package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ v10 c;

    public /* synthetic */ b7(WalletEngine2 walletEngine2, v10 v10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = v10Var;
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
