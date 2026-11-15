package di;

import android.app.Activity;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z10;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new j((t) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new l((fi.s6) this.d, tL_error, this.b, this.c, (z10) this.e, (org.telegram.ui.ActionBar.e6) this.f));
                break;
        }
    }

    public /* synthetic */ i(fi.s6 s6Var, boolean z10, long j3, z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = s6Var;
        this.b = z10;
        this.c = j3;
        this.e = z10Var;
        this.f = e6Var;
    }
}
