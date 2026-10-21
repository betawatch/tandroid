package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ChatMessagesMetadataController) this.c).lambda$loadStoriesForMessages$1((MessageObject) this.d, this.b, (TL_stories.StoryItem) this.e);
                break;
            case 1:
                ((MediaDataController) this.c).lambda$loadReplyMessagesForMessages$170((Timer.Task) this.d, this.b, (ArrayList) this.e);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$loadMusic$141(this.b, (ArrayList) this.d, (ArrayList) this.e);
                break;
            case 3:
                ((MessagesController) this.c).lambda$addUserToChat$299((Utilities.Callback) this.d, (TLRPC.TL_messages_invitedUsers) this.e, this.b);
                break;
            case 4:
                ((MessagesController) this.c).lambda$checkChatInviter$373(this.b, (ArrayList) this.d, (TLRPC.TL_channels_channelParticipant) this.e);
                break;
            case 5:
                ((MessagesController) this.c).lambda$getGroupCall$61((TLObject) this.d, this.b, (Runnable) this.e);
                break;
            case 6:
                ((MessagesController) this.c).lambda$reloadMessages$72(this.b, (ArrayList) this.d, (ArrayList) this.e);
                break;
            case 7:
                ((MessagesController) this.c).lambda$checkPromoInfoInternal$164((TLRPC.TL_help_promoData) this.d, (TLRPC.TL_messages_peerDialogs) this.e, this.b);
                break;
            case 8:
                ((MessagesController) this.c).lambda$updateChannelUserName$290(this.b, (String) this.d, (Runnable) this.e);
                break;
            case 9:
                ((MessagesStorage) this.c).lambda$deleteUserChatHistory$85((ArrayList) this.d, this.b, (ArrayList) this.e);
                break;
            case 10:
                ((MessagesStorage) this.c).lambda$updateMessagePollResults$101(this.b, (TLRPC.Poll) this.d, (TLRPC.PollResults) this.e);
                break;
            case 11:
                ((MessagesStorage) this.c).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) this.d, (TLRPC.TL_messageReactions) this.e, this.b);
                break;
            case 12:
                ((MessagesStorage) this.c).lambda$getUserSync$258((TLRPC.User[]) this.d, this.b, (CountDownLatch) this.e);
                break;
            case 13:
                ((MessagesStorage) this.c).lambda$containsLocalDialog$179(this.b, (Boolean[]) this.d, (CountDownLatch) this.e);
                break;
            case 14:
                ((MessagesStorage) this.c).lambda$getChannelPtsSync$257(this.b, (Integer[]) this.d, (CountDownLatch) this.e);
                break;
            case 15:
                ((MessagesStorage) this.c).lambda$getChatSync$259((TLRPC.Chat[]) this.d, this.b, (CountDownLatch) this.e);
                break;
            case 16:
                ((MessagesStorage) this.c).lambda$loadPendingTasks$14((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, this.b);
                break;
            case 17:
                ((MessagesStorage) this.c).lambda$getEncryptedChat$177(this.b, (ArrayList) this.d, (CountDownLatch) this.e);
                break;
            case 18:
                ((SavedMessagesController) this.c).lambda$updateDialogsLastMessage$9((MessagesStorage) this.d, (ArrayList) this.e, this.b);
                break;
            default:
                ((SavedMessagesController) this.c).lambda$loadCache$7((MessagesStorage) this.d, this.b, (Runnable) this.e);
                break;
        }
    }

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    public /* synthetic */ x0(BaseController baseController, long j10, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = baseController;
        this.b = j10;
        this.d = obj;
        this.e = obj2;
    }
}
