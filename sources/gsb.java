// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum gsb extends qsb {
    public gsb() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            return;
        }
        if (d == '\"') {
            aqbVar.c = qsb.A0;
            return;
        }
        if (d == '\'') {
            aqbVar.c = qsb.B0;
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.m(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        } else if (d != 65535) {
            aqbVar.m(this);
            aqbVar.c = qsb.D0;
        } else {
            aqbVar.l(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        }
    }
}
