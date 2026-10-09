package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                this.b.lambda$updateTimerProc$156(this.c);
                break;
            case 1:
                this.b.lambda$onFolderEmpty$196(this.c);
                break;
            case 2:
                this.b.lambda$ensureMessagesLoaded$465(this.c);
                break;
            default:
                this.b.lambda$didAddedNewTask$80(this.c);
                break;
        }
    }
}
