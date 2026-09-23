package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;

    public /* synthetic */ aq(lq lqVar, int i10) {
        this.a = i10;
        this.b = lqVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                lq lqVar = this.b;
                lqVar.t0(true);
                dq dqVar = new dq(lqVar, 0);
                if (!lqVar.K && !lqVar.L) {
                    lqVar.getMessagesController().addUserToChat(lqVar.w.id, lqVar.v, 0, lqVar.Y0, lqVar, true, dqVar, new aq(lqVar, 3));
                    break;
                } else {
                    lqVar.getMessagesController().setUserAdminRole(lqVar.w.id, lqVar.v, lqVar.K ? lqVar.M : lq.o0(false), lqVar.S, false, lqVar, lqVar.Z0, lqVar.K, lqVar.Y0, dqVar, new aq(lqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                lq lqVar2 = this.b;
                lqVar2.getClass();
                lqVar2.presentFragment(new zg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                lq lqVar3 = this.b;
                u uVar = new u(18, lqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = uVar;
                lqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        lq.U(this.b, j3);
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
