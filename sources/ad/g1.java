package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum g1 extends c2 {
    public g1() {
        super("Doctype", 50);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        char d = aVar.d();
        h1 h1Var = c2.p0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            mVar.c = h1Var;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                mVar.m(this);
                mVar.c = h1Var;
                return;
            }
            mVar.l(this);
        }
        mVar.m(this);
        gVar.b();
        gVar.getClass();
        mVar.j();
        mVar.c = c2.a;
    }
}
