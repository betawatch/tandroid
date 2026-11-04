package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum w0 extends c2 {
    public w0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        x xVar = c2.a;
        if (d == '>') {
            mVar.i.j = true;
            mVar.k();
            mVar.c = xVar;
        } else if (d == 65535) {
            mVar.l(this);
            mVar.c = xVar;
        } else {
            mVar.m(this);
            aVar.q();
            mVar.c = c2.X;
        }
    }
}
