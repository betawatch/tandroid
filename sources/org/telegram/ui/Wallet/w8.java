package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ w8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j9.a0(this.b, (String) obj);
                break;
            case 1:
                this.b.p0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                this.b.p0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                this.b.p0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
