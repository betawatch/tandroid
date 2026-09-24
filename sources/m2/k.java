package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class k extends m implements l2.h {
    public final n n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // l2.h
    public final long A(long j3, long j10) {
        return this.n.b(j3, j10);
    }

    @Override // m2.m
    public final String a() {
        return null;
    }

    @Override // l2.h
    public final long b(long j3) {
        return this.n.g(j3);
    }

    @Override // l2.h
    public final long c(long j3, long j10) {
        return this.n.e(j3, j10);
    }

    @Override // m2.m
    public final j e() {
        return null;
    }

    @Override // l2.h
    public final long f(long j3, long j10) {
        return this.n.c(j3, j10);
    }

    @Override // l2.h
    public final long j(long j3, long j10) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.i;
    }

    @Override // l2.h
    public final j k(long j3) {
        return this.n.h(this, j3);
    }

    @Override // l2.h
    public final long s(long j3, long j10) {
        return this.n.f(j3, j10);
    }

    @Override // l2.h
    public final boolean w() {
        return this.n.i();
    }

    @Override // l2.h
    public final long y() {
        return this.n.d;
    }

    @Override // l2.h
    public final long z(long j3) {
        return this.n.d(j3);
    }

    @Override // m2.m
    public final l2.h d() {
        return this;
    }
}
