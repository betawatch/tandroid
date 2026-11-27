// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum nvb extends rwb {
    public nvb() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.k("--")) {
            bubVar.n.s();
            bubVar.c = rwb.i0;
        } else if (ik1Var.l("DOCTYPE")) {
            bubVar.c = rwb.o0;
        } else if (ik1Var.k("[CDATA[")) {
            bubVar.e();
            bubVar.c = rwb.E0;
        } else {
            bubVar.m(this);
            bubVar.a(rwb.g0);
        }
    }
}
