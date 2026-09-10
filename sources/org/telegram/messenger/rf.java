package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;

    public /* synthetic */ rf(MessagesStorage messagesStorage, int i10, int i11) {
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
