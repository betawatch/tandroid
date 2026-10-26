package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                this.b.lambda$loadChannelAdmins$126(this.c);
                break;
        }
    }
}
