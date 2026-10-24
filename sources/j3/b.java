package j3;

import c3.g0;
import c3.l;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.k8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b implements q {
    public final q a;
    public final boolean b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.b = z10;
        if (z10) {
            this.a = new g0(-1, -1, "image/heif");
        } else {
            this.a = new a();
        }
    }

    @Override // c3.q
    public final boolean a(r rVar) {
        return this.b ? k8.a((l) rVar, false) : this.a.a(rVar);
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.a.c(sVar);
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        this.a.d(j10, j11);
    }

    @Override // c3.q
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.q
    public final int f(r rVar, u uVar) {
        return this.a.f(rVar, uVar);
    }

    @Override // c3.q
    public final void release() {
        this.a.release();
    }

    @Override // c3.q
    public final q b() {
        return this;
    }
}
