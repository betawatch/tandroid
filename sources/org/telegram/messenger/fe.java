package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback4 b;

    public /* synthetic */ fe(Utilities.Callback4 callback4, int i9) {
        this.a = i9;
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
