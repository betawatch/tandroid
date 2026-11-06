package gf;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p extends mf.a {
    public final kf.o a = new kf.o();
    public final int b;
    public boolean c;

    public p(int i7) {
        this.b = i7;
    }

    @Override // mf.a
    public final boolean b(kf.a aVar) {
        if (!this.c) {
            return true;
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
    public final a h(h hVar) {
        if (hVar.h) {
            if (((kf.p) this.a.c) == null) {
                return null;
            }
            kf.a e10 = hVar.h().e();
            this.c = (e10 instanceof kf.r) || (e10 instanceof kf.o);
            return a.a(hVar.e);
        }
        int i7 = hVar.g;
        int i10 = this.b;
        if (i7 >= i10) {
            return new a(-1, hVar.c + i10, false);
        }
        return null;
    }
}
