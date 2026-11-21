package dd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
