// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class onc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ v25 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ i8c f;

    public /* synthetic */ onc(WalletEngine2 walletEngine2, byte[] bArr, v25 v25Var, String str, i8c i8cVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = v25Var;
        this.e = str;
        this.f = i8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.f;
        String str = this.e;
        v25 v25Var = this.d;
        byte[] bArr = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$signMessage$14(bArr, v25Var, str, i8cVar);
                break;
            default:
                walletEngine2.lambda$prepareTonConnectTransfer$5(bArr, v25Var, str, i8cVar);
                break;
        }
    }
}
