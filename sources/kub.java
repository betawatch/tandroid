// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum kub extends rwb {
    public kub() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            bubVar.d(false);
            bubVar.c = rwb.I;
        } else {
            bubVar.h("</");
            bubVar.c = rwb.f;
        }
    }
}
