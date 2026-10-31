package m4;

import android.os.Bundle;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.l0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public j(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static j a(Bundle bundle) {
        int i10 = bundle.getInt(f, 0);
        int i11 = bundle.getInt(j, 0);
        String string = bundle.getString(g);
        string.getClass();
        String str = h;
        t6.f(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(i);
        int i13 = bundle.getInt(k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j(i10, i11, string, i12, bundle2, i13);
    }
}
