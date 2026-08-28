package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ j20(o50 o50Var, int i9) {
        this.a = i9;
        this.b = o50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                o50 o50Var = this.b;
                if (updates != null) {
                    o50Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new b20(o50Var, 10));
                break;
            default:
                o50 o50Var2 = this.b;
                if (updates == null) {
                    o50Var2.getClass();
                    break;
                } else {
                    o50Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
