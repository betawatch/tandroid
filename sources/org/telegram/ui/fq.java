package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ fq(qq qqVar, int i10) {
        this.a = i10;
        this.b = qqVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.r0(true);
                break;
            case 1:
                qq qqVar = this.b;
                qqVar.t0(true);
                iq iqVar = new iq(qqVar, 0);
                if (!qqVar.K && !qqVar.L) {
                    qqVar.getMessagesController().addUserToChat(qqVar.w.id, qqVar.v, 0, qqVar.Y0, qqVar, true, iqVar, new fq(qqVar, 3));
                    break;
                } else {
                    qqVar.getMessagesController().setUserAdminRole(qqVar.w.id, qqVar.v, qqVar.K ? qqVar.M : qq.o0(false), qqVar.S, false, qqVar, qqVar.Z0, qqVar.K, qqVar.Y0, iqVar, new fq(qqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                qq qqVar2 = this.b;
                qqVar2.getClass();
                qqVar2.presentFragment(new hh1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                qq qqVar3 = this.b;
                m4 m4Var = new m4(17, qqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = m4Var;
                qqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        qq.U(this.b, j3);
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
                return qq.W(this.b, tL_error);
        }
    }
}
