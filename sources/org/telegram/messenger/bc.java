package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadFullUser$71(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$408(this.c);
                break;
        }
    }
}
