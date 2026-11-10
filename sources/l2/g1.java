package l2;

import android.util.Pair;
import bi.l4;
import bi.ub;
import java.io.IOException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g1 implements x2.j0, q2.k {
    public final i1 a;
    public final /* synthetic */ j1 b;

    public g1(j1 j1Var, i1 i1Var) {
        this.b = j1Var;
        this.a = i1Var;
    }

    @Override // x2.j0
    public final void A(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new e1(this, a10, tVar, b0Var, 0));
        }
    }

    @Override // x2.j0
    public final void E(int i7, x2.f0 f0Var, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new d1(this, a10, b0Var, 0));
        }
    }

    @Override // x2.j0
    public final void G(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new e1(this, a10, tVar, b0Var, 1));
        }
    }

    @Override // x2.j0
    public final void I(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var, int i10) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new ub(this, a10, tVar, b0Var, i10, 6));
        }
    }

    @Override // q2.k
    public final void K(int i7, x2.f0 f0Var, Exception exc) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new z0(this, a10, exc, 2));
        }
    }

    @Override // q2.k
    public final void N(int i7, x2.f0 f0Var, int i10) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new ai.e0(this, a10, i10, 19));
        }
    }

    public final Pair a(int i7, x2.f0 f0Var) {
        x2.f0 f0Var2;
        i1 i1Var = this.a;
        x2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= i1Var.c.size()) {
                    f0Var2 = null;
                    break;
                }
                if (((x2.f0) i1Var.c.get(i10)).d == f0Var.d) {
                    Object obj = f0Var.a;
                    Object obj2 = i1Var.b;
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
        return Pair.create(Integer.valueOf(i7 + i1Var.d), f0Var3);
    }

    @Override // q2.k
    public final void b(int i7, x2.f0 f0Var, qb.a aVar) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new z0(this, a10, aVar, 1));
        }
    }

    @Override // x2.j0
    public final void d(int i7, x2.f0 f0Var, x2.b0 b0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new d1(this, a10, b0Var, 1));
        }
    }

    @Override // x2.j0
    public final void r(int i7, x2.f0 f0Var, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z9) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new l4(this, a10, tVar, b0Var, iOException, z9, 1));
        }
    }

    @Override // q2.k
    public final void w(int i7, x2.f0 f0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new f1(this, a10, 1));
        }
    }

    @Override // q2.k
    public final void z(int i7, x2.f0 f0Var) {
        Pair a10 = a(i7, f0Var);
        if (a10 != null) {
            this.b.i.d(new f1(this, a10, 0));
        }
    }
}
