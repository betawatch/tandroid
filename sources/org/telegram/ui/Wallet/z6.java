package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ e2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ v10 f;

    public /* synthetic */ z6(WalletEngine2 walletEngine2, byte[] bArr, e2 e2Var, String str, v10 v10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = e2Var;
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
