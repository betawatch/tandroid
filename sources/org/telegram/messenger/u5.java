package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;

    public /* synthetic */ u5(LocationController locationController, int i10) {
        this.a = i10;
        this.b = locationController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$removeSharingLocation$19(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                break;
            default:
                this.b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                break;
        }
    }
}
