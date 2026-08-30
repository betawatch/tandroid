package c4;

import android.net.Uri;
import c2.a1;
import g5.p;
import h5.d0;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.Map;
import r3.l;
import r3.m;
import r3.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements b {
    public int a;
    public long b;
    public long c;
    public int d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public c(m mVar, v vVar, a1 a1Var, String str, int i10) {
        this.e = mVar;
        this.f = vVar;
        this.g = a1Var;
        int i11 = a1Var.a;
        int i12 = a1Var.b;
        int i13 = (a1Var.d * i11) / 8;
        int i14 = a1Var.c;
        if (i14 != i13) {
            throw r1.a("Expected block size: " + i13 + "; got: " + i14, null);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int max = Math.max(i13, i15 / 10);
        this.a = max;
        m0 m0Var = new m0();
        m0Var.o = str;
        m0Var.f = i16;
        m0Var.g = i16;
        m0Var.p = max;
        m0Var.B = i11;
        m0Var.C = i12;
        m0Var.D = i10;
        this.h = new n0(m0Var);
    }

    @Override // c4.b
    public void a(long j10) {
        this.b = j10;
        this.d = 0;
        this.c = 0L;
    }

    @Override // c4.b
    public boolean b(l lVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.d) < (i11 = this.a)) {
            int e = ((v) this.f).e(lVar, (int) Math.min(i11 - i10, j11), true);
            if (e == -1) {
                j11 = 0;
            } else {
                this.d += e;
                j11 -= e;
            }
        }
        int i12 = ((a1) this.g).c;
        int i13 = this.d / i12;
        if (i13 > 0) {
            long N = this.b + d0.N(this.c, 1000000L, r1.b);
            int i14 = i13 * i12;
            int i15 = this.d - i14;
            ((v) this.f).c(N, 1, i14, i15, null);
            this.c += i13;
            this.d = i15;
        }
        return j11 <= 0;
    }

    @Override // c4.b
    public void c(int i10, long j10) {
        ((m) this.e).g2(new f((a1) this.g, 1, i10, j10));
        ((v) this.f).b((n0) this.h);
    }

    public p d() {
        h5.a.k((Uri) this.e, "The uri must be set.");
        return new p((Uri) this.e, this.a, (byte[]) this.f, (Map) this.g, this.b, this.c, (String) this.h, this.d);
    }
}
