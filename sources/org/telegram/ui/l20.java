package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class l20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;

    public /* synthetic */ l20(q50 q50Var, int i10) {
        this.a = i10;
        this.b = q50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                q50 q50Var = this.b;
                if (updates != null) {
                    q50Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new c20(q50Var, 10));
                break;
            default:
                q50 q50Var2 = this.b;
                if (updates == null) {
                    q50Var2.getClass();
                    break;
                } else {
                    q50Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    break;
                }
        }
    }
}
