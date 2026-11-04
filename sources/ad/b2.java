package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum b2 extends c2 {
    public b2() {
        super("EndTagOpen", 8);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        boolean j10 = aVar.j();
        x xVar = c2.a;
        if (j10) {
            mVar.l(this);
            mVar.h("</");
            mVar.c = xVar;
        } else if (aVar.o()) {
            mVar.d(false);
            mVar.c = c2.r;
        } else if (aVar.m('>')) {
            mVar.m(this);
            mVar.a(xVar);
        } else {
            mVar.m(this);
            mVar.a(c2.g0);
        }
    }
}
