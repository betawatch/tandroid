package m4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ y(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                c0 c0Var = e0Var.u;
                if (c0Var != null) {
                    e0Var.t.C(c0Var);
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
