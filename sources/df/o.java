package df;

import gf.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends jf.a {
    public final gf.o a = new gf.o();
    public final int b;
    public boolean c;

    public o(int i3) {
        this.b = i3;
    }

    @Override // jf.a
    public final boolean b(gf.a aVar) {
        if (!this.c) {
            return true;
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
            if (((gf.p) this.a.c) == null) {
                return null;
            }
            gf.a e10 = gVar.h().e();
            this.c = (e10 instanceof r) || (e10 instanceof gf.o);
            return a.a(gVar.e);
        }
        int i3 = gVar.g;
        int i10 = this.b;
        if (i3 >= i10) {
            return new a(-1, gVar.c + i10, false);
        }
        return null;
    }
}
