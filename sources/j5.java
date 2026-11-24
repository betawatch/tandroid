// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

    public final na7 b() {
        return na7.q1(this.a);
    }

    public final kk7 c() {
        return kk7.f(this.a);
    }

    public final SharedPreferences d() {
        return na7.q1(this.a).W3;
    }

    public final y6c e() {
        return y6c.h(this.a);
    }
}
