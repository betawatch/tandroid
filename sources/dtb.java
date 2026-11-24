// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum dtb extends rub {
    public dtb() {
        super("AttributeName", 34);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String h = hl1Var.h(rub.H0);
        wrb wrbVar = bsbVar.i;
        String str = wrbVar.g;
        if (str != null) {
            h = str.concat(h);
        }
        wrbVar.g = h;
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.i.u((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    bsbVar.c = rub.f0;
                    return;
                }
                msb msbVar = rub.a;
                if (d == 65535) {
                    bsbVar.l(this);
                    bsbVar.c = msbVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    switch (d) {
                        case nm7.w0 /* 60 */:
                            break;
                        case nm7.x0 /* 61 */:
                            bsbVar.c = rub.a0;
                            break;
                        case nm7.y0 /* 62 */:
                            bsbVar.k();
                            bsbVar.c = msbVar;
                            break;
                        default:
                            bsbVar.i.u(d);
                            break;
                    }
                    return;
                }
            }
            bsbVar.m(this);
            bsbVar.i.u(d);
            return;
        }
        bsbVar.c = rub.Z;
    }
}
