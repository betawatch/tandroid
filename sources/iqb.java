// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum iqb extends qsb {
    public iqb() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        if (d == '!') {
            aqbVar.h("<!");
            aqbVar.c = qsb.J;
        } else if (d == '/') {
            aqbVar.e();
            aqbVar.c = qsb.H;
        } else {
            aqbVar.h("<");
            zj1Var.q();
            aqbVar.c = qsb.f;
        }
    }
}
