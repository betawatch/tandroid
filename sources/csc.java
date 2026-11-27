// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class csc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ icc c;

    public /* synthetic */ csc(WalletEngine2 walletEngine2, icc iccVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = iccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        icc iccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$33(iccVar);
                break;
            case 1:
                walletEngine2.lambda$prepareSendNFT$27(iccVar);
                break;
            default:
                walletEngine2.lambda$balance$17(iccVar);
                break;
        }
    }
}
