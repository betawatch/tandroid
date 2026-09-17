package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;

    public /* synthetic */ db(long j3, Runnable runnable, MessagesController messagesController) {
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

    public /* synthetic */ db(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.d = j3;
        this.c = runnable;
    }
}
