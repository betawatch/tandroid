package l2;

import android.net.Uri;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d implements y2.i {
    public final /* synthetic */ i a;

    @Override // y2.i
    public void C(y2.k kVar, long j3, long j10, boolean z10) {
        this.a.w((y2.q) kVar, j10);
    }

    public void a() {
        long j3;
        i iVar = this.a;
        synchronized (z2.b.b) {
            try {
                j3 = z2.b.c ? z2.b.d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iVar.L = j3;
        iVar.y(true);
    }

    @Override // y2.i
    public k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        y2.q qVar = (y2.q) kVar;
        i iVar = this.a;
        a5.a aVar = iVar.q;
        long j11 = qVar.a;
        Uri uri = qVar.d.c;
        aVar.q(new u(j10), qVar.c, iOException, true);
        iVar.m.getClass();
        iVar.x(iOException);
        return y2.n.e;
    }

    @Override // y2.i
    public void p(y2.k kVar, long j3, long j10) {
        y2.q qVar = (y2.q) kVar;
        i iVar = this.a;
        long j11 = qVar.a;
        Uri uri = qVar.d.c;
        u uVar = new u(j10);
        iVar.m.getClass();
        iVar.q.o(uVar, qVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        iVar.L = ((Long) qVar.f).longValue() - j3;
        iVar.y(true);
    }

    @Override // y2.i
    public /* synthetic */ void l(y2.k kVar, long j3, long j10, int i10) {
    }
}
