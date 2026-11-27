// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
