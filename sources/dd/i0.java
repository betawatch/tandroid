package dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public enum i0 extends b2 {
    public i0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.S;
        if (d == 0) {
            lVar.m(this);
            lVar.f((char) 65533);
            lVar.c = g0Var;
        } else if (d == '-') {
            lVar.f(d);
            lVar.c = b2.U;
        } else if (d == '<') {
            lVar.f(d);
            lVar.c = b2.V;
        } else if (d != 65535) {
            lVar.f(d);
            lVar.c = g0Var;
        } else {
            lVar.l(this);
            lVar.c = b2.a;
        }
    }
}
