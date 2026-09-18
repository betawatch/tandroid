package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ g30(k60 k60Var, int i10) {
        this.a = i10;
        this.b = k60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                k60 k60Var = this.b;
                if (updates != null) {
                    k60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new x20(k60Var, 10));
                break;
            default:
                k60 k60Var2 = this.b;
                if (updates == null) {
                    k60Var2.getClass();
                    break;
                } else {
                    k60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
