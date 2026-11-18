package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ q10 c;

    public /* synthetic */ q7(WalletEngine2 walletEngine2, q10 q10Var, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = q10Var;
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
