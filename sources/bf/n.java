package bf;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
