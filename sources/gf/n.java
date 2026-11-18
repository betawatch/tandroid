package gf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class n extends mf.a {
    public final kf.n a;
    public boolean b;
    public int c;

    public n(kf.n nVar) {
        this.a = nVar;
    }

    @Override // mf.a
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final boolean f() {
        return true;
    }

    @Override // mf.a
    public final a h(g gVar) {
        if (gVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return a.a(gVar.b);
    }
}
