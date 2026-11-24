// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ev5 extends pd6 implements xp3, ep5 {
    public ov5 d;

    @Override // ep5
    public final ul7 b() {
        return null;
    }

    @Override // xp3
    public final void dispose() {
        ev5 ev5Var;
        Unsafe unsafe;
        long j;
        ov5 j2 = j();
        while (true) {
            Object v = j2.v();
            if (v instanceof ev5) {
                if (v != this) {
                    return;
                }
                do {
                    unsafe = fy.a;
                    j = ov5.b;
                    if (unsafe.compareAndSwapObject(j2, j, v, hcd.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == v);
            } else {
                if (!(v instanceof ep5) || ((ep5) v).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (f instanceof u89) {
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    pd6 pd6Var = (pd6) f;
                    Unsafe unsafe2 = fy.a;
                    long j3 = pd6.c;
                    u89 u89Var = (u89) unsafe2.getObjectVolatile(pd6Var, j3);
                    if (u89Var == null) {
                        u89Var = new u89(pd6Var);
                        unsafe2.putObjectVolatile(pd6Var, j3, u89Var);
                    }
                    u89 u89Var2 = u89Var;
                    while (true) {
                        Unsafe unsafe3 = fy.a;
                        long j4 = pd6.a;
                        ev5Var = this;
                        if (unsafe3.compareAndSwapObject(ev5Var, j4, f, u89Var2)) {
                            pd6Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(ev5Var, j4) != f) {
                            break;
                        } else {
                            this = ev5Var;
                        }
                    }
                    this = ev5Var;
                }
            }
        }
    }

    @Override // ep5
    public final boolean isActive() {
        return true;
    }

    public final ov5 j() {
        ov5 ov5Var = this.d;
        if (ov5Var != null) {
            return ov5Var;
        }
        rr5.e("job");
        throw null;
    }

    public boolean k() {
        return false;
    }

    public void l(Throwable th) {
        throw null;
    }

    @Override // pd6
    public final String toString() {
        return getClass().getSimpleName() + '@' + ea3.a(this) + "[job@" + ea3.a(j()) + ']';
    }
}
