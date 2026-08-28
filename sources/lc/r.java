package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.A;
        } else {
            lVar.g("</");
            lVar.c = b2.e;
        }
    }
}
