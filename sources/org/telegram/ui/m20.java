package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ m20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                if (updates != null) {
                    s50Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new e20(s50Var, 10));
                break;
            default:
                s50 s50Var2 = this.b;
                if (updates == null) {
                    s50Var2.getClass();
                    break;
                } else {
                    s50Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
