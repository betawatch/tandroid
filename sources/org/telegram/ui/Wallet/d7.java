package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ u10 d;

    public /* synthetic */ d7(WalletEngine2 walletEngine2, String str, u10 u10Var) {
        this.b = walletEngine2;
        this.c = str;
        this.d = u10Var;
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

    public /* synthetic */ d7(WalletEngine2 walletEngine2, u10 u10Var, String str) {
        this.b = walletEngine2;
        this.d = u10Var;
        this.c = str;
    }
}
