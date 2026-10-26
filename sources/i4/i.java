package i4;

import b2.x0;
import e2.n0;
import e2.x;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class i {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(x xVar) {
        xVar.getClass();
        String n10 = xVar.n(StandardCharsets.UTF_8);
        return n10 != null && n10.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = n0.a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str3);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j11 += Long.parseLong(trim);
        }
        return j11 * 1000;
    }

    public static void d(x xVar) {
        int i10 = xVar.b;
        if (a(xVar)) {
            return;
        }
        xVar.N(i10);
        throw x0.a(null, "Expected WEBVTT. Got " + xVar.n(StandardCharsets.UTF_8));
    }
}
