package mh;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.po;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v1(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        long j10 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                g5.D0((g5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                oh.p pVar = (oh.p) obj4;
                oh.o oVar = (oh.o) obj3;
                ((org.telegram.ui.ActionBar.d2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    qh.ca E = qh.ca.E(pVar.b0.getParentActivity(), pVar.f);
                    E.K = j10;
                    qh.r9 r9Var = E.Z0;
                    if (r9Var != null) {
                        r9Var.setDialogId(j10);
                    }
                    E.J = false;
                    E.R(qh.x9.c(oVar));
                    break;
                }
                break;
            case 2:
                oh.t6 t6Var = (oh.t6) obj4;
                h5.d dVar = (h5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new v1(t6Var, dVar, j11, tL_premium_boostsStatus));
                    dVar.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                oh.t6 t6Var2 = (oh.t6) obj4;
                h5.d dVar2 = (h5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    hg.y1 y1Var = t6Var2.j(j10) ? new hg.y1(t6Var2, j10, 7) : null;
                    int i11 = fg.v0.S0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        fg.v0 v0Var = new fg.v0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        v0Var.G1(canApplyBoost);
                        v0Var.F1(tL_premium_boostsStatus2, true);
                        v0Var.H1(j10);
                        v0Var.N0 = y1Var;
                        v0Var.show();
                    }
                    dVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar2.accept(Boolean.FALSE);
                    break;
                }
            default:
                po.Y((po) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ v1(oh.t6 t6Var, h5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = t6Var;
        this.e = dVar;
        this.b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public /* synthetic */ v1(oh.t6 t6Var, h5.d dVar, MessagesController messagesController, long j10) {
        this.a = 2;
        this.c = t6Var;
        this.d = dVar;
        this.e = messagesController;
        this.b = j10;
    }

    public /* synthetic */ v1(po poVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.a = 4;
        this.c = poVar;
        this.e = d2Var;
        this.d = tL_premium_boostsStatus;
        this.b = j10;
    }
}
