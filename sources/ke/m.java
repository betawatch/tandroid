package ke;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m extends pe.a {
    public final ne.n a;
    public boolean b;
    public int c;

    public m(ne.n nVar) {
        this.a = nVar;
    }

    @Override // pe.a
    public final boolean b(ne.a aVar) {
        if (!(aVar instanceof ne.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return j4.h.a(eVar.b);
    }
}
