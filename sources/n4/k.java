package n4;

import h3.t0;
import java.util.ArrayList;
import java.util.List;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends m implements m4.h {
    public final n n;

    public k(t0 t0Var, z zVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // m4.h
    public final long C(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // m4.h
    public final long a(long j10) {
        return this.n.g(j10);
    }

    @Override // n4.m
    public final String b() {
        return null;
    }

    @Override // n4.m
    public final j d() {
        return null;
    }

    @Override // m4.h
    public final long f(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // m4.h
    public final long i(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // m4.h
    public final long j(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // m4.h
    public final j l(long j10) {
        return this.n.h(this, j10);
    }

    @Override // m4.h
    public final long q(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // m4.h
    public final boolean v() {
        return this.n.i();
    }

    @Override // m4.h
    public final long x() {
        return this.n.d;
    }

    @Override // m4.h
    public final long z(long j10) {
        return this.n.d(j10);
    }

    @Override // n4.m
    public final m4.h c() {
        return this;
    }
}
