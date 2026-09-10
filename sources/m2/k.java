package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k extends m implements l2.j {
    public final n n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // l2.j
    public final boolean E() {
        return this.n.i();
    }

    @Override // l2.j
    public final long J() {
        return this.n.d;
    }

    @Override // l2.j
    public final long K(long j3) {
        return this.n.d(j3);
    }

    @Override // l2.j
    public final long M(long j3, long j10) {
        return this.n.b(j3, j10);
    }

    @Override // l2.j
    public final long a(long j3) {
        return this.n.g(j3);
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // l2.j
    public final long c(long j3, long j10) {
        return this.n.e(j3, j10);
    }

    @Override // m2.m
    public final j e() {
        return null;
    }

    @Override // l2.j
    public final long i(long j3, long j10) {
        return this.n.c(j3, j10);
    }

    @Override // l2.j
    public final long k(long j3, long j10) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.i;
    }

    @Override // l2.j
    public final j m(long j3) {
        return this.n.h(this, j3);
    }

    @Override // l2.j
    public final long w(long j3, long j10) {
        return this.n.f(j3, j10);
    }

    @Override // m2.m
    public final l2.j d() {
        return this;
    }
}
