package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class db1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb1 b;

    public /* synthetic */ db1(eb1 eb1Var, int i10) {
        this.a = i10;
        this.b = eb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eb1 eb1Var = this.b;
                eb1Var.F = null;
                if (eb1Var.G != -1) {
                    eb1Var.H.getNotificationCenter().j(eb1Var.G);
                    eb1Var.G = -1;
                    break;
                }
                break;
            default:
                eb1 eb1Var2 = this.b;
                eb1Var2.F = null;
                if (eb1Var2.G != -1) {
                    eb1Var2.H.getNotificationCenter().j(eb1Var2.G);
                    eb1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
