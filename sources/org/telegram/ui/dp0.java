package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dp0(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ap0 ap0Var) {
        this.e = cq0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
        this.f = ap0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                cq0.V((cq0) this.e, this.b, this.c, this.d, (ap0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                xh.g4.U((xh.g4) this.e, (org.telegram.ui.ActionBar.c2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ dp0(xh.g4 g4Var, org.telegram.ui.ActionBar.c2 c2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = g4Var;
        this.f = c2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
    }
}
