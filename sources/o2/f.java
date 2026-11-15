package o2;

import a8.xa;
import b3.r;
import j2.b0;
import java.io.IOException;
import x2.t;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f implements b3.j {
    public final /* synthetic */ h a;

    @Override // b3.j
    public b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        r rVar = (r) lVar;
        h hVar = this.a;
        xa xaVar = hVar.q;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        b0 b0Var = rVar.d;
        xaVar.q(new t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b), rVar.c, iOException, true);
        hVar.m.getClass();
        hVar.y(iOException);
        return b3.o.e;
    }

    @Override // b3.j
    public void m(b3.l lVar, long j3, long j10, boolean z10) {
        this.a.x((r) lVar, j3, j10);
    }

    @Override // b3.j
    public void w(b3.l lVar, long j3, long j10) {
        r rVar = (r) lVar;
        h hVar = this.a;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        b0 b0Var = rVar.d;
        t tVar = new t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        hVar.m.getClass();
        hVar.q.o(tVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) rVar.f).longValue() - j3;
        hVar.z(true);
    }

    @Override // b3.j
    public /* synthetic */ void r(b3.l lVar, long j3, long j10, int i7) {
    }
}
