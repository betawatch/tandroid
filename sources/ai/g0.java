package ai;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g0(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.a = 14;
        this.d = context;
        this.b = i10;
        this.e = auction;
        this.c = j10;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        long j10 = this.c;
        int i12 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((k0) obj3).a;
                boolean[] zArr = j0Var.d;
                boolean[] zArr2 = j0Var.b;
                ArrayList[] arrayListArr = j0Var.a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i13).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i13).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr2[i12] = !arrayListArr[i12].isEmpty() || zArr2[i12];
                    boolean[] zArr3 = j0Var.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i12] = z10;
                    j0Var.c[i12] = z10 ? null : starsStatus.next_offset;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    break;
                }
                break;
            case 1:
                ei.d dVar = (ei.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new c0(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i14, this.c, 1));
                break;
            case 2:
                ci.i7 i7Var = (ci.i7) obj3;
                TLObject tLObject2 = (TLObject) obj;
                String str = (String) obj2;
                int i15 = i7Var.a;
                HashSet hashSet = i7Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i15).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                i7Var.W.remove(str);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2.endsWith(":" + j10 + ":" + i12)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                    hashSet.add(str);
                    i7Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i15).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    i7Var.Z(tL_updateStory);
                    break;
                }
            case 3:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.c, this.b, (Runnable) obj);
                break;
            case 4:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj, this.b, (Utilities.Callback) obj2, this.c);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.c, this.b, (boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 6:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.c, this.b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                break;
            case 7:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.b, this.c, (TLRPC.Message) obj2, (String) obj);
                break;
            case 8:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.b, this.c);
                break;
            case 9:
                ((SendMessagesHelper) obj3).lambda$completeSendingGramTransfer$6((MessageObject) obj2, (TLRPC.Message) obj, this.c, this.b);
                break;
            case 10:
                ((TelegramMediaSession) obj3).lambda$loadMusicForDialog$6(this.b, this.c, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.c, (a0.h) obj, this.b);
                break;
            case 12:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.c, (a0.h) obj, this.b);
                break;
            case 13:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i16 = u1Var.I7;
                if (user == null) {
                    if (chat == null) {
                        u1Var.X8[i12].n(j10, "", "");
                        break;
                    } else {
                        u1Var.X8[i12].k(i16, chat);
                        u1Var.W8[i12].setForUserOrChat(chat, u1Var.X8[i12]);
                        break;
                    }
                } else {
                    u1Var.X8[i12].m(i16, user);
                    u1Var.W8[i12].setForUserOrChat(user, u1Var.X8[i12]);
                    break;
                }
            default:
                new yh.x4((Context) obj3, this.b, ((GiftAuctionController.Auction) obj2).gift, null, this.c, (Runnable) obj, false, false).show();
                break;
        }
    }

    public /* synthetic */ g0(Object obj, int i10, long j10, Object obj2, Serializable serializable, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j10;
        this.e = obj2;
        this.f = serializable;
    }

    public /* synthetic */ g0(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = j10;
    }

    public /* synthetic */ g0(Object obj, TLObject tLObject, int i10, Object obj2, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.f = tLObject;
        this.b = i10;
        this.e = obj2;
        this.c = j10;
    }

    public /* synthetic */ g0(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.a = 3;
        this.d = botForumHelper;
        this.e = jArr;
        this.c = j10;
        this.b = i10;
        this.f = runnable;
    }

    public /* synthetic */ g0(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.c = j10;
        this.b = i10;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ g0(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.a = 8;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ g0(SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TLRPC.Message message, long j10, int i10) {
        this.a = 9;
        this.d = sendMessagesHelper;
        this.e = messageObject;
        this.f = message;
        this.c = j10;
        this.b = i10;
    }

    public /* synthetic */ g0(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.c = j10;
        this.f = hVar;
        this.b = i10;
    }
}
