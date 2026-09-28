package dd;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.h("</");
            lVar.c = b2.c;
            return;
        }
        lVar.d(false);
        j jVar = lVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i10));
        lVar.h.append(aVar.i());
        lVar.a(b2.w);
    }
}
