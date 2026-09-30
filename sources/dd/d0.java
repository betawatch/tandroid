package dd;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
