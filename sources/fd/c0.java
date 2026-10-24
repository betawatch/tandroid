package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public enum c0 extends a2 {
    public c0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.o()) {
            kVar.h("</");
            kVar.c = a2.K;
            return;
        }
        kVar.d(false);
        j jVar = kVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i10));
        kVar.h.append(aVar.i());
        kVar.a(a2.P);
    }
}
