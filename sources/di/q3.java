package di;

import org.telegram.messenger.k10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ q3(f6 f6Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.b = f6Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f = z10;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLObject tLObject = this.e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                f6 f6Var = this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                boolean z11 = this.f;
                if (!z10) {
                    f6Var.Y1(this.c, twoStepVerificationActivity, z11);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    k10.i(f6Var.a).y = tmppassword;
                    k10.i(f6Var.a).v(false);
                    f6Var.O1(tmppassword.tmp_password, twoStepVerificationActivity, z11, null);
                    break;
                }
            default:
                TLRPC.TL_error tL_error = this.c;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                if (tL_error == null && twoStepVerificationActivity2 != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity2.J = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity2.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    f6 f6Var2 = this.b;
                    ConnectionsManager.getInstance(f6Var2.a).sendRequest(gettmppassword, new l3(f6Var2, twoStepVerificationActivity2, this.f, 0));
                    break;
                } else {
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                    }
                    org.telegram.ui.Components.lc.c0(tL_error != null ? tL_error.text : "NULL_ERROR");
                    break;
                }
        }
    }

    public /* synthetic */ q3(f6 f6Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.b = f6Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z10;
    }
}
