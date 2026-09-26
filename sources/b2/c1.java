package b2;

import android.os.Bundle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                throw new IllegalArgumentException(hg.c.h(i10, "Unknown RatingType: "));
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
