package dd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public enum j0 extends b2 {
    public j0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.R;
        if (d == 0) {
            lVar.m(this);
            lVar.f((char) 65533);
            lVar.c = g0Var;
            return;
        }
        if (d == '-') {
            lVar.f(d);
            return;
        }
        if (d == '<') {
            lVar.f(d);
            lVar.c = b2.U;
        } else if (d == '>') {
            lVar.f(d);
            lVar.c = b2.f;
        } else if (d != 65535) {
            lVar.f(d);
            lVar.c = g0Var;
        } else {
            lVar.l(this);
            lVar.c = b2.a;
        }
    }
}
