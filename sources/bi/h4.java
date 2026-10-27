package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ h4(h7 h7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y1(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new y1(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
