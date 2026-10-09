package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ r9(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestIsUserContactBlocked();
                break;
            case 1:
                this.b.lambda$new$508();
                break;
            case 2:
                this.b.lambda$registerForPush$322();
                break;
            case 3:
                this.b.lambda$updateTimerProc$157();
                break;
            case 4:
                this.b.lambda$updateTimerProc$160();
                break;
            case 5:
                this.b.lambda$applyAppConfig$35();
                break;
            case 6:
                this.b.lambda$applyAppConfig$36();
                break;
            case 7:
                this.b.lambda$processUpdateArray$412();
                break;
            case 8:
                this.b.lambda$processUpdateArray$413();
                break;
            case 9:
                this.b.lambda$processUpdateArray$414();
                break;
            case 10:
                this.b.lambda$loadRemoteFilters$26();
                break;
            case 11:
                this.b.lambda$loadRemoteFilters$27();
                break;
            case 12:
                this.b.lambda$loadRemoteFilters$28();
                break;
            case 13:
                this.b.lambda$loadRemoteFilters$29();
                break;
            case 14:
                this.b.lambda$migrateDialogs$214();
                break;
            case 15:
                this.b.lambda$addWebBrowserException$515();
                break;
            case 16:
                this.b.lambda$processUpdates$383();
                break;
            case 17:
                this.b.lambda$migrateDialogs$212();
                break;
            case 18:
                this.b.lambda$cleanup$51();
                break;
            case 19:
                this.b.lambda$cleanup$52();
                break;
            case 20:
                this.b.lambda$cleanup$53();
                break;
            case 21:
                this.b.lambda$processLoadedDeleteTask$86();
                break;
            case 22:
                this.b.lambda$didReceivedNotification$41();
                break;
            case 23:
                this.b.lambda$removeWebBrowserException$517();
                break;
            case 24:
                this.b.lambda$scheduleTranscriptionUpdate$37();
                break;
            case 25:
                this.b.lambda$toggleChannelForum$284();
                break;
            case 26:
                this.b.lambda$toggleChannelSignatures$282();
                break;
            case 27:
                this.b.lambda$updateEmojiStatusUntil$477();
                break;
            case 28:
                this.b.lambda$checkPromoInfoInternal$165();
                break;
            default:
                this.b.lambda$markAllTopicsAsRead$5();
                break;
        }
    }
}
