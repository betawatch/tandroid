package gh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i9, int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = i10;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i10 = this.b;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_resolveStarGiftOffer, new j0(i10, o2Var, g10, c2Var));
    }

    public /* synthetic */ h0(mt mtVar, int i9, int i10) {
        this.c = mtVar;
        this.a = i9;
        this.b = i10;
    }
}
