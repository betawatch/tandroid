package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ag.c b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lo0(kp0 kp0Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, io0 io0Var) {
        this.e = kp0Var;
        this.b = cVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = io0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                kp0.V((kp0) this.e, this.b, this.c, this.d, (io0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.b2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ lo0(yh.f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f = b2Var;
        this.b = cVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }
}
