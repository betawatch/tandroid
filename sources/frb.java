// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum frb extends qsb {
    public frb() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String g = zj1Var.g(qsb.G0);
        int length = g.length();
        vpb vpbVar = aqbVar.i;
        if (length > 0) {
            vpbVar.w(g);
        } else {
            vpbVar.j = true;
        }
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.i.v((char) 65533);
            return;
        }
        if (d == '\"') {
            aqbVar.c = qsb.e0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                aqbVar.i.v(d);
                return;
            } else {
                aqbVar.l(this);
                aqbVar.c = qsb.a;
                return;
            }
        }
        int[] c = aqbVar.c('\"', true);
        vpb vpbVar2 = aqbVar.i;
        if (c != null) {
            vpbVar2.x(c);
        } else {
            vpbVar2.v('&');
        }
    }
}
