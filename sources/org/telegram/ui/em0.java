package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class em0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ em0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rf0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new pl0(4, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new pl0(3, this.b, tLObject));
                break;
        }
    }
}
