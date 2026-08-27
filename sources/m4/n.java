package m4;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.r;
import d5.g0;
import d5.z;
import h3.t0;
import h3.t1;
import h3.u0;
import j4.a1;
import j4.v0;
import m3.v;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements w {
    public final a1 a;
    public final u0 b = new u0();
    public final z3.e c = new z3.e();
    public long d = -9223372036854775807L;
    public final /* synthetic */ o e;

    public n(o oVar, r rVar) {
        this.e = oVar;
        this.a = new a1(rVar, null, null);
    }

    @Override // m3.w
    public final /* synthetic */ void a(int i10, z zVar) {
        i0.a.a(this, zVar, i10);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        a1 a1Var = this.a;
        a1Var.getClass();
        return a1Var.C(jVar, i10, z10);
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
        this.a.c(t0Var);
    }

    @Override // m3.w
    public final void d(int i10, z zVar) {
        a1 a1Var = this.a;
        a1Var.getClass();
        a1Var.d(i10, zVar);
    }

    @Override // m3.w
    public final void e(long j10, int i10, int i11, int i12, v vVar) {
        long g10;
        long j11;
        this.a.e(j10, i10, i11, i12, vVar);
        while (this.a.u(false)) {
            z3.e eVar = this.c;
            eVar.clear();
            if (this.a.z(this.b, eVar, 0, false) == -4) {
                eVar.d();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j12 = eVar.d;
                z3.c a2 = this.e.c.a(eVar);
                if (a2 != null) {
                    b4.a aVar = (b4.a) a2.a[0];
                    String str = aVar.a;
                    String str2 = aVar.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = g0.K(g0.l(aVar.e));
                        } catch (t1 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            m mVar = new m(j12, j11);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.a;
        v0 v0Var = a1Var.a;
        synchronized (a1Var) {
            int i13 = a1Var.s;
            g10 = i13 == 0 ? -1L : a1Var.g(i13);
        }
        v0Var.b(g10);
    }
}
