// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum hsb extends qsb {
    public hsb() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            rpbVar.g.append((char) 65533);
            return;
        }
        if (d == '\"') {
            aqbVar.c = qsb.C0;
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.m(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        } else {
            if (d != 65535) {
                rpbVar.g.append(d);
                return;
            }
            aqbVar.l(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
        }
    }
}
