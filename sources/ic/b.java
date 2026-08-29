package ic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String a;
    public final String b;
    public final String c;

    public b(String str) {
        this.a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            this.c = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.b = "";
            this.c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.b)) {
            Matcher matcher3 = f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
