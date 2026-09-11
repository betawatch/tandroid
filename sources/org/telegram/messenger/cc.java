package org.telegram.messenger;

import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class cc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$processUpdateArray$394((TL_update.TL_updateLangPack) this.c);
                break;
            case 1:
                ((MessagesController) this.b).lambda$processUpdateArray$384((TL_update.TL_updateGroupCallMessage) this.c);
                break;
            case 2:
                ((MessagesController) this.b).lambda$processUpdateArray$385((TL_update.TL_updateDeleteGroupCallMessages) this.c);
                break;
            case 3:
                ((MessagesController) this.b).lambda$processUpdateArray$386((TL_update.TL_updateUserTyping) this.c);
                break;
            case 4:
                ((MessagesController) this.b).lambda$processUpdateArray$387((TL_update.TL_updateChatUserTyping) this.c);
                break;
            case 5:
                MessagesController.lambda$setCustomChatReactions$468((Utilities.Callback) this.b, (TLRPC.TL_error) this.c);
                break;
            case 6:
                ((MessagesController) this.b).lambda$getSponsoredMessages$438((TLRPC.messages_SponsoredMessages) this.c);
                break;
            case 7:
                ((MessagesController) this.b).lambda$processUpdateArray$412((TL_update.TL_updateChannel) this.c);
                break;
            case 8:
                ((MessagesController) this.b).lambda$getChannelDifference$338((TLRPC.updates_ChannelDifference) this.c);
                break;
            case 9:
                ((MessagesController) this.b).lambda$createChat$257((TLRPC.TL_messages_invitedUsers) this.c);
                break;
            case 10:
                ((MessagesController) this.b).lambda$addToViewsQueue$230((MessageObject) this.c);
                break;
            case 11:
                ((MessagesController) this.b).lambda$getSendAsPeers$441((TLRPC.TL_channels_sendAsPeers) this.c);
                break;
            case 12:
                MessagesController.lambda$toggleChatNoForwards$277((Utilities.Callback2) this.b, (TLRPC.TL_error) this.c);
                break;
            case 13:
                ((MessagesController) this.b).lambda$updateConfig$41((TLRPC.TL_config) this.c);
                break;
            case 14:
                MessagesController.lambda$addUsersToChat$294((q0.a) this.b, (TLRPC.User) this.c);
                break;
            case 15:
                ((MessagesController) this.b).lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) this.c);
                break;
            case 16:
                ((MessagesController) this.b).lambda$checkChatInviter$371((TLRPC.TL_channels_channelParticipant) this.c);
                break;
            case 17:
                MessagesController.lambda$addUserToChat$299((Utilities.Callback) this.b, (Runnable) this.c);
                break;
            case 18:
                ((MessagesController.SavedMusicIds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 19:
                ((MessagesStorage) this.b).lambda$updateTopicsWithReadMessages$59((HashMap) this.c);
                break;
            case 20:
                ((MessagesStorage) this.b).lambda$putGiftChatThemes$265((List) this.c);
                break;
            case 21:
                ((MessagesStorage) this.b).lambda$putPushMessage$42((MessageObject) this.c);
                break;
            case 22:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.b, (Runnable) this.c);
                break;
            case 23:
                ((MessagesStorage) this.b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.c);
                break;
            case 24:
                ((MessagesStorage) this.b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.c);
                break;
            case 25:
                ((MessagesStorage) this.b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.c);
                break;
            case 26:
                ((MessagesStorage) this.b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.c);
                break;
            case 27:
                ((MessagesStorage) this.b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.c);
                break;
            case 28:
                ((MessagesStorage) this.b).lambda$updateDialogData$241((TLRPC.Dialog) this.c);
                break;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.b, (Intent) this.c);
                break;
        }
    }
}
