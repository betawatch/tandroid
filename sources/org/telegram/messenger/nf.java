package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;

    public /* synthetic */ nf(MessagesStorage messagesStorage, long j10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteStoryPushMessage$39(this.c);
                break;
            case 1:
                this.b.lambda$clearUserPhotos$95(this.c);
                break;
            case 2:
                this.b.lambda$removeAllTopics$59(this.c);
                break;
            case 3:
                this.b.lambda$deleteWallpaper$82(this.c);
                break;
            case 4:
                this.b.lambda$deleteSavedDialog$58(this.c);
                break;
            case 5:
                this.b.lambda$onDeleteQueryComplete$94(this.c);
                break;
            case 6:
                this.b.lambda$removePendingTask$11(this.c);
                break;
            default:
                this.b.lambda$loadChannelAdmins$127(this.c);
                break;
        }
    }
}
