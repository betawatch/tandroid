// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class iv5 extends ud6 implements ep3, hp5 {
    public sv5 d;

    @Override // hp5
    public final qm7 b() {
        return null;
    }

    @Override // ep3
    public final void dispose() {
        iv5 iv5Var;
        Unsafe unsafe;
        long j;
        sv5 j2 = j();
        while (true) {
            Object v = j2.v();
            if (v instanceof iv5) {
                if (v != this) {
                    return;
                }
                do {
                    unsafe = fx.a;
                    j = sv5.b;
                    if (unsafe.compareAndSwapObject(j2, j, v, yed.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == v);
            } else {
                if (!(v instanceof hp5) || ((hp5) v).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (f instanceof fa9) {
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    ud6 ud6Var = (ud6) f;
                    Unsafe unsafe2 = fx.a;
                    long j3 = ud6.c;
                    fa9 fa9Var = (fa9) unsafe2.getObjectVolatile(ud6Var, j3);
                    if (fa9Var == null) {
                        fa9Var = new fa9(ud6Var);
                        unsafe2.putObjectVolatile(ud6Var, j3, fa9Var);
                    }
                    fa9 fa9Var2 = fa9Var;
                    while (true) {
                        Unsafe unsafe3 = fx.a;
                        long j4 = ud6.a;
                        iv5Var = this;
                        if (unsafe3.compareAndSwapObject(iv5Var, j4, f, fa9Var2)) {
                            ud6Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(iv5Var, j4) != f) {
                            break;
                        } else {
                            this = iv5Var;
                        }
                    }
                    this = iv5Var;
                }
            }
        }
    }

    @Override // hp5
    public final boolean isActive() {
        return true;
    }

    public final sv5 j() {
        sv5 sv5Var = this.d;
        if (sv5Var != null) {
            return sv5Var;
        }
        ur5.e("job");
        throw null;
    }

    public boolean k() {
        return false;
    }

    public void l(Throwable th) {
        throw null;
    }

    @Override // ud6
    public final String toString() {
        return getClass().getSimpleName() + '@' + l93.a(this) + "[job@" + l93.a(j()) + ']';
    }
}
