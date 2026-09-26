package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d8(l9 l9Var, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = l9Var;
        this.b = z10;
        this.c = j3;
        this.e = callback;
        this.f = d6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.b, this.c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.d6) this.f));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u21((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
        }
    }

    public /* synthetic */ d8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z10;
        this.c = j3;
    }
}
