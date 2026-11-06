package f3;

import a8.ia;
import e2.s0;
import h9.t1;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e0 implements o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public q f;
    public j0 g;

    public e0(int i7, int i10, String str) {
        this.a = i7;
        this.b = i10;
        this.c = str;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        int i7 = this.b;
        int i10 = this.a;
        ia.p((i10 == -1 || i7 == -1) ? false : true);
        h2.x xVar = new h2.x(i7);
        ((l) pVar).k(xVar.a, 0, i7, false);
        return xVar.H() == i10;
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.f = qVar;
        j0 O1 = qVar.O1(1024, 4);
        this.g = O1;
        e2.t tVar = new e2.t();
        String str = this.c;
        tVar.q = s0.n(str);
        tVar.r = s0.n(str);
        f1.s(tVar, O1);
        this.f.U0();
        this.f.f(new f0());
        this.e = 1;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        if (j3 == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // f3.o
    public final List e() {
        h9.g0 g0Var = h9.i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(p pVar, s sVar) {
        int i7 = this.e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        j0 j0Var = this.g;
        j0Var.getClass();
        int e10 = j0Var.e(pVar, 1024, true);
        if (e10 != -1) {
            this.d += e10;
            return 0;
        }
        this.e = 2;
        this.g.c(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
