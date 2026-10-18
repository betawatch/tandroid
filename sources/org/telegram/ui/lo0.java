package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                yh.g4.V((yh.g4) this.e, (org.telegram.ui.ActionBar.b2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ lo0(yh.g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = g4Var;
        this.f = b2Var;
        this.b = cVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }
}
