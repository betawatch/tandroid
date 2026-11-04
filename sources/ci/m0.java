package ci;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(int i3, int i10, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = i10;
        this.c = d2Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
        sf.b h = s1Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i10 = this.b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new o0(i10, d2Var, h, s1Var));
    }

    public /* synthetic */ m0(xs xsVar, int i3, int i10) {
        this.c = xsVar;
        this.a = i3;
        this.b = i10;
    }
}
