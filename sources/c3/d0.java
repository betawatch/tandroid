package c3;

import b2.v0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 implements o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public q f;
    public k0 g;

    public d0(int i10, int i11, String str) {
        this.a = i10;
        this.b = i11;
        this.c = str;
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        int i10 = this.b;
        int i11 = this.a;
        t6.p((i11 == -1 || i10 == -1) ? false : true);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).j(xVar.a, 0, i10, false);
        return xVar.H() == i11;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.f = qVar;
        k0 I1 = qVar.I1(1024, 4);
        this.g = I1;
        b2.w wVar = new b2.w();
        String str = this.c;
        wVar.q = v0.n(str);
        wVar.r = v0.n(str);
        i0.a.r(wVar, I1);
        this.f.Q0();
        this.f.G1(new e0());
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
        e9.l0 l0Var = n0.b;
        return x1.e;
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
        k0 k0Var = this.g;
        k0Var.getClass();
        int a2 = k0Var.a(pVar, 1024, true);
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
