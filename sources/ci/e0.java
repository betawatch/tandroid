package ci;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ e0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                if (i0Var.h == null && i0Var.d != null && !i0Var.isFinished && i0Var.getParentActivity() != null) {
                    i0Var.g0(i0Var.d.H0(), 0.0f, true);
                    i0Var.h.setVisibility(4);
                    c cVar = i0Var.y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                i0 i0Var2 = this.b;
                c cVar2 = i0Var2.y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                i0Var2.m0();
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
