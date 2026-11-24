// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum erb extends qsb {
    public erb() {
        super("BeforeAttributeValue", 36);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        irb irbVar = qsb.d0;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.i.v((char) 65533);
            aqbVar.c = irbVar;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                aqbVar.c = qsb.b0;
                return;
            }
            if (d != '`') {
                lqb lqbVar = qsb.a;
                if (d == 65535) {
                    aqbVar.l(this);
                    aqbVar.k();
                    aqbVar.c = lqbVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                if (d == '&') {
                    zj1Var.q();
                    aqbVar.c = irbVar;
                    return;
                }
                if (d == '\'') {
                    aqbVar.c = qsb.c0;
                    return;
                }
                switch (d) {
                    case kk7.w0 /* 60 */:
                    case kk7.x0 /* 61 */:
                        break;
                    case kk7.y0 /* 62 */:
                        aqbVar.m(this);
                        aqbVar.k();
                        aqbVar.c = lqbVar;
                        break;
                    default:
                        zj1Var.q();
                        aqbVar.c = irbVar;
                        break;
                }
                return;
            }
            aqbVar.m(this);
            aqbVar.i.v(d);
            aqbVar.c = irbVar;
        }
    }
}
