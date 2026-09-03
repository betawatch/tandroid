package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd b;

    public /* synthetic */ fd(pd pdVar, int i10) {
        this.a = i10;
        this.b = pdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hc(4, this.b, tLObject));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new gd(this.b, 3));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hc(2, this.b, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
