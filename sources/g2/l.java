package g2;

import android.net.Uri;
import b2.v0;
import b2.w0;
import c3.j0;
import e2.m0;
import java.math.RoundingMode;
import java.util.Map;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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

    public l(c3.q qVar, j0 j0Var, f2.u uVar, String str, int i10) {
        this.e = qVar;
        this.f = j0Var;
        this.g = uVar;
        int i11 = uVar.a;
        int i12 = uVar.b;
        int i13 = (uVar.d * i11) / 8;
        int i14 = uVar.c;
        if (i14 != i13) {
            throw w0.a(null, "Expected block size: " + i13 + "; got: " + i14);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int max = Math.max(i13, i15 / 10);
        this.a = max;
        b2.v vVar = new b2.v();
        vVar.q = v0.n("audio/wav");
        vVar.r = v0.n(str);
        vVar.h = i16;
        vVar.i = i16;
        vVar.s = max;
        vVar.J = i11;
        vVar.K = i12;
        vVar.L = i10;
        this.h = new b2.w(vVar);
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
            int a2 = ((j0) this.f).a(pVar, (int) Math.min(i11 - i10, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.c += a2;
                j11 -= a2;
            }
        }
        f2.u uVar = (f2.u) this.g;
        int i12 = uVar.c;
        int i13 = this.c / i12;
        if (i13 > 0) {
            long j12 = this.b;
            long j13 = this.d;
            long j14 = uVar.b;
            String str = m0.a;
            long a02 = j12 + m0.a0(j13, 1000000L, j14, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.c - i14;
            ((j0) this.f).c(a02, 1, i14, i15, null);
            this.d += i13;
            this.c = i15;
        }
        return j11 <= 0;
    }

    @Override // k4.b
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.u) this.g, 1, i10, j10);
        ((c3.q) this.e).g0(fVar);
        j0 j0Var = (j0) this.f;
        j0Var.b((b2.w) this.h);
        j0Var.e(fVar.e);
    }

    public m d() {
        u6.l((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.a, (byte[]) this.f, (Map) this.g, this.b, this.d, (String) this.h, this.c);
    }
}
