package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k0(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.a = 9;
        this.d = context;
        this.b = i10;
        this.e = auction;
        this.c = j3;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        long j3 = this.c;
        int i12 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.c, this.b, (Runnable) obj);
                break;
            case 1:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.b, (Utilities.Callback) obj, this.c);
                break;
            case 2:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.c, this.b, (boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 3:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.c, this.b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.b, this.c, (TLRPC.Message) obj2, (String) obj);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.b, this.c);
                break;
            case 6:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.c, (a0.i) obj, this.b);
                break;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.c, (a0.i) obj, this.b);
                break;
            case 8:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i13 = t1Var.I7;
                if (user == null) {
                    if (chat == null) {
                        t1Var.X8[i12].n(j3, "", "");
                        break;
                    } else {
                        t1Var.X8[i12].k(i13, chat);
                        t1Var.W8[i12].setForUserOrChat(chat, t1Var.X8[i12]);
                        break;
                    }
                } else {
                    t1Var.X8[i12].m(i13, user);
                    t1Var.W8[i12].setForUserOrChat(user, t1Var.X8[i12]);
                    break;
                }
            case 9:
                new wh.y4((Context) obj3, this.b, ((GiftAuctionController.Auction) obj2).gift, null, this.c, (Runnable) obj, false, false).show();
                break;
            case 10:
                xh.o oVar = (xh.o) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = ((xh.p) obj3).a;
                boolean[] zArr = oVar.d;
                boolean[] zArr2 = oVar.b;
                ArrayList[] arrayListArr = oVar.a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr2[i12] = !arrayListArr[i12].isEmpty() || zArr2[i12];
                    boolean[] zArr3 = oVar.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i12] = z10;
                    oVar.c[i12] = z10 ? null : starsStatus.next_offset;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j3));
                    break;
                }
                break;
            case 11:
                bi.d dVar = (bi.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i15 = this.b;
                ConnectionsManager.getInstance(i15).sendRequest(tL_fulfillStarsSubscription, new u0(dVar, (org.telegram.ui.ActionBar.h3[]) obj, i15, this.c, 6));
                break;
            default:
                zh.i5 i5Var = (zh.i5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                int i16 = i5Var.a;
                HashSet hashSet = i5Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i16).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i16).putChats(tL_stories_stories.chats, false);
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
                i5Var.W.remove(str);
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
                    i5Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i16).getPeer(j3);
                    tL_updateStory.story = storyItem;
                    i5Var.Z(tL_updateStory);
                    break;
                }
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, int i10, Object obj3, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = j3;
    }

    public /* synthetic */ k0(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.a = 0;
        this.d = botForumHelper;
        this.e = jArr;
        this.c = j3;
        this.b = i10;
        this.f = runnable;
    }

    public /* synthetic */ k0(MessagesStorage messagesStorage, int i10, long j3, TLRPC.Message message, String str) {
        this.a = 4;
        this.d = messagesStorage;
        this.b = i10;
        this.c = j3;
        this.e = message;
        this.f = str;
    }

    public /* synthetic */ k0(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.c = j3;
        this.b = i10;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ k0(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.a = 5;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i10;
        this.c = j3;
    }

    public /* synthetic */ k0(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.c = j3;
        this.f = iVar;
        this.b = i10;
    }
}
