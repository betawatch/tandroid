package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum p extends c2 {
    public p() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (!aVar.o()) {
            mVar.h("</");
            mVar.c = c2.c;
            return;
        }
        mVar.d(false);
        k kVar = mVar.i;
        char i3 = aVar.i();
        kVar.getClass();
        kVar.h(String.valueOf(i3));
        mVar.h.append(aVar.i());
        mVar.a(c2.x);
    }
}
