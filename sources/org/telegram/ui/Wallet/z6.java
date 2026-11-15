package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ c2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ s10 f;

    public /* synthetic */ z6(WalletEngine2 walletEngine2, byte[] bArr, c2 c2Var, String str, s10 s10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = c2Var;
        this.e = str;
        this.f = s10Var;
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
