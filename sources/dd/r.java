package dd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.c = b2.F;
        } else {
            lVar.h("</");
            lVar.c = b2.e;
        }
    }
}
