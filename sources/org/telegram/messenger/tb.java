package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class tb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ tb(MessagesController messagesController, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadFullUser$70(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$413(this.c);
                break;
        }
    }
}
