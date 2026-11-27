// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
