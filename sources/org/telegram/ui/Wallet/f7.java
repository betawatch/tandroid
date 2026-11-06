package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c20 d;

    public /* synthetic */ f7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
        this.b = walletEngine2;
        this.c = str;
        this.d = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$previewSignMessage$7(this.d, this.c);
                break;
            default:
                this.b.lambda$getTransactionByHash$39(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ f7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.b = walletEngine2;
        this.d = c20Var;
        this.c = str;
    }
}
