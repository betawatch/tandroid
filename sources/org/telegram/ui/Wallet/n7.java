package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ q10 c;
    public final /* synthetic */ TL_wallet.sendTransfer d;
    public final /* synthetic */ String e;

    public /* synthetic */ n7(WalletEngine2 walletEngine2, q10 q10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = q10Var;
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
