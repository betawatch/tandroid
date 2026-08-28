package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;

    public /* synthetic */ pp(bq bqVar, int i9) {
        this.a = i9;
        this.b = bqVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.q0(true);
                break;
            case 1:
                bq bqVar = this.b;
                bqVar.s0(true);
                sp spVar = new sp(bqVar, 0);
                if (!bqVar.G && !bqVar.H) {
                    bqVar.getMessagesController().addUserToChat(bqVar.w.id, bqVar.v, 0, bqVar.U0, bqVar, true, spVar, new pp(bqVar, 3));
                    break;
                } else {
                    bqVar.getMessagesController().setUserAdminRole(bqVar.w.id, bqVar.v, bqVar.G ? bqVar.I : bq.n0(false), bqVar.O, false, bqVar, bqVar.V0, bqVar.G, bqVar.U0, spVar, new pp(bqVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                bq bqVar2 = this.b;
                bqVar2.getClass();
                bqVar2.presentFragment(new ag1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                bq bqVar3 = this.b;
                ih.v3 v3Var = new ih.v3(26, bqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 0;
                twoStepVerificationActivity.X = v3Var;
                bqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        bq.T(this.b, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.s0(false);
                return true;
            case 3:
                this.b.s0(false);
                return true;
            default:
                return bq.V(this.b, tL_error);
        }
    }
}
