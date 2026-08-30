package lh;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.po;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w1(Object obj, Object obj2, long j10, Object obj3, int i10) {
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
                nh.q qVar = (nh.q) obj4;
                nh.p pVar = (nh.p) obj3;
                ((org.telegram.ui.ActionBar.d2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ph.da E = ph.da.E(qVar.b0.getParentActivity(), qVar.f);
                    E.K = j10;
                    ph.t9 t9Var = E.Z0;
                    if (t9Var != null) {
                        t9Var.setDialogId(j10);
                    }
                    E.J = false;
                    E.R(ph.y9.c(pVar));
                    break;
                }
                break;
            case 2:
                nh.t6 t6Var = (nh.t6) obj4;
                h5.d dVar = (h5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new w1(t6Var, dVar, j11, tL_premium_boostsStatus));
                    dVar.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                nh.t6 t6Var2 = (nh.t6) obj4;
                h5.d dVar2 = (h5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    gg.y1 y1Var = t6Var2.j(j10) ? new gg.y1(t6Var2, j10, 7) : null;
                    int i11 = eg.v0.S0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        eg.v0 v0Var = new eg.v0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
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

    public /* synthetic */ w1(nh.t6 t6Var, h5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = t6Var;
        this.e = dVar;
        this.b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public /* synthetic */ w1(nh.t6 t6Var, h5.d dVar, MessagesController messagesController, long j10) {
        this.a = 2;
        this.c = t6Var;
        this.d = dVar;
        this.e = messagesController;
        this.b = j10;
    }

    public /* synthetic */ w1(po poVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.a = 4;
        this.c = poVar;
        this.e = d2Var;
        this.d = tL_premium_boostsStatus;
        this.b = j10;
    }
}
