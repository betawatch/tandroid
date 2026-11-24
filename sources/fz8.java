// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class fz8 {
    public static final String a;

    static {
        String str = g8c.a;
        a = "0";
    }

    public static fz8 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = ud5.d;
            gre.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(ud5.d, false) ? new ud5(bundle.getBoolean(ud5.e, false)) : new ud5();
        }
        if (i == 1) {
            String str3 = e38.c;
            gre.f(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(e38.c, -1.0f);
            return f == -1.0f ? new e38() : new e38(f);
        }
        if (i == 2) {
            String str4 = dra.d;
            gre.f(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(dra.d, 5);
            float f2 = bundle.getFloat(dra.e, -1.0f);
            return f2 == -1.0f ? new dra(i2) : new dra(i2, f2);
        }
        if (i != 3) {
            w26.j(de9.k(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = knb.d;
        gre.f(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(knb.d, false) ? new knb(bundle.getBoolean(knb.e, false)) : new knb();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
