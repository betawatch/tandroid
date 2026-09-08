package l2;

import android.os.Handler;
import b2.p0;
import b2.s;
import b2.s0;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import n4.y;
import org.telegram.ui.Components.ho0;
import u2.a1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n implements h0 {
    public final a1 a;
    public final y b = new y(17, false);
    public final l3.a c = new l3.a();
    public long d = -9223372036854775807L;
    public final /* synthetic */ o e;

    public n(o oVar, y2.d dVar) {
        this.e = oVar;
        this.a = new a1(dVar, null, null);
    }

    @Override // c3.h0
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void b(s sVar) {
        this.a.b(sVar);
    }

    @Override // c3.h0
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.a.c(j3, i10, i11, i12, g0Var);
        while (this.a.x(false)) {
            l3.a aVar = this.c;
            aVar.clear();
            if (this.a.C(this.b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.e;
                p0 a2 = this.e.c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.T(d0.p(aVar2.e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            m mVar = new m(j11, j10);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.a;
        ho0 ho0Var = a1Var.a;
        synchronized (a1Var) {
            int i14 = a1Var.s;
            i13 = i14 == 0 ? -1L : a1Var.i(i14);
        }
        ho0Var.b(i13);
    }

    @Override // c3.h0
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        a1 a1Var = this.a;
        a1Var.getClass();
        return a1Var.e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void f(v vVar, int i10, int i11) {
        a1 a1Var = this.a;
        a1Var.getClass();
        a1Var.f(vVar, i10, 0);
    }
}
