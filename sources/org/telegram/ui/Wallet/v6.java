package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ v6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.b = walletEngine2;
        this.c = str;
        this.d = callback;
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

    public /* synthetic */ v6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.b = walletEngine2;
        this.d = callback;
        this.c = str;
    }
}
