// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dr6 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = g8c.a;
        a = "0";
        b = "1";
        c = "2";
        d = "3";
    }

    public static dr6 a(Bundle bundle) {
        Bundle o = g8c.o(bundle.getBundle(a));
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (o == null) {
            o = Bundle.EMPTY;
        }
        dr6 dr6Var = new dr6();
        new Bundle(o);
        return dr6Var;
    }
}
