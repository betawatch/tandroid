package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ b9(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                o9.a0(this.b, (String) obj);
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
