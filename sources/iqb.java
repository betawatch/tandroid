// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
