package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ b7(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
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

    public /* synthetic */ b7(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.b = walletEngine2;
        this.d = callback;
        this.c = str;
    }
}
