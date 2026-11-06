package bi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.i0 b;

    public /* synthetic */ z3(zh.i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                zh.i0 i0Var = this.b;
                rh.h hVar = i0Var.n1;
                jh.f fVar = i0Var.m1;
                if (fVar != null) {
                    fVar.d();
                }
                zh.h0 h0Var = i0Var.y1;
                if (h0Var != null) {
                    h0Var.setTranslationY(-hVar.d());
                }
                org.telegram.ui.Components.j6 j6Var = i0Var.s1;
                if (j6Var != null) {
                    j6Var.setTranslationY(-hVar.d());
                }
                i0Var.I0();
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
