package gf;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
