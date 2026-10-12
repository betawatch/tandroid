package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq b;

    public /* synthetic */ iq(tq tqVar, int i10) {
        this.a = i10;
        this.b = tqVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                tq tqVar = this.b;
                tqVar.t0(true);
                lq lqVar = new lq(tqVar, 0);
                if (!tqVar.K && !tqVar.L) {
                    tqVar.getMessagesController().addUserToChat(tqVar.w.id, tqVar.v, 0, tqVar.Y0, tqVar, true, lqVar, new iq(tqVar, 3));
                    break;
                } else {
                    tqVar.getMessagesController().setUserAdminRole(tqVar.w.id, tqVar.v, tqVar.K ? tqVar.M : tq.o0(false), tqVar.S, false, tqVar, tqVar.Z0, tqVar.K, tqVar.Y0, lqVar, new iq(tqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                tq tqVar2 = this.b;
                tqVar2.getClass();
                tqVar2.presentFragment(new oh1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                tq tqVar3 = this.b;
                m4.z0 z0Var = new m4.z0(22, tqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = z0Var;
                tqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        tq.U(this.b, j10);
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
                return tq.W(this.b, tL_error);
        }
    }
}
