package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.no0;
import org.telegram.ui.np0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ lf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g5(p5 p5Var, org.telegram.ui.ActionBar.d2 d2Var, lf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = p5Var;
        this.f = d2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                p5.U((p5) this.e, (org.telegram.ui.ActionBar.d2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                np0.V((np0) this.e, this.b, this.c, this.d, (no0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ g5(np0 np0Var, lf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var) {
        this.e = np0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = no0Var;
    }
}
