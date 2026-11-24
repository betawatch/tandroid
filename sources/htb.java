// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum htb extends rub {
    public htb() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String g = hl1Var.g(rub.F0);
        int length = g.length();
        wrb wrbVar = bsbVar.i;
        if (length > 0) {
            wrbVar.w(g);
        } else {
            wrbVar.j = true;
        }
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.i.v((char) 65533);
            return;
        }
        if (d == 65535) {
            bsbVar.l(this);
            bsbVar.c = rub.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                bsbVar.i.v(d);
                return;
            } else {
                bsbVar.c = rub.e0;
                return;
            }
        }
        int[] c = bsbVar.c('\'', true);
        wrb wrbVar2 = bsbVar.i;
        if (c != null) {
            wrbVar2.x(c);
        } else {
            wrbVar2.v('&');
        }
    }
}
