package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zt(int i10, int i11, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = i11;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i11 = this.b;
        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_resolveStarGiftOffer, new ei.i1(i11, n2Var, g10, b2Var));
    }

    public /* synthetic */ zt(eu euVar, int i10, int i11) {
        this.c = euVar;
        this.a = i10;
        this.b = i11;
    }
}
