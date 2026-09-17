package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class q5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;

    public /* synthetic */ q5(LocationController locationController, int i10) {
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
