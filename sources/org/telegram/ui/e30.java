package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ e30(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                j60 j60Var = this.b;
                if (updates != null) {
                    j60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new v20(j60Var, 10));
                break;
            default:
                j60 j60Var2 = this.b;
                if (updates == null) {
                    j60Var2.getClass();
                    break;
                } else {
                    j60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
