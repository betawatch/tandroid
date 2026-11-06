package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ b9(n9 n9Var, int i7) {
        this.a = i7;
        this.b = n9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                n9.f0(this.b, (String) obj);
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
