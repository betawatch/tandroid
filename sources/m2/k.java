package m2;

import b2.x;
import f9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k extends m implements l2.h {
    public final n n;

    public k(x xVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // l2.h
    public final boolean N() {
        return this.n.i();
    }

    @Override // l2.h
    public final long R() {
        return this.n.d;
    }

    @Override // l2.h
    public final long V(long j10) {
        return this.n.d(j10);
    }

    @Override // l2.h
    public final long W(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // l2.h
    public final long a(long j10) {
        return this.n.g(j10);
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // m2.m
    public final j d() {
        return null;
    }

    @Override // l2.h
    public final long e(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // l2.h
    public final long g(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // l2.h
    public final long k(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // l2.h
    public final j l(long j10) {
        return this.n.h(this, j10);
    }

    @Override // l2.h
    public final long t(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // m2.m
    public final l2.h c() {
        return this;
    }
}
