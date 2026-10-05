package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ x60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.b, tL_error, tLObject, 22));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yw(14, this.b, tL_error));
                break;
        }
    }
}
