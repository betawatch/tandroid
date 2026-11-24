// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dt6 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = hac.a;
        a = "0";
        b = "1";
        c = "2";
        d = "3";
    }

    public static dt6 a(Bundle bundle) {
        Bundle o = hac.o(bundle.getBundle(a));
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (o == null) {
            o = Bundle.EMPTY;
        }
        dt6 dt6Var = new dt6();
        new Bundle(o);
        return dt6Var;
    }
}
