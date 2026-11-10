package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ v10 c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ e7(WalletEngine2 walletEngine2, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = v10Var;
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
