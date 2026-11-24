// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum ftb extends rub {
    public ftb() {
        super("BeforeAttributeValue", 36);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        jtb jtbVar = rub.d0;
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.i.v((char) 65533);
            bsbVar.c = jtbVar;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                bsbVar.c = rub.b0;
                return;
            }
            if (d != '`') {
                msb msbVar = rub.a;
                if (d == 65535) {
                    bsbVar.l(this);
                    bsbVar.k();
                    bsbVar.c = msbVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                if (d == '&') {
                    hl1Var.q();
                    bsbVar.c = jtbVar;
                    return;
                }
                if (d == '\'') {
                    bsbVar.c = rub.c0;
                    return;
                }
                switch (d) {
                    case nm7.w0 /* 60 */:
                    case nm7.x0 /* 61 */:
                        break;
                    case nm7.y0 /* 62 */:
                        bsbVar.m(this);
                        bsbVar.k();
                        bsbVar.c = msbVar;
                        break;
                    default:
                        hl1Var.q();
                        bsbVar.c = jtbVar;
                        break;
                }
                return;
            }
            bsbVar.m(this);
            bsbVar.i.v(d);
            bsbVar.c = jtbVar;
        }
    }
}
