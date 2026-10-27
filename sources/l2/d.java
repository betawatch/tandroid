package l2;

import a8.ng;
import g2.b0;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d implements y2.g {
    public final /* synthetic */ g a;

    @Override // y2.g
    public void B(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.a;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        gVar.m.getClass();
        gVar.q.q(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.K = ((Long) oVar.f).longValue() - j10;
        gVar.z(true);
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
    public void l0(y2.i iVar, long j10, long j11, boolean z10) {
        this.a.x((y2.o) iVar, j10, j11);
    }

    @Override // y2.g
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.a;
        ng ngVar = gVar.q;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        ngVar.s(new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b), oVar.c, iOException, true);
        gVar.m.getClass();
        gVar.y(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public /* synthetic */ void z(y2.i iVar, long j10, long j11, int i10) {
    }
}
