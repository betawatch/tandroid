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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class lc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$processUpdateArray$398((TLRPC.Message) this.c);
                break;
            case 1:
                ((MessagesController) this.b).lambda$processUpdateArray$400((TL_update.TL_updateLangPack) this.c);
                break;
            case 2:
                ((MessagesController) this.b).lambda$processUpdateArray$389((TL_update.TL_updateGroupCallMessage) this.c);
                break;
            case 3:
                ((MessagesController) this.b).lambda$processUpdateArray$390((TL_update.TL_updateDeleteGroupCallMessages) this.c);
                break;
            case 4:
                ((MessagesController) this.b).lambda$processUpdateArray$391((TL_update.TL_updateUserTyping) this.c);
                break;
            case 5:
                ((MessagesController) this.b).lambda$processUpdateArray$392((TL_update.TL_updateChatUserTyping) this.c);
                break;
            case 6:
                MessagesController.lambda$toggleChatNoForwards$276((Utilities.Callback2) this.b, (TLRPC.TL_error) this.c);
                break;
            case 7:
                ((MessagesController) this.b).lambda$getChannelDifference$339((TLRPC.updates_ChannelDifference) this.c);
                break;
            case 8:
                ((MessagesController) this.b).lambda$checkChatInviter$372((TLRPC.TL_channels_channelParticipant) this.c);
                break;
            case 9:
                ((MessagesController) this.b).lambda$getSendAsPeers$447((TLRPC.TL_channels_sendAsPeers) this.c);
                break;
            case 10:
                ((MessagesController) this.b).lambda$getDifference$352((TLRPC.updates_Difference) this.c);
                break;
            case 11:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.b, (Runnable) this.c);
                break;
            case 12:
                ((MessagesController) this.b).lambda$addToViewsQueue$229((MessageObject) this.c);
                break;
            case 13:
                ((MessagesController) this.b).lambda$loadAppConfig$31((TLRPC.TL_help_appConfig) this.c);
                break;
            case 14:
                ((MessagesController) this.b).lambda$changeChatAvatar$319((Runnable) this.c);
                break;
            case 15:
                ((MessagesController) this.b).lambda$updateConfig$40((TLRPC.TL_config) this.c);
                break;
            case 16:
                MessagesController.lambda$addUsersToChat$293((q0.a) this.b, (TLRPC.User) this.c);
                break;
            case 17:
                ((MessagesController) this.b).lambda$getSponsoredMessages$444((TLRPC.messages_SponsoredMessages) this.c);
                break;
            case 18:
                ((MessagesController.SavedMusicIds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 19:
                ((MessagesStorage) this.b).lambda$putGiftChatThemes$269((List) this.c);
                break;
            case 20:
                ((MessagesStorage) this.b).lambda$putPushMessage$42((MessageObject) this.c);
                break;
            case 21:
                MessagesStorage.lambda$getMessages$165((Timer.Task) this.b, (Runnable) this.c);
                break;
            case 22:
                ((MessagesStorage) this.b).lambda$updateChatParticipants$126((TLRPC.ChatParticipants) this.c);
                break;
            case 23:
                ((MessagesStorage) this.b).lambda$deleteDialogFilter$75((MessagesController.DialogFilter) this.c);
                break;
            case 24:
                ((MessagesStorage) this.b).lambda$loadGiftChatTheme$272((Utilities.Callback) this.c);
                break;
            case 25:
                ((MessagesStorage) this.b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.c);
                break;
            case 26:
                ((MessagesStorage) this.b).lambda$updateMessageStateAndIdInternal$216((TLRPC.TL_updates) this.c);
                break;
            case 27:
                ((MessagesStorage) this.b).lambda$updateDialogData$245((TLRPC.Dialog) this.c);
                break;
            case 28:
                ((MessagesStorage) this.b).lambda$updateTopicsWithReadMessages$62((HashMap) this.c);
                break;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.b, (Intent) this.c);
                break;
        }
    }
}
