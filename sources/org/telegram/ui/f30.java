package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ f30(j60 j60Var, int i10) {
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
                AndroidUtilities.runOnUIThread(new w20(j60Var, 10));
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
