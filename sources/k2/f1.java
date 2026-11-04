package k2;

import ai.e3;
import android.util.Pair;
import ci.v3;
import ei.h9;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f1 implements w2.k0, p2.k {
    public final h1 a;
    public final /* synthetic */ i1 b;

    public f1(i1 i1Var, h1 h1Var) {
        this.b = i1Var;
        this.a = h1Var;
    }

    @Override // p2.k
    public final void A(int i3, w2.g0 g0Var, Exception exc) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new h9(this, a10, exc, 20));
        }
    }

    @Override // w2.k0
    public final void D(int i3, w2.g0 g0Var, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new c1(this, a10, c0Var, 0));
        }
    }

    @Override // p2.k
    public final void I(int i3, w2.g0 g0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new e1(this, a10, 1));
        }
    }

    @Override // w2.k0
    public final void K(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var, int i10) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new ai.p1(this, a10, uVar, c0Var, i10, 4));
        }
    }

    @Override // p2.k
    public final void M(int i3, w2.g0 g0Var, int i10) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new e3(this, a10, i10, 18));
        }
    }

    public final Pair a(int i3, w2.g0 g0Var) {
        w2.g0 g0Var2;
        h1 h1Var = this.a;
        w2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= h1Var.c.size()) {
                    g0Var2 = null;
                    break;
                }
                if (((w2.g0) h1Var.c.get(i10)).d == g0Var.d) {
                    Object obj = g0Var.a;
                    Object obj2 = h1Var.b;
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
        return Pair.create(Integer.valueOf(i3 + h1Var.d), g0Var3);
    }

    @Override // p2.k
    public final void b(int i3, w2.g0 g0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new e1(this, a10, 0));
        }
    }

    @Override // w2.k0
    public final void d(int i3, w2.g0 g0Var, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new c1(this, a10, c0Var, 1));
        }
    }

    @Override // w2.k0
    public final void j(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var, IOException iOException, boolean z10) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new v3(this, a10, uVar, c0Var, iOException, z10, 1));
        }
    }

    @Override // w2.k0
    public final void t(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new d1(this, a10, uVar, c0Var, 1));
        }
    }

    @Override // p2.k
    public final void x(int i3, w2.g0 g0Var, v7.s sVar) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new h9(this, a10, sVar, 19));
        }
    }

    @Override // w2.k0
    public final void z(int i3, w2.g0 g0Var, w2.u uVar, w2.c0 c0Var) {
        Pair a10 = a(i3, g0Var);
        if (a10 != null) {
            this.b.i.d(new d1(this, a10, uVar, c0Var, 0));
        }
    }
}
