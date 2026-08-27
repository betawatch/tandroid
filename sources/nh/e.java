package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.P.f(kVar.U.end_date == 0 ? null : gg.o.f((r2 - kVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (kVar.U.end_date != 0 && kVar.X) {
                    AndroidUtilities.runOnUIThread(kVar.R, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                k kVar2 = this.b;
                updatestarrefprogram.bot = kVar2.getMessagesController().getInputUser(kVar2.L);
                TL_payments.starRefProgram starrefprogram = kVar2.U;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i10 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i10;
                if (i10 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i10 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i10 & (-2);
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(kVar2.getParentActivity(), 3, null);
                b2Var.q(150L);
                kVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(kVar2, b2Var, 1));
                break;
            default:
                k kVar3 = this.b;
                we.e.s(kVar3.getParentActivity(), LocaleController.getString((kVar3.S || kVar3.U.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
