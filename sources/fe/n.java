package fe;

import ie.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends ke.a {
    public final ie.o a = new ie.o();
    public final int b;
    public boolean c;

    public n(int i9) {
        this.b = i9;
    }

    @Override // ke.a
    public final boolean b(ie.a aVar) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final boolean f() {
        return true;
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        if (eVar.h) {
            if (((ie.p) this.a.c) == null) {
                return null;
            }
            ie.a e10 = eVar.h().e();
            this.c = (e10 instanceof r) || (e10 instanceof ie.o);
            return e4.h.a(eVar.e);
        }
        int i9 = eVar.g;
        int i10 = this.b;
        if (i9 >= i10) {
            return new e4.h(-1, eVar.c + i10, false);
        }
        return null;
    }
}
