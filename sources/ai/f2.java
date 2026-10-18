package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_error f;

    public /* synthetic */ f2(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.b = k7Var;
        this.c = tLObject;
        this.d = twoStepVerificationActivity;
        this.e = z10;
        this.f = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.a) {
            case 0:
                if (this.f == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.c;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    this.b.C2(twoStepVerificationActivity.l0(), twoStepVerificationActivity, this.e);
                    break;
                }
                break;
            default:
                k7.e0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ f2(k7 k7Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.b = k7Var;
        this.f = tL_error;
        this.d = twoStepVerificationActivity;
        this.c = tLObject;
        this.e = z10;
    }
}
