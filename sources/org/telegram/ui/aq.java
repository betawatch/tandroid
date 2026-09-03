package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;

    public /* synthetic */ aq(lq lqVar, int i10) {
        this.a = i10;
        this.b = lqVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                lq lqVar = this.b;
                lqVar.t0(true);
                dq dqVar = new dq(lqVar, 0);
                if (!lqVar.H && !lqVar.I) {
                    lqVar.getMessagesController().addUserToChat(lqVar.w.id, lqVar.v, 0, lqVar.V0, lqVar, true, dqVar, new aq(lqVar, 3));
                    break;
                } else {
                    lqVar.getMessagesController().setUserAdminRole(lqVar.w.id, lqVar.v, lqVar.H ? lqVar.J : lq.o0(false), lqVar.P, false, lqVar, lqVar.W0, lqVar.H, lqVar.V0, dqVar, new aq(lqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                lq lqVar2 = this.b;
                lqVar2.getClass();
                lqVar2.presentFragment(new wg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                lq lqVar3 = this.b;
                mg.w wVar = new mg.w(25, lqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 0;
                twoStepVerificationActivity.Y = wVar;
                lqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        lq.U(this.b, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.t0(false);
                return true;
            case 3:
                this.b.t0(false);
                return true;
            default:
                return lq.W(this.b, tL_error);
        }
    }
}
