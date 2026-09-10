package b2;

import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final String a;

    static {
        String str = e2.d0.a;
        a = Integer.toString(0, 36);
    }

    public static c1 a(Bundle bundle) {
        String str = a;
        int i10 = bundle.getInt(str, -1);
        if (i10 == 0) {
            String str2 = u.d;
            e2.d.b(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(u.d, false) ? new u(bundle.getBoolean(u.e, false)) : new u();
        }
        if (i10 == 1) {
            String str3 = t0.c;
            e2.d.b(bundle.getInt(str, -1) == 1);
            float f7 = bundle.getFloat(t0.c, -1.0f);
            return f7 == -1.0f ? new t0() : new t0(f7);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException(hc.b.j(i10, "Unknown RatingType: "));
            }
            String str4 = f1.d;
            e2.d.b(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(f1.d, false) ? new f1(bundle.getBoolean(f1.e, false)) : new f1();
        }
        String str5 = d1.d;
        e2.d.b(bundle.getInt(str, -1) == 2);
        int i11 = bundle.getInt(d1.d, 5);
        float f10 = bundle.getFloat(d1.e, -1.0f);
        return f10 == -1.0f ? new d1(i11) : new d1(i11, f10);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
