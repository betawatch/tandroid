// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class g19 {
    public static final String a;

    static {
        String str = hac.a;
        a = "0";
    }

    public static g19 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = sf5.d;
            jte.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(sf5.d, false) ? new sf5(bundle.getBoolean(sf5.e, false)) : new sf5();
        }
        if (i == 1) {
            String str3 = g58.c;
            jte.f(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(g58.c, -1.0f);
            return f == -1.0f ? new g58() : new g58(f);
        }
        if (i == 2) {
            String str4 = eta.d;
            jte.f(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(eta.d, 5);
            float f2 = bundle.getFloat(eta.e, -1.0f);
            return f2 == -1.0f ? new eta(i2) : new eta(i2, f2);
        }
        if (i != 3) {
            u36.j(hg9.j(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = lpb.d;
        jte.f(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(lpb.d, false) ? new lpb(bundle.getBoolean(lpb.e, false)) : new lpb();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
