package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ p10 c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ t7(WalletEngine2 walletEngine2, p10 p10Var, TL_wallet.walletTransaction wallettransaction, String str, int i7) {
        this.a = i7;
        this.b = walletEngine2;
        this.c = p10Var;
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
