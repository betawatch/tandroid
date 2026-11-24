// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum ntb extends rub {
    public ntb() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.k("--")) {
            bsbVar.n.s();
            bsbVar.c = rub.i0;
        } else if (hl1Var.l("DOCTYPE")) {
            bsbVar.c = rub.o0;
        } else if (hl1Var.k("[CDATA[")) {
            bsbVar.e();
            bsbVar.c = rub.E0;
        } else {
            bsbVar.m(this);
            bsbVar.a(rub.g0);
        }
    }
}
