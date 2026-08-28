package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ e(l lVar, int i9) {
        this.a = i9;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.P.f(lVar.U.end_date == 0 ? null : fg.p.f((r2 - lVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (lVar.U.end_date != 0 && lVar.X) {
                    AndroidUtilities.runOnUIThread(lVar.R, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                l lVar2 = this.b;
                updatestarrefprogram.bot = lVar2.getMessagesController().getInputUser(lVar2.L);
                TL_payments.starRefProgram starrefprogram = lVar2.U;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i9 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i9;
                if (i9 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i9 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i9 & (-2);
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(lVar2.getParentActivity(), 3, null);
                c2Var.q(150L);
                lVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(lVar2, c2Var, 1));
                break;
            default:
                l lVar3 = this.b;
                ve.e.s(lVar3.getParentActivity(), LocaleController.getString((lVar3.S || lVar3.U.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
