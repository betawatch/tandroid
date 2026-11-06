package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ i4(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = twoStepVerificationActivity;
        this.d = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new x1(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new x1(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
