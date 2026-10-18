package org.telegram.messenger;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ ic(long j10, Runnable runnable, MessagesController messagesController) {
        this.a = 2;
        this.b = messagesController;
        this.d = runnable;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setUserAdminRole$104(this.c, this.d);
                break;
            case 1:
                this.b.lambda$setUserAdminRole$98(this.c, this.d);
                break;
            default:
                this.b.lambda$setCustomChatReactions$470(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ ic(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = runnable;
    }
}
