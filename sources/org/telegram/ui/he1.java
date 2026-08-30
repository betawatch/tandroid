package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf1 b;

    public /* synthetic */ he1(kf1 kf1Var, int i10) {
        this.a = i10;
        this.b = kf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kf1 kf1Var = this.b;
                kf1Var.x0();
                kf1Var.B0();
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
                kf1 kf1Var2 = this.b;
                kf1Var2.x0 = null;
                kf1Var2.U0(true, false);
                break;
            default:
                kf1 kf1Var3 = this.b;
                kf1Var3.K.postOnAnimation(new he1(kf1Var3, 1));
                break;
        }
    }
}
