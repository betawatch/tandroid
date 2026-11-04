package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum o1 extends c2 {
    public o1() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            mVar.c = c2.x0;
            return;
        }
        if (d == '\"') {
            mVar.m(this);
            mVar.c = c2.A0;
            return;
        }
        if (d == '\'') {
            mVar.m(this);
            mVar.c = c2.B0;
            return;
        }
        x xVar = c2.a;
        if (d == '>') {
            mVar.j();
            mVar.c = xVar;
        } else if (d != 65535) {
            mVar.m(this);
            gVar.getClass();
            mVar.c = c2.D0;
        } else {
            mVar.l(this);
            gVar.getClass();
            mVar.j();
            mVar.c = xVar;
        }
    }
}
