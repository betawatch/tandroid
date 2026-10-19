package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ v8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i9.a0(this.b, (String) obj);
                break;
            case 1:
                this.b.n0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                this.b.n0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                this.b.n0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
