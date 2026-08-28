package com.google.android.exoplayer2.upstream;

import c2.b1;
import h3.t1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements x3.b {
    public int a;
    public long b;
    public int c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public p(m3.m mVar, m3.w wVar, b1 b1Var, String str, int i9) {
        this.e = mVar;
        this.f = wVar;
        this.g = b1Var;
        int i10 = b1Var.a;
        int i11 = b1Var.b;
        int i12 = (b1Var.d * i10) / 8;
        int i13 = b1Var.c;
        if (i13 != i12) {
            throw t1.a("Expected block size: " + i12 + "; got: " + i13, null);
        }
        int i14 = i11 * i12;
        int i15 = i14 * 8;
        int max = Math.max(i12, i14 / 10);
        this.a = max;
        h3.s0 s0Var = new h3.s0();
        s0Var.o = str;
        s0Var.f = i15;
        s0Var.g = i15;
        s0Var.p = max;
        s0Var.B = i10;
        s0Var.C = i11;
        s0Var.D = i9;
        this.h = new h3.t0(s0Var);
    }

    @Override // x3.b
    public boolean a(m3.l lVar, long j10) {
        int i9;
        int i10;
        long j11 = j10;
        while (j11 > 0 && (i9 = this.c) < (i10 = this.a)) {
            int b10 = ((m3.w) this.f).b(lVar, (int) Math.min(i10 - i9, j11), true);
            if (b10 == -1) {
                j11 = 0;
            } else {
                this.c += b10;
                j11 -= b10;
            }
        }
        int i11 = ((b1) this.g).c;
        int i12 = this.c / i11;
        if (i12 > 0) {
            long O = this.b + d5.f0.O(this.d, 1000000L, r1.b);
            int i13 = i12 * i11;
            int i14 = this.c - i13;
            ((m3.w) this.f).e(O, 1, i13, i14, null);
            this.d += i12;
            this.c = i14;
        }
        return j11 <= 0;
    }

    @Override // x3.b
    public void b(long j10) {
        this.b = j10;
        this.c = 0;
        this.d = 0L;
    }

    @Override // x3.b
    public void c(int i9, long j10) {
        ((m3.m) this.e).y(new x3.d((b1) this.g, 1, i9, j10));
        ((m3.w) this.f).c((h3.t0) this.h);
    }
}
