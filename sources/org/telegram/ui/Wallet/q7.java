package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
