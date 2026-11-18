package di;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ f2(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
