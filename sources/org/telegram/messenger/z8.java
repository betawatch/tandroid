package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z8(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$clearBotKeyboard$193((ArrayList) this.c, (MessagesStorage.TopicKey) this.d);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$30((String) this.c, (Utilities.Callback) this.d);
                break;
            case 2:
                ((MediaDataController) this.b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 3:
                ((MediaDataController) this.b).lambda$processLoadedMedia$135((ArrayList) this.c, (y6) this.d);
                break;
            case 4:
                ((MediaDataController) this.b).lambda$saveToRingtones$203((TLObject) this.c, (TLRPC.Document) this.d);
                break;
            case 5:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.c, (Utilities.Callback) this.d);
                break;
            case 6:
                ((MessagesController) this.b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.c);
                break;
            case 7:
                ((MessagesController) this.b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.c, (cb) this.d);
                break;
            case 8:
                ((MessagesController) this.b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.c, (db) this.d);
                break;
            case 9:
                ((MessagesController) this.b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.c, (String) this.d);
                break;
            case 10:
                ((MessagesController) this.b).lambda$addUsersToChat$296((TLRPC.Chat) this.c, (TLRPC.TL_messages_invitedUsers) this.d);
                break;
            case 11:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.b2[]) this.b, (boolean[]) this.c, (org.telegram.ui.ActionBar.n2) this.d);
                break;
            case 12:
                ((MessagesController) this.b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.c, (org.telegram.ui.ActionBar.h6) this.d);
                break;
            case 13:
                ((MessagesController) this.b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.c, (LongSparseIntArray) this.d);
                break;
            case 14:
                ((MessagesController) this.b).lambda$getDifference$353((ArrayList) this.c, (TLRPC.updates_Difference) this.d);
                break;
            case 15:
                ((MessagesController) this.b).lambda$getChannelDifference$342((ArrayList) this.c, (TLRPC.updates_ChannelDifference) this.d);
                break;
            case 16:
                ((MessagesController.SavedMusicList) this.b).lambda$load$0((TLObject) this.d, (ArrayList) this.c);
                break;
            case 17:
                ((MessagesStorage) this.b).lambda$saveBotCache$126((TLObject) this.c, (String) this.d);
                break;
            case 18:
                ((MessagesStorage) this.b).lambda$applyPhoneBookUpdates$148((String) this.c, (String) this.d);
                break;
            case 19:
                ((MessagesStorage) this.b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.c);
                break;
            case 20:
                ((MessagesStorage) this.b).lambda$getNewTask$111((a0.i) this.c, (a0.i) this.d);
                break;
            case 21:
                ((SavedMessagesController) this.b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.c);
                break;
            case 22:
                ((SecretChatHelper) this.b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.c, (TLRPC.EncryptedChat) this.d);
                break;
            case 23:
                ((SendMessagesHelper) this.b).lambda$sendVote$31((String) this.c, (Runnable) this.d);
                break;
            case 24:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$49((TLObject) this.c, (SendMessagesHelper.DelayedMessage) this.d);
                break;
            case 25:
                ((SendMessagesHelper) this.b).lambda$sendMessage$14((TLRPC.TL_error) this.c, (TLRPC.TL_messages_forwardMessages) this.d);
                break;
            case 26:
                ((TelegramMediaSession) this.b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.c, (String) this.d);
                break;
            case 27:
                ((TranslateController) this.b).lambda$checkDialogMessageSure$10((ArrayList) this.c, (ArrayList) this.d);
                break;
            case 28:
                Utilities.lambda$raceCallbacks$1((int[]) this.b, (Utilities.Callback[]) this.c, (Runnable) this.d);
                break;
            default:
                WearAuthListenerService.lambda$onMessageReceived$0((String) this.b, (String) this.c, (byte[]) this.d);
                break;
        }
    }

    public /* synthetic */ z8(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
