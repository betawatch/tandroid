package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ j20 c;

    public /* synthetic */ f7(WalletEngine2 walletEngine2, j20 j20Var, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = j20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$emulateRotateKey$30(this.c);
                break;
            case 1:
                this.b.lambda$balance$14(this.c);
                break;
            default:
                this.b.lambda$prepareSendNFT$24(this.c);
                break;
        }
    }
}
