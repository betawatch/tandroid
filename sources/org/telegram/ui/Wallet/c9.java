package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ c9(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p9.f0(this.b, (String) obj);
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
