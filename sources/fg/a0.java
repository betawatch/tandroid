package fg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ a0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(25, this.b, tLObject));
                break;
            case 1:
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                v0 v0Var = this.b;
                if (!z4) {
                    v0Var.getClass();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(v0Var.E0);
                    break;
                }
            default:
                v0.U(this.b, tLObject, tL_error);
                break;
        }
    }
}
