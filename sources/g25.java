// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;

    public /* synthetic */ g25(c cVar, icc iccVar) {
        this.a = (byte) 0;
        this.b = iccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                c.m("getSecretPhrase: password request closed without a result");
                iccVar.a(null, "WALLET_SEND_CANCELLED");
                break;
            case 1:
                iccVar.a(null, "CANCELLED");
                break;
            case 2:
                iccVar.a(null, "EMPTY");
                break;
            case 3:
                iccVar.a(Boolean.FALSE, null);
                break;
            case 4:
                iccVar.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 5:
                iccVar.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 6:
                cc4.b("StarsController.buy onCanceled");
                hl.c3(new g25(iccVar, (byte) 3));
                break;
            case 7:
                iccVar.a(null, Boolean.FALSE);
                break;
            case 8:
                iccVar.a(null, "Wallet engine is closed");
                break;
            case 9:
                iccVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 10:
                iccVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 11:
                iccVar.a(null, "Recovery phrase is required");
                break;
            case 12:
                iccVar.a(null, "Transaction hash is required");
                break;
            case 13:
                iccVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 14:
                iccVar.a(null, "NO_WALLET_ENGINE");
                break;
            default:
                iccVar.a(null, "NO_WALLET_ENGINE");
                break;
        }
    }

    public /* synthetic */ g25(icc iccVar, byte b) {
        this.a = b;
        this.b = iccVar;
    }
}
