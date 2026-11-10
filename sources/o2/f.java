package o2;

import a8.wa;
import b3.r;
import j2.c0;
import java.io.IOException;
import x2.t;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f implements b3.j {
    public final /* synthetic */ h a;

    @Override // b3.j
    public b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        r rVar = (r) lVar;
        h hVar = this.a;
        wa waVar = hVar.q;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        waVar.r(new t(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b), rVar.c, iOException, true);
        hVar.m.getClass();
        hVar.y(iOException);
        return b3.o.e;
    }

    @Override // b3.j
    public void o1(b3.l lVar, long j3, long j10) {
        r rVar = (r) lVar;
        h hVar = this.a;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        t tVar = new t(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        hVar.m.getClass();
        hVar.q.p(tVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) rVar.f).longValue() - j3;
        hVar.z(true);
    }

    @Override // b3.j
    public void q0(b3.l lVar, long j3, long j10, boolean z9) {
        this.a.x((r) lVar, j3, j10);
    }

    @Override // b3.j
    public /* synthetic */ void M0(b3.l lVar, long j3, long j10, int i7) {
    }
}
