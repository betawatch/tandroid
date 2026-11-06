package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6 b;

    public /* synthetic */ t6(w6 w6Var, int i7) {
        this.a = i7;
        this.b = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w6.a(this.b);
                break;
            default:
                w6 w6Var = this.b;
                Runnable runnable = w6Var.c0;
                w6Var.c0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
