// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum grb extends qsb {
    public grb() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String g = zj1Var.g(qsb.F0);
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
        if (d == 65535) {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                aqbVar.i.v(d);
                return;
            } else {
                aqbVar.c = qsb.e0;
                return;
            }
        }
        int[] c = aqbVar.c('\'', true);
        vpb vpbVar2 = aqbVar.i;
        if (c != null) {
            vpbVar2.x(c);
        } else {
            vpbVar2.v('&');
        }
    }
}
