package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ c9(o9 o9Var, int i7) {
        this.a = i7;
        this.b = o9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                o9.f0(this.b, (String) obj);
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
