package m4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import j4.g0;
import j4.p;
import java.io.IOException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements l0 {
    public final /* synthetic */ g a;

    public /* synthetic */ d(g gVar) {
        this.a = gVar;
    }

    public void a() {
        long j10;
        g gVar = this.a;
        synchronized (d5.a.i) {
            try {
                j10 = d5.a.j ? d5.a.k : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.L = j10;
        gVar.u(true);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void d(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        p pVar = new p();
        g gVar = this.a;
        gVar.n.getClass();
        gVar.q.d(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public k0 h(n0 n0Var, IOException iOException, int i10) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.a;
        g0 g0Var = gVar.q;
        long j10 = t0Var.a;
        Uri uri = t0Var.d.c;
        g0Var.i(new p(), t0Var.c, iOException, true);
        gVar.n.getClass();
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return q0.e;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void l(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.a;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        p pVar = new p();
        gVar.n.getClass();
        gVar.q.f(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) t0Var.f).longValue() - j10;
        gVar.u(true);
    }
}
