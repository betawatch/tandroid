package l2;

import a8.la;
import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class v0 {
    public final x2.g0 a;
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

    public v0(x2.g0 g0Var, long j3, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        la.f(!z14 || z12);
        la.f(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        la.f(z15);
        this.a = g0Var;
        this.b = j3;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = j13;
        this.g = z10;
        this.h = z11;
        this.i = z12;
        this.j = z13;
        this.k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.a, this.b, this.c, j3, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.b && j10 == this.c) {
            return this;
        }
        return new v0(this.a, j3, j10, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.b == v0Var.b && this.d == v0Var.d && this.e == v0Var.e && this.f == v0Var.f && this.g == v0Var.g && this.h == v0Var.h && this.i == v0Var.i && this.j == v0Var.j && this.k == v0Var.k && Objects.equals(this.a, v0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
