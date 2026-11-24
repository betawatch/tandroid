// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum crb extends qsb {
    public crb() {
        super("AttributeName", 34);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String h = zj1Var.h(qsb.H0);
        vpb vpbVar = aqbVar.i;
        String str = vpbVar.g;
        if (str != null) {
            h = str.concat(h);
        }
        vpbVar.g = h;
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.i.u((char) 65533);
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
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
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
                            aqbVar.i.u(d);
                            break;
                    }
                    return;
                }
            }
            aqbVar.m(this);
            aqbVar.i.u(d);
            return;
        }
        aqbVar.c = qsb.Z;
    }
}
