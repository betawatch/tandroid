package i2;

import ai.s1;
import android.util.Pair;
import ei.l3;
import java.io.IOException;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class d1 implements u2.j0, n2.l {
    public final f1 a;
    public final /* synthetic */ g1 b;

    public d1(g1 g1Var, f1 f1Var) {
        this.b = g1Var;
        this.a = f1Var;
    }

    @Override // n2.l
    public final void a(int i10, u2.f0 f0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new s1(this, l4, i11, 13));
        }
    }

    @Override // n2.l
    public final void b(int i10, u2.f0 f0Var, Exception exc) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new gg.t(this, l4, exc, 14));
        }
    }

    @Override // u2.j0
    public final void c(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new z0(this, l4, b0Var, 0));
        }
    }

    @Override // u2.j0
    public final void d(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new z0(this, l4, b0Var, 1));
        }
    }

    @Override // u2.j0
    public final void e(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new b1(this, l4, tVar, b0Var, 1));
        }
    }

    @Override // u2.j0
    public final void f(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new c1(this, l4, tVar, b0Var, iOException, z10, 0));
        }
    }

    @Override // n2.l
    public final void g(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new a1(this, l4, 1));
        }
    }

    @Override // u2.j0
    public final void h(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new l3(this, l4, tVar, b0Var, i11, 4));
        }
    }

    @Override // n2.l
    public final void i(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new a1(this, l4, 2));
        }
    }

    @Override // u2.j0
    public final void j(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new b1(this, l4, tVar, b0Var, 0));
        }
    }

    @Override // n2.l
    public final void k(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new a1(this, l4, 0));
        }
    }

    public final Pair l(int i10, u2.f0 f0Var) {
        u2.f0 f0Var2;
        f1 f1Var = this.a;
        u2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= f1Var.c.size()) {
                    f0Var2 = null;
                    break;
                }
                if (((u2.f0) f1Var.c.get(i11)).d == f0Var.d) {
                    Object obj = f0Var.a;
                    Object obj2 = f1Var.b;
                    int i12 = a.g;
                    f0Var2 = f0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (f0Var2 == null) {
                return null;
            }
            f0Var3 = f0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + f1Var.d), f0Var3);
    }
}
