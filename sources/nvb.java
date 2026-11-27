// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
