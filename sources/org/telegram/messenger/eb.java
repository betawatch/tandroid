package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;

    public /* synthetic */ eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.a = 1;
        this.b = messagesController;
        this.c = runnable;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setUserAdminRole$105(this.d, this.c);
                break;
            case 1:
                this.b.lambda$setCustomChatReactions$467(this.c, this.d);
                break;
            default:
                this.b.lambda$setUserAdminRole$99(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.d = j3;
        this.c = runnable;
    }
}
