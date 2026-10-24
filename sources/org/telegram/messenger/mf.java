package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;

    public /* synthetic */ mf(MessagesStorage messagesStorage, long j10, int i10) {
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
                this.b.lambda$clearUserPhotos$92(this.c);
                break;
            case 2:
                this.b.lambda$removeAllTopics$56(this.c);
                break;
            case 3:
                this.b.lambda$deleteWallpaper$79(this.c);
                break;
            case 4:
                this.b.lambda$deleteSavedDialog$55(this.c);
                break;
            case 5:
                this.b.lambda$onDeleteQueryComplete$91(this.c);
                break;
            case 6:
                this.b.lambda$removePendingTask$11(this.c);
                break;
            default:
                this.b.lambda$loadChannelAdmins$123(this.c);
                break;
        }
    }
}
