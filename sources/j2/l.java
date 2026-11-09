package j2;

import a8.ia;
import android.net.Uri;
import e2.s0;
import e2.t0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class l implements n4.b {
    public int a;
    public long b;
    public int c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public l(f3.q qVar, j0 j0Var, i2.s sVar, String str, int i7) {
        this.e = qVar;
        this.f = j0Var;
        this.g = sVar;
        int i10 = sVar.a;
        int i11 = sVar.b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.c;
        if (i13 != i12) {
            throw t0.a(null, "Expected block size: " + i12 + "; got: " + i13);
        }
        int i14 = i11 * i12;
        int i15 = i14 * 8;
        int max = Math.max(i12, i14 / 10);
        this.a = max;
        e2.t tVar = new e2.t();
        tVar.q = s0.n("audio/wav");
        tVar.r = s0.n(str);
        tVar.h = i15;
        tVar.i = i15;
        tVar.s = max;
        tVar.J = i10;
        tVar.K = i11;
        tVar.L = i7;
        this.h = new e2.u(tVar);
    }

    @Override // n4.b
    public boolean a(f3.p pVar, long j3) {
        int i7;
        int i10;
        long j10 = j3;
        while (j10 > 0 && (i7 = this.c) < (i10 = this.a)) {
            int e10 = ((j0) this.f).e(pVar, (int) Math.min(i10 - i7, j10), true);
            if (e10 == -1) {
                j10 = 0;
            } else {
                this.c += e10;
                j10 -= e10;
            }
        }
        i2.s sVar = (i2.s) this.g;
        int i11 = sVar.c;
        int i12 = this.c / i11;
        if (i12 > 0) {
            long j11 = this.b;
            long j12 = this.d;
            long j13 = sVar.b;
            String str = m0.a;
            long a02 = j11 + m0.a0(j12, 1000000L, j13, RoundingMode.DOWN);
            int i13 = i12 * i11;
            int i14 = this.c - i13;
            ((j0) this.f).c(a02, 1, i13, i14, null);
            this.d += i12;
            this.c = i14;
        }
        return j10 <= 0;
    }

    @Override // n4.b
    public void b(long j3) {
        this.b = j3;
        this.c = 0;
        this.d = 0L;
    }

    @Override // n4.b
    public void c(int i7, long j3) {
        n4.e eVar = new n4.e((i2.s) this.g, 1, i7, j3);
        ((f3.q) this.e).f(eVar);
        j0 j0Var = (j0) this.f;
        j0Var.g((e2.u) this.h);
        j0Var.d(eVar.e);
    }

    public m d() {
        ia.k((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.a, (byte[]) this.f, (Map) this.g, this.b, this.d, (String) this.h, this.c);
    }
}
