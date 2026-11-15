package l2;

import android.util.Pair;
import di.m3;
import java.io.IOException;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class c1 implements x2.j0, q2.l {
    public final e1 a;
    public final /* synthetic */ f1 b;

    public c1(f1 f1Var, e1 e1Var) {
        this.b = f1Var;
        this.a = e1Var;
    }

    @Override // x2.j0
    public final void A(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new a1(this, a10, tVar, b0Var, 0));
        }
    }

    @Override // x2.j0
    public final void C(int i7, x2.f0 f0Var, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new z0(this, a10, b0Var, 0));
        }
    }

    @Override // x2.j0
    public final void G(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new a1(this, a10, tVar, b0Var, 1));
        }
    }

    @Override // x2.j0
    public final void I(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var, int i10) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new ai.f1(this, a10, tVar, b0Var, i10, 8));
        }
    }

    @Override // q2.l
    public final void K(int i7, x2.f0 f0Var, Exception exc) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new ki.n(this, a10, exc, 7));
        }
    }

    @Override // q2.l
    public final void N(int i7, x2.f0 f0Var, int i10) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new ai.z0(this, a10, i10, 22));
        }
    }

    public final Pair a(int i7, x2.f0 f0Var) {
        x2.f0 f0Var2;
        e1 e1Var = this.a;
        x2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= e1Var.c.size()) {
                    f0Var2 = null;
                    break;
                }
                if (((x2.f0) e1Var.c.get(i10)).d == f0Var.d) {
                    Object obj = f0Var.a;
                    Object obj2 = e1Var.b;
                    int i11 = a.g;
                    f0Var2 = f0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (f0Var2 == null) {
                return null;
            }
            f0Var3 = f0Var2;
        }
        return Pair.create(Integer.valueOf(i7 + e1Var.d), f0Var3);
    }

    @Override // x2.j0
    public final void k(int i7, x2.f0 f0Var, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new z0(this, a10, b0Var, 1));
        }
    }

    @Override // q2.l
    public final void p(int i7, x2.f0 f0Var, nb.a aVar) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new ki.n(this, a10, aVar, 6));
        }
    }

    @Override // x2.j0
    public final void r(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z10) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new m3(this, a10, tVar, b0Var, iOException, z10, 1));
        }
    }

    @Override // q2.l
    public final void w(int i7, x2.f0 f0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new b1(this, a10, 1));
        }
    }

    @Override // q2.l
    public final void z(int i7, x2.f0 f0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new b1(this, a10, 0));
        }
    }
}
