package ie;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends ne.a {
    public final le.n a;
    public boolean b;
    public int c;

    public m(le.n nVar) {
        this.a = nVar;
    }

    @Override // ne.a
    public final boolean b(le.a aVar) {
        if (!(aVar instanceof le.o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return g4.h.a(eVar.b);
    }
}
