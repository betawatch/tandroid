// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum mub extends rub {
    public mub() {
        super("CdataSection", 66);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String c;
        StringBuilder sb = bsbVar.h;
        String[] strArr = hl1Var.h;
        char[] cArr = hl1Var.a;
        int p = hl1Var.p("]]>");
        if (p != -1) {
            c = hl1.c(cArr, strArr, hl1Var.e, p);
            hl1Var.e += p;
        } else {
            hl1Var.b();
            int i = hl1Var.e;
            c = hl1.c(cArr, strArr, i, hl1Var.c - i);
            hl1Var.e = hl1Var.c;
        }
        sb.append(c);
        if (hl1Var.k("]]>") || hl1Var.j()) {
            String sb2 = sb.toString();
            prb prbVar = new prb(5, (byte) 2);
            prbVar.e = sb2;
            bsbVar.g(prbVar);
            bsbVar.c = rub.a;
        }
    }
}
