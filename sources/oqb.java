// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum oqb extends qsb {
    public oqb() {
        super("ScriptDataEscaped", 21);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.j()) {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
            return;
        }
        char i = zj1Var.i();
        if (i == 0) {
            aqbVar.m(this);
            zj1Var.a();
            aqbVar.f((char) 65533);
        } else if (i == '-') {
            aqbVar.f('-');
            aqbVar.a(qsb.M);
        } else if (i != '<') {
            aqbVar.h(zj1Var.g('-', '<', 0));
        } else {
            aqbVar.a(qsb.O);
        }
    }
}
