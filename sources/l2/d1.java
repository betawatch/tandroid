package l2;

import android.util.Pair;
import di.o3;
import java.io.IOException;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d1 implements x2.k0, q2.k {
    public final f1 a;
    public final /* synthetic */ g1 b;

    public d1(g1 g1Var, f1 f1Var) {
        this.b = g1Var;
        this.a = f1Var;
    }

    @Override // x2.k0
    public final void A(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new b1(this, a10, uVar, c0Var, 0));
        }
    }

    @Override // x2.k0
    public final void C(int i7, x2.g0 g0Var, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new a1(this, a10, c0Var, 0));
        }
    }

    @Override // x2.k0
    public final void G(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new b1(this, a10, uVar, c0Var, 1));
        }
    }

    @Override // x2.k0
    public final void I(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var, int i10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new ai.d1(this, a10, uVar, c0Var, i10, 8));
        }
    }

    @Override // q2.k
    public final void K(int i7, x2.g0 g0Var, Exception exc) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new kg.x(this, a10, exc, 13));
        }
    }

    @Override // q2.k
    public final void N(int i7, x2.g0 g0Var, int i10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new ai.e1(this, a10, i10, 22));
        }
    }

    public final Pair a(int i7, x2.g0 g0Var) {
        x2.g0 g0Var2;
        f1 f1Var = this.a;
        x2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= f1Var.c.size()) {
                    g0Var2 = null;
                    break;
                }
                if (((x2.g0) f1Var.c.get(i10)).d == g0Var.d) {
                    Object obj = g0Var.a;
                    Object obj2 = f1Var.b;
                    int i11 = a.g;
                    g0Var2 = g0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (g0Var2 == null) {
                return null;
            }
            g0Var3 = g0Var2;
        }
        return Pair.create(Integer.valueOf(i7 + f1Var.d), g0Var3);
    }

    @Override // x2.k0
    public final void i(int i7, x2.g0 g0Var, x2.c0 c0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new a1(this, a10, c0Var, 1));
        }
    }

    @Override // q2.k
    public final void l(int i7, x2.g0 g0Var, nb.a aVar) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new kg.x(this, a10, aVar, 12));
        }
    }

    @Override // x2.k0
    public final void r(int i7, x2.g0 g0Var, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new o3(this, a10, uVar, c0Var, iOException, z10, 1));
        }
    }

    @Override // q2.k
    public final void w(int i7, x2.g0 g0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new c1(this, a10, 1));
        }
    }

    @Override // q2.k
    public final void z(int i7, x2.g0 g0Var) {
        Pair a10 = a(i7, g0Var);
        if (a10 != null) {
            this.b.i.d(new c1(this, a10, 0));
        }
    }
}
