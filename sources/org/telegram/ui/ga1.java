package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la1 b;

    public /* synthetic */ ga1(la1 la1Var, int i10) {
        this.a = i10;
        this.b = la1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                la1 la1Var = this.b;
                la1Var.getClass();
                new kg.i1((org.telegram.ui.ActionBar.k2) la1Var, 11, false).show();
                break;
            default:
                la1 la1Var2 = this.b;
                la1Var2.e.requestFocus();
                org.telegram.messenger.i0.J3(la1Var2.e);
                break;
        }
    }
}
