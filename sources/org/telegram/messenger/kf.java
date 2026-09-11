package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;

    public /* synthetic */ kf(int i10, long j3, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
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
