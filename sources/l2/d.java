package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class d implements y2.h {
    public final /* synthetic */ g a;

    @Override // y2.h
    public void E(y2.j jVar, long j3, long j10, boolean z10) {
        this.a.w((p) jVar, j10);
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

    @Override // y2.h
    public k4.d m(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
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
    public void o(y2.j jVar, long j3, long j10) {
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
    public /* synthetic */ void n(y2.j jVar, long j3, long j10, int i10) {
    }
}
