package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ q20 d;

    public /* synthetic */ j7(WalletEngine2 walletEngine2, String str, q20 q20Var) {
        this.b = walletEngine2;
        this.c = str;
        this.d = q20Var;
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

    public /* synthetic */ j7(WalletEngine2 walletEngine2, q20 q20Var, String str) {
        this.b = walletEngine2;
        this.d = q20Var;
        this.c = str;
    }
}
