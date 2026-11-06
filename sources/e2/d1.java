package e2;

import a8.ia;
import android.os.Bundle;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class d1 {
    public static final String a;

    static {
        String str = h2.m0.a;
        a = Integer.toString(0, 36);
    }

    public static d1 a(Bundle bundle) {
        String str = a;
        int i7 = bundle.getInt(str, -1);
        if (i7 == 0) {
            String str2 = w.d;
            ia.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(w.d, false) ? new w(bundle.getBoolean(w.e, false)) : new w();
        }
        if (i7 == 1) {
            String str3 = u0.c;
            ia.f(bundle.getInt(str, -1) == 1);
            float f10 = bundle.getFloat(u0.c, -1.0f);
            return f10 == -1.0f ? new u0() : new u0(f10);
        }
        if (i7 != 2) {
            if (i7 != 3) {
                throw new IllegalArgumentException(jg.g.j(i7, "Unknown RatingType: "));
            }
            String str4 = g1.d;
            ia.f(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(g1.d, false) ? new g1(bundle.getBoolean(g1.e, false)) : new g1();
        }
        String str5 = e1.d;
        ia.f(bundle.getInt(str, -1) == 2);
        int i10 = bundle.getInt(e1.d, 5);
        float f11 = bundle.getFloat(e1.e, -1.0f);
        return f11 == -1.0f ? new e1(i10) : new e1(i10, f11);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
