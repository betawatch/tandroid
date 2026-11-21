package c8;

import java.util.Locale;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class qd {
    public static int a(int i7) {
        if (i7 >= 100 || i7 < 0) {
            return i7;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.gms.internal.vision.e2.k(String.valueOf(w7.s.b0().get(1)), 2, 0), Integer.valueOf(i7)));
    }
}
