package ai;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
