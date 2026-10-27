package c3;

import a8.yb;
import b2.w0;
import f9.s1;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d0 implements o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public q f;
    public j0 g;

    public d0(int i10, int i11, String str) {
        this.a = i10;
        this.b = i11;
        this.c = str;
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        int i10 = this.b;
        int i11 = this.a;
        yb.p((i11 == -1 || i10 == -1) ? false : true);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).h(xVar.a, 0, i10, false);
        return xVar.H() == i11;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.f = qVar;
        j0 F1 = qVar.F1(1024, 4);
        this.g = F1;
        b2.w wVar = new b2.w();
        String str = this.c;
        wVar.q = w0.n(str);
        wVar.r = w0.n(str);
        ic.a.u(wVar, F1);
        this.f.Q0();
        this.f.D1(new e0());
        this.e = 1;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        if (j10 == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // c3.o
    public final List e() {
        f9.g0 g0Var = f9.i0.b;
        return s1.e;
    }

    @Override // c3.o
    public final int f(p pVar, s sVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        j0 j0Var = this.g;
        j0Var.getClass();
        int a2 = j0Var.a(pVar, 1024, true);
        if (a2 != -1) {
            this.d += a2;
            return 0;
        }
        this.e = 2;
        this.g.c(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
