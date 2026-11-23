package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ k7(n7 n7Var, int i7) {
        this.a = i7;
        this.b = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n7.a(this.b);
                break;
            default:
                n7 n7Var = this.b;
                Runnable runnable = n7Var.d0;
                n7Var.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
