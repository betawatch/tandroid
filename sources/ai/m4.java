package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ m4(l7 l7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b2(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new b2(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
