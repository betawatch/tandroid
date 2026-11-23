package h3;

import a8.la;
import f3.a0;
import f3.c0;
import f3.i0;
import h2.l0;
import java.math.RoundingMode;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

    public e(int i7, d dVar, i0 i0Var) {
        int i10 = dVar.d;
        this.a = dVar;
        int a10 = dVar.a();
        boolean z10 = true;
        if (a10 != 1 && a10 != 2) {
            z10 = false;
        }
        la.f(z10);
        int i11 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.c = (a10 == 2 ? 1667497984 : 1651965952) | i11;
        long j3 = dVar.b * 1000000;
        long j10 = dVar.c;
        String str = l0.a;
        this.e = l0.a0(i10, j3, j10, RoundingMode.DOWN);
        this.b = i0Var;
        this.d = a10 == 2 ? i11 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i10;
    }

    public final c0 a(int i7) {
        return new c0(((this.e * 1) / this.f) * this.n[i7], this.m[i7]);
    }

    public final a0 b(long j3) {
        if (this.k == 0) {
            c0 c0Var = new c0(0L, this.l);
            return new a0(c0Var, c0Var);
        }
        int i7 = (int) (j3 / ((this.e * 1) / this.f));
        int e10 = l0.e(this.n, i7, true, true);
        if (this.n[e10] == i7) {
            c0 a10 = a(e10);
            return new a0(a10, a10);
        }
        c0 a11 = a(e10);
        int i10 = e10 + 1;
        return i10 < this.m.length ? new a0(a11, a(i10)) : new a0(a11, a11);
    }
}
