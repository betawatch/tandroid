package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ long d;

    public /* synthetic */ pe(int i9, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.a = i9;
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
