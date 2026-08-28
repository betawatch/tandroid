package fe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends ke.a {
    public final ie.n a;
    public boolean b;
    public int c;

    public m(ie.n nVar) {
        this.a = nVar;
    }

    @Override // ke.a
    public final boolean b(ie.a aVar) {
        if (!(aVar instanceof ie.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final boolean f() {
        return true;
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        if (eVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return e4.h.a(eVar.b);
    }
}
