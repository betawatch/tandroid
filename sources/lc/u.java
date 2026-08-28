package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.D;
        } else {
            lVar.g("</");
            lVar.c = b2.f;
        }
    }
}
