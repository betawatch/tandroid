package ai;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uo;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        long j3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj4;
                a0 a0Var = (a0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.oc E = ci.oc.E(b0Var.e0.getParentActivity(), b0Var.f);
                    E.N = j3;
                    ci.ec ecVar = E.c1;
                    if (ecVar != null) {
                        ecVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(ci.jc.c(a0Var));
                    break;
                }
                break;
            case 1:
                l9 l9Var = (l9) obj4;
                e2.h hVar = (e2.h) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new l(l9Var, hVar, j10, tL_premium_boostsStatus, 2));
                    hVar.accept(Boolean.FALSE);
                    break;
                } else {
                    hVar.accept(Boolean.FALSE);
                    break;
                }
            case 2:
                l9 l9Var2 = (l9) obj4;
                e2.h hVar2 = (e2.h) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    j jVar = l9Var2.j(j3) ? new j(l9Var2, j3, 3) : null;
                    int i11 = rg.j0.V0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        rg.j0 j0Var = new rg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        j0Var.G1(canApplyBoost);
                        j0Var.F1(tL_premium_boostsStatus2, true);
                        j0Var.H1(j3);
                        j0Var.Q0 = jVar;
                        j0Var.show();
                    }
                    hVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    hVar2.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                uo.X((uo) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                yh.y3.d0((yh.y3) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }
}
