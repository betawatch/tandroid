package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
