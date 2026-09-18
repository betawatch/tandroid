package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ d3(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(k3Var.G).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new e2(k3Var, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a3.k0(this.b, tLObject, tL_error, 26));
                break;
        }
    }
}
