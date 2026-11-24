// default package

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class exc {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yw7 yw7Var) {
        String n = yw7Var.n(StandardCharsets.UTF_8);
        return n != null && n.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = hac.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                u36.j("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void d(yw7 yw7Var) {
        int i = yw7Var.b;
        if (a(yw7Var)) {
            return;
        }
        yw7Var.N(i);
        throw bx7.a("Expected WEBVTT. Got " + yw7Var.n(StandardCharsets.UTF_8), null);
    }
}
