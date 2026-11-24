// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu3 implements ee {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lu3(int i, int i2, d dVar) {
        this.a = i;
        this.b = i2;
        this.c = dVar;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        d dVar = (d) this.c;
        k11 g = heVar.g(-1, true, true);
        g.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i2 = this.b;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new e(i2, dVar, g, heVar));
    }

    public /* synthetic */ lu3(qu3 qu3Var, int i, int i2) {
        this.c = qu3Var;
        this.a = i;
        this.b = i2;
    }
}
