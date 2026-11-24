// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum eqb extends qsb {
    public eqb() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(aqb aqbVar, zj1 zj1Var) {
        aqbVar.h("</".concat(aqbVar.h.toString()));
        zj1Var.q();
        aqbVar.c = qsb.c;
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            String e = zj1Var.e();
            aqbVar.i.y(e);
            aqbVar.h.append(e);
            return;
        }
        char d = zj1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (aqbVar.n()) {
                aqbVar.c = qsb.X;
                return;
            } else {
                e(aqbVar, zj1Var);
                return;
            }
        }
        if (d == '/') {
            if (aqbVar.n()) {
                aqbVar.c = qsb.f0;
                return;
            } else {
                e(aqbVar, zj1Var);
                return;
            }
        }
        if (d != '>') {
            e(aqbVar, zj1Var);
        } else if (!aqbVar.n()) {
            e(aqbVar, zj1Var);
        } else {
            aqbVar.k();
            aqbVar.c = qsb.a;
        }
    }
}
