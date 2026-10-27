package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.e();
            kVar.h.append(aVar.i());
            kVar.h("<" + aVar.i());
            kVar.a(a2.Q);
            return;
        }
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.O);
        } else {
            kVar.f('<');
            kVar.c = a2.K;
        }
    }
}
