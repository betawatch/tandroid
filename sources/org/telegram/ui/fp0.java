package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ag.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fp0(eq0 eq0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, cp0 cp0Var) {
        this.e = eq0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = cp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                eq0.V((eq0) this.e, this.b, this.c, this.d, (cp0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                yh.f4.V((yh.f4) this.e, (org.telegram.ui.ActionBar.a2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ fp0(yh.f4 f4Var, org.telegram.ui.ActionBar.a2 a2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = f4Var;
        this.f = a2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }
}
