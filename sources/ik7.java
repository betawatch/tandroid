// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ik7 {
    public static final Pattern c = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern d = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String a;
    public final String b;

    public ik7(String str) {
        String str2;
        this.a = str;
        str2 = "";
        if (str != null) {
            Matcher matcher = c.matcher(str);
            str2 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = d.matcher(str);
            this.b = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.b = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(str2)) {
            Matcher matcher3 = e.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
