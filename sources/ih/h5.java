package ih;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tm;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ kf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h5(q5 q5Var, org.telegram.ui.ActionBar.c2 c2Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = q5Var;
        this.f = c2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                q5.U((q5) this.e, (org.telegram.ui.ActionBar.c2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                yo0.U((yo0) this.e, this.b, this.c, this.d, (tm) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ h5(yo0 yo0Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm tmVar) {
        this.e = yo0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = tmVar;
    }
}
