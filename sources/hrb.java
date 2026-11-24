// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum hrb extends qsb {
    public hrb() {
        super("Rcdata", 2);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char i = zj1Var.i();
        if (i == 0) {
            aqbVar.m(this);
            zj1Var.a();
            aqbVar.f((char) 65533);
        } else {
            if (i == '&') {
                aqbVar.a(qsb.d);
                return;
            }
            if (i == '<') {
                aqbVar.a(qsb.s);
            } else if (i != 65535) {
                aqbVar.h(zj1Var.g('&', '<', 0));
            } else {
                aqbVar.g(new spb());
            }
        }
    }
}
