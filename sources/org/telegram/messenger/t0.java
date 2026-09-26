package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ t0(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.b, tLObject, tL_error);
                break;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.b, tLObject, tL_error);
                break;
        }
    }
}
