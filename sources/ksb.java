// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum ksb extends qsb {
    public ksb() {
        super("BogusDoctype", 65);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.j();
            aqbVar.c = lqbVar;
        } else {
            if (d != 65535) {
                return;
            }
            aqbVar.j();
            aqbVar.c = lqbVar;
        }
    }
}
