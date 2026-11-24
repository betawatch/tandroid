// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum esb extends qsb {
    public esb() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            return;
        }
        if (d == '\"') {
            aqbVar.m(this);
            aqbVar.c = qsb.A0;
            return;
        }
        if (d == '\'') {
            aqbVar.m(this);
            aqbVar.c = qsb.B0;
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
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
