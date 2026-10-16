package c3;

import b2.w0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d0 implements o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public q f;
    public i0 g;

    public d0(int i10, int i11, String str) {
        this.a = i10;
        this.b = i11;
        this.c = str;
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        int i10 = this.b;
        int i11 = this.a;
        u6.p((i11 == -1 || i10 == -1) ? false : true);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).j(xVar.a, 0, i10, false);
        return xVar.H() == i11;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.f = qVar;
        i0 W = qVar.W(1024, 4);
        this.g = W;
        b2.w wVar = new b2.w();
        String str = this.c;
        wVar.q = w0.n(str);
        wVar.r = w0.n(str);
        i2.d.u(wVar, W);
        this.f.D();
        this.f.K(new e0());
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
        l0 l0Var = n0.b;
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
        i0 i0Var = this.g;
        i0Var.getClass();
        int a2 = i0Var.a(pVar, 1024, true);
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
