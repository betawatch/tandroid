package ke;

import ne.r;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            ne.a e6 = eVar.h().e();
            this.c = (e6 instanceof r) || (e6 instanceof ne.o);
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
