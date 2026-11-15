package o2;

import android.os.Handler;
import e2.q0;
import e2.t0;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
import org.telegram.ui.Components.sm0;
import x2.a1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o implements i0 {
    public final a1 a;
    public final k8.a b = new k8.a(1, false);
    public final o3.a c = new o3.a();
    public long d = -9223372036854775807L;
    public final /* synthetic */ p e;

    public o(p pVar, h6.m mVar) {
        this.e = pVar;
        this.a = new a1(mVar, null, null);
    }

    @Override // f3.i0
    public final void a(x xVar, int i7, int i10) {
        a1 a1Var = this.a;
        a1Var.getClass();
        a1Var.a(xVar, i7, 0);
    }

    @Override // f3.i0
    public final void b(int i7, x xVar) {
        a(xVar, i7, 0);
    }

    @Override // f3.i0
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        long j10;
        long j11;
        this.a.c(j3, i7, i10, i11, h0Var);
        while (this.a.A(false)) {
            o3.a aVar = this.c;
            aVar.clear();
            if (this.a.F(this.b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.e;
                q0 a10 = this.e.c.a(aVar);
                if (a10 != null) {
                    q3.a aVar2 = (q3.a) a10.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = l0.V(l0.r(aVar2.e));
                        } catch (t0 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.a;
        sm0 sm0Var = a1Var.a;
        synchronized (a1Var) {
            int i12 = a1Var.s;
            j10 = i12 == 0 ? -1L : a1Var.j(i12);
        }
        sm0Var.b(j10);
    }

    @Override // f3.i0
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override // f3.i0
    public final int f(e2.n nVar, int i7, boolean z10) {
        a1 a1Var = this.a;
        a1Var.getClass();
        return a1Var.f(nVar, i7, z10);
    }

    @Override // f3.i0
    public final void g(u uVar) {
        this.a.g(uVar);
    }

    @Override // f3.i0
    public final /* synthetic */ void d(long j3) {
    }
}
