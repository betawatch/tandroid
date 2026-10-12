package g2;

import android.net.Uri;
import b2.w0;
import b2.x0;
import c3.i0;
import e2.m0;
import java.math.RoundingMode;
import java.util.Map;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class l implements k4.b {
    public int a;
    public long b;
    public int c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public l(c3.q qVar, i0 i0Var, f2.t tVar, String str, int i10) {
        this.e = qVar;
        this.f = i0Var;
        this.g = tVar;
        int i11 = tVar.a;
        int i12 = tVar.b;
        int i13 = (tVar.d * i11) / 8;
        int i14 = tVar.c;
        if (i14 != i13) {
            throw x0.a(null, "Expected block size: " + i13 + "; got: " + i14);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int max = Math.max(i13, i15 / 10);
        this.a = max;
        b2.w wVar = new b2.w();
        wVar.q = w0.n("audio/wav");
        wVar.r = w0.n(str);
        wVar.h = i16;
        wVar.i = i16;
        wVar.s = max;
        wVar.J = i11;
        wVar.K = i12;
        wVar.L = i10;
        this.h = new b2.x(wVar);
    }

    @Override // k4.b
    public void a(long j10) {
        this.b = j10;
        this.c = 0;
        this.d = 0L;
    }

    @Override // k4.b
    public boolean b(c3.p pVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.c) < (i11 = this.a)) {
            int a2 = ((i0) this.f).a(pVar, (int) Math.min(i11 - i10, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.c += a2;
                j11 -= a2;
            }
        }
        f2.t tVar = (f2.t) this.g;
        int i12 = tVar.c;
        int i13 = this.c / i12;
        if (i13 > 0) {
            long j12 = this.b;
            long j13 = this.d;
            long j14 = tVar.b;
            String str = m0.a;
            long a02 = j12 + m0.a0(j13, 1000000L, j14, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.c - i14;
            ((i0) this.f).c(a02, 1, i14, i15, null);
            this.d += i13;
            this.c = i15;
        }
        return j11 <= 0;
    }

    @Override // k4.b
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.t) this.g, 1, i10, j10);
        ((c3.q) this.e).K(fVar);
        i0 i0Var = (i0) this.f;
        i0Var.b((b2.x) this.h);
        i0Var.e(fVar.e);
    }

    public m d() {
        u6.l((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.a, (byte[]) this.f, (Map) this.g, this.b, this.d, (String) this.h, this.c);
    }
}
