package dd;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
