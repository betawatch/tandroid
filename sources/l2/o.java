package l2;

import android.os.Handler;
import b2.t0;
import b2.w;
import b2.w0;
import c3.i0;
import c3.j0;
import e2.m0;
import e2.x;
import org.telegram.ui.Components.ep0;
import u2.b1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o implements j0 {
    public final b1 a;
    public final qf.b b = new qf.b(22);
    public final l3.a c = new l3.a();
    public long d = -9223372036854775807L;
    public final /* synthetic */ p e;

    public o(p pVar, androidx.biometric.e eVar) {
        this.e = pVar;
        this.a = new b1(eVar, null, null);
    }

    @Override // c3.j0
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override // c3.j0
    public final void b(w wVar) {
        this.a.b(wVar);
    }

    @Override // c3.j0
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11;
        long j12;
        this.a.c(j10, i10, i11, i12, i0Var);
        while (this.a.A(false)) {
            l3.a aVar = this.c;
            aVar.clear();
            if (this.a.F(this.b, aVar, 0, false) == -4) {
                aVar.f();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                t0 a2 = this.e.c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = m0.V(m0.r(aVar2.e));
                        } catch (w0 unused) {
                            j12 = -9223372036854775807L;
                        }
                        if (j12 != -9223372036854775807L) {
                            n nVar = new n(j13, j12);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.a;
        ep0 ep0Var = b1Var.a;
        synchronized (b1Var) {
            int i13 = b1Var.s;
            j11 = i13 == 0 ? -1L : b1Var.j(i13);
        }
        ep0Var.b(j11);
    }

    @Override // c3.j0
    public final void d(int i10, x xVar) {
        g(xVar, i10, 0);
    }

    @Override // c3.j0
    public final int f(b2.o oVar, int i10, boolean z10) {
        b1 b1Var = this.a;
        b1Var.getClass();
        return b1Var.f(oVar, i10, z10);
    }

    @Override // c3.j0
    public final void g(x xVar, int i10, int i11) {
        b1 b1Var = this.a;
        b1Var.getClass();
        b1Var.g(xVar, i10, 0);
    }

    @Override // c3.j0
    public final /* synthetic */ void e(long j10) {
    }
}
