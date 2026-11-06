package n2;

import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final e2.e g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public n(m mVar) {
        this.a = mVar.a;
        this.b = mVar.b;
        this.c = mVar.c;
        this.d = mVar.d;
        this.e = mVar.e;
        this.f = mVar.f;
        this.g = mVar.g;
        this.h = mVar.h;
        this.i = mVar.i;
        this.j = mVar.j;
        this.k = mVar.k;
    }

    public final m a() {
        m mVar = new m();
        mVar.a = this.a;
        mVar.b = this.b;
        mVar.c = this.c;
        mVar.d = this.d;
        mVar.e = this.e;
        mVar.f = this.f;
        mVar.g = this.g;
        mVar.h = this.h;
        mVar.i = this.i;
        mVar.j = this.j;
        mVar.k = this.k;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && this.e == nVar.e && this.f == nVar.f && this.h == nVar.h && this.i == nVar.i && this.j == nVar.j && this.k == nVar.k && this.g.equals(nVar.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
