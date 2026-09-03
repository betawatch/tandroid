package ke;

import ne.r;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends pe.a {
    public final ne.o a = new ne.o();
    public final int b;
    public boolean c;

    public n(int i10) {
        this.b = i10;
    }

    @Override // pe.a
    public final boolean b(ne.a aVar) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final boolean f() {
        return true;
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        if (eVar.h) {
            if (((ne.p) this.a.c) == null) {
                return null;
            }
            ne.a e = eVar.h().e();
            this.c = (e instanceof r) || (e instanceof ne.o);
            return j4.h.a(eVar.e);
        }
        int i10 = eVar.g;
        int i11 = this.b;
        if (i10 >= i11) {
            return new j4.h(-1, eVar.c + i11, false);
        }
        return null;
    }
}
