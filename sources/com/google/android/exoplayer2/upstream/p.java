package com.google.android.exoplayer2.upstream;

import h3.t1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public p(m3.m mVar, m3.w wVar, c2.a1 a1Var, String str, int i10) {
        this.e = mVar;
        this.f = wVar;
        this.g = a1Var;
        int i11 = a1Var.a;
        int i12 = a1Var.b;
        int i13 = (a1Var.d * i11) / 8;
        int i14 = a1Var.c;
        if (i14 != i13) {
            throw t1.a("Expected block size: " + i13 + "; got: " + i14, null);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int max = Math.max(i13, i15 / 10);
        this.a = max;
        h3.s0 s0Var = new h3.s0();
        s0Var.o = str;
        s0Var.f = i16;
        s0Var.g = i16;
        s0Var.p = max;
        s0Var.B = i11;
        s0Var.C = i12;
        s0Var.D = i10;
        this.h = new h3.t0(s0Var);
    }

    @Override // x3.b
    public boolean a(m3.l lVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.c) < (i11 = this.a)) {
            int b10 = ((m3.w) this.f).b(lVar, (int) Math.min(i11 - i10, j11), true);
            if (b10 == -1) {
                j11 = 0;
            } else {
                this.c += b10;
                j11 -= b10;
            }
        }
        int i12 = ((c2.a1) this.g).c;
        int i13 = this.c / i12;
        if (i13 > 0) {
            long O = this.b + d5.g0.O(this.d, 1000000L, r1.b);
            int i14 = i13 * i12;
            int i15 = this.c - i14;
            ((m3.w) this.f).e(O, 1, i14, i15, null);
            this.d += i13;
            this.c = i15;
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
    public void c(int i10, long j10) {
        ((m3.m) this.e).n(new x3.d((c2.a1) this.g, 1, i10, j10));
        ((m3.w) this.f).c((h3.t0) this.h);
    }
}
