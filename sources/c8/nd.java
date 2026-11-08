package c8;

import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class nd {
    public static int a(int i7) {
        if (i7 >= 100 || i7 < 0) {
            return i7;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.recaptcha.internal.a.k(String.valueOf(qb.a.u4().get(1)), 2, 0), Integer.valueOf(i7)));
    }
}
