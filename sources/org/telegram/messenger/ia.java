package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ ia(long j10, Runnable runnable, MessagesController messagesController) {
        this.a = 0;
        this.b = messagesController;
        this.d = runnable;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setCustomChatReactions$473(this.d, this.c);
                break;
            case 1:
                this.b.lambda$setUserAdminRole$104(this.c, this.d);
                break;
            default:
                this.b.lambda$setUserAdminRole$98(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ ia(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = runnable;
    }
}
