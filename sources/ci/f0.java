package ci;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ f0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                if (j0Var.h == null && j0Var.d != null && !j0Var.isFinished && j0Var.getParentActivity() != null) {
                    j0Var.g0(j0Var.d.H0(), 0.0f, true);
                    j0Var.h.setVisibility(4);
                    c cVar = j0Var.y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                j0 j0Var2 = this.b;
                c cVar2 = j0Var2.y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                j0Var2.m0();
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
