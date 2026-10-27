package bf;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n extends gf.a {
    public final ef.n a;
    public boolean b;
    public int c;

    public n(ef.n nVar) {
        this.a = nVar;
    }

    @Override // gf.a
    public final boolean b(ef.a aVar) {
        if (!(aVar instanceof ef.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // gf.a
    public final ef.a e() {
        return this.a;
    }

    @Override // gf.a
    public final boolean f() {
        return true;
    }

    @Override // gf.a
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
