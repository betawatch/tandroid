package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i70 b;

    public /* synthetic */ g70(i70 i70Var, int i10) {
        this.a = i10;
        this.b = i70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kg(this.b, tL_error, tLObject, 11));
                break;
            default:
                AndroidUtilities.runOnUIThread(new so(27, this.b, tL_error));
                break;
        }
    }
}
