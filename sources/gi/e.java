package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                lVar.V.g(lVar.a0.end_date == 0 ? null : yg.k.f((r2 - lVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (lVar.a0.end_date != 0 && lVar.d0) {
                    AndroidUtilities.runOnUIThread(lVar.X, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                l lVar2 = this.b;
                updatestarrefprogram.bot = lVar2.getMessagesController().getInputUser(lVar2.R);
                TL_payments.starRefProgram starrefprogram = lVar2.a0;
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
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(lVar2.getParentActivity(), 3, null);
                c2Var.r(150L);
                lVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(lVar2, c2Var, 1));
                break;
            default:
                l lVar3 = this.b;
                pf.d.r(lVar3.getParentActivity(), LocaleController.getString((lVar3.Y || lVar3.a0.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
