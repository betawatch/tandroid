package m2;

import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class k extends m implements l2.i {
    public final n n;

    public k(x xVar, n0 n0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // m2.m
    public final String a() {
        return null;
    }

    @Override // l2.i
    public final long b(long j10) {
        return this.n.g(j10);
    }

    @Override // l2.i
    public final long c(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // l2.i
    public final long e(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // m2.m
    public final j f() {
        return null;
    }

    @Override // l2.i
    public final long h(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // l2.i
    public final j i(long j10) {
        return this.n.h(this, j10);
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
    public final long w(long j10) {
        return this.n.d(j10);
    }

    @Override // l2.i
    public final long x(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // m2.m
    public final l2.i d() {
        return this;
    }
}
