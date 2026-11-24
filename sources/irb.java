// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum irb extends qsb {
    public irb() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String h = zj1Var.h(qsb.I0);
        if (h.length() > 0) {
            aqbVar.i.w(h);
        }
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.i.v((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                lqb lqbVar = qsb.a;
                if (d == 65535) {
                    aqbVar.l(this);
                    aqbVar.c = lqbVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c = aqbVar.c('>', true);
                        vpb vpbVar = aqbVar.i;
                        if (c != null) {
                            vpbVar.x(c);
                            return;
                        } else {
                            vpbVar.v('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case kk7.w0 /* 60 */:
                            case kk7.x0 /* 61 */:
                                break;
                            case kk7.y0 /* 62 */:
                                aqbVar.k();
                                aqbVar.c = lqbVar;
                                break;
                            default:
                                aqbVar.i.v(d);
                                break;
                        }
                        return;
                    }
                }
            }
            aqbVar.m(this);
            aqbVar.i.v(d);
            return;
        }
        aqbVar.c = qsb.X;
    }
}
