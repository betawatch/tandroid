package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ y10 c;
    public final /* synthetic */ String d;

    public /* synthetic */ u7(WalletEngine2 walletEngine2, String str, y10 y10Var) {
        this.b = walletEngine2;
        this.d = str;
        this.c = y10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getTransactionByHash$42(this.d, this.c);
                break;
            default:
                this.b.lambda$previewSignMessage$10(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ u7(WalletEngine2 walletEngine2, y10 y10Var, String str) {
        this.b = walletEngine2;
        this.c = y10Var;
        this.d = str;
    }
}
