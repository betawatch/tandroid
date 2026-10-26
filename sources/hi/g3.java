package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ g3(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(m3Var.H).lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new g2(m3Var, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new e2.m0(this.b, tLObject, tL_error, 12));
                break;
        }
    }
}
