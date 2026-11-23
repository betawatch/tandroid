package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ w10 c;
    public final /* synthetic */ String d;

    public /* synthetic */ v7(WalletEngine2 walletEngine2, String str, w10 w10Var) {
        this.b = walletEngine2;
        this.d = str;
        this.c = w10Var;
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

    public /* synthetic */ v7(WalletEngine2 walletEngine2, w10 w10Var, String str) {
        this.b = walletEngine2;
        this.c = w10Var;
        this.d = str;
    }
}
