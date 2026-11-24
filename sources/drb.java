// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum drb extends qsb {
    public drb() {
        super("AfterAttributeName", 35);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        crb crbVar = qsb.Y;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.i.u((char) 65533);
            aqbVar.c = crbVar;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    aqbVar.c = qsb.f0;
                    return;
                }
                lqb lqbVar = qsb.a;
                if (d == 65535) {
                    aqbVar.l(this);
                    aqbVar.c = lqbVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case kk7.w0 /* 60 */:
                        break;
                    case kk7.x0 /* 61 */:
                        aqbVar.c = qsb.a0;
                        break;
                    case kk7.y0 /* 62 */:
                        aqbVar.k();
                        aqbVar.c = lqbVar;
                        break;
                    default:
                        aqbVar.i.A();
                        zj1Var.q();
                        aqbVar.c = crbVar;
                        break;
                }
                return;
            }
            aqbVar.m(this);
            aqbVar.i.A();
            aqbVar.i.u(d);
            aqbVar.c = crbVar;
        }
    }
}
