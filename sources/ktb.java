// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum ktb extends rub {
    public ktb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        ctb ctbVar = rub.X;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bsbVar.c = ctbVar;
            return;
        }
        if (d == '/') {
            bsbVar.c = rub.f0;
            return;
        }
        msb msbVar = rub.a;
        if (d == '>') {
            bsbVar.k();
            bsbVar.c = msbVar;
        } else if (d == 65535) {
            bsbVar.l(this);
            bsbVar.c = msbVar;
        } else {
            bsbVar.m(this);
            hl1Var.q();
            bsbVar.c = ctbVar;
        }
    }
}
