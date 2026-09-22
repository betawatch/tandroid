package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b8(l9 l9Var, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = l9Var;
        this.b = z10;
        this.c = j3;
        this.e = hVar;
        this.f = e6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.b, this.c, (e2.h) this.e, (org.telegram.ui.ActionBar.e6) this.f));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h21((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
        }
    }

    public /* synthetic */ b8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z10;
        this.c = j3;
    }
}
