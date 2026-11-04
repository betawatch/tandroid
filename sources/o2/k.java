package o2;

import d2.v;
import g9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends m implements n2.i {
    public final n n;

    public k(v vVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(vVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // n2.i
    public final boolean A() {
        return this.n.i();
    }

    @Override // n2.i
    public final long C() {
        return this.n.d;
    }

    @Override // n2.i
    public final long H(long j10) {
        return this.n.d(j10);
    }

    @Override // n2.i
    public final long K(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // o2.m
    public final String a() {
        return null;
    }

    @Override // n2.i
    public final long b(long j10) {
        return this.n.g(j10);
    }

    @Override // o2.m
    public final j d() {
        return null;
    }

    @Override // n2.i
    public final long i(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // n2.i
    public final long j(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // n2.i
    public final long l(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // n2.i
    public final j m(long j10) {
        return this.n.h(this, j10);
    }

    @Override // n2.i
    public final long s(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // o2.m
    public final n2.i c() {
        return this;
    }
}
