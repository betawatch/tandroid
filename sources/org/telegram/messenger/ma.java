package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ma implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ma(MessagesController messagesController, int i10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateTimerProc$156(this.c);
                break;
            case 1:
                this.b.lambda$onFolderEmpty$196(this.c);
                break;
            case 2:
                this.b.lambda$ensureMessagesLoaded$468(this.c);
                break;
            default:
                this.b.lambda$didAddedNewTask$80(this.c);
                break;
        }
    }
}
