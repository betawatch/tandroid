package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ x6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a7.a(this.b);
                break;
            default:
                a7 a7Var = this.b;
                Runnable runnable = a7Var.c0;
                a7Var.c0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
