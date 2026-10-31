package b2;

import android.os.Bundle;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g1 {
    public static final String a;

    static {
        String str = e2.l0.a;
        a = Integer.toString(0, 36);
    }

    public static g1 a(Bundle bundle) {
        String str = a;
        int i10 = bundle.getInt(str, -1);
        if (i10 == 0) {
            String str2 = z.d;
            t6.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(z.d, false) ? new z(bundle.getBoolean(z.e, false)) : new z();
        }
        if (i10 == 1) {
            String str3 = x0.c;
            t6.f(bundle.getInt(str, -1) == 1);
            float f7 = bundle.getFloat(x0.c, -1.0f);
            return f7 == -1.0f ? new x0() : new x0(f7);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException(i0.a.i(i10, "Unknown RatingType: "));
            }
            String str4 = j1.d;
            t6.f(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(j1.d, false) ? new j1(bundle.getBoolean(j1.e, false)) : new j1();
        }
        String str5 = h1.d;
        t6.f(bundle.getInt(str, -1) == 2);
        int i11 = bundle.getInt(h1.d, 5);
        float f10 = bundle.getFloat(h1.e, -1.0f);
        return f10 == -1.0f ? new h1(i11) : new h1(i11, f10);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
