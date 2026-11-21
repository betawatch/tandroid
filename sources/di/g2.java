package di;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
