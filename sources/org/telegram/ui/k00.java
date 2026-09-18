package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ k00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mw(10, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
