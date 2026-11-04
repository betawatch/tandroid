package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum d0 extends c2 {
    public d0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            mVar.e();
            mVar.h.append(aVar.i());
            mVar.h("<" + aVar.i());
            mVar.a(c2.R);
            return;
        }
        if (aVar.m('/')) {
            mVar.e();
            mVar.a(c2.P);
        } else {
            mVar.f('<');
            mVar.c = c2.L;
        }
    }
}
