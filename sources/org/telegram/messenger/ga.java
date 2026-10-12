package org.telegram.messenger;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
