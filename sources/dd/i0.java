package dd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public enum i0 extends b2 {
    public i0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.R;
        if (d == 0) {
            lVar.m(this);
            lVar.f((char) 65533);
            lVar.c = g0Var;
        } else if (d == '-') {
            lVar.f(d);
            lVar.c = b2.T;
        } else if (d == '<') {
            lVar.f(d);
            lVar.c = b2.U;
        } else if (d != 65535) {
            lVar.f(d);
            lVar.c = g0Var;
        } else {
            lVar.l(this);
            lVar.c = b2.a;
        }
    }
}
