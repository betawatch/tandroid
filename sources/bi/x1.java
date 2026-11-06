package bi;

import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ x1(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, TLRPC.TL_error tL_error) {
        this.b = k7Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f = z9;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.e;
                boolean z9 = tLObject instanceof TL_account.tmpPassword;
                k7 k7Var = this.b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z10 = this.f;
                if (!z9) {
                    k7Var.Q1(this.c, twoStepVerificationActivity2, z10);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    p10.i(k7Var.a).y = tmppassword;
                    p10.i(k7Var.a).v(false);
                    k7Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z10, null);
                    break;
                }
            default:
                if (this.c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    k7 k7Var2 = this.b;
                    ConnectionsManager.getInstance(k7Var2.a).sendRequest(gettmppassword, new i4(k7Var2, twoStepVerificationActivity, this.f, 0));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x1(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z9) {
        this.b = k7Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z9;
    }
}
