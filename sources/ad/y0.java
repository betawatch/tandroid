package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum y0 extends c2 {
    public y0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.k("--")) {
            mVar.n.b();
            mVar.c = c2.i0;
        } else if (aVar.l("DOCTYPE")) {
            mVar.c = c2.o0;
        } else if (aVar.k("[CDATA[")) {
            mVar.e();
            mVar.c = c2.E0;
        } else {
            mVar.m(this);
            mVar.a(c2.g0);
        }
    }
}
