package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai0 b;

    public /* synthetic */ jh0(ai0 ai0Var, int i10) {
        this.a = i10;
        this.b = ai0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oh0(this.b, tL_error, tLObject, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new oa0(22, this.b, tL_error));
                break;
        }
    }
}
