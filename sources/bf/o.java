package bf;

import ef.r;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o extends gf.a {
    public final ef.o a = new ef.o();
    public final int b;
    public boolean c;

    public o(int i10) {
        this.b = i10;
    }

    @Override // gf.a
    public final boolean b(ef.a aVar) {
        if (!this.c) {
            return true;
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
            if (((ef.p) this.a.c) == null) {
                return null;
            }
            ef.a e = gVar.h().e();
            this.c = (e instanceof r) || (e instanceof ef.o);
            return a.a(gVar.e);
        }
        int i10 = gVar.g;
        int i11 = this.b;
        if (i10 >= i11) {
            return new a(-1, gVar.c + i11, false);
        }
        return null;
    }
}
