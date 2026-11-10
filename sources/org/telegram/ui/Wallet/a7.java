package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ c2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ v10 f;

    public /* synthetic */ a7(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, v10 v10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = c2Var;
        this.e = str;
        this.f = v10Var;
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
