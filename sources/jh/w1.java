package jh;

import nh.gb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ko;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements f5.d {
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

    @Override // f5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        long j10 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                h5.D0((h5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                lh.p pVar = (lh.p) obj4;
                lh.o oVar = (lh.o) obj3;
                ((org.telegram.ui.ActionBar.c2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    gb E = gb.E(pVar.a0.getParentActivity(), pVar.f);
                    E.J = j10;
                    nh.wa waVar = E.Y0;
                    if (waVar != null) {
                        waVar.setDialogId(j10);
                    }
                    E.I = false;
                    E.R(nh.bb.c(oVar));
                    break;
                }
                break;
            case 2:
                lh.s6 s6Var = (lh.s6) obj4;
                f5.d dVar = (f5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new w1(s6Var, dVar, j11, tL_premium_boostsStatus));
                    dVar.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                lh.s6 s6Var2 = (lh.s6) obj4;
                f5.d dVar2 = (f5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    eg.z1 z1Var = s6Var2.j(j10) ? new eg.z1(s6Var2, j10, 7) : null;
                    int i11 = cg.v0.R0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        cg.v0 v0Var = new cg.v0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        v0Var.G1(canApplyBoost);
                        v0Var.F1(tL_premium_boostsStatus2, true);
                        v0Var.H1(j10);
                        v0Var.M0 = z1Var;
                        v0Var.show();
                    }
                    dVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar2.accept(Boolean.FALSE);
                    break;
                }
            default:
                ko.Y((ko) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ w1(lh.s6 s6Var, f5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = s6Var;
        this.e = dVar;
        this.b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public /* synthetic */ w1(lh.s6 s6Var, f5.d dVar, MessagesController messagesController, long j10) {
        this.a = 2;
        this.c = s6Var;
        this.d = dVar;
        this.e = messagesController;
        this.b = j10;
    }

    public /* synthetic */ w1(ko koVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.a = 4;
        this.c = koVar;
        this.e = c2Var;
        this.d = tL_premium_boostsStatus;
        this.b = j10;
    }
}
