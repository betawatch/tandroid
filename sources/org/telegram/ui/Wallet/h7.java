package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ j20 c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ h7(WalletEngine2 walletEngine2, j20 j20Var, TL_wallet.walletTransaction wallettransaction, String str, int i10) {
        this.a = i10;
        this.b = walletEngine2;
        this.c = j20Var;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$previewTonConnect$1(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$emulateRotateKey$29(this.c, this.d, this.e);
                break;
        }
    }
}
