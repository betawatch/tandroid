package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;

    public /* synthetic */ pj0(xj0 xj0Var, int i10) {
        this.a = i10;
        this.b = xj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wb0(22, this.b, tLObject));
                break;
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                xj0 xj0Var = this.b;
                if (!z10) {
                    xj0Var.getClass();
                    break;
                } else {
                    xj0Var.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
