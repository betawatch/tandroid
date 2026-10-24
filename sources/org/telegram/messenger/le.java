package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class le implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback4 b;

    public /* synthetic */ le(Utilities.Callback4 callback4, int i10) {
        this.a = i10;
        this.b = callback4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                MessagesController.1.lambda$getRemote$0(this.b, tLObject, tL_error);
                break;
            default:
                MessagesController.4.lambda$getRemote$0(this.b, tLObject, tL_error);
                break;
        }
    }
}
