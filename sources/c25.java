// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class c25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jac b;

    public /* synthetic */ c25(c cVar, jac jacVar) {
        this.a = (byte) 0;
        this.b = jacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                c.m("getSecretPhrase: password request closed without a result");
                jacVar.a(null, "WALLET_SEND_CANCELLED");
                break;
            case 1:
                jacVar.a(null, "CANCELLED");
                break;
            case 2:
                jacVar.a(null, "EMPTY");
                break;
            case 3:
                jacVar.a(Boolean.FALSE, null);
                break;
            case 4:
                jacVar.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 5:
                jacVar.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 6:
                fc4.b("StarsController.buy onCanceled");
                gm.c3(new c25(jacVar, (byte) 3));
                break;
            case 7:
                jacVar.a(null, Boolean.FALSE);
                break;
            case 8:
                jacVar.a(null, "Wallet engine is closed");
                break;
            case 9:
                jacVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 10:
                jacVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 11:
                jacVar.a(null, "Recovery phrase is required");
                break;
            case 12:
                jacVar.a(null, "Transaction hash is required");
                break;
            case 13:
                jacVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 14:
                jacVar.a(null, "NO_WALLET_ENGINE");
                break;
            default:
                jacVar.a(null, "NO_WALLET_ENGINE");
                break;
        }
    }

    public /* synthetic */ c25(jac jacVar, byte b) {
        this.a = b;
        this.b = jacVar;
    }
}
