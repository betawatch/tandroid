package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vk;
import org.telegram.ui.gp0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ mf.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h5(q5 q5Var, org.telegram.ui.ActionBar.d2 d2Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = q5Var;
        this.f = d2Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                q5.U((q5) this.e, (org.telegram.ui.ActionBar.d2) this.f, this.b, this.c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                gp0.U((gp0) this.e, this.b, this.c, this.d, (vk) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ h5(gp0 gp0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, vk vkVar) {
        this.e = gp0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = vkVar;
    }
}
