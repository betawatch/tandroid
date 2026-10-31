package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] b;

    public /* synthetic */ q1(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10) {
        this.a = i10;
        this.b = x1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, w0.b, null);
                x1VarArr[0] = x1Var;
                x1Var.r(500L);
                break;
            default:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.b[0];
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    break;
                }
                break;
        }
    }
}
