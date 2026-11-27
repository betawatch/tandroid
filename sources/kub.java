// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
