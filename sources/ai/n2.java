package ai;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n2(q2 q2Var, boolean z10, int i3) {
        this.a = i3;
        this.b = q2Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                q2 q2Var = this.b;
                if (!z10) {
                    q2Var.H.setVisibility(8);
                    break;
                } else {
                    q2Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                q2 q2Var2 = this.b;
                if (!z11) {
                    q2Var2.w.setVisibility(8);
                    break;
                } else {
                    q2Var2.getClass();
                    break;
                }
        }
    }
}
