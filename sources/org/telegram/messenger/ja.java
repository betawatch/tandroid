package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ja(MessagesController messagesController, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$414(this.c);
                break;
            default:
                this.b.lambda$loadFullUser$70(this.c);
                break;
        }
    }
}
