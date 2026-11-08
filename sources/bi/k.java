package bi;

import android.app.Activity;
import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3) {
        this.d = zVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z9;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new l((z) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new o((di.y6) this.d, tL_error, this.b, this.c, (c20) this.e, (org.telegram.ui.ActionBar.f6) this.f));
                break;
        }
    }

    public /* synthetic */ k(di.y6 y6Var, boolean z9, long j3, c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = y6Var;
        this.b = z9;
        this.c = j3;
        this.e = c20Var;
        this.f = f6Var;
    }
}
