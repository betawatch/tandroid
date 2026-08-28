package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.n.c();
            lVar.c = b2.d0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.c = b2.j0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.c = b2.z0;
        } else {
            lVar.m(this);
            lVar.a(b2.b0);
        }
    }
}
