package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ w2(x2 x2Var, int i9) {
        this.a = i9;
        this.b = x2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(c3Var.C).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y1(c3Var, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ih.h3(this.b, tLObject, tL_error, 21));
                break;
        }
    }
}
