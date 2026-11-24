// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum brb extends qsb {
    public brb() {
        super("BeforeAttributeName", 33);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        crb crbVar = qsb.Y;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.i.A();
            zj1Var.q();
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
                    case kk7.x0 /* 61 */:
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
