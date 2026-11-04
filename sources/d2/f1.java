package d2;

import android.os.Bundle;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class f1 {
    public static final String a;

    static {
        String str = g2.n0.a;
        a = Integer.toString(0, 36);
    }

    public static f1 a(Bundle bundle) {
        String str = a;
        int i3 = bundle.getInt(str, -1);
        if (i3 == 0) {
            String str2 = x.d;
            zb.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(x.d, false) ? new x(bundle.getBoolean(x.e, false)) : new x();
        }
        if (i3 == 1) {
            String str3 = w0.c;
            zb.f(bundle.getInt(str, -1) == 1);
            float f10 = bundle.getFloat(w0.c, -1.0f);
            return f10 == -1.0f ? new w0() : new w0(f10);
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException(k2.p1.i(i3, "Unknown RatingType: "));
            }
            String str4 = i1.d;
            zb.f(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(i1.d, false) ? new i1(bundle.getBoolean(i1.e, false)) : new i1();
        }
        String str5 = g1.d;
        zb.f(bundle.getInt(str, -1) == 2);
        int i10 = bundle.getInt(g1.d, 5);
        float f11 = bundle.getFloat(g1.e, -1.0f);
        return f11 == -1.0f ? new g1(i10) : new g1(i10, f11);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
