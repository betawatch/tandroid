package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ ho(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new jo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jo(this.b, 4));
                break;
        }
    }
}
