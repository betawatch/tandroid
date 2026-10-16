package l2;

import g2.b0;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d implements y2.g {
    public final /* synthetic */ g a;

    @Override // y2.g
    public void A(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.a;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        gVar.m.getClass();
        gVar.q.r(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.K = ((Long) oVar.f).longValue() - j10;
        gVar.z(true);
    }

    @Override // y2.g
    public void X0(y2.i iVar, long j10, long j11, boolean z10) {
        this.a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        g gVar = this.a;
        synchronized (z2.b.b) {
            try {
                j10 = z2.b.c ? z2.b.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.K = j10;
        gVar.z(true);
    }

    @Override // y2.g
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.a;
        a5.a aVar = gVar.q;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        aVar.t(new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b), oVar.c, iOException, true);
        gVar.m.getClass();
        gVar.y(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public /* synthetic */ void y(y2.i iVar, long j10, long j11, int i10) {
    }
}
