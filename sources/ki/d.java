package ki;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ d(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        k kVar = this.b;
        switch (i7) {
            case 0:
                kVar.W.g(kVar.b0.end_date != 0 ? ah.r.f((r4 - kVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
                if (kVar.b0.end_date != 0 && kVar.e0) {
                    org.telegram.messenger.g0.i3(kVar.Y, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().o1(kVar.S);
                TL_payments.starRefProgram starrefprogram = kVar.b0;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i11 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i11;
                if (i11 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i11 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i11 & (-2);
                }
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, kVar.getParentActivity(), null);
                t1Var.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, t1Var, i10));
                break;
            default:
                vf.c.t(kVar.getParentActivity(), hd.M0((kVar.Z || kVar.b0.end_date != 0) ? 2131754314 : 2131754327, null));
                break;
        }
    }
}
