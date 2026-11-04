package o4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ y(e0 e0Var, int i3) {
        this.a = i3;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                c0 c0Var = e0Var.u;
                if (c0Var != null) {
                    e0Var.t.s(c0Var);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                e0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
