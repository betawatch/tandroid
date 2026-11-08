package bi;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.h0 b;

    public /* synthetic */ z3(zh.h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                zh.h0 h0Var = this.b;
                rh.h hVar = h0Var.n1;
                jh.f fVar = h0Var.m1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.g0 g0Var = h0Var.y1;
                if (g0Var != null) {
                    g0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.j6 j6Var = h0Var.s1;
                if (j6Var != null) {
                    j6Var.setTranslationY(-hVar.d());
                }
                h0Var.I0();
                break;
            case 2:
                this.b.y1.performClick();
                break;
            default:
                this.b.o1.I0();
                break;
        }
    }
}
