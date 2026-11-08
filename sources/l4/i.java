package l4;

import e2.t0;
import h2.m0;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        String str2 = m0.a;
        String[] split = str.split("\\.", 2);
        long j3 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str3);
        }
        long j10 = j3 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j10 += Long.parseLong(trim);
        }
        return j10 * 1000;
    }

    public static void d(x xVar) {
        int i7 = xVar.b;
        if (a(xVar)) {
            return;
        }
        xVar.N(i7);
        throw t0.a(null, "Expected WEBVTT. Got " + xVar.n(StandardCharsets.UTF_8));
    }
}
