package ag;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ f0(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(4, this.b, tLObject));
                break;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                i1 i1Var = this.b;
                if (!z10) {
                    i1Var.getClass();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(i1Var.D0);
                    break;
                }
            default:
                i1.U(this.b, tLObject, tL_error);
                break;
        }
    }
}
