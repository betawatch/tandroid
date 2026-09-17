package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ca(MessagesController messagesController, int i10, int i11) {
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
