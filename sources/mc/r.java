package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // mc.b2
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
