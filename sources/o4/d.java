package o4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import java.io.IOException;
import l4.g0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements l0 {
    public final /* synthetic */ h a;

    public /* synthetic */ d(h hVar) {
        this.a = hVar;
    }

    public void a() {
        long j10;
        h hVar = this.a;
        synchronized (f5.a.i) {
            try {
                j10 = f5.a.j ? f5.a.k : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.L = j10;
        hVar.u(true);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void g(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        l4.p pVar = new l4.p();
        h hVar = this.a;
        hVar.n.getClass();
        hVar.q.d(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public k0 j(n0 n0Var, IOException iOException, int i10) {
        t0 t0Var = (t0) n0Var;
        h hVar = this.a;
        g0 g0Var = hVar.q;
        long j10 = t0Var.a;
        Uri uri = t0Var.d.c;
        g0Var.i(new l4.p(), t0Var.c, iOException, true);
        hVar.n.getClass();
        f5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.u(true);
        return q0.e;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        h hVar = this.a;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        l4.p pVar = new l4.p();
        hVar.n.getClass();
        hVar.q.f(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.L = ((Long) t0Var.f).longValue() - j10;
        hVar.u(true);
    }
}
