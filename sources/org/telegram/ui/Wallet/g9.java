package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g9 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ g9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                r9.e0(this.b, (String) obj);
                break;
            case 1:
                this.b.q0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                this.b.q0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                this.b.q0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
