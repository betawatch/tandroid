// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum jqb extends qsb {
    public jqb() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.d(false);
            aqbVar.c = qsb.I;
        } else {
            aqbVar.h("</");
            aqbVar.c = qsb.f;
        }
    }
}
