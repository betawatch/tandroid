package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ r10 c;

    public /* synthetic */ q7(WalletEngine2 walletEngine2, r10 r10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = r10Var;
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
