package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.b);
                break;
            case 1:
                ((CacheFetcher) this.c).lambda$callCallbacks$3((Pair) this.d, this.e, this.b);
                break;
            case 2:
                ((ChatObject.Call) this.c).lambda$loadMembers$2(this.b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                break;
            case 3:
                ((ChatThemeController) this.c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.b);
                break;
            case 4:
                ((ContactsController) this.c).lambda$deleteContact$56((ArrayList) this.d, this.b, (String) this.e);
                break;
            case 5:
                ((MediaController) this.c).lambda$toggleRecordingPause$27((File) this.d, this.b, (TLRPC.TL_document) this.e);
                break;
            case 6:
                ((MediaController) this.c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.b);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$saveReplyMessages$178(this.b, (ArrayList) this.d, (a0.i) this.e);
                break;
            case 8:
                ((MediaDataController) this.c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.e, this.b);
                break;
            case 9:
                ((MediaDataController) this.c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.b, (ArrayList) this.e);
                break;
            case 10:
                ((MessagesController) this.c).lambda$processUpdates$377(this.b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                break;
            case 11:
                ((MessagesController) this.c).lambda$getBlockedPeers$112((TLObject) this.d, this.b, (TLRPC.TL_contacts_getBlocked) this.e);
                break;
            case 12:
                ((MessagesController.CommonChatsList) this.c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.b);
                break;
            case 13:
                ((MessagesStorage) this.c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.b);
                break;
            default:
                ((NotificationsController) this.c).lambda$removeDeletedMessagesFromNotifications$10((a0.i) this.d, this.b, (ArrayList) this.e);
                break;
        }
    }

    public /* synthetic */ vj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ vj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ vj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.a = 6;
        this.c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.b = z10;
    }
}
