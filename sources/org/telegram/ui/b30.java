package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ b30(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                f60 f60Var = this.b;
                if (updates != null) {
                    f60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new s20(f60Var, 10));
                break;
            default:
                f60 f60Var2 = this.b;
                if (updates == null) {
                    f60Var2.getClass();
                    break;
                } else {
                    f60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
