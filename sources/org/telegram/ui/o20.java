package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ o20(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                u50 u50Var = this.b;
                if (updates != null) {
                    u50Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new f20(u50Var, 10));
                break;
            default:
                u50 u50Var2 = this.b;
                if (updates == null) {
                    u50Var2.getClass();
                    break;
                } else {
                    u50Var2.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    break;
                }
        }
    }
}
