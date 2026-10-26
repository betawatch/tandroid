package bf;

import ef.r;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
