// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum lwb extends rwb {
    public lwb() {
        super("BogusDoctype", 65);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.j();
            bubVar.c = mubVar;
        } else {
            if (d != 65535) {
                return;
            }
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
