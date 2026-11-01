package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ k20 c;

    public /* synthetic */ f7(WalletEngine2 walletEngine2, k20 k20Var, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = k20Var;
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
