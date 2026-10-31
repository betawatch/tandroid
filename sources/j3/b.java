package j3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.j8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements o {
    public final o a;
    public final boolean b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.b = z10;
        if (z10) {
            this.a = new d0(-1, -1, "image/heif");
        } else {
            this.a = new a();
        }
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        return this.b ? j8.a((l) pVar, false) : this.a.a(pVar);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.a.c(qVar);
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.a.d(j10, j11);
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.o
    public final int f(p pVar, s sVar) {
        return this.a.f(pVar, sVar);
    }

    @Override // c3.o
    public final void release() {
        this.a.release();
    }

    @Override // c3.o
    public final o b() {
        return this;
    }
}
