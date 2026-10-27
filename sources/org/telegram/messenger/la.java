package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class la implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ la(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$420(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$updateTimerProc$151(tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$updateTimerProc$152(tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$loadCurrentState$326(tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$getContentSettings$508(tLObject, tL_error);
                break;
            case 5:
                this.b.lambda$loadSignUpNotificationsSettings$206(tLObject, tL_error);
                break;
            case 6:
                this.b.lambda$reloadDialogsReadValue$63(tLObject, tL_error);
                break;
            case 7:
                this.b.lambda$completeReadTask$237(tLObject, tL_error);
                break;
            case 8:
                this.b.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                break;
            case 9:
                this.b.lambda$sendBotStart$292(tLObject, tL_error);
                break;
            case 10:
                this.b.lambda$toggleChannelForum$285(tLObject, tL_error);
                break;
            case 11:
                this.b.lambda$setDialogHistoryTTL$136(tLObject, tL_error);
                break;
            case 12:
                this.b.lambda$loadUnreadDialogs$363(tLObject, tL_error);
                break;
            case 13:
                this.b.lambda$checkTosUpdate$162(tLObject, tL_error);
                break;
            case 14:
                this.b.lambda$reloadReactionsNotifySettings$204(tLObject, tL_error);
                break;
            case 15:
                this.b.lambda$loadHintDialogs$195(tLObject, tL_error);
                break;
            case 16:
                this.b.lambda$reloadUser$55(tLObject, tL_error);
                break;
            case 17:
                this.b.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                break;
            case 18:
                this.b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                break;
            case 19:
                this.b.lambda$didReceivedNotification$42(tLObject, tL_error);
                break;
            case 20:
                this.b.lambda$loadGlobalNotificationsSettings$202(tLObject, tL_error);
                break;
            case 21:
                this.b.lambda$performLogout$323(tLObject, tL_error);
                break;
            case 22:
                this.b.lambda$checkPeerColors$497(tLObject, tL_error);
                break;
            case 23:
                this.b.lambda$checkPeerColors$499(tLObject, tL_error);
                break;
            case 24:
                this.b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                break;
            case 25:
                this.b.lambda$toggleChannelInvitesHistory$287(tLObject, tL_error);
                break;
            default:
                this.b.lambda$toggleChannelSignatures$283(tLObject, tL_error);
                break;
        }
    }
}
