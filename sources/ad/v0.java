package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum v0 extends c2 {
    public v0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = c2.X;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            mVar.c = n0Var;
            return;
        }
        if (d == '/') {
            mVar.c = c2.f0;
            return;
        }
        x xVar = c2.a;
        if (d == '>') {
            mVar.k();
            mVar.c = xVar;
        } else if (d == 65535) {
            mVar.l(this);
            mVar.c = xVar;
        } else {
            mVar.m(this);
            aVar.q();
            mVar.c = n0Var;
        }
    }
}
