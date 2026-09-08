package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;
import y2.p;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d implements y2.h {
    public final /* synthetic */ g a;

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
    public k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        p pVar = (p) jVar;
        g gVar = this.a;
        a5.a aVar = gVar.q;
        long j11 = pVar.a;
        Uri uri = pVar.d.c;
        aVar.q(new t(j10), pVar.c, iOException, true);
        gVar.m.getClass();
        gVar.x(iOException);
        return y2.m.e;
    }

    @Override // y2.h
    public void i(y2.j jVar, long j3, long j10) {
        p pVar = (p) jVar;
        g gVar = this.a;
        long j11 = pVar.a;
        Uri uri = pVar.d.c;
        t tVar = new t(j10);
        gVar.m.getClass();
        gVar.q.o(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) pVar.f).longValue() - j3;
        gVar.y(true);
    }

    @Override // y2.h
    public void w(y2.j jVar, long j3, long j10, boolean z10) {
        this.a.w((p) jVar, j10);
    }

    @Override // y2.h
    public /* synthetic */ void h(y2.j jVar, long j3, long j10, int i10) {
    }
}
