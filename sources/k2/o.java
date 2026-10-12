package k2;

import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class o {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final b2.f g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public o(n nVar) {
        this.a = nVar.a;
        this.b = nVar.b;
        this.c = nVar.c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f = nVar.f;
        this.g = nVar.g;
        this.h = nVar.h;
        this.i = nVar.i;
        this.j = nVar.j;
        this.k = nVar.k;
    }

    public final n a() {
        n nVar = new n();
        nVar.a = this.a;
        nVar.b = this.b;
        nVar.c = this.c;
        nVar.d = this.d;
        nVar.e = this.e;
        nVar.f = this.f;
        nVar.g = this.g;
        nVar.h = this.h;
        nVar.i = this.i;
        nVar.j = this.j;
        nVar.k = this.k;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.e == oVar.e && this.f == oVar.f && this.h == oVar.h && this.i == oVar.i && this.j == oVar.j && this.k == oVar.k && this.g.equals(oVar.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
