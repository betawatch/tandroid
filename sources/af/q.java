package af;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
