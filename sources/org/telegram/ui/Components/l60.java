package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ l60(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gp((Object) this.b, (Object) tL_error, tLObject, 6));
                break;
            default:
                AndroidUtilities.runOnUIThread(new em(27, this.b, tL_error));
                break;
        }
    }
}
