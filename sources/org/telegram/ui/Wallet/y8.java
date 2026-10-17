package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ y8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l9.a0(this.b, (String) obj);
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
