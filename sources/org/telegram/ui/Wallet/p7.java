package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ k2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ r10 f;

    public /* synthetic */ p7(WalletEngine2 walletEngine2, byte[] bArr, k2 k2Var, String str, r10 r10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = k2Var;
        this.e = str;
        this.f = r10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$signMessage$14(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.lambda$prepareTonConnectTransfer$5(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
