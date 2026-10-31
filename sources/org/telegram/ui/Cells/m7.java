package org.telegram.ui.Cells;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ m7(o7 o7Var, int i10) {
        this.a = i10;
        this.b = o7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o7 o7Var = this.b;
                o7Var.post(new m7(o7Var, 1));
                break;
            default:
                o7 o7Var2 = this.b;
                o7Var2.b0.L0 = true;
                o7Var2.H.clear();
                o7Var2.I.clear();
                o7Var2.J.clear();
                o7Var2.invalidate();
                break;
        }
    }
}
