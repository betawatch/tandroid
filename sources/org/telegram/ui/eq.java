package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pq b;

    public /* synthetic */ eq(pq pqVar, int i10) {
        this.a = i10;
        this.b = pqVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                pq pqVar = this.b;
                pqVar.t0(true);
                hq hqVar = new hq(pqVar, 0);
                if (!pqVar.K && !pqVar.L) {
                    pqVar.getMessagesController().addUserToChat(pqVar.w.id, pqVar.v, 0, pqVar.Y0, pqVar, true, hqVar, new eq(pqVar, 3));
                    break;
                } else {
                    pqVar.getMessagesController().setUserAdminRole(pqVar.w.id, pqVar.v, pqVar.K ? pqVar.M : pq.o0(false), pqVar.S, false, pqVar, pqVar.Z0, pqVar.K, pqVar.Y0, hqVar, new eq(pqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                pq pqVar2 = this.b;
                pqVar2.getClass();
                pqVar2.presentFragment(new ih1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                pq pqVar3 = this.b;
                x5 x5Var = new x5(16, pqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = x5Var;
                pqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        pq.U(this.b, j3);
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
                return pq.W(this.b, tL_error);
        }
    }
}
