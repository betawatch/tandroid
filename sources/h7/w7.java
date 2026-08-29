package h7;

import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class w7 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.recaptcha.internal.a.m(String.valueOf(ab.b.A3().get(1)), 2, 0), Integer.valueOf(i10)));
    }
}
