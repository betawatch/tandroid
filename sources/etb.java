// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum etb extends rub {
    public etb() {
        super("AfterAttributeName", 35);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        dtb dtbVar = rub.Y;
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.i.u((char) 65533);
            bsbVar.c = dtbVar;
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
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
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
                        bsbVar.i.A();
                        hl1Var.q();
                        bsbVar.c = dtbVar;
                        break;
                }
                return;
            }
            bsbVar.m(this);
            bsbVar.i.A();
            bsbVar.i.u(d);
            bsbVar.c = dtbVar;
        }
    }
}
