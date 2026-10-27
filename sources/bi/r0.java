package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ju;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(int i10, int i11, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = i11;
        this.c = r2Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i11 = this.b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new v0(i11, r2Var, h, e2Var));
    }

    public /* synthetic */ r0(ju juVar, int i10, int i11) {
        this.c = juVar;
        this.a = i10;
        this.b = i11;
    }
}
