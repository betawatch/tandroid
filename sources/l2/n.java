package l2;

import android.os.Handler;
import b2.p;
import b2.u0;
import b2.x;
import b2.x0;
import c3.h0;
import c3.i0;
import e2.m0;
import org.telegram.ui.Components.ip0;
import u2.c1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class n implements i0 {
    public final c1 a;
    public final qf.b b = new qf.b(24);
    public final l3.a c = new l3.a();
    public long d = -9223372036854775807L;
    public final /* synthetic */ o e;

    public n(o oVar, androidx.biometric.e eVar) {
        this.e = oVar;
        this.a = new c1(eVar, null, null);
    }

    @Override // c3.i0
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.i0
    public final void b(x xVar) {
        this.a.b(xVar);
    }

    @Override // c3.i0
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
        long j11;
        long j12;
        this.a.c(j10, i10, i11, i12, h0Var);
        while (this.a.A(false)) {
            l3.a aVar = this.c;
            aVar.clear();
            if (this.a.F(this.b, aVar, 0, false) == -4) {
                aVar.d();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                u0 a2 = this.e.c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = m0.V(m0.r(aVar2.e));
                        } catch (x0 unused) {
                            j12 = -9223372036854775807L;
                        }
                        if (j12 != -9223372036854775807L) {
                            m mVar = new m(j13, j12);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.a;
        ip0 ip0Var = c1Var.a;
        synchronized (c1Var) {
            int i13 = c1Var.s;
            j11 = i13 == 0 ? -1L : c1Var.j(i13);
        }
        ip0Var.b(j11);
    }

    @Override // c3.i0
    public final void d(int i10, e2.x xVar) {
        g(xVar, i10, 0);
    }

    @Override // c3.i0
    public final int f(p pVar, int i10, boolean z10) {
        c1 c1Var = this.a;
        c1Var.getClass();
        return c1Var.f(pVar, i10, z10);
    }

    @Override // c3.i0
    public final void g(e2.x xVar, int i10, int i11) {
        c1 c1Var = this.a;
        c1Var.getClass();
        c1Var.g(xVar, i10, 0);
    }

    @Override // c3.i0
    public final /* synthetic */ void e(long j10) {
    }
}
