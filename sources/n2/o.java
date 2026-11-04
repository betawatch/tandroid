package n2;

import android.os.Handler;
import android.support.v4.media.session.a0;
import d2.s0;
import d2.v;
import d2.v0;
import e3.h0;
import e3.i0;
import g2.n0;
import g2.y;
import org.telegram.ui.Components.rm0;
import w2.c1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements i0 {
    public final c1 a;
    public final tf.b b = new tf.b();
    public final n3.a c = new n3.a();
    public long d = -9223372036854775807L;
    public final /* synthetic */ p e;

    public o(p pVar, a0 a0Var) {
        this.e = pVar;
        this.a = new c1(a0Var, null, null);
    }

    @Override // e3.i0
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(d2.o oVar, int i3, boolean z10) {
        c1 c1Var = this.a;
        c1Var.getClass();
        return c1Var.c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        long j11;
        long j12;
        this.a.d(j10, i3, i10, i11, h0Var);
        while (this.a.A(false)) {
            n3.a aVar = this.c;
            aVar.clear();
            if (this.a.F(this.b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                s0 a10 = this.e.c.a(aVar);
                if (a10 != null) {
                    p3.a aVar2 = (p3.a) a10.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = n0.V(n0.r(aVar2.e));
                        } catch (v0 unused) {
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
        c1 c1Var = this.a;
        rm0 rm0Var = c1Var.a;
        synchronized (c1Var) {
            int i12 = c1Var.s;
            j11 = i12 == 0 ? -1L : c1Var.j(i12);
        }
        rm0Var.b(j11);
    }

    @Override // e3.i0
    public final void e(int i3, y yVar) {
        f(yVar, i3, 0);
    }

    @Override // e3.i0
    public final void f(y yVar, int i3, int i10) {
        c1 c1Var = this.a;
        c1Var.getClass();
        c1Var.f(yVar, i3, 0);
    }

    @Override // e3.i0
    public final void g(v vVar) {
        this.a.g(vVar);
    }

    @Override // e3.i0
    public final /* synthetic */ void b(long j10) {
    }
}
