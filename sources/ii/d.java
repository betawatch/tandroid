package ii;

import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ d(k kVar, int i3) {
        this.a = i3;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 1;
        k kVar = this.b;
        switch (i3) {
            case 0:
                kVar.W.g(kVar.b0.end_date != 0 ? bh.p.f((r4 - kVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
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
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, kVar.getParentActivity(), null);
                s1Var.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar, s1Var, i10));
                break;
            default:
                sf.c.t(kVar.getParentActivity(), bd.M0((kVar.Z || kVar.b0.end_date != 0) ? 2131754314 : 2131754327, null));
                break;
        }
    }
}
