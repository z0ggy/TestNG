package test_ng;
/*
1. Open the browser and application
2. login
3. Close browser
 */

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Check {

    @Test
    void setup() {
        System.out.println("Here normally is a selenium code");
    }

    @Test
    void login() {
        System.out.println("This is login test");
    }

    @Test
    void closeBrowser() {
        System.out.println("Closing the browser");
    }

}
