package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ r6(WalletEngine2 walletEngine2, Utilities.Callback2 callback2, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = callback2;
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
