package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ k2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ q10 f;

    public /* synthetic */ p7(WalletEngine2 walletEngine2, byte[] bArr, k2 k2Var, String str, q10 q10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = k2Var;
        this.e = str;
        this.f = q10Var;
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
