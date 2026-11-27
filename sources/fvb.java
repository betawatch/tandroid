// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum fvb extends rwb {
    public fvb() {
        super("BeforeAttributeValue", 36);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        jvb jvbVar = rwb.d0;
        if (d == 0) {
            bubVar.m(this);
            bubVar.i.v((char) 65533);
            bubVar.c = jvbVar;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                bubVar.c = rwb.b0;
                return;
            }
            if (d != '`') {
                mub mubVar = rwb.a;
                if (d == 65535) {
                    bubVar.l(this);
                    bubVar.k();
                    bubVar.c = mubVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                if (d == '&') {
                    ik1Var.q();
                    bubVar.c = jvbVar;
                    return;
                }
                if (d == '\'') {
                    bubVar.c = rwb.c0;
                    return;
                }
                switch (d) {
                    case jn7.w0 /* 60 */:
                    case jn7.x0 /* 61 */:
                        break;
                    case jn7.y0 /* 62 */:
                        bubVar.m(this);
                        bubVar.k();
                        bubVar.c = mubVar;
                        break;
                    default:
                        ik1Var.q();
                        bubVar.c = jvbVar;
                        break;
                }
                return;
            }
            bubVar.m(this);
            bubVar.i.v(d);
            bubVar.c = jvbVar;
        }
    }
}
