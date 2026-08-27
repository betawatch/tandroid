package hh;

import lh.nb;
import lh.sb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y1(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        long j10 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                i5.D0((i5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                jh.p pVar = (jh.p) obj4;
                jh.o oVar = (jh.o) obj3;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sb E = sb.E(pVar.a0.getParentActivity(), pVar.f);
                    E.J = j10;
                    lh.ib ibVar = E.Y0;
                    if (ibVar != null) {
                        ibVar.setDialogId(j10);
                    }
                    E.I = false;
                    E.R(nb.c(oVar));
                    break;
                }
                break;
            case 2:
                jh.s6 s6Var = (jh.s6) obj4;
                d5.d dVar = (d5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new y1(s6Var, dVar, j11, tL_premium_boostsStatus));
                    dVar.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                jh.s6 s6Var2 = (jh.s6) obj4;
                d5.d dVar2 = (d5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    cg.b2 b2Var = s6Var2.j(j10) ? new cg.b2(s6Var2, j10, 7) : null;
                    int i11 = ag.i1.R0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        ag.i1 i1Var = new ag.i1(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        i1Var.G1(canApplyBoost);
                        i1Var.F1(tL_premium_boostsStatus2, true);
                        i1Var.H1(j10);
                        i1Var.M0 = b2Var;
                        i1Var.show();
                    }
                    dVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar2.accept(Boolean.FALSE);
                    break;
                }
            default:
                jo.Y((jo) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ y1(jh.s6 s6Var, d5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = s6Var;
        this.e = dVar;
        this.b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public /* synthetic */ y1(jh.s6 s6Var, d5.d dVar, MessagesController messagesController, long j10) {
        this.a = 2;
        this.c = s6Var;
        this.d = dVar;
        this.e = messagesController;
        this.b = j10;
    }

    public /* synthetic */ y1(jo joVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.a = 4;
        this.c = joVar;
        this.e = b2Var;
        this.d = tL_premium_boostsStatus;
        this.b = j10;
    }
}
