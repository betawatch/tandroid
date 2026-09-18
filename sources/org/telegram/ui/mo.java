package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ mo(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new oo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new oo(this.b, 4));
                break;
        }
    }
}
