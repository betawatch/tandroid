package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class na1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb1 b;

    public /* synthetic */ na1(pb1 pb1Var, int i10) {
        this.a = i10;
        this.b = pb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pb1 pb1Var = this.b;
                pb1Var.A0();
                pb1Var.E0();
                break;
            case 1:
                this.b.A0();
                break;
            case 2:
                this.b.R0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                pb1 pb1Var2 = this.b;
                pb1Var2.A0 = null;
                pb1Var2.Y0(true, false);
                break;
            default:
                pb1 pb1Var3 = this.b;
                pb1Var3.N.postOnAnimation(new na1(pb1Var3, 1));
                break;
        }
    }
}
