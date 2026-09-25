package m4;

import android.os.Bundle;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class n {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = e2.d0.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(a);
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        n nVar = new n();
        new Bundle(bundle2);
        return nVar;
    }
}
