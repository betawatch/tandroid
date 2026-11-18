package e2;

import a8.la;
import android.os.Bundle;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class d1 {
    public static final String a;

    static {
        String str = h2.l0.a;
        a = Integer.toString(0, 36);
    }

    public static d1 a(Bundle bundle) {
        String str = a;
        int i7 = bundle.getInt(str, -1);
        if (i7 == 0) {
            String str2 = w.d;
            la.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(w.d, false) ? new w(bundle.getBoolean(w.e, false)) : new w();
        }
        if (i7 == 1) {
            String str3 = u0.c;
            la.f(bundle.getInt(str, -1) == 1);
            float f10 = bundle.getFloat(u0.c, -1.0f);
            return f10 == -1.0f ? new u0() : new u0(f10);
        }
        if (i7 != 2) {
            if (i7 != 3) {
                throw new IllegalArgumentException(i5.c.i(i7, "Unknown RatingType: "));
            }
            String str4 = g1.d;
            la.f(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(g1.d, false) ? new g1(bundle.getBoolean(g1.e, false)) : new g1();
        }
        String str5 = e1.d;
        la.f(bundle.getInt(str, -1) == 2);
        int i10 = bundle.getInt(e1.d, 5);
        float f11 = bundle.getFloat(e1.e, -1.0f);
        return f11 == -1.0f ? new e1(i10) : new e1(i10, f11);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
