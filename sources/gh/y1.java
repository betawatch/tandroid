package gh;

import kh.mb;
import kh.rb;
import kh.wb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ho;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y1(ih.v6 v6Var, d5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = v6Var;
        this.e = dVar;
        this.b = j10;
        this.d = tL_premium_boostsStatus;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i9 = this.a;
        long j10 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i9) {
            case 0:
                k5.C0((k5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                ih.r rVar = (ih.r) obj4;
                ih.q qVar = (ih.q) obj3;
                ((org.telegram.ui.ActionBar.c2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    wb E = wb.E(rVar.a0.getParentActivity(), rVar.f);
                    E.J = j10;
                    mb mbVar = E.Y0;
                    if (mbVar != null) {
                        mbVar.setDialogId(j10);
                    }
                    E.I = false;
                    E.R(rb.c(qVar));
                    break;
                }
                break;
            case 2:
                ih.v6 v6Var = (ih.v6) obj4;
                d5.d dVar = (d5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new y1(v6Var, dVar, j11, tL_premium_boostsStatus));
                    dVar.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar.accept(Boolean.FALSE);
                    break;
                }
            case 3:
                ih.v6 v6Var2 = (ih.v6) obj4;
                d5.d dVar2 = (d5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    bg.i2 i2Var = v6Var2.j(j10) ? new bg.i2(v6Var2, j10, 6) : null;
                    int i10 = zf.j0.R0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        zf.j0 j0Var = new zf.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        j0Var.G1(canApplyBoost);
                        j0Var.F1(tL_premium_boostsStatus2, true);
                        j0Var.H1(j10);
                        j0Var.M0 = i2Var;
                        j0Var.show();
                    }
                    dVar2.accept(Boolean.FALSE);
                    break;
                } else {
                    dVar2.accept(Boolean.FALSE);
                    break;
                }
            default:
                ho.X((ho) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ y1(ih.v6 v6Var, d5.d dVar, MessagesController messagesController, long j10) {
        this.a = 2;
        this.c = v6Var;
        this.d = dVar;
        this.e = messagesController;
        this.b = j10;
    }

    public /* synthetic */ y1(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    public /* synthetic */ y1(ho hoVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.a = 4;
        this.c = hoVar;
        this.e = c2Var;
        this.d = tL_premium_boostsStatus;
        this.b = j10;
    }
}
