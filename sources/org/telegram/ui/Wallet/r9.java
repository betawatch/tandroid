package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
