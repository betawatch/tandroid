package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cp0(bq0 bq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var) {
        this.e = bq0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
        this.f = zo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                bq0.V((bq0) this.e, this.b, this.c, this.d, (zo0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                yh.f4.U((yh.f4) this.e, (org.telegram.ui.ActionBar.b2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ cp0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = f4Var;
        this.f = b2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
    }
}
