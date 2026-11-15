package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                Runnable runnable = w6Var.d0;
                w6Var.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
