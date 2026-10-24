package fd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // fd.a2
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
