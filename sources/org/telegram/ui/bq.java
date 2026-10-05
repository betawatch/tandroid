package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;

    public /* synthetic */ bq(mq mqVar, int i10) {
        this.a = i10;
        this.b = mqVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                mq mqVar = this.b;
                mqVar.t0(true);
                eq eqVar = new eq(mqVar, 0);
                if (!mqVar.K && !mqVar.L) {
                    mqVar.getMessagesController().addUserToChat(mqVar.w.id, mqVar.v, 0, mqVar.Y0, mqVar, true, eqVar, new bq(mqVar, 3));
                    break;
                } else {
                    mqVar.getMessagesController().setUserAdminRole(mqVar.w.id, mqVar.v, mqVar.K ? mqVar.M : mq.o0(false), mqVar.S, false, mqVar, mqVar.Z0, mqVar.K, mqVar.Y0, eqVar, new bq(mqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                mq mqVar2 = this.b;
                mqVar2.getClass();
                mqVar2.presentFragment(new zg1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mq mqVar3 = this.b;
                o oVar = new o(20, mqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = oVar;
                mqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        mq.S(this.b, j3);
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
                return mq.U(this.b, tL_error);
        }
    }
}
