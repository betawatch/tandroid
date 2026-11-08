package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ v10 c;
    public final /* synthetic */ TL_wallet.sendTransfer d;
    public final /* synthetic */ String e;

    public /* synthetic */ w6(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = v10Var;
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
