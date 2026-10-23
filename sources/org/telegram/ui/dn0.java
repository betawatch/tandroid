package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;

    public /* synthetic */ dn0(eo0 eo0Var, int i10) {
        this.a = i10;
        this.b = eo0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xg0(15, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new cn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new wm0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new wm0(this.b, tLObject, 0));
                break;
        }
    }
}
