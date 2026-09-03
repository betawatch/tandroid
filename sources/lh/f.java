package lh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10) {
        this.d = qVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z4;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g((q) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new j((nh.t6) this.d, tL_error, this.b, this.c, (h5.d) this.e, (org.telegram.ui.ActionBar.f6) this.f));
                break;
        }
    }

    public /* synthetic */ f(nh.t6 t6Var, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = t6Var;
        this.b = z4;
        this.c = j10;
        this.e = dVar;
        this.f = f6Var;
    }
}
