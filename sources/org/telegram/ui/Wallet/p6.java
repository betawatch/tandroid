package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ d2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Utilities.Callback2 f;

    public /* synthetic */ p6(WalletEngine2 walletEngine2, byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = d2Var;
        this.e = str;
        this.f = callback2;
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
