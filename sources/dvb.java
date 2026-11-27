// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum dvb extends rwb {
    public dvb() {
        super("AttributeName", 34);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        String h = ik1Var.h(rwb.H0);
        wtb wtbVar = bubVar.i;
        String str = wtbVar.g;
        if (str != null) {
            h = str.concat(h);
        }
        wtbVar.g = h;
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            bubVar.i.u((char) 65533);
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
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    switch (d) {
                        case jn7.w0 /* 60 */:
                            break;
                        case jn7.x0 /* 61 */:
                            bubVar.c = rwb.a0;
                            break;
                        case jn7.y0 /* 62 */:
                            bubVar.k();
                            bubVar.c = mubVar;
                            break;
                        default:
                            bubVar.i.u(d);
                            break;
                    }
                    return;
                }
            }
            bubVar.m(this);
            bubVar.i.u(d);
            return;
        }
        bubVar.c = rwb.Z;
    }
}
