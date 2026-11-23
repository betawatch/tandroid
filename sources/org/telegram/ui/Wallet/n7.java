package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ r10 c;
    public final /* synthetic */ TL_wallet.sendTransfer d;
    public final /* synthetic */ String e;

    public /* synthetic */ n7(WalletEngine2 walletEngine2, r10 r10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = r10Var;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$prepareTonConnectTransfer$4(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$prepareTonConnectTransferPair$7(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$prepareSendNFT$28(this.c, this.d, this.e);
                break;
        }
    }
}
