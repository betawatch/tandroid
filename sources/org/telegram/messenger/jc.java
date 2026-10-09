package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ jc(long j3, Runnable runnable, MessagesController messagesController) {
        this.a = 2;
        this.b = messagesController;
        this.d = runnable;
        this.c = j3;
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

    public /* synthetic */ jc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j3;
        this.d = runnable;
    }
}
