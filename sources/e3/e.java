package e3;

import c3.d0;
import c3.f0;
import c3.l0;
import e2.m0;
import java.math.RoundingMode;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e {
    public final d a;
    public final l0 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public e(int i10, d dVar, l0 l0Var) {
        int i11 = dVar.d;
        this.a = dVar;
        int a2 = dVar.a();
        boolean z10 = true;
        if (a2 != 1 && a2 != 2) {
            z10 = false;
        }
        u6.g(z10);
        int i12 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.c = (a2 == 2 ? 1667497984 : 1651965952) | i12;
        long j10 = dVar.b * 1000000;
        long j11 = dVar.c;
        String str = m0.a;
        this.e = m0.a0(i11, j10, j11, RoundingMode.DOWN);
        this.b = l0Var;
        this.d = a2 == 2 ? i12 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i11;
    }

    public final f0 a(int i10) {
        return new f0(((this.e * 1) / this.f) * this.n[i10], this.m[i10]);
    }

    public final d0 b(long j10) {
        if (this.k == 0) {
            f0 f0Var = new f0(0L, this.l);
            return new d0(f0Var, f0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f));
        int e = m0.e(this.n, i10, true, true);
        if (this.n[e] == i10) {
            f0 a2 = a(e);
            return new d0(a2, a2);
        }
        f0 a10 = a(e);
        int i11 = e + 1;
        return i11 < this.m.length ? new d0(a10, a(i11)) : new d0(a10, a10);
    }
}
