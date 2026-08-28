package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j1 {
    public final j4.d0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public j1(j4.d0 d0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        d5.a.f(!z13 || z11);
        d5.a.f(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        d5.a.f(z14);
        this.a = d0Var;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
    }

    public final j1 a(long j10) {
        if (j10 == this.c) {
            return this;
        }
        return new j1(this.a, this.b, j10, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final j1 b(long j10) {
        if (j10 == this.b) {
            return this;
        }
        return new j1(this.a, j10, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.b == j1Var.b && this.c == j1Var.c && this.d == j1Var.d && this.e == j1Var.e && this.f == j1Var.f && this.g == j1Var.g && this.h == j1Var.h && this.i == j1Var.i && d5.f0.a(this.a, j1Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
