package dd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.h("</");
            lVar.c = b2.K;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i10));
        lVar.h.append(aVar.i());
        lVar.a(b2.P);
    }
}
