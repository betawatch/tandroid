package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ fu(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                uw uwVar = this.b;
                uwVar.P1 = (Long) obj;
                uwVar.g5();
                break;
            default:
                uw.f0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
