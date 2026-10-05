package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ e3(g3 g3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                l3 l3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(l3Var.G).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new f2(l3Var, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a3.k0(this.b, tLObject, tL_error, 26));
                break;
        }
    }
}
