package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.a = i10;
        this.b = messagesController;
        this.c = j3;
        this.d = j10;
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
