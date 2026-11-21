package dd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.b();
            lVar.c = b2.i0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.c = b2.o0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.c = b2.E0;
        } else {
            lVar.m(this);
            lVar.a(b2.g0);
        }
    }
}
