package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g60 b;

    public /* synthetic */ c30(g60 g60Var, int i10) {
        this.a = i10;
        this.b = g60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                g60 g60Var = this.b;
                if (updates != null) {
                    g60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new t20(g60Var, 10));
                break;
            default:
                g60 g60Var2 = this.b;
                if (updates == null) {
                    g60Var2.getClass();
                    break;
                } else {
                    g60Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    break;
                }
        }
    }
}
