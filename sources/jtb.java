// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum jtb extends rub {
    public jtb() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String h = hl1Var.h(rub.I0);
        if (h.length() > 0) {
            bsbVar.i.w(h);
        }
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.i.v((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                msb msbVar = rub.a;
                if (d == 65535) {
                    bsbVar.l(this);
                    bsbVar.c = msbVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c = bsbVar.c('>', true);
                        wrb wrbVar = bsbVar.i;
                        if (c != null) {
                            wrbVar.x(c);
                            return;
                        } else {
                            wrbVar.v('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case nm7.w0 /* 60 */:
                            case nm7.x0 /* 61 */:
                                break;
                            case nm7.y0 /* 62 */:
                                bsbVar.k();
                                bsbVar.c = msbVar;
                                break;
                            default:
                                bsbVar.i.v(d);
                                break;
                        }
                        return;
                    }
                }
            }
            bsbVar.m(this);
            bsbVar.i.v(d);
            return;
        }
        bsbVar.c = rub.X;
    }
}
