package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c20 d;

    public /* synthetic */ g7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
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

    public /* synthetic */ g7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.b = walletEngine2;
        this.d = c20Var;
        this.c = str;
    }
}
