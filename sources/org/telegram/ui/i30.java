package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ i30(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                n60 n60Var = this.b;
                if (updates != null) {
                    n60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new z20(n60Var, 10));
                break;
            default:
                n60 n60Var2 = this.b;
                if (updates == null) {
                    n60Var2.getClass();
                    break;
                } else {
                    n60Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    break;
                }
        }
    }
}
