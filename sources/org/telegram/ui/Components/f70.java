package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h70 b;

    public /* synthetic */ f70(h70 h70Var, int i10) {
        this.a = i10;
        this.b = h70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kg(this.b, tL_error, tLObject, 11));
                break;
            default:
                AndroidUtilities.runOnUIThread(new so(27, this.b, tL_error));
                break;
        }
    }
}
