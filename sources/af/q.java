package af;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q extends ff.a {
    public final df.o a = new df.o();
    public final int b;
    public boolean c;

    public q(int i10) {
        this.b = i10;
    }

    @Override // ff.a
    public final boolean b(df.a aVar) {
        if (!this.c) {
            return true;
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
            if (((df.p) this.a.c) == null) {
                return null;
            }
            df.a e = hVar.h().e();
            this.c = (e instanceof df.r) || (e instanceof df.o);
            return a.a(hVar.e);
        }
        int i10 = hVar.g;
        int i11 = this.b;
        if (i10 >= i11) {
            return new a(-1, hVar.c + i11, false);
        }
        return null;
    }
}
