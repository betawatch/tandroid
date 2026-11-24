// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum fsb extends rub {
    public fsb() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(bsb bsbVar, hl1 hl1Var) {
        bsbVar.h("</".concat(bsbVar.h.toString()));
        hl1Var.q();
        bsbVar.c = rub.c;
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            String e = hl1Var.e();
            bsbVar.i.y(e);
            bsbVar.h.append(e);
            return;
        }
        char d = hl1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (bsbVar.n()) {
                bsbVar.c = rub.X;
                return;
            } else {
                e(bsbVar, hl1Var);
                return;
            }
        }
        if (d == '/') {
            if (bsbVar.n()) {
                bsbVar.c = rub.f0;
                return;
            } else {
                e(bsbVar, hl1Var);
                return;
            }
        }
        if (d != '>') {
            e(bsbVar, hl1Var);
        } else if (!bsbVar.n()) {
            e(bsbVar, hl1Var);
        } else {
            bsbVar.k();
            bsbVar.c = rub.a;
        }
    }
}
