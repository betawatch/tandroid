package lh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import oh.t6;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.a = 0;
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
                new e6((Context) obj3, this.b, ((GiftAuctionController.Auction) obj2).gift, null, this.c, (Runnable) obj, false, false).show();
                break;
            case 1:
                mh.z zVar = (mh.z) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((mh.a0) obj3).a;
                boolean[] zArr = zVar.d;
                boolean[] zArr2 = zVar.b;
                ArrayList[] arrayListArr = zVar.a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i13).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i13).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr2[i12] = !arrayListArr[i12].isEmpty() || zArr2[i12];
                    boolean[] zArr3 = zVar.e;
                    boolean z4 = (starsStatus.flags & 1) == 0;
                    zArr3[i12] = z4;
                    zVar.c[i12] = z4 ? null : starsStatus.next_offset;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    break;
                }
                break;
            case 2:
                qh.d dVar = (qh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new mh.t(dVar, (org.telegram.ui.ActionBar.h3[]) obj, i14, this.c, 1));
                break;
            case 3:
                t6 t6Var = (t6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                int i15 = t6Var.a;
                HashSet hashSet = t6Var.t;
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
                t6Var.W.remove(str);
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
                    t6Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i15).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    t6Var.Z(tL_updateStory);
                    break;
                }
            case 4:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.c, this.b, (Runnable) obj);
                break;
            case 5:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.b, (Utilities.Callback) obj, this.c);
                break;
            case 6:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.c, this.b, (boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 7:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.c, this.b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                break;
            case 8:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.b, this.c, (TLRPC.Message) obj2, (String) obj);
                break;
            case 9:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.b, this.c);
                break;
            case 10:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.c, (a0.h) obj, this.b);
                break;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.c, (a0.h) obj, this.b);
                break;
            default:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i16 = t1Var.F7;
                if (user == null) {
                    if (chat == null) {
                        t1Var.U8[i12].n(j10, "", "");
                        break;
                    } else {
                        t1Var.U8[i12].k(i16, chat);
                        t1Var.T8[i12].setForUserOrChat(chat, t1Var.U8[i12]);
                        break;
                    }
                } else {
                    t1Var.U8[i12].m(i16, user);
                    t1Var.T8[i12].setForUserOrChat(user, t1Var.U8[i12]);
                    break;
                }
        }
    }

    public /* synthetic */ x(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = j10;
    }

    public /* synthetic */ x(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.a = 4;
        this.d = botForumHelper;
        this.e = jArr;
        this.c = j10;
        this.b = i10;
        this.f = runnable;
    }

    public /* synthetic */ x(MessagesStorage messagesStorage, int i10, long j10, TLRPC.Message message, String str) {
        this.a = 8;
        this.d = messagesStorage;
        this.b = i10;
        this.c = j10;
        this.e = message;
        this.f = str;
    }

    public /* synthetic */ x(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.c = j10;
        this.b = i10;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ x(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.a = 9;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ x(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.c = j10;
        this.f = hVar;
        this.b = i10;
    }
}
