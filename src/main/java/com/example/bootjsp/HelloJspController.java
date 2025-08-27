package com.example.bootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 💡 @Controller: 이 클래스가 Spring MVC 컨트롤러임을 나타냅니다.
// 이 컨트롤러의 메소드는 문자열을 반환하며, 이는 뷰(View)의 이름으로 해석됩니다.
@Controller
public class HelloJspController {

    // render 배포용 
    @GetMapping("/")
    public String index() {
        return "redirect:/hello-jsp";
    }

    // 💡 @GetMapping: HTTP GET 요청을 특정 URL 경로와 매핑합니다.
    // 클라이언트가 "/hello-jsp" 경로로 GET 요청을 보내면 이 메소드가 호출됩니다.
    @GetMapping("/hello-jsp")
    public String helloJsp() {
        // 💡 반환값 "hello"는 뷰의 논리적인 이름입니다.
        // application.properties의 설정(prefix, suffix)에 따라,
        // 스프링은 "/WEB-INF/views/hello.jsp" 파일을 찾아 렌더링합니다.
        return "hello";
    }
}

/*
애플리케이션 실행 및 확인

1.  IntelliJ의 `DemoApplication.java` 파일에서 `main` 메소드를 실행합니다.
2.  내장 톰캣 서버가 8080 포트로 실행됩니다.
3.  웹 브라우저를 열고 `http://localhost:8080/hello-jsp` 주소로 접속합니다.
4.  "Hello, JSP\!" 메시지가 화면에 출력되는 것을 확인합니다.
*/
