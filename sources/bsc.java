// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bsc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ z45 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ icc f;

    public /* synthetic */ bsc(WalletEngine2 walletEngine2, byte[] bArr, z45 z45Var, String str, icc iccVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = z45Var;
        this.e = str;
        this.f = iccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        icc iccVar = this.f;
        String str = this.e;
        z45 z45Var = this.d;
        byte[] bArr = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$signMessage$14(bArr, z45Var, str, iccVar);
                break;
            default:
                walletEngine2.lambda$prepareTonConnectTransfer$5(bArr, z45Var, str, iccVar);
                break;
        }
    }
}
