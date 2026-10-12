package af;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
