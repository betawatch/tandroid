package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u7(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.a = 10;
        this.d = context;
        this.c = i10;
        this.e = auction;
        this.b = j3;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TL_stories.StoryItem storyItem = null;
        storyItem = null;
        int i11 = 0;
        long j3 = this.b;
        int i12 = this.c;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                u8 u8Var = (u8) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                int i13 = u8Var.a;
                HashSet hashSet = u8Var.t;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i13).putChats(tL_stories_stories.chats, false);
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
                u8Var.W.remove(str);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2.endsWith(":" + j3 + ":" + i12)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                    hashSet.add(str);
                    u8Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i13).getPeer(j3);
                    tL_updateStory.story = storyItem;
                    u8Var.Z(tL_updateStory);
                    break;
                }
            case 1:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.b, this.c, (Runnable) obj);
                break;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.c, (Utilities.Callback) obj, this.b);
                break;
            case 3:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.b, this.c, (boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.b, this.c, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.c, this.b, (TLRPC.Message) obj2, (String) obj);
                break;
            case 6:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.c, this.b);
                break;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.b, (a0.i) obj, this.c);
                break;
            case 8:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.b, (a0.i) obj, this.c);
                break;
            case 9:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i14 = t1Var.I7;
                if (user == null) {
                    if (chat == null) {
                        t1Var.X8[i12].n(j3, "", "");
                        break;
                    } else {
                        t1Var.X8[i12].k(i14, chat);
                        t1Var.W8[i12].setForUserOrChat(chat, t1Var.X8[i12]);
                        break;
                    }
                } else {
                    t1Var.X8[i12].m(i14, user);
                    t1Var.W8[i12].setForUserOrChat(user, t1Var.X8[i12]);
                    break;
                }
            case 10:
                new yh.x4((Context) obj3, this.c, ((GiftAuctionController.Auction) obj2).gift, null, this.b, (Runnable) obj, false, false).show();
                break;
            case 11:
                zh.n nVar = (zh.n) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i15 = ((zh.o) obj3).a;
                boolean[] zArr = nVar.d;
                boolean[] zArr2 = nVar.b;
                ArrayList[] arrayListArr = nVar.a;
                zArr[i12] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr2[i12] = !arrayListArr[i12].isEmpty() || zArr2[i12];
                    boolean[] zArr3 = nVar.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i12] = z10;
                    nVar.c[i12] = z10 ? null : starsStatus.next_offset;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j3));
                    break;
                }
                break;
            default:
                di.d dVar = (di.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i16 = this.c;
                ConnectionsManager.getInstance(i16).sendRequest(tL_fulfillStarsSubscription, new s7(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i16, this.b, 7));
                break;
        }
    }

    public /* synthetic */ u7(Object obj, TLObject tLObject, int i10, Object obj2, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.c = i10;
        this.f = obj2;
        this.b = j3;
    }

    public /* synthetic */ u7(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.a = 1;
        this.d = botForumHelper;
        this.e = jArr;
        this.b = j3;
        this.c = i10;
        this.f = runnable;
    }

    public /* synthetic */ u7(MessagesStorage messagesStorage, int i10, long j3, TLRPC.Message message, String str) {
        this.a = 5;
        this.d = messagesStorage;
        this.c = i10;
        this.b = j3;
        this.e = message;
        this.f = str;
    }

    public /* synthetic */ u7(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.b = j3;
        this.c = i10;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ u7(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.a = 6;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = i10;
        this.b = j3;
    }

    public /* synthetic */ u7(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.b = j3;
        this.f = iVar;
        this.c = i10;
    }

    public /* synthetic */ u7(zh.o oVar, zh.n nVar, int i10, TLObject tLObject, long j3) {
        this.a = 11;
        this.d = oVar;
        this.f = nVar;
        this.c = i10;
        this.e = tLObject;
        this.b = j3;
    }
}
