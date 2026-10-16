package m2;

import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class k extends m implements l2.h {
    public final n n;

    public k(x xVar, n0 n0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // l2.h
    public final long a(long j10) {
        return this.n.g(j10);
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // l2.h
    public final long c(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // l2.h
    public final long e(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // l2.h
    public final long f(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // m2.m
    public final j g() {
        return null;
    }

    @Override // l2.h
    public final j h(long j10) {
        return this.n.h(this, j10);
    }

    @Override // l2.h
    public final long n(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // l2.h
    public final boolean s() {
        return this.n.i();
    }

    @Override // l2.h
    public final long u() {
        return this.n.d;
    }

    @Override // l2.h
    public final long w(long j10) {
        return this.n.d(j10);
    }

    @Override // l2.h
    public final long x(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // m2.m
    public final l2.h d() {
        return this;
    }
}
