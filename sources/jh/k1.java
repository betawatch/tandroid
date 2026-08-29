package jh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ k1(h5 h5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.b = h5Var;
        this.c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h5 h5Var = this.b;
                h5Var.getClass();
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    h5Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                h5.W0(this.b, this.c, this.e, twoStepVerificationActivity2);
                break;
        }
    }

    public /* synthetic */ k1(h5 h5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.b = h5Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}
