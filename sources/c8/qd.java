package c8;

import java.util.Locale;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class qd {
    public static int a(int i7) {
        if (i7 >= 100 || i7 < 0) {
            return i7;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.gms.internal.vision.e2.k(String.valueOf(w7.s.b0().get(1)), 2, 0), Integer.valueOf(i7)));
    }
}
