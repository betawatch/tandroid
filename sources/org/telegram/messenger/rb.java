package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ rb(int i9, long j10, long j11, MessagesController messagesController) {
        this.a = i9;
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadUnknownDialog$208(this.c, this.d, tLObject, tL_error);
                break;
            default:
                this.b.lambda$deleteMessages$124(this.c, this.d, tLObject, tL_error);
                break;
        }
    }
}
