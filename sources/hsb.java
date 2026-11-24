// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum hsb extends rub {
    public hsb() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            bsbVar.d(false);
            bsbVar.c = rub.F;
        } else {
            bsbVar.h("</");
            bsbVar.c = rub.e;
        }
    }
}
