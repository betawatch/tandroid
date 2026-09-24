package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ e(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.T.f(lVar.Y.end_date == 0 ? null : xg.l.f((r2 - lVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (lVar.Y.end_date != 0 && lVar.b0) {
                    AndroidUtilities.runOnUIThread(lVar.V, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                l lVar2 = this.b;
                updatestarrefprogram.bot = lVar2.getMessagesController().getInputUser(lVar2.P);
                TL_payments.starRefProgram starrefprogram = lVar2.Y;
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
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(lVar2.getParentActivity(), 3, null);
                a2Var.q(150L);
                lVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(lVar2, a2Var, 1));
                break;
            default:
                l lVar3 = this.b;
                nf.f.s(lVar3.getParentActivity(), LocaleController.getString((lVar3.W || lVar3.Y.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
