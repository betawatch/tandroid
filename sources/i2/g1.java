package i2;

import android.util.Pair;
import bi.k4;
import bi.sb;
import java.io.IOException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g1 implements u2.k0, n2.k {
    public final i1 a;
    public final /* synthetic */ j1 b;

    public g1(j1 j1Var, i1 i1Var) {
        this.b = j1Var;
        this.a = i1Var;
    }

    @Override // n2.k
    public final void a(int i10, u2.g0 g0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new ai.h0(this, l4, i11, 17));
        }
    }

    @Override // n2.k
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new e2.m0(this, l4, exc, 17));
        }
    }

    @Override // u2.k0
    public final void c(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new d1(this, l4, c0Var, 0));
        }
    }

    @Override // u2.k0
    public final void d(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new d1(this, l4, c0Var, 1));
        }
    }

    @Override // u2.k0
    public final void e(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new e1(this, l4, uVar, c0Var, 1));
        }
    }

    @Override // u2.k0
    public final void f(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new k4(this, l4, uVar, c0Var, iOException, z10, 1));
        }
    }

    @Override // n2.k
    public final void g(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new f1(this, l4, 0));
        }
    }

    @Override // u2.k0
    public final void h(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new sb(this, l4, uVar, c0Var, i11, 3));
        }
    }

    @Override // n2.k
    public final void i(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new f1(this, l4, 1));
        }
    }

    @Override // u2.k0
    public final void j(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new e1(this, l4, uVar, c0Var, 0));
        }
    }

    @Override // n2.k
    public final void k(int i10, u2.g0 g0Var, pa.d dVar) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new e2.m0(this, l4, dVar, 16));
        }
    }

    public final Pair l(int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        i1 i1Var = this.a;
        u2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= i1Var.c.size()) {
                    g0Var2 = null;
                    break;
                }
                if (((u2.g0) i1Var.c.get(i11)).d == g0Var.d) {
                    Object obj = g0Var.a;
                    Object obj2 = i1Var.b;
                    int i12 = a.g;
                    g0Var2 = g0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (g0Var2 == null) {
                return null;
            }
            g0Var3 = g0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + i1Var.d), g0Var3);
    }
}
