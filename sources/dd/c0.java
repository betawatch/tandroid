package dd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public enum c0 extends b2 {
    public c0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.e();
            lVar.h.append(aVar.i());
            lVar.h("<" + aVar.i());
            lVar.a(b2.Q);
            return;
        }
        if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.O);
        } else {
            lVar.f('<');
            lVar.c = b2.K;
        }
    }
}
