package k4;

import d2.v0;
import g2.n0;
import g2.y;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(y yVar) {
        yVar.getClass();
        String n4 = yVar.n(StandardCharsets.UTF_8);
        return n4 != null && n4.startsWith("WEBVTT");
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

    public static void d(y yVar) {
        int i3 = yVar.b;
        if (a(yVar)) {
            return;
        }
        yVar.N(i3);
        throw v0.a(null, "Expected WEBVTT. Got " + yVar.n(StandardCharsets.UTF_8));
    }
}
