package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf1 b;

    public /* synthetic */ ke1(mf1 mf1Var, int i10) {
        this.a = i10;
        this.b = mf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mf1 mf1Var = this.b;
                mf1Var.x0();
                mf1Var.B0();
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
                mf1 mf1Var2 = this.b;
                mf1Var2.x0 = null;
                mf1Var2.U0(true, false);
                break;
            default:
                mf1 mf1Var3 = this.b;
                mf1Var3.K.postOnAnimation(new ke1(mf1Var3, 1));
                break;
        }
    }
}
