package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum e0 extends c2 {
    public e0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (!aVar.o()) {
            mVar.h("</");
            mVar.c = c2.L;
            return;
        }
        mVar.d(false);
        k kVar = mVar.i;
        char i3 = aVar.i();
        kVar.getClass();
        kVar.h(String.valueOf(i3));
        mVar.h.append(aVar.i());
        mVar.a(c2.Q);
    }
}
