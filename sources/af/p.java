package af;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
