package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ u7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i8.a0(this.b, (String) obj);
                break;
            case 1:
                this.b.m0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                this.b.m0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                this.b.m0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
