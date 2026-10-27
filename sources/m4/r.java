package m4;

import android.os.Bundle;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = e2.n0.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static r a(Bundle bundle) {
        Bundle o10 = e2.n0.o(bundle.getBundle(a));
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        r rVar = new r();
        new Bundle(o10);
        return rVar;
    }
}
