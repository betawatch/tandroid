package l2;

import android.os.Handler;
import b2.p0;
import b2.s;
import b2.s0;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import org.telegram.ui.Components.qo0;
import u2.c1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p implements h0 {
    public final c1 a;
    public final of.b b = new of.b(17);
    public final l3.a c = new l3.a();
    public long d = -9223372036854775807L;
    public final /* synthetic */ q e;

    public p(q qVar, y2.d dVar) {
        this.e = qVar;
        this.a = new c1(dVar, null, null);
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
                            o oVar = new o(j11, j10);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.a;
        qo0 qo0Var = c1Var.a;
        synchronized (c1Var) {
            int i14 = c1Var.s;
            i13 = i14 == 0 ? -1L : c1Var.i(i14);
        }
        qo0Var.b(i13);
    }

    @Override // c3.h0
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        c1 c1Var = this.a;
        c1Var.getClass();
        return c1Var.e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void f(v vVar, int i10, int i11) {
        c1 c1Var = this.a;
        c1Var.getClass();
        c1Var.f(vVar, i10, 0);
    }
}
