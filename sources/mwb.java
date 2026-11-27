// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum mwb extends rwb {
    public mwb() {
        super("CdataSection", 66);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        String c;
        StringBuilder sb = bubVar.h;
        String[] strArr = ik1Var.h;
        char[] cArr = ik1Var.a;
        int p = ik1Var.p("]]>");
        if (p != -1) {
            c = ik1.c(cArr, strArr, ik1Var.e, p);
            ik1Var.e += p;
        } else {
            ik1Var.b();
            int i = ik1Var.e;
            c = ik1.c(cArr, strArr, i, ik1Var.c - i);
            ik1Var.e = ik1Var.c;
        }
        sb.append(c);
        if (ik1Var.k("]]>") || ik1Var.j()) {
            String sb2 = sb.toString();
            ptb ptbVar = new ptb(5, (byte) 2);
            ptbVar.e = sb2;
            bubVar.g(ptbVar);
            bubVar.c = rwb.a;
        }
    }
}
