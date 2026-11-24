// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j5 {
    public static volatile j5[] b = new j5[4];
    public int a;

    public static j5 a(int i) {
        j5 j5Var;
        j5 j5Var2 = b[i];
        if (j5Var2 != null) {
            return j5Var2;
        }
        synchronized (j5.class) {
            j5Var = b[i];
            if (j5Var == null) {
                j5[] j5VarArr = b;
                j5 j5Var3 = new j5();
                j5Var3.a = i;
                j5VarArr[i] = j5Var3;
                j5Var = j5Var3;
            }
        }
        return j5Var;
    }

    public final oc7 b() {
        return oc7.r1(this.a);
    }

    public final nm7 c() {
        return nm7.f(this.a);
    }

    public final SharedPreferences d() {
        return oc7.r1(this.a).W3;
    }

    public final z8c e() {
        return z8c.h(this.a);
    }
}
