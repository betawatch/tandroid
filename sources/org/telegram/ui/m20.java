package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ m20(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                r50 r50Var = this.b;
                if (updates != null) {
                    r50Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new d20(r50Var, 10));
                break;
            default:
                r50 r50Var2 = this.b;
                if (updates == null) {
                    r50Var2.getClass();
                    break;
                } else {
                    r50Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
