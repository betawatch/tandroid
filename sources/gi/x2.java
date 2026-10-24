package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                    MessagesController.getInstance(d3Var.H).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y1(d3Var, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ei.z1(this.b, tLObject, tL_error, false, 11));
                break;
        }
    }
}
