package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ d2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ k20 f;

    public /* synthetic */ d7(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, k20 k20Var, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f = k20Var;
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
