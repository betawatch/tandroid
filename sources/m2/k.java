package m2;

import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends m implements l2.i {
    public final n n;

    public k(x xVar, n0 n0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // l2.i
    public final long A(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // l2.i
    public final long a(long j10) {
        return this.n.g(j10);
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // l2.i
    public final long c(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // l2.i
    public final long e(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // l2.i
    public final long f(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // l2.i
    public final j g(long j10) {
        return this.n.h(this, j10);
    }

    @Override // m2.m
    public final j h() {
        return null;
    }

    @Override // l2.i
    public final long o(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // l2.i
    public final boolean t() {
        return this.n.i();
    }

    @Override // l2.i
    public final long u() {
        return this.n.d;
    }

    @Override // l2.i
    public final long z(long j10) {
        return this.n.d(j10);
    }

    @Override // m2.m
    public final l2.i d() {
        return this;
    }
}
