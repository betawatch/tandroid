package i2;

import ai.p4;
import ai.ub;
import android.util.Pair;
import ei.z1;
import java.io.IOException;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class f1 implements u2.l0, n2.l {
    public final h1 a;
    public final /* synthetic */ i1 b;

    public f1(i1 i1Var, h1 h1Var) {
        this.b = i1Var;
        this.a = h1Var;
    }

    @Override // n2.l
    public final void a(int i10, u2.g0 g0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new ah.o(this, l4, i11, 17));
        }
    }

    @Override // n2.l
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new z1(this, l4, exc, 22));
        }
    }

    @Override // n2.l
    public final void c(int i10, u2.g0 g0Var, oa.d dVar) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new z1(this, l4, dVar, 21));
        }
    }

    @Override // u2.l0
    public final void d(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new c1(this, l4, c0Var, 0));
        }
    }

    @Override // u2.l0
    public final void e(int i10, u2.g0 g0Var, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new c1(this, l4, c0Var, 1));
        }
    }

    @Override // u2.l0
    public final void f(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new d1(this, l4, uVar, c0Var, 1));
        }
    }

    @Override // u2.l0
    public final void g(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new p4(this, l4, uVar, c0Var, iOException, z10, 1));
        }
    }

    @Override // n2.l
    public final void h(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new e1(this, l4, 0));
        }
    }

    @Override // u2.l0
    public final void i(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var, int i11) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new ub(this, l4, uVar, c0Var, i11, 5));
        }
    }

    @Override // n2.l
    public final void j(int i10, u2.g0 g0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new e1(this, l4, 1));
        }
    }

    @Override // u2.l0
    public final void k(int i10, u2.g0 g0Var, u2.u uVar, u2.c0 c0Var) {
        Pair l4 = l(i10, g0Var);
        if (l4 != null) {
            this.b.i.d(new d1(this, l4, uVar, c0Var, 0));
        }
    }

    public final Pair l(int i10, u2.g0 g0Var) {
        u2.g0 g0Var2;
        h1 h1Var = this.a;
        u2.g0 g0Var3 = null;
        if (g0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= h1Var.c.size()) {
                    g0Var2 = null;
                    break;
                }
                if (((u2.g0) h1Var.c.get(i11)).d == g0Var.d) {
                    Object obj = g0Var.a;
                    Object obj2 = h1Var.b;
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
        return Pair.create(Integer.valueOf(i10 + h1Var.d), g0Var3);
    }
}
