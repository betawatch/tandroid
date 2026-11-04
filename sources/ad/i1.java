package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum i1 extends c2 {
    public i1() {
        super("DoctypeName", 52);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        if (aVar.o()) {
            gVar.c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            mVar.m(this);
            gVar.c.append((char) 65533);
            return;
        }
        if (d != ' ') {
            x xVar = c2.a;
            if (d == '>') {
                mVar.j();
                mVar.c = xVar;
                return;
            }
            if (d == 65535) {
                mVar.l(this);
                gVar.getClass();
                mVar.j();
                mVar.c = xVar;
                return;
            }
            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                gVar.c.append(d);
                return;
            }
        }
        mVar.c = c2.r0;
    }
}
