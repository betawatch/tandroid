package gf;

import kf.r;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class o extends mf.a {
    public final kf.o a = new kf.o();
    public final int b;
    public boolean c;

    public o(int i7) {
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
    public final a h(g gVar) {
        if (gVar.h) {
            if (((kf.p) this.a.c) == null) {
                return null;
            }
            kf.a e10 = gVar.h().e();
            this.c = (e10 instanceof r) || (e10 instanceof kf.o);
            return a.a(gVar.e);
        }
        int i7 = gVar.g;
        int i10 = this.b;
        if (i7 >= i10) {
            return new a(-1, gVar.c + i10, false);
        }
        return null;
    }
}
