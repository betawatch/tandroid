package dd;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
