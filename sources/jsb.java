// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum jsb extends rub {
    public jsb() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        if (d == '!') {
            bsbVar.h("<!");
            bsbVar.c = rub.J;
        } else if (d == '/') {
            bsbVar.e();
            bsbVar.c = rub.H;
        } else {
            bsbVar.h("<");
            hl1Var.q();
            bsbVar.c = rub.f;
        }
    }
}
