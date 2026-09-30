package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ w60(y60 y60Var, int i10) {
        this.a = i10;
        this.b = y60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.b, tL_error, tLObject, 22));
                break;
            default:
                AndroidUtilities.runOnUIThread(new dv(16, this.b, tL_error));
                break;
        }
    }
}
