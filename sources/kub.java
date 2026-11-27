// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
