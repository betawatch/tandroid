package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.g("</");
            lVar.c = b2.c;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i9 = aVar.i();
        jVar.getClass();
        jVar.i(String.valueOf(i9));
        lVar.h.append(aVar.i());
        lVar.a(b2.w);
    }
}
