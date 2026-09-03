package mh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i10, int i11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = i11;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i11 = this.b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new h0(i11, p2Var, g10, d2Var));
    }

    public /* synthetic */ f0(xt xtVar, int i10, int i11) {
        this.c = xtVar;
        this.a = i10;
        this.b = i11;
    }
}
