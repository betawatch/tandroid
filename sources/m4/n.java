package m4;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.r;
import d5.f0;
import d5.y;
import h3.t0;
import h3.t1;
import h3.u0;
import j3.r0;
import j4.a1;
import j4.w0;
import m3.v;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final /* synthetic */ void a(int i9, y yVar) {
        r0.a(this, yVar, i9);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        a1 a1Var = this.a;
        a1Var.getClass();
        return a1Var.C(jVar, i9, z10);
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
        this.a.c(t0Var);
    }

    @Override // m3.w
    public final void d(int i9, y yVar) {
        a1 a1Var = this.a;
        a1Var.getClass();
        a1Var.d(i9, yVar);
    }

    @Override // m3.w
    public final void e(long j10, int i9, int i10, int i11, v vVar) {
        long g10;
        long j11;
        this.a.e(j10, i9, i10, i11, vVar);
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
                            j11 = f0.K(f0.l(aVar.e));
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
        w0 w0Var = a1Var.a;
        synchronized (a1Var) {
            int i12 = a1Var.s;
            g10 = i12 == 0 ? -1L : a1Var.g(i12);
        }
        w0Var.b(g10);
    }
}
