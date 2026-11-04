package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum h1 extends c2 {
    public h1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        boolean o10 = aVar.o();
        i1 i1Var = c2.q0;
        if (o10) {
            gVar.b();
            mVar.c = i1Var;
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            mVar.m(this);
            gVar.b();
            gVar.c.append((char) 65533);
            mVar.c = i1Var;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                mVar.l(this);
                gVar.b();
                gVar.getClass();
                mVar.j();
                mVar.c = c2.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            gVar.b();
            gVar.c.append(d);
            mVar.c = i1Var;
        }
    }
}
