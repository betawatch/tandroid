package df;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n extends jf.a {
    public final gf.n a;
    public boolean b;
    public int c;

    public n(gf.n nVar) {
        this.a = nVar;
    }

    @Override // jf.a
    public final boolean b(gf.a aVar) {
        if (!(aVar instanceof gf.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // jf.a
    public final gf.a e() {
        return this.a;
    }

    @Override // jf.a
    public final boolean f() {
        return true;
    }

    @Override // jf.a
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
