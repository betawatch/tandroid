// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hc0 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final hc0 a() {
        hc0 hc0Var = new hc0();
        hc0Var.c = this.c;
        hc0Var.d = this.d;
        hc0Var.e = this.e;
        hc0Var.f = this.f;
        hc0Var.b = this.b;
        return hc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        return this.c == hc0Var.c && this.d == hc0Var.d && this.e == hc0Var.e && this.f == hc0Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
