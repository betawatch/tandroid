package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ a9(m9 m9Var, int i7) {
        this.a = i7;
        this.b = m9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                m9.f0(this.b, (String) obj);
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
