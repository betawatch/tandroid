package org.telegram.messenger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
