package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ a30(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                e60 e60Var = this.b;
                if (updates != null) {
                    e60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new r20(e60Var, 10));
                break;
            default:
                e60 e60Var2 = this.b;
                if (updates == null) {
                    e60Var2.getClass();
                    break;
                } else {
                    e60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
