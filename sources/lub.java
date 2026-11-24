// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum lub extends rub {
    public lub() {
        super("BogusDoctype", 65);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        msb msbVar = rub.a;
        if (d == '>') {
            bsbVar.j();
            bsbVar.c = msbVar;
        } else {
            if (d != 65535) {
                return;
            }
            bsbVar.j();
            bsbVar.c = msbVar;
        }
    }
}
