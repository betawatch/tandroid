// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fsc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ pcc c;
    public final /* synthetic */ String d;

    public /* synthetic */ fsc(WalletEngine2 walletEngine2, pcc pccVar, String str) {
        this.b = walletEngine2;
        this.c = pccVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        pcc pccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$getTransactionByHash$42(str, pccVar);
                break;
            default:
                walletEngine2.lambda$previewSignMessage$10(pccVar, str);
                break;
        }
    }

    public /* synthetic */ fsc(WalletEngine2 walletEngine2, String str, pcc pccVar) {
        this.b = walletEngine2;
        this.d = str;
        this.c = pccVar;
    }
}
