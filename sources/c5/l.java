package c5;

import f5.d0;
import f5.w;
import j3.t1;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(w wVar) {
        wVar.getClass();
        String f9 = wVar.f(p8.d.c);
        return f9 != null && f9.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = d0.a;
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

    public static void d(w wVar) {
        int i10 = wVar.b;
        if (a(wVar)) {
            return;
        }
        wVar.C(i10);
        throw t1.a("Expected WEBVTT. Got " + wVar.f(p8.d.c), null);
    }
}
