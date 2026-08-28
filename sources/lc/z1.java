package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        char i9 = aVar.i();
        if (i9 == '!') {
            lVar.a(b2.c0);
            return;
        }
        if (i9 == '/') {
            lVar.a(b2.n);
            return;
        }
        if (i9 == '?') {
            lVar.a(b2.b0);
            return;
        }
        if (aVar.o()) {
            lVar.d(true);
            lVar.c = b2.r;
        } else {
            lVar.m(this);
            lVar.f('<');
            lVar.c = b2.a;
        }
    }
}
