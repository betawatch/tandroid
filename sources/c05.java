// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c05 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8c b;

    public /* synthetic */ c05(c cVar, i8c i8cVar) {
        this.a = (byte) 0;
        this.b = i8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                c.m("getSecretPhrase: password request closed without a result");
                i8cVar.a(null, "WALLET_SEND_CANCELLED");
                break;
            case 1:
                i8cVar.a(null, "CANCELLED");
                break;
            case 2:
                i8cVar.a(null, "EMPTY");
                break;
            case 3:
                i8cVar.a(Boolean.FALSE, null);
                break;
            case 4:
                i8cVar.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 5:
                i8cVar.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 6:
                fa4.b("StarsController.buy onCanceled");
                gl.c3(new c05(i8cVar, (byte) 3));
                break;
            case 7:
                i8cVar.a(null, Boolean.FALSE);
                break;
            case 8:
                i8cVar.a(null, "Wallet engine is closed");
                break;
            case 9:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 10:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 11:
                i8cVar.a(null, "Recovery phrase is required");
                break;
            case 12:
                i8cVar.a(null, "Transaction hash is required");
                break;
            case 13:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                break;
            case 14:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                break;
            default:
                i8cVar.a(null, "NO_WALLET_ENGINE");
                break;
        }
    }

    public /* synthetic */ c05(i8c i8cVar, byte b) {
        this.a = b;
        this.b = i8cVar;
    }
}
