package dd;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.b();
            lVar.c = b2.h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.c = b2.n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f0);
        }
    }
}
