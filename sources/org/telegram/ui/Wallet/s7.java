package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ q10 c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ s7(WalletEngine2 walletEngine2, q10 q10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = q10Var;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$emulateRotateKey$32(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$previewTonConnect$1(this.c, this.d, this.e);
                break;
        }
    }
}
