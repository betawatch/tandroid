package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ jo(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lo(this.b, 4));
                break;
        }
    }
}
