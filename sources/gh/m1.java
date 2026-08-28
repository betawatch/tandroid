package gh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ m1(k5 k5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.b = k5Var;
        this.c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                k5Var.getClass();
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    k5Var.M1(twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    break;
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                k5.W0(this.b, this.c, this.e, twoStepVerificationActivity2);
                break;
        }
    }

    public /* synthetic */ m1(k5 k5Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.b = k5Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}
