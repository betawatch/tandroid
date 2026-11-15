package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ s10 c;
    public final /* synthetic */ TL_wallet.sendTransfer d;
    public final /* synthetic */ String e;

    public /* synthetic */ x6(WalletEngine2 walletEngine2, s10 s10Var, TL_wallet.sendTransfer sendtransfer, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = s10Var;
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
