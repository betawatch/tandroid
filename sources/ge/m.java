package ge;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends le.a {
    public final je.n a;
    public boolean b;
    public int c;

    public m(je.n nVar) {
        this.a = nVar;
    }

    @Override // le.a
    public final boolean b(je.a aVar) {
        if (!(aVar instanceof je.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return e4.h.a(eVar.b);
    }
}
