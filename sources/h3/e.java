package h3;

import a8.ia;
import f3.b0;
import f3.d0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class e {
    public final d a;
    public final j0 b;
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

    public e(int i7, d dVar, j0 j0Var) {
        int i10 = dVar.d;
        this.a = dVar;
        int a10 = dVar.a();
        boolean z9 = true;
        if (a10 != 1 && a10 != 2) {
            z9 = false;
        }
        ia.f(z9);
        int i11 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.c = (a10 == 2 ? 1667497984 : 1651965952) | i11;
        long j3 = dVar.b * 1000000;
        long j10 = dVar.c;
        String str = m0.a;
        this.e = m0.a0(i10, j3, j10, RoundingMode.DOWN);
        this.b = j0Var;
        this.d = a10 == 2 ? i11 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i10;
    }

    public final d0 a(int i7) {
        return new d0(((this.e * 1) / this.f) * this.n[i7], this.m[i7]);
    }

    public final b0 b(long j3) {
        if (this.k == 0) {
            d0 d0Var = new d0(0L, this.l);
            return new b0(d0Var, d0Var);
        }
        int i7 = (int) (j3 / ((this.e * 1) / this.f));
        int e10 = m0.e(this.n, i7, true, true);
        if (this.n[e10] == i7) {
            d0 a10 = a(e10);
            return new b0(a10, a10);
        }
        d0 a11 = a(e10);
        int i10 = e10 + 1;
        return i10 < this.m.length ? new b0(a11, a(i10)) : new b0(a11, a11);
    }
}
