package k2;

import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y0 {
    public final w2.g0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public y0(w2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zb.f(!z14 || z12);
        zb.f(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        zb.f(z15);
        this.a = g0Var;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = j14;
        this.g = z10;
        this.h = z11;
        this.i = z12;
        this.j = z13;
        this.k = z14;
    }

    public final y0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new y0(this.a, this.b, this.c, j10, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final y0 b(long j10, long j11) {
        if (j10 == this.b && j11 == this.c) {
            return this;
        }
        return new y0(this.a, j10, j11, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.b == y0Var.b && this.d == y0Var.d && this.e == y0Var.e && this.f == y0Var.f && this.g == y0Var.g && this.h == y0Var.h && this.i == y0Var.i && this.j == y0Var.j && this.k == y0Var.k && Objects.equals(this.a, y0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
