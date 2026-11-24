// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ft5 extends qb6 implements no3, en5 {
    public pt5 d;

    @Override // en5
    public final rj7 b() {
        return null;
    }

    @Override // no3
    public final void dispose() {
        ft5 ft5Var;
        Unsafe unsafe;
        long j;
        pt5 j2 = j();
        while (true) {
            Object v = j2.v();
            if (v instanceof ft5) {
                if (v != this) {
                    return;
                }
                do {
                    unsafe = ex.a;
                    j = pt5.b;
                    if (unsafe.compareAndSwapObject(j2, j, v, fad.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == v);
            } else {
                if (!(v instanceof en5) || ((en5) v).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (f instanceof s69) {
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    qb6 qb6Var = (qb6) f;
                    Unsafe unsafe2 = ex.a;
                    long j3 = qb6.c;
                    s69 s69Var = (s69) unsafe2.getObjectVolatile(qb6Var, j3);
                    if (s69Var == null) {
                        s69Var = new s69(qb6Var);
                        unsafe2.putObjectVolatile(qb6Var, j3, s69Var);
                    }
                    s69 s69Var2 = s69Var;
                    while (true) {
                        Unsafe unsafe3 = ex.a;
                        long j4 = qb6.a;
                        ft5Var = this;
                        if (unsafe3.compareAndSwapObject(ft5Var, j4, f, s69Var2)) {
                            qb6Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(ft5Var, j4) != f) {
                            break;
                        } else {
                            this = ft5Var;
                        }
                    }
                    this = ft5Var;
                }
            }
        }
    }

    @Override // en5
    public final boolean isActive() {
        return true;
    }

    public final pt5 j() {
        pt5 pt5Var = this.d;
        if (pt5Var != null) {
            return pt5Var;
        }
        rp5.e("job");
        throw null;
    }

    public boolean k() {
        return false;
    }

    public void l(Throwable th) {
        throw null;
    }

    @Override // qb6
    public final String toString() {
        return getClass().getSimpleName() + '@' + s83.a(this) + "[job@" + s83.a(j()) + ']';
    }
}
