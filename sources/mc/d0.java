package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // mc.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.g("</");
            lVar.c = b2.G;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.i(String.valueOf(i10));
        lVar.h.append(aVar.i());
        lVar.a(b2.L);
    }
}
