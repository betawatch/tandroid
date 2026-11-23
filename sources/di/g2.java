package di;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ g2(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.g2();
                break;
            case 1:
                f6 f6Var = this.b;
                org.telegram.ui.Wallet.n6.N0(f6Var.a, f6Var.getContext(), f6Var.J0);
                break;
            default:
                this.b.g2();
                break;
        }
    }
}
