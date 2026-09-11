package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ e(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                mVar.T.f(mVar.Y.end_date == 0 ? null : yg.l.f((r2 - mVar.getConnectionsManager().getCurrentTime()) * 1000), true);
                if (mVar.Y.end_date != 0 && mVar.b0) {
                    AndroidUtilities.runOnUIThread(mVar.V, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                m mVar2 = this.b;
                updatestarrefprogram.bot = mVar2.getMessagesController().getInputUser(mVar2.P);
                TL_payments.starRefProgram starrefprogram = mVar2.Y;
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(mVar2.getParentActivity(), 3, null);
                b2Var.q(150L);
                mVar2.getConnectionsManager().sendRequest(updatestarrefprogram, new b(mVar2, b2Var, 1));
                break;
            default:
                m mVar3 = this.b;
                of.f.s(mVar3.getParentActivity(), LocaleController.getString((mVar3.W || mVar3.Y.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
        }
    }
}
