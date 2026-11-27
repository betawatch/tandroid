// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum jub extends rwb {
    public jub() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d == '!') {
            bubVar.h("<!");
            bubVar.c = rwb.J;
        } else if (d == '/') {
            bubVar.e();
            bubVar.c = rwb.H;
        } else {
            bubVar.h("<");
            ik1Var.q();
            bubVar.c = rwb.f;
        }
    }
}
