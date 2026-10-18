package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ long d;

    public /* synthetic */ se(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = message;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateMessageCustomParams$110(this.c, this.d);
                break;
            default:
                this.b.lambda$markMessageAsSendErrorWithParams$210(this.c, this.d);
                break;
        }
    }
}
