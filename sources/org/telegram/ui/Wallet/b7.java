package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ k20 c;
    public final /* synthetic */ TL_wallet.sendTransfer d;
    public final /* synthetic */ String e;

    public /* synthetic */ b7(WalletEngine2 walletEngine2, k20 k20Var, TL_wallet.sendTransfer sendtransfer, String str, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = k20Var;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$prepareTonConnectTransfer$4(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$prepareSendNFT$25(this.c, this.d, this.e);
                break;
        }
    }
}
