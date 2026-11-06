package gf;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o extends mf.a {
    public final kf.n a;
    public boolean b;
    public int c;

    public o(kf.n nVar) {
        this.a = nVar;
    }

    @Override // mf.a
    public final boolean b(kf.a aVar) {
        if (!(aVar instanceof kf.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
    public final a h(h hVar) {
        if (hVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return a.a(hVar.b);
    }
}
