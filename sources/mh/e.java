package mh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(p pVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10) {
        this.d = pVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z4;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((p) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i((oh.t6) this.d, tL_error, this.b, this.c, (h5.d) this.e, (org.telegram.ui.ActionBar.g6) this.f));
                break;
        }
    }

    public /* synthetic */ e(oh.t6 t6Var, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = t6Var;
        this.b = z4;
        this.c = j10;
        this.e = dVar;
        this.f = g6Var;
    }
}
