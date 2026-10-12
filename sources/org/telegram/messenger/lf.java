package org.telegram.messenger;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;

    public /* synthetic */ lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$readAllDialogs$65(this.c);
                break;
            case 1:
                this.b.lambda$checkIfFolderEmptyInternal$245(this.c);
                break;
            case 2:
                this.b.lambda$clearDownloadQueue$184(this.c);
                break;
            case 3:
                this.b.lambda$putMessagesInternal$196(this.c);
                break;
            case 4:
                this.b.lambda$getDownloadQueue$186(this.c);
                break;
            case 5:
                this.b.lambda$getUnsentMessages$152(this.c);
                break;
            case 6:
                this.b.lambda$checkIfFolderEmpty$246(this.c);
                break;
            default:
                this.b.lambda$clearWidgetDialogs$167(this.c);
                break;
        }
    }
}
