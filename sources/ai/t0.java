package ai;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ t0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                if (z0Var.h == null && z0Var.d != null && !z0Var.isFinished && z0Var.getParentActivity() != null) {
                    z0Var.c0(z0Var.d.H0(), 0.0f, true);
                    z0Var.h.setVisibility(4);
                    d dVar = z0Var.x;
                    if (dVar != null) {
                        dVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                z0 z0Var2 = this.b;
                d dVar2 = z0Var2.x;
                if (dVar2 != null) {
                    dVar2.invalidate();
                }
                z0Var2.i0();
                break;
            default:
                this.b.g0();
                break;
        }
    }
}
