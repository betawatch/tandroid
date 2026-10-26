package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;

    public /* synthetic */ i2(MessagesStorage messagesStorage, int i10) {
        this.a = i10;
        this.b = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FactCheckController.lambda$clearExpiredInDatabase$7(this.b);
                break;
            case 1:
                this.b.lambda$clearWidgetHeights$45();
                break;
            case 2:
                this.b.lambda$deleteDialog$92();
                break;
            case 3:
                this.b.lambda$fixNotificationSettings$9();
                break;
            case 4:
                this.b.lambda$getWallpapers$84();
                break;
            case 5:
                this.b.lambda$loadUnreadMessages$80();
                break;
            case 6:
                this.b.lambda$updateMutedDialogsFiltersCounters$36();
                break;
            case 7:
                this.b.lambda$openDatabase$1();
                break;
            case 8:
                this.b.lambda$openDatabase$2();
                break;
            case 9:
                this.b.lambda$fullReset$65();
                break;
            case 10:
                this.b.lambda$updateFiltersReadCounter$122();
                break;
            case 11:
                this.b.lambda$clearLocalDatabase$47();
                break;
            case 12:
                this.b.lambda$checkSQLException$8();
                break;
            case 13:
                this.b.lambda$new$0();
                break;
            case 14:
                this.b.lambda$clearLocalDatabase$46();
                break;
            case 15:
                this.b.lambda$resetAllUnreadCounters$253();
                break;
            case 16:
                this.b.lambda$reset$64();
                break;
            case 17:
                this.b.lambda$saveDialogFilter$76();
                break;
            case 18:
                this.b.lambda$updateDbToLastVersion$3();
                break;
            case 19:
                this.b.lambda$updateDbToLastVersion$4();
                break;
            case 20:
                this.b.lambda$loadDialogFilters$70();
                break;
            case 21:
                this.b.lambda$clearSentMedia$166();
                break;
            case 22:
                this.b.lambda$fullReset$66();
                break;
            case 23:
                this.b.lambda$loadPendingTasks$33();
                break;
            case 24:
                this.b.lambda$deleteAllStoryPushMessages$40();
                break;
            case 25:
                this.b.lambda$cleanup$5();
                break;
            case 26:
                this.b.lambda$deleteAllStoryReactionPushMessages$41();
                break;
            case 27:
                this.b.lambda$getContacts$154();
                break;
            default:
                this.b.lambda$broadcastQuickRepliesMessagesChange$226();
                break;
        }
    }
}
