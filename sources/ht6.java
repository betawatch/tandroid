// default package

import android.os.Bundle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ht6 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = gcc.a;
        a = "0";
        b = "1";
        c = "2";
        d = "3";
    }

    public static ht6 a(Bundle bundle) {
        Bundle o = gcc.o(bundle.getBundle(a));
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (o == null) {
            o = Bundle.EMPTY;
        }
        ht6 ht6Var = new ht6();
        new Bundle(o);
        return ht6Var;
    }
}
