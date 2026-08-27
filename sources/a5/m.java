package a5;

import d5.g0;
import d5.z;
import h3.t1;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class m {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(z zVar) {
        zVar.getClass();
        String f10 = zVar.f(o8.d.c);
        return f10 != null && f10.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = g0.a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void d(z zVar) {
        int i10 = zVar.b;
        if (a(zVar)) {
            return;
        }
        zVar.C(i10);
        throw t1.a("Expected WEBVTT. Got " + zVar.f(o8.d.c), null);
    }
}
