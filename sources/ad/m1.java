package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum m1 extends c2 {
    public m1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        g gVar = mVar.m;
        char d = aVar.d();
        if (d == 0) {
            mVar.m(this);
            gVar.d.append((char) 65533);
            return;
        }
        if (d == '\"') {
            mVar.c = c2.w0;
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
            gVar.d.append(d);
            return;
        }
        mVar.l(this);
        gVar.getClass();
        mVar.j();
        mVar.c = xVar;
    }
}
