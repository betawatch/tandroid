package n2;

import a3.q;
import a3.t;
import b8.kg;
import i2.c0;
import java.io.IOException;
import w2.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements a3.k {
    public final /* synthetic */ h a;

    @Override // a3.k
    public void h(a3.m mVar, long j10, long j11) {
        t tVar = (t) mVar;
        h hVar = this.a;
        long j12 = tVar.a;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        hVar.m.getClass();
        hVar.q.q(uVar, tVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) tVar.f).longValue() - j10;
        hVar.z(true);
    }

    @Override // a3.k
    public a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        t tVar = (t) mVar;
        h hVar = this.a;
        kg kgVar = hVar.q;
        long j12 = tVar.a;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        kgVar.s(new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b), tVar.c, iOException, true);
        hVar.m.getClass();
        hVar.y(iOException);
        return q.e;
    }

    @Override // a3.k
    public void q0(a3.m mVar, long j10, long j11, boolean z10) {
        this.a.x((t) mVar, j10, j11);
    }

    @Override // a3.k
    public /* synthetic */ void M(a3.m mVar, long j10, long j11, int i3) {
    }
}
