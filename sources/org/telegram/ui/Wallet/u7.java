package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ String d;

    public /* synthetic */ u7(WalletEngine2 walletEngine2, String str, x10 x10Var) {
        this.b = walletEngine2;
        this.d = str;
        this.c = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getTransactionByHash$42(this.d, this.c);
                break;
            default:
                this.b.lambda$previewSignMessage$10(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ u7(WalletEngine2 walletEngine2, x10 x10Var, String str) {
        this.b = walletEngine2;
        this.c = x10Var;
        this.d = str;
    }
}
