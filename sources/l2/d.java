package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class d implements y2.h {
    public final /* synthetic */ g a;

    @Override // y2.h
    public void V(y2.j jVar, long j3, long j10, boolean z10) {
        this.a.w((p) jVar, j10);
    }

    public void a() {
        long j3;
        g gVar = this.a;
        synchronized (z2.b.b) {
            try {
                j3 = z2.b.c ? z2.b.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.L = j3;
        gVar.y(true);
    }

    @Override // y2.h
    public k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        p pVar = (p) jVar;
        g gVar = this.a;
        a5.a aVar = gVar.q;
        long j11 = pVar.a;
        Uri uri = pVar.d.c;
        aVar.r(new t(j10), pVar.c, iOException, true);
        gVar.m.getClass();
        gVar.x(iOException);
        return y2.m.e;
    }

    @Override // y2.h
    public void q(y2.j jVar, long j3, long j10) {
        p pVar = (p) jVar;
        g gVar = this.a;
        long j11 = pVar.a;
        Uri uri = pVar.d.c;
        t tVar = new t(j10);
        gVar.m.getClass();
        gVar.q.p(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) pVar.f).longValue() - j3;
        gVar.y(true);
    }

    @Override // y2.h
    public /* synthetic */ void o(y2.j jVar, long j3, long j10, int i10) {
    }
}
