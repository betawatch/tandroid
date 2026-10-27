package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                this.b.lambda$readAllDialogs$68(this.c);
                break;
            case 1:
                this.b.lambda$checkIfFolderEmptyInternal$249(this.c);
                break;
            case 2:
                this.b.lambda$clearDownloadQueue$188(this.c);
                break;
            case 3:
                this.b.lambda$putMessagesInternal$200(this.c);
                break;
            case 4:
                this.b.lambda$getDownloadQueue$190(this.c);
                break;
            case 5:
                this.b.lambda$getUnsentMessages$156(this.c);
                break;
            case 6:
                this.b.lambda$checkIfFolderEmpty$250(this.c);
                break;
            default:
                this.b.lambda$clearWidgetDialogs$171(this.c);
                break;
        }
    }
}
