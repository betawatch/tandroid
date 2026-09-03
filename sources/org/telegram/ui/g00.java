package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;

    public /* synthetic */ g00(c10 c10Var, int i10) {
        this.a = i10;
        this.b = c10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(27, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
