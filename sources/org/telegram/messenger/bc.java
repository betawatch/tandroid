package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ bc(int i10, long j10, long j11, MessagesController messagesController) {
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
