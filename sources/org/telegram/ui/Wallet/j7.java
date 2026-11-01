package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r20 d;

    public /* synthetic */ j7(WalletEngine2 walletEngine2, String str, r20 r20Var) {
        this.b = walletEngine2;
        this.c = str;
        this.d = r20Var;
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

    public /* synthetic */ j7(WalletEngine2 walletEngine2, r20 r20Var, String str) {
        this.b = walletEngine2;
        this.d = r20Var;
        this.c = str;
    }
}
