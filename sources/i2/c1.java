package i2;

import android.util.Pair;
import fi.l3;
import java.io.IOException;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c1 implements u2.k0, n2.k {
    public final e1 a;
    public final /* synthetic */ f1 b;

    public c1(f1 f1Var, e1 e1Var) {
        this.b = f1Var;
        this.a = e1Var;
    }

    @Override // n2.k
    public final void a(int i10, u2.f0 f0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new ah.p(this, l4, i11, 13));
        }
    }

    @Override // n2.k
    public final void b(int i10, u2.f0 f0Var, Exception exc) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new hg.t(this, l4, exc, 6));
        }
    }

    @Override // u2.k0
    public final void c(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new y0(this, l4, b0Var, 0));
        }
    }

    @Override // u2.k0
    public final void d(int i10, u2.f0 f0Var, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new y0(this, l4, b0Var, 1));
        }
    }

    @Override // u2.k0
    public final void e(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new a1(this, l4, tVar, b0Var, 1));
        }
    }

    @Override // u2.k0
    public final void f(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new b1(this, l4, tVar, b0Var, iOException, z10, 0));
        }
    }

    @Override // n2.k
    public final void g(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new z0(this, l4, 1));
        }
    }

    @Override // u2.k0
    public final void h(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var, int i11) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new l3(this, l4, tVar, b0Var, i11, 4));
        }
    }

    @Override // n2.k
    public final void i(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new z0(this, l4, 2));
        }
    }

    @Override // u2.k0
    public final void j(int i10, u2.f0 f0Var, u2.t tVar, u2.b0 b0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new a1(this, l4, tVar, b0Var, 0));
        }
    }

    @Override // n2.k
    public final void k(int i10, u2.f0 f0Var) {
        Pair l4 = l(i10, f0Var);
        if (l4 != null) {
            this.b.i.c(new z0(this, l4, 0));
        }
    }

    public final Pair l(int i10, u2.f0 f0Var) {
        u2.f0 f0Var2;
        e1 e1Var = this.a;
        u2.f0 f0Var3 = null;
        if (f0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= e1Var.c.size()) {
                    f0Var2 = null;
                    break;
                }
                if (((u2.f0) e1Var.c.get(i11)).d == f0Var.d) {
                    Object obj = f0Var.a;
                    Object obj2 = e1Var.b;
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
        return Pair.create(Integer.valueOf(i10 + e1Var.d), f0Var3);
    }
}
