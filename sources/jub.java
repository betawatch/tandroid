// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
