package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class d implements y2.g {
    public final /* synthetic */ g a;

    @Override // y2.g
    public void E(y2.i iVar, long j3, long j10, boolean z10) {
        this.a.w((y2.o) iVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.a;
        synchronized (z2.c.b) {
            try {
                j3 = z2.c.c ? z2.c.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.L = j3;
        gVar.y(true);
    }

    @Override // y2.g
    public k4.d m(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.a;
        a5.a aVar = gVar.q;
        long j11 = oVar.a;
        Uri uri = oVar.d.c;
        aVar.r(new t(j10), oVar.c, iOException, true);
        gVar.m.getClass();
        gVar.x(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public void o(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        g gVar = this.a;
        long j11 = oVar.a;
        Uri uri = oVar.d.c;
        t tVar = new t(j10);
        gVar.m.getClass();
        gVar.q.p(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) oVar.f).longValue() - j3;
        gVar.y(true);
    }

    @Override // y2.g
    public /* synthetic */ void n(y2.i iVar, long j3, long j10, int i10) {
    }
}
