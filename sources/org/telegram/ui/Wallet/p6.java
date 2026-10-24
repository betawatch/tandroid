package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
