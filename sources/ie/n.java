package ie;

import le.r;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends ne.a {
    public final le.o a = new le.o();
    public final int b;
    public boolean c;

    public n(int i10) {
        this.b = i10;
    }

    @Override // ne.a
    public final boolean b(le.a aVar) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // ne.a
    public final le.a e() {
        return this.a;
    }

    @Override // ne.a
    public final boolean f() {
        return true;
    }

    @Override // ne.a
    public final g4.h h(e eVar) {
        if (eVar.h) {
            if (((le.p) this.a.c) == null) {
                return null;
            }
            le.a e10 = eVar.h().e();
            this.c = (e10 instanceof r) || (e10 instanceof le.o);
            return g4.h.a(eVar.e);
        }
        int i10 = eVar.g;
        int i11 = this.b;
        if (i10 >= i11) {
            return new g4.h(-1, eVar.c + i11, false);
        }
        return null;
    }
}
