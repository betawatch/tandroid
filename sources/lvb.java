// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum lvb extends rwb {
    public lvb() {
        super("SelfClosingStartTag", 41);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.i.l = true;
            bubVar.k();
            bubVar.c = mubVar;
        } else if (d == 65535) {
            bubVar.l(this);
            bubVar.c = mubVar;
        } else {
            bubVar.m(this);
            ik1Var.q();
            bubVar.c = rwb.X;
        }
    }
}
