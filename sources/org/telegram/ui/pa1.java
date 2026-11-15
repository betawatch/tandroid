package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa1 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa1 b;

    public /* synthetic */ pa1(xa1 xa1Var, int i7) {
        this.a = i7;
        this.b = xa1Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                xa1 xa1Var = this.b;
                xa1Var.G0();
                xa1Var.finishFragment();
                break;
            case 2:
                xa1 xa1Var2 = this.b;
                xa1Var2.S = "";
                xa1Var2.J0(false);
                break;
            case 3:
                xa1.f0(this.b);
                break;
            default:
                xa1.c0(this.b);
                break;
        }
    }
}
