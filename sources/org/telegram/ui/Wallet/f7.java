package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ z10 d;

    public /* synthetic */ f7(WalletEngine2 walletEngine2, String str, z10 z10Var) {
        this.b = walletEngine2;
        this.c = str;
        this.d = z10Var;
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

    public /* synthetic */ f7(WalletEngine2 walletEngine2, z10 z10Var, String str) {
        this.b = walletEngine2;
        this.d = z10Var;
        this.c = str;
    }
}
