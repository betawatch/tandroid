package ge;

import je.r;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends le.a {
    public final je.o a = new je.o();
    public final int b;
    public boolean c;

    public n(int i10) {
        this.b = i10;
    }

    @Override // le.a
    public final boolean b(je.a aVar) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // le.a
    public final je.a e() {
        return this.a;
    }

    @Override // le.a
    public final boolean f() {
        return true;
    }

    @Override // le.a
    public final e4.h h(e eVar) {
        if (eVar.h) {
            if (((je.p) this.a.c) == null) {
                return null;
            }
            je.a e9 = eVar.h().e();
            this.c = (e9 instanceof r) || (e9 instanceof je.o);
            return e4.h.a(eVar.e);
        }
        int i10 = eVar.g;
        int i11 = this.b;
        if (i10 >= i11) {
            return new e4.h(-1, eVar.c + i11, false);
        }
        return null;
    }
}
