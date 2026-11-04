package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a9 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ a9(m9 m9Var, int i3) {
        this.a = i3;
        this.b = m9Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                m9.f0(this.b, (String) obj);
                break;
            case 1:
                this.b.r0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                this.b.r0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                this.b.r0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
