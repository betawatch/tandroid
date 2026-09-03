package j3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g1 {
    public final o4.v a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public g1(o4.v vVar, long j10, long j11, long j12, long j13, boolean z4, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        h5.a.f(!z12 || z10);
        h5.a.f(!z11 || z10);
        if (z4 && (z10 || z11 || z12)) {
            z13 = false;
        }
        h5.a.f(z13);
        this.a = vVar;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = z4;
        this.g = z10;
        this.h = z11;
        this.i = z12;
    }

    public final g1 a(long j10) {
        if (j10 == this.c) {
            return this;
        }
        return new g1(this.a, this.b, j10, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final g1 b(long j10) {
        if (j10 == this.b) {
            return this;
        }
        return new g1(this.a, j10, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.b == g1Var.b && this.c == g1Var.c && this.d == g1Var.d && this.e == g1Var.e && this.f == g1Var.f && this.g == g1Var.g && this.h == g1Var.h && this.i == g1Var.i && h5.d0.a(this.a, g1Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
