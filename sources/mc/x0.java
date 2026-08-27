package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // mc.b2
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
