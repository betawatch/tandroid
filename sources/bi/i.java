package bi;

import di.fc;
import di.kc;
import di.pc;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, Object obj2, long j3, Object obj3, int i10) {
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
                v vVar = (v) obj4;
                u uVar = (u) obj2;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    pc E = pc.E(vVar.e0.getParentActivity(), vVar.f);
                    E.N = j3;
                    fc fcVar = E.c1;
                    if (fcVar != null) {
                        fcVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(kc.c(uVar));
                    break;
                }
                break;
            case 1:
                u8 u8Var = (u8) obj4;
                e2.h hVar = (e2.h) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new i(u8Var, hVar, j10, tL_premium_boostsStatus, 2));
                    hVar.accept(Boolean.FALSE);
                    break;
                } else {
                    hVar.accept(Boolean.FALSE);
                    break;
                }
            case 2:
                u8 u8Var2 = (u8) obj4;
                e2.h hVar2 = (e2.h) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    g gVar = u8Var2.j(j3) ? new g(u8Var2, j3, 3) : null;
                    int i11 = sg.k0.V0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        sg.k0 k0Var = new sg.k0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        k0Var.G1(canApplyBoost);
                        k0Var.F1(tL_premium_boostsStatus2, true);
                        k0Var.H1(j3);
                        k0Var.Q0 = gVar;
                        k0Var.show();
                    }
                    hVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    hVar2.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                xo.X((xo) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                zh.w3.d0((zh.w3) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }
}
