package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;

    public /* synthetic */ jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$readAllDialogs$68(this.c);
                break;
            case 1:
                this.b.lambda$checkIfFolderEmptyInternal$248(this.c);
                break;
            case 2:
                this.b.lambda$clearDownloadQueue$187(this.c);
                break;
            case 3:
                this.b.lambda$putMessagesInternal$199(this.c);
                break;
            case 4:
                this.b.lambda$getDownloadQueue$189(this.c);
                break;
            case 5:
                this.b.lambda$getUnsentMessages$155(this.c);
                break;
            case 6:
                this.b.lambda$checkIfFolderEmpty$249(this.c);
                break;
            default:
                this.b.lambda$clearWidgetDialogs$170(this.c);
                break;
        }
    }
}
