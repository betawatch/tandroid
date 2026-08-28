package m4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import j4.h0;
import j4.q;
import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        q qVar = new q();
        g gVar = this.a;
        gVar.n.getClass();
        gVar.q.d(qVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public k0 h(n0 n0Var, IOException iOException, int i9) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.a;
        h0 h0Var = gVar.q;
        long j10 = t0Var.a;
        Uri uri = t0Var.d.c;
        h0Var.i(new q(), t0Var.c, iOException, true);
        gVar.n.getClass();
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return q0.e;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.a;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        q qVar = new q();
        gVar.n.getClass();
        gVar.q.f(qVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) t0Var.f).longValue() - j10;
        gVar.u(true);
    }
}
