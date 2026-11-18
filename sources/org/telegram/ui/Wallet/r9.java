package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ r9(da daVar, int i7) {
        this.a = i7;
        this.b = daVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                da.f0(this.b, (String) obj);
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
