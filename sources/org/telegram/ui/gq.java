package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ gq(rq rqVar, int i10) {
        this.a = i10;
        this.b = rqVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                rq rqVar = this.b;
                rqVar.t0(true);
                jq jqVar = new jq(rqVar, 0);
                if (!rqVar.K && !rqVar.L) {
                    rqVar.getMessagesController().addUserToChat(rqVar.w.id, rqVar.v, 0, rqVar.Y0, rqVar, true, jqVar, new gq(rqVar, 3));
                    break;
                } else {
                    rqVar.getMessagesController().setUserAdminRole(rqVar.w.id, rqVar.v, rqVar.K ? rqVar.M : rq.o0(false), rqVar.S, false, rqVar, rqVar.Z0, rqVar.K, rqVar.Y0, jqVar, new gq(rqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                rq rqVar2 = this.b;
                rqVar2.getClass();
                rqVar2.presentFragment(new mh1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                rq rqVar3 = this.b;
                oe oeVar = new oe(12, rqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = oeVar;
                rqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        rq.U(this.b, j3);
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
                return rq.W(this.b, tL_error);
        }
    }
}
