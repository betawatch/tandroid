package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ e30(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                i60 i60Var = this.b;
                if (updates != null) {
                    i60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new v20(i60Var, 10));
                break;
            default:
                i60 i60Var2 = this.b;
                if (updates == null) {
                    i60Var2.getClass();
                    break;
                } else {
                    i60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
