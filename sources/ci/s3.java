package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s3(l6 l6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new q1(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new q1(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
