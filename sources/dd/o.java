package dd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        char i7 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i7));
        lVar.h.append(aVar.i());
        lVar.a(b2.x);
    }
}
