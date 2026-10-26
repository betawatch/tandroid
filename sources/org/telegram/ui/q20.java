package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ q20(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                v50 v50Var = this.b;
                if (updates != null) {
                    v50Var.d.getMessagesController().lambda$processUpdates$379(updates, false);
                }
                AndroidUtilities.runOnUIThread(new h20(v50Var, 10));
                break;
            default:
                v50 v50Var2 = this.b;
                if (updates == null) {
                    v50Var2.getClass();
                    break;
                } else {
                    v50Var2.d.getMessagesController().lambda$processUpdates$379(updates, false);
                    break;
                }
        }
    }
}
