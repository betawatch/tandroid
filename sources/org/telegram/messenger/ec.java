package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class ec implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ec(int i10, long j10, long j11, MessagesController messagesController) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadUnknownDialog$207(this.c, this.d, tLObject, tL_error);
                break;
            default:
                this.b.lambda$deleteMessages$123(this.c, this.d, tLObject, tL_error);
                break;
        }
    }
}
