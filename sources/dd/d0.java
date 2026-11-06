package dd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        char i7 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i7));
        lVar.h.append(aVar.i());
        lVar.a(b2.P);
    }
}
