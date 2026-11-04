package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum j1 extends c2 {
    public j1() {
        super("AfterDoctypeName", 53);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        boolean j10 = aVar.j();
        x xVar = c2.a;
        if (j10) {
            mVar.l(this);
            gVar.getClass();
            mVar.j();
            mVar.c = xVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            mVar.j();
            mVar.a(xVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            gVar.getClass();
            mVar.c = c2.s0;
        } else if (aVar.l("SYSTEM")) {
            gVar.getClass();
            mVar.c = c2.y0;
        } else {
            mVar.m(this);
            gVar.getClass();
            mVar.a(c2.D0);
        }
    }
}
