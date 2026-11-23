package ki;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i7) {
        this.a = i7;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        j jVar = this.b;
        switch (i7) {
            case 0:
                jVar.W.g(jVar.b0.end_date != 0 ? ah.r.f((r4 - jVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
                if (jVar.b0.end_date != 0 && jVar.e0) {
                    org.telegram.messenger.g0.h3(jVar.Y, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().q1(jVar.S);
                TL_payments.starRefProgram starrefprogram = jVar.b0;
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
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, jVar.getParentActivity(), null);
                t1Var.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar, t1Var, i10));
                break;
            default:
                vf.c.t(jVar.getParentActivity(), hd.N0((jVar.Z || jVar.b0.end_date != 0) ? 2131754311 : 2131754324, null));
                break;
        }
    }
}
