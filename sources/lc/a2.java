package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum a2 extends b2 {
    public a2() {
        super("EndTagOpen", 8);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        boolean j10 = aVar.j();
        w wVar = b2.a;
        if (j10) {
            lVar.l(this);
            lVar.g("</");
            lVar.c = wVar;
        } else if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.r;
        } else if (aVar.m('>')) {
            lVar.m(this);
            lVar.a(wVar);
        } else {
            lVar.m(this);
            lVar.a(b2.b0);
        }
    }
}
