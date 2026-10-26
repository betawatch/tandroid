package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ da(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$updateTimerProc$151(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$updateTimerProc$152(tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$loadCurrentState$326(tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$getContentSettings$507(tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$loadSignUpNotificationsSettings$206(tLObject, tL_error);
                break;
            case 5:
                this.b.lambda$reloadDialogsReadValue$63(tLObject, tL_error);
                break;
            case 6:
                this.b.lambda$completeReadTask$237(tLObject, tL_error);
                break;
            case 7:
                this.b.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                break;
            case 8:
                this.b.lambda$sendBotStart$292(tLObject, tL_error);
                break;
            case 9:
                this.b.lambda$toggleChannelForum$285(tLObject, tL_error);
                break;
            case 10:
                this.b.lambda$setDialogHistoryTTL$136(tLObject, tL_error);
                break;
            case 11:
                this.b.lambda$loadUnreadDialogs$363(tLObject, tL_error);
                break;
            case 12:
                this.b.lambda$checkTosUpdate$162(tLObject, tL_error);
                break;
            case 13:
                this.b.lambda$reloadReactionsNotifySettings$204(tLObject, tL_error);
                break;
            case 14:
                this.b.lambda$loadHintDialogs$195(tLObject, tL_error);
                break;
            case 15:
                this.b.lambda$reloadUser$55(tLObject, tL_error);
                break;
            case 16:
                this.b.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                break;
            case 17:
                this.b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                break;
            case 18:
                this.b.lambda$didReceivedNotification$42(tLObject, tL_error);
                break;
            case 19:
                this.b.lambda$loadGlobalNotificationsSettings$202(tLObject, tL_error);
                break;
            case 20:
                this.b.lambda$performLogout$323(tLObject, tL_error);
                break;
            case 21:
                this.b.lambda$processUpdateArray$419(tLObject, tL_error);
                break;
            case 22:
                this.b.lambda$checkPeerColors$496(tLObject, tL_error);
                break;
            case 23:
                this.b.lambda$checkPeerColors$498(tLObject, tL_error);
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
