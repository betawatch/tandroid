package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class y9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ y9(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$18();
                break;
            case 1:
                this.b.lambda$new$39();
                break;
            case 2:
                this.b.requestIsUserContactBlocked();
                break;
            case 3:
                this.b.lambda$new$505();
                break;
            case 4:
                this.b.lambda$updateTimerProc$158();
                break;
            case 5:
                this.b.lambda$updateTimerProc$161();
                break;
            case 6:
                this.b.lambda$applyAppConfig$36();
                break;
            case 7:
                this.b.lambda$applyAppConfig$37();
                break;
            case 8:
                this.b.lambda$processUpdates$380();
                break;
            case 9:
                this.b.lambda$migrateDialogs$213();
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
                this.b.lambda$cleanup$52();
                break;
            case 15:
                this.b.lambda$cleanup$53();
                break;
            case 16:
                this.b.lambda$cleanup$54();
                break;
            case 17:
                this.b.lambda$toggleChannelInvitesHistory$287();
                break;
            case 18:
                this.b.lambda$removeWebBrowserException$514();
                break;
            case 19:
                this.b.lambda$checkPromoInfoInternal$166();
                break;
            case 20:
                this.b.lambda$toggleChatJoinToSend$279();
                break;
            case 21:
                this.b.lambda$migrateDialogs$215();
                break;
            case 22:
                this.b.lambda$scheduleTranscriptionUpdate$38();
                break;
            case 23:
                this.b.lambda$processUpdateArray$409();
                break;
            case 24:
                this.b.lambda$processUpdateArray$410();
                break;
            case 25:
                this.b.lambda$processUpdateArray$411();
                break;
            case 26:
                this.b.lambda$registerForPush$323();
                break;
            case 27:
                this.b.lambda$updateEmojiStatusUntil$474();
                break;
            case 28:
                this.b.lambda$toggleChannelForum$285();
                break;
            default:
                this.b.lambda$toggleChannelSignatures$283();
                break;
        }
    }
}
