package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class v0 {
    public final u2.f0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public v0(u2.f0 f0Var, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        e2.d.b(!z14 || z12);
        e2.d.b(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        e2.d.b(z15);
        this.a = f0Var;
        this.b = j3;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
        this.j = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.c) {
            return this;
        }
        return new v0(this.a, this.b, j3, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final v0 b(long j3) {
        if (j3 == this.b) {
            return this;
        }
        return new v0(this.a, j3, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.b == v0Var.b && this.c == v0Var.c && this.d == v0Var.d && this.e == v0Var.e && this.f == v0Var.f && this.g == v0Var.g && this.h == v0Var.h && this.i == v0Var.i && this.j == v0Var.j && Objects.equals(this.a, v0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
