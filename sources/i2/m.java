package i2;

import android.net.Uri;
import b8.zb;
import d2.u0;
import d2.v0;
import e3.i0;
import g2.n0;
import java.math.RoundingMode;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements m4.b {
    public int a;
    public long b;
    public int c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public m(e3.q qVar, i0 i0Var, h2.s sVar, String str, int i3) {
        this.e = qVar;
        this.f = i0Var;
        this.g = sVar;
        int i10 = sVar.a;
        int i11 = sVar.b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.c;
        if (i13 != i12) {
            throw v0.a(null, "Expected block size: " + i12 + "; got: " + i13);
        }
        int i14 = i11 * i12;
        int i15 = i14 * 8;
        int max = Math.max(i12, i14 / 10);
        this.a = max;
        d2.u uVar = new d2.u();
        uVar.q = u0.n("audio/wav");
        uVar.r = u0.n(str);
        uVar.h = i15;
        uVar.i = i15;
        uVar.s = max;
        uVar.J = i10;
        uVar.K = i11;
        uVar.L = i3;
        this.h = new d2.v(uVar);
    }

    @Override // m4.b
    public void a(long j10) {
        this.b = j10;
        this.c = 0;
        this.d = 0L;
    }

    @Override // m4.b
    public boolean b(e3.p pVar, long j10) {
        int i3;
        int i10;
        long j11 = j10;
        while (j11 > 0 && (i3 = this.c) < (i10 = this.a)) {
            int a10 = ((i0) this.f).a(pVar, (int) Math.min(i10 - i3, j11), true);
            if (a10 == -1) {
                j11 = 0;
            } else {
                this.c += a10;
                j11 -= a10;
            }
        }
        h2.s sVar = (h2.s) this.g;
        int i11 = sVar.c;
        int i12 = this.c / i11;
        if (i12 > 0) {
            long j12 = this.b;
            long j13 = this.d;
            long j14 = sVar.b;
            String str = n0.a;
            long a02 = j12 + n0.a0(j13, 1000000L, j14, RoundingMode.DOWN);
            int i13 = i12 * i11;
            int i14 = this.c - i13;
            ((i0) this.f).d(a02, 1, i13, i14, null);
            this.d += i12;
            this.c = i14;
        }
        return j11 <= 0;
    }

    @Override // m4.b
    public void c(int i3, long j10) {
        m4.e eVar = new m4.e((h2.s) this.g, 1, i3, j10);
        ((e3.q) this.e).f(eVar);
        i0 i0Var = (i0) this.f;
        i0Var.g((d2.v) this.h);
        i0Var.b(eVar.e);
    }

    public n d() {
        zb.k((Uri) this.e, "The uri must be set.");
        return new n((Uri) this.e, this.a, (byte[]) this.f, (Map) this.g, this.b, this.d, (String) this.h, this.c);
    }
}
