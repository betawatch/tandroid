package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ g3(i3 i3Var, int i10) {
        this.a = i10;
        this.b = i3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(n3Var.G).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h2(n3Var, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a3.k0(this.b, tLObject, tL_error, 16));
                break;
        }
    }
}
