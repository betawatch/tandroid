// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k5 {
    public static volatile k5[] b = new k5[4];
    public int a;

    public static k5 a(int i) {
        k5 k5Var;
        k5 k5Var2 = b[i];
        if (k5Var2 != null) {
            return k5Var2;
        }
        synchronized (k5.class) {
            k5Var = b[i];
            if (k5Var == null) {
                k5[] k5VarArr = b;
                k5 k5Var3 = new k5();
                k5Var3.a = i;
                k5VarArr[i] = k5Var3;
                k5Var = k5Var3;
            }
        }
        return k5Var;
    }

    public final uc7 b() {
        return uc7.s1(this.a);
    }

    public final jn7 c() {
        return jn7.f(this.a);
    }

    public final SharedPreferences d() {
        return uc7.s1(this.a).W3;
    }

    public final yac e() {
        return yac.h(this.a);
    }
}
