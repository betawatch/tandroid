package c8;

import java.util.Locale;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class qd {
    public static int a(int i7) {
        if (i7 >= 100 || i7 < 0) {
            return i7;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.gms.internal.vision.e2.k(String.valueOf(w7.s.b0().get(1)), 2, 0), Integer.valueOf(i7)));
    }
}
