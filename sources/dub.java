// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum dub extends rub {
    public dub() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bsbVar.c = rub.x0;
            return;
        }
        if (d == '\"') {
            bsbVar.m(this);
            bsbVar.c = rub.A0;
            return;
        }
        if (d == '\'') {
            bsbVar.m(this);
            bsbVar.c = rub.B0;
            return;
        }
        msb msbVar = rub.a;
        if (d == '>') {
            bsbVar.j();
            bsbVar.c = msbVar;
        } else if (d != 65535) {
            bsbVar.m(this);
            bsbVar.c = rub.D0;
        } else {
            bsbVar.l(this);
            bsbVar.j();
            bsbVar.c = msbVar;
        }
    }
}
