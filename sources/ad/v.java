package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum v extends c2 {
    public v() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            mVar.d(false);
            mVar.c = c2.I;
        } else {
            mVar.h("</");
            mVar.c = c2.f;
        }
    }
}
