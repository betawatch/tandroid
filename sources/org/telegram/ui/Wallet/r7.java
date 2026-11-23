package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ p10 c;

    public /* synthetic */ r7(WalletEngine2 walletEngine2, p10 p10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = p10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$emulateRotateKey$33(this.c);
                break;
            case 1:
                this.b.lambda$prepareSendNFT$27(this.c);
                break;
            default:
                this.b.lambda$balance$17(this.c);
                break;
        }
    }
}
