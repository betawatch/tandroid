package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum u extends c2 {
    public u() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            mVar.h("<!");
            mVar.c = c2.J;
        } else if (d == '/') {
            mVar.e();
            mVar.c = c2.H;
        } else {
            mVar.h("<");
            aVar.q();
            mVar.c = c2.f;
        }
    }
}
