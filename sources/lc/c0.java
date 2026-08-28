package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum c0 extends b2 {
    public c0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // lc.b2
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
