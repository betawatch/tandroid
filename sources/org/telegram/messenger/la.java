package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$411(this.c);
                break;
            default:
                this.b.lambda$loadFullUser$70(this.c);
                break;
        }
    }
}
