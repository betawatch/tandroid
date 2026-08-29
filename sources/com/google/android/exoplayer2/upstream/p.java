package com.google.android.exoplayer2.upstream;

import j3.t1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p implements z3.b {
    public int a;
    public long b;
    public int c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public p(o3.m mVar, o3.w wVar, a4.k kVar, String str, int i10) {
        this.e = mVar;
        this.f = wVar;
        this.g = kVar;
        int i11 = kVar.a;
        int i12 = kVar.b;
        int i13 = (kVar.d * i11) / 8;
        int i14 = kVar.c;
        if (i14 != i13) {
            throw t1.a("Expected block size: " + i13 + "; got: " + i14, null);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int max = Math.max(i13, i15 / 10);
        this.a = max;
        j3.s0 s0Var = new j3.s0();
        s0Var.o = str;
        s0Var.f = i16;
        s0Var.g = i16;
        s0Var.p = max;
        s0Var.B = i11;
        s0Var.C = i12;
        s0Var.D = i10;
        this.h = new j3.t0(s0Var);
    }

    @Override // z3.b
    public void a(long j10) {
        this.b = j10;
        this.c = 0;
        this.d = 0L;
    }

    @Override // z3.b
    public boolean b(o3.l lVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.c) < (i11 = this.a)) {
            int a2 = ((o3.w) this.f).a(lVar, (int) Math.min(i11 - i10, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.c += a2;
                j11 -= a2;
            }
        }
        int i12 = ((a4.k) this.g).c;
        int i13 = this.c / i12;
        if (i13 > 0) {
            long O = this.b + f5.d0.O(this.d, 1000000L, r1.b);
            int i14 = i13 * i12;
            int i15 = this.c - i14;
            ((o3.w) this.f).c(O, 1, i14, i15, null);
            this.d += i13;
            this.c = i15;
        }
        return j11 <= 0;
    }

    @Override // z3.b
    public void c(int i10, long j10) {
        ((o3.m) this.e).D1(new z3.d((a4.k) this.g, 1, i10, j10));
        ((o3.w) this.f).b((j3.t0) this.h);
    }
}
