package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bp0(aq0 aq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yo0 yo0Var) {
        this.e = aq0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
        this.f = yo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                aq0.V((aq0) this.e, this.b, this.c, this.d, (yo0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                xh.g4.U((xh.g4) this.e, (org.telegram.ui.ActionBar.b2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ bp0(xh.g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = g4Var;
        this.f = b2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
    }
}
