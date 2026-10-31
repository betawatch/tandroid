package i2;

import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z0 {
    public final u2.g0 a;
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

    public z0(u2.g0 g0Var, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        t6.f(!z14 || z12);
        t6.f(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        t6.f(z15);
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

    public final z0 a(long j10) {
        if (j10 == this.d) {
            return this;
        }
        return new z0(this.a, this.b, this.c, j10, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final z0 b(long j10, long j11) {
        if (j10 == this.b && j11 == this.c) {
            return this;
        }
        return new z0(this.a, j10, j11, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.b == z0Var.b && this.d == z0Var.d && this.e == z0Var.e && this.f == z0Var.f && this.g == z0Var.g && this.h == z0Var.h && this.i == z0Var.i && this.j == z0Var.j && this.k == z0Var.k && Objects.equals(this.a, z0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
