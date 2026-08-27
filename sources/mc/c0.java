package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public enum c0 extends b2 {
    public c0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // mc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.e();
            lVar.h.append(aVar.i());
            lVar.g("<" + aVar.i());
            lVar.a(b2.M);
            return;
        }
        if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.K);
        } else {
            lVar.f('<');
            lVar.c = b2.G;
        }
    }
}
