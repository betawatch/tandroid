package k2;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class p {
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

    public p(o oVar) {
        this.a = oVar.a;
        this.b = oVar.b;
        this.c = oVar.c;
        this.d = oVar.d;
        this.e = oVar.e;
        this.f = oVar.f;
        this.g = oVar.g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.j = oVar.j;
        this.k = oVar.k;
    }

    public final o a() {
        o oVar = new o();
        oVar.a = this.a;
        oVar.b = this.b;
        oVar.c = this.c;
        oVar.d = this.d;
        oVar.e = this.e;
        oVar.f = this.f;
        oVar.g = this.g;
        oVar.h = this.h;
        oVar.i = this.i;
        oVar.j = this.j;
        oVar.k = this.k;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && this.h == pVar.h && this.i == pVar.i && this.j == pVar.j && this.k == pVar.k && this.g.equals(pVar.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
