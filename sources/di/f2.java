package di;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
