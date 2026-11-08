package hi;

import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                jVar.V.g(jVar.a0.end_date != 0 ? ah.r.f((r4 - jVar.getConnectionsManager().getCurrentTime()) * 1000) : null, true);
                if (jVar.a0.end_date != 0 && jVar.d0) {
                    org.telegram.messenger.g0.i3(jVar.X, 1000L);
                    break;
                }
                break;
            case 1:
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().o1(jVar.R);
                TL_payments.starRefProgram starrefprogram = jVar.a0;
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
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, jVar.getParentActivity(), null);
                u1Var.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(jVar, u1Var, i10));
                break;
            default:
                vf.c.t(jVar.getParentActivity(), id.M0((jVar.Y || jVar.a0.end_date != 0) ? 2131754314 : 2131754327, null));
                break;
        }
    }
}
