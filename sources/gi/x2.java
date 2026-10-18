package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ x2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(d3Var.G).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y1(d3Var, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ei.z1(this.b, tLObject, tL_error, false, 11));
                break;
        }
    }
}
