// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
