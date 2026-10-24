package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ga(MessagesController messagesController, int i10, int i11) {
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
