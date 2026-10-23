package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g70 b;

    public /* synthetic */ e70(g70 g70Var, int i10) {
        this.a = i10;
        this.b = g70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lg(this.b, tL_error, tLObject, 10));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yt(17, this.b, tL_error));
                break;
        }
    }
}
