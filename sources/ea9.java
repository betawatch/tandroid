// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ea9 extends a4 {
    public final boolean m(t56 t56Var) {
        u3 u3Var;
        Object obj = this.a;
        if (obj == null) {
            if (t56Var.isDone()) {
                if (a4.f.b(this, null, a4.h(t56Var))) {
                    a4.e(this);
                    return true;
                }
                return false;
            }
            x3 x3Var = new x3(this, t56Var);
            if (a4.f.b(this, null, x3Var)) {
                try {
                    t56Var.b(x3Var, xn3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        u3Var = new u3(th);
                    } catch (Throwable unused) {
                        u3Var = u3.b;
                    }
                    a4.f.b(this, x3Var, u3Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof t3) {
            t56Var.cancel(((t3) obj).a);
        }
        return false;
    }
}
