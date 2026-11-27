// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
