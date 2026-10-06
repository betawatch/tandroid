package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class k extends m implements l2.i {
    public final n n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // l2.i
    public final long H(long j3, long j10) {
        return this.n.f(j3, j10);
    }

    @Override // l2.i
    public final long a(long j3) {
        return this.n.g(j3);
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // m2.m
    public final j d() {
        return null;
    }

    @Override // l2.i
    public final boolean e0() {
        return this.n.i();
    }

    @Override // l2.i
    public final long i(long j3, long j10) {
        return this.n.e(j3, j10);
    }

    @Override // l2.i
    public final long j0() {
        return this.n.d;
    }

    @Override // l2.i
    public final long n(long j3, long j10) {
        return this.n.c(j3, j10);
    }

    @Override // l2.i
    public final long p(long j3, long j10) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.i;
    }

    @Override // l2.i
    public final long p0(long j3) {
        return this.n.d(j3);
    }

    @Override // l2.i
    public final j q(long j3) {
        return this.n.h(this, j3);
    }

    @Override // l2.i
    public final long q0(long j3, long j10) {
        return this.n.b(j3, j10);
    }

    @Override // m2.m
    public final l2.i c() {
        return this;
    }
}
