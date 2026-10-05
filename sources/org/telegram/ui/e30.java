package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ e30(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                h60 h60Var = this.b;
                if (updates != null) {
                    h60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new v20(h60Var, 10));
                break;
            default:
                h60 h60Var2 = this.b;
                if (updates == null) {
                    h60Var2.getClass();
                    break;
                } else {
                    h60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
