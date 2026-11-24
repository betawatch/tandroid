// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum bub extends rub {
    public bub() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.m(this);
            srbVar.f.append((char) 65533);
            return;
        }
        if (d == '\"') {
            bsbVar.c = rub.w0;
            return;
        }
        msb msbVar = rub.a;
        if (d == '>') {
            bsbVar.m(this);
            bsbVar.j();
            bsbVar.c = msbVar;
        } else {
            if (d != 65535) {
                srbVar.f.append(d);
                return;
            }
            bsbVar.l(this);
            bsbVar.j();
            bsbVar.c = msbVar;
        }
    }
}
