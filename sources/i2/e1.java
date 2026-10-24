package i2;

import ai.p4;
import ai.vb;
import android.util.Pair;
import ei.z1;
import java.io.IOException;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e1 implements u2.m0, n2.l {
    public final g1 a;
    public final /* synthetic */ h1 b;

    public e1(h1 h1Var, g1 g1Var) {
        this.b = h1Var;
        this.a = g1Var;
    }

    @Override // n2.l
    public final void a(int i10, u2.h0 h0Var, int i11) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new ah.o(this, l4, i11, 17));
        }
    }

    @Override // n2.l
    public final void b(int i10, u2.h0 h0Var, Exception exc) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new z1(this, l4, exc, 22));
        }
    }

    @Override // n2.l
    public final void c(int i10, u2.h0 h0Var, oa.d dVar) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new z1(this, l4, dVar, 21));
        }
    }

    @Override // u2.m0
    public final void d(int i10, u2.h0 h0Var, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new b1(this, l4, d0Var, 0));
        }
    }

    @Override // u2.m0
    public final void e(int i10, u2.h0 h0Var, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new b1(this, l4, d0Var, 1));
        }
    }

    @Override // u2.m0
    public final void f(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new c1(this, l4, vVar, d0Var, 1));
        }
    }

    @Override // u2.m0
    public final void g(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var, IOException iOException, boolean z10) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new p4(this, l4, vVar, d0Var, iOException, z10, 1));
        }
    }

    @Override // n2.l
    public final void h(int i10, u2.h0 h0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new d1(this, l4, 0));
        }
    }

    @Override // u2.m0
    public final void i(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var, int i11) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new vb(this, l4, vVar, d0Var, i11, 5));
        }
    }

    @Override // n2.l
    public final void j(int i10, u2.h0 h0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new d1(this, l4, 1));
        }
    }

    @Override // u2.m0
    public final void k(int i10, u2.h0 h0Var, u2.v vVar, u2.d0 d0Var) {
        Pair l4 = l(i10, h0Var);
        if (l4 != null) {
            this.b.i.d(new c1(this, l4, vVar, d0Var, 0));
        }
    }

    public final Pair l(int i10, u2.h0 h0Var) {
        u2.h0 h0Var2;
        g1 g1Var = this.a;
        u2.h0 h0Var3 = null;
        if (h0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= g1Var.c.size()) {
                    h0Var2 = null;
                    break;
                }
                if (((u2.h0) g1Var.c.get(i11)).d == h0Var.d) {
                    Object obj = h0Var.a;
                    Object obj2 = g1Var.b;
                    int i12 = a.g;
                    h0Var2 = h0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (h0Var2 == null) {
                return null;
            }
            h0Var3 = h0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + g1Var.d), h0Var3);
    }
}
