package gh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = rVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z10;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((r) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i((ih.v6) this.d, tL_error, this.b, this.c, (d5.d) this.e, (org.telegram.ui.ActionBar.b6) this.f));
                break;
        }
    }

    public /* synthetic */ e(ih.v6 v6Var, boolean z10, long j10, d5.d dVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.d = v6Var;
        this.b = z10;
        this.c = j10;
        this.e = dVar;
        this.f = b6Var;
    }
}
