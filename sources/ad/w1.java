package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum w1 extends c2 {
    public w1() {
        super("BogusDoctype", 65);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        x xVar = c2.a;
        if (d == '>') {
            mVar.j();
            mVar.c = xVar;
        } else {
            if (d != 65535) {
                return;
            }
            mVar.j();
            mVar.c = xVar;
        }
    }
}
