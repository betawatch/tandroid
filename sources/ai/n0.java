package ai;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ n0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                if (s0Var.h == null && s0Var.d != null && !s0Var.isFinished && s0Var.getParentActivity() != null) {
                    s0Var.g0(s0Var.d.H0(), 0.0f, true);
                    s0Var.h.setVisibility(4);
                    d dVar = s0Var.y;
                    if (dVar != null) {
                        dVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                s0 s0Var2 = this.b;
                d dVar2 = s0Var2.y;
                if (dVar2 != null) {
                    dVar2.invalidate();
                }
                s0Var2.m0();
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
