package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig1 b;

    public /* synthetic */ gf1(ig1 ig1Var, int i10) {
        this.a = i10;
        this.b = ig1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ig1 ig1Var = this.b;
                ig1Var.x0();
                ig1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                ig1 ig1Var2 = this.b;
                ig1Var2.A0 = null;
                ig1Var2.U0(true, false);
                break;
            default:
                ig1 ig1Var3 = this.b;
                ig1Var3.N.postOnAnimation(new gf1(ig1Var3, 1));
                break;
        }
    }
}
