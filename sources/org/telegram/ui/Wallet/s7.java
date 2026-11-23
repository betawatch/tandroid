package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ r10 c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ s7(WalletEngine2 walletEngine2, r10 r10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = r10Var;
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
