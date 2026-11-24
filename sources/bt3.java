// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt3 implements ed {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt3(int i, int i2, d dVar) {
        this.a = i;
        this.b = i2;
        this.c = dVar;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        d dVar = (d) this.c;
        c01 g = hdVar.g(-1, true, true);
        g.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i2 = this.b;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new e(i2, dVar, g, hdVar));
    }

    public /* synthetic */ bt3(gt3 gt3Var, int i, int i2) {
        this.c = gt3Var;
        this.a = i;
        this.b = i2;
    }
}
