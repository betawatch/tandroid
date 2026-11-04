package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum r1 extends c2 {
    public r1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            mVar.c = c2.z0;
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
            mVar.m(this);
            gVar.getClass();
            mVar.j();
            mVar.c = xVar;
            return;
        }
        if (d != 65535) {
            mVar.m(this);
            gVar.getClass();
            mVar.j();
        } else {
            mVar.l(this);
            gVar.getClass();
            mVar.j();
            mVar.c = xVar;
        }
    }
}
