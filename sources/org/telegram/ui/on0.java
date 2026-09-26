package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ on0(oo0 oo0Var, int i10) {
        this.a = i10;
        this.b = oo0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sj0(12, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new nn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hn0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hn0(this.b, tLObject, 0));
                break;
        }
    }
}
