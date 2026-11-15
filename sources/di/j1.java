package di;

import org.telegram.messenger.m10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ j1(c6 c6Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.b = c6Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f = z10;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                c6 c6Var = this.b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z11 = this.f;
                if (!z10) {
                    c6Var.Q1(this.c, twoStepVerificationActivity2, z11);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    m10.i(c6Var.a).y = tmppassword;
                    m10.i(c6Var.a).v(false);
                    c6Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z11, null);
                    break;
                }
            default:
                if (this.c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    c6 c6Var2 = this.b;
                    ConnectionsManager.getInstance(c6Var2.a).sendRequest(gettmppassword, new j3(c6Var2, twoStepVerificationActivity, this.f, 0));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j1(c6 c6Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.b = c6Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z10;
    }
}
