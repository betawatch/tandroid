package g3;

import b8.zb;
import e3.a0;
import e3.c0;
import e3.i0;
import g2.n0;
import java.math.RoundingMode;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final d a;
    public final i0 b;
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

    public e(int i3, d dVar, i0 i0Var) {
        int i10 = dVar.d;
        this.a = dVar;
        int a10 = dVar.a();
        boolean z10 = true;
        if (a10 != 1 && a10 != 2) {
            z10 = false;
        }
        zb.f(z10);
        int i11 = (((i3 % 10) + 48) << 8) | ((i3 / 10) + 48);
        this.c = (a10 == 2 ? 1667497984 : 1651965952) | i11;
        long j10 = dVar.b * 1000000;
        long j11 = dVar.c;
        String str = n0.a;
        this.e = n0.a0(i10, j10, j11, RoundingMode.DOWN);
        this.b = i0Var;
        this.d = a10 == 2 ? i11 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i10;
    }

    public final c0 a(int i3) {
        return new c0(((this.e * 1) / this.f) * this.n[i3], this.m[i3]);
    }

    public final a0 b(long j10) {
        if (this.k == 0) {
            c0 c0Var = new c0(0L, this.l);
            return new a0(c0Var, c0Var);
        }
        int i3 = (int) (j10 / ((this.e * 1) / this.f));
        int e10 = n0.e(this.n, i3, true, true);
        if (this.n[e10] == i3) {
            c0 a10 = a(e10);
            return new a0(a10, a10);
        }
        c0 a11 = a(e10);
        int i10 = e10 + 1;
        return i10 < this.m.length ? new a0(a11, a(i10)) : new a0(a11, a11);
    }
}
