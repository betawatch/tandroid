// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum mrb extends qsb {
    public mrb() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.k("--")) {
            aqbVar.n.s();
            aqbVar.c = qsb.i0;
        } else if (zj1Var.l("DOCTYPE")) {
            aqbVar.c = qsb.o0;
        } else if (zj1Var.k("[CDATA[")) {
            aqbVar.e();
            aqbVar.c = qsb.E0;
        } else {
            aqbVar.m(this);
            aqbVar.a(qsb.g0);
        }
    }
}
