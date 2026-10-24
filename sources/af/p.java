package af;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class p extends ff.a {
    public final df.n a;
    public boolean b;
    public int c;

    public p(df.n nVar) {
        this.a = nVar;
    }

    @Override // ff.a
    public final boolean b(df.a aVar) {
        if (!(aVar instanceof df.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // ff.a
    public final df.a e() {
        return this.a;
    }

    @Override // ff.a
    public final boolean f() {
        return true;
    }

    @Override // ff.a
    public final a h(h hVar) {
        if (hVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return a.a(hVar.b);
    }
}
