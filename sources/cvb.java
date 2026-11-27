// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum cvb extends rwb {
    public cvb() {
        super("BeforeAttributeName", 33);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        dvb dvbVar = rwb.Y;
        if (d == 0) {
            bubVar.m(this);
            bubVar.i.A();
            ik1Var.q();
            bubVar.c = dvbVar;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    bubVar.c = rwb.f0;
                    return;
                }
                mub mubVar = rwb.a;
                if (d == 65535) {
                    bubVar.l(this);
                    bubVar.c = mubVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case jn7.w0 /* 60 */:
                    case jn7.x0 /* 61 */:
                        break;
                    case jn7.y0 /* 62 */:
                        bubVar.k();
                        bubVar.c = mubVar;
                        break;
                    default:
                        bubVar.i.A();
                        ik1Var.q();
                        bubVar.c = dvbVar;
                        break;
                }
                return;
            }
            bubVar.m(this);
            bubVar.i.A();
            bubVar.i.u(d);
            bubVar.c = dvbVar;
        }
    }
}
