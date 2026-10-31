package l2;

import g2.c0;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements y2.g {
    public final /* synthetic */ h a;

    @Override // y2.g
    public void M(y2.i iVar, long j10, long j11, boolean z10) {
        this.a.x((y2.o) iVar, j10, j11);
    }

    public void a() {
        long j10;
        h hVar = this.a;
        synchronized (z2.b.b) {
            try {
                j10 = z2.b.c ? z2.b.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.K = j10;
        hVar.z(true);
    }

    @Override // y2.g
    public k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.a;
        a5.a aVar = hVar.q;
        long j12 = oVar.a;
        g2.n nVar = oVar.b;
        c0 c0Var = oVar.d;
        aVar.s(new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b), oVar.c, iOException, true);
        hVar.m.getClass();
        hVar.y(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public void o(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.a;
        long j12 = oVar.a;
        g2.n nVar = oVar.b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        hVar.m.getClass();
        hVar.q.q(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) oVar.f).longValue() - j10;
        hVar.z(true);
    }

    @Override // y2.g
    public /* synthetic */ void n(y2.i iVar, long j10, long j11, int i10) {
    }
}
