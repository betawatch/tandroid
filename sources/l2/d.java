package l2;

import android.net.Uri;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class d implements y2.g {
    public final /* synthetic */ h a;

    public void a() {
        long j3;
        h hVar = this.a;
        synchronized (z2.b.b) {
            try {
                j3 = z2.b.c ? z2.b.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.L = j3;
        hVar.y(true);
    }

    @Override // y2.g
    public k4.d s(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.a;
        a5.a aVar = hVar.q;
        long j11 = oVar.a;
        Uri uri = oVar.d.c;
        aVar.r(new t(j10), oVar.c, iOException, true);
        hVar.m.getClass();
        hVar.x(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public void v(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        h hVar = this.a;
        long j11 = oVar.a;
        Uri uri = oVar.d.c;
        t tVar = new t(j10);
        hVar.m.getClass();
        hVar.q.p(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.L = ((Long) oVar.f).longValue() - j3;
        hVar.y(true);
    }

    @Override // y2.g
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
        this.a.w((y2.o) iVar, j10);
    }

    @Override // y2.g
    public /* synthetic */ void t(y2.i iVar, long j3, long j10, int i10) {
    }
}
