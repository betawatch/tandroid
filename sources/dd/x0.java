package dd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
