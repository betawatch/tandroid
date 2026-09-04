package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;

    public /* synthetic */ da(MessagesController messagesController, int i10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateTimerProc$157(this.c);
                break;
            case 1:
                this.b.lambda$onFolderEmpty$197(this.c);
                break;
            case 2:
                this.b.lambda$ensureMessagesLoaded$462(this.c);
                break;
            default:
                this.b.lambda$didAddedNewTask$81(this.c);
                break;
        }
    }
}
