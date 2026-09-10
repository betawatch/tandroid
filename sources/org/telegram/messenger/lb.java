package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;

    public /* synthetic */ lb(long j3, Runnable runnable, MessagesController messagesController) {
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

    public /* synthetic */ lb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.d = j3;
        this.c = runnable;
    }
}
