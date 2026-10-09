package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ v7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j8.a0(this.b, (String) obj);
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
