package b2;

import android.os.Bundle;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class h1 {
    public static final String a;

    static {
        String str = e2.m0.a;
        a = Integer.toString(0, 36);
    }

    public static h1 a(Bundle bundle) {
        String str = a;
        int i10 = bundle.getInt(str, -1);
        if (i10 == 0) {
            String str2 = z.d;
            u6.g(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(z.d, false) ? new z(bundle.getBoolean(z.e, false)) : new z();
        }
        if (i10 == 1) {
            String str3 = y0.c;
            u6.g(bundle.getInt(str, -1) == 1);
            float f7 = bundle.getFloat(y0.c, -1.0f);
            return f7 == -1.0f ? new y0() : new y0(f7);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException(i2.d.j(i10, "Unknown RatingType: "));
            }
            String str4 = k1.d;
            u6.g(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(k1.d, false) ? new k1(bundle.getBoolean(k1.e, false)) : new k1();
        }
        String str5 = i1.d;
        u6.g(bundle.getInt(str, -1) == 2);
        int i11 = bundle.getInt(i1.d, 5);
        float f10 = bundle.getFloat(i1.e, -1.0f);
        return f10 == -1.0f ? new i1(i11) : new i1(i11, f10);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
