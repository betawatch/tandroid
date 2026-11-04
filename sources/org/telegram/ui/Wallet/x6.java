package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ b2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ n10 f;

    public /* synthetic */ x6(WalletEngine2 walletEngine2, byte[] bArr, b2 b2Var, String str, n10 n10Var, int i3) {
        this.a = i3;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = b2Var;
        this.e = str;
        this.f = n10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$signMessage$11(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.lambda$prepareTonConnectTransfer$5(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
