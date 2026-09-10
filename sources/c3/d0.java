package c3;

import b2.r0;
import e9.a1;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d0 implements o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public q f;
    public h0 g;

    public d0(int i10, int i11, String str) {
        this.a = i10;
        this.b = i11;
        this.c = str;
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        int i10 = this.b;
        int i11 = this.a;
        e2.d.g((i11 == -1 || i10 == -1) ? false : true);
        e2.v vVar = new e2.v(i10);
        ((l) pVar).g(vVar.a, 0, i10, false);
        return vVar.D() == i11;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.f = qVar;
        h0 I = qVar.I(1024, 4);
        this.g = I;
        b2.r rVar = new b2.r();
        String str = this.c;
        rVar.p = r0.n(str);
        rVar.q = r0.n(str);
        hc.b.u(rVar, I);
        this.f.B();
        this.f.G(new e0());
        this.e = 1;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        if (j3 == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // c3.o
    public final List i() {
        e9.g0 g0Var = e9.i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(p pVar, s sVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        h0 h0Var = this.g;
        h0Var.getClass();
        int a2 = h0Var.a(pVar, 1024, true);
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
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
