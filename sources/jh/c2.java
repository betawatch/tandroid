package jh;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ba0;
import org.telegram.ui.fy;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c3;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i11 = this.a;
        TL_stories.StoryItem storyItem = null;
        int i12 = 0;
        long j10 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                h5 h5Var = (h5) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (!((s7) obj2).e) {
                    mc Q = h5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    h5Var.v1(j10, callback);
                    break;
                }
            case 1:
                h5.d0((h5) obj3, j10, (TL_stars.TL_starGiftUnique) obj2, (fy) obj);
                break;
            case 2:
                h5 h5Var2 = (h5) obj3;
                h5Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                h5Var2.f0.setLoading(false);
                h5Var2.v1(j10, (Utilities.Callback) obj);
                break;
            case 3:
                ((s7) obj2).d0((MessageObject) obj, ((m5) obj3).a, this.c, true, true, null);
                break;
            case 4:
                s7 s7Var = (s7) obj2;
                TLObject tLObject = (TLObject) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    s7Var.getClass();
                    callback2.run(null);
                    break;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    s7Var.M.put(Long.valueOf(j10), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    break;
                }
            case 5:
                s7 s7Var2 = (s7) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                if (!s7Var2.e) {
                    s7.e("NO_BALANCE");
                    callback3.run(null);
                    break;
                } else {
                    s7Var2.H(starGift, this.c, null, true, callback3);
                    break;
                }
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                tc a02 = tc.a0((tn) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j10, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                break;
            case 7:
                ((s7) obj2).h0((LaunchActivity) obj3, j10, (String) obj);
                break;
            case 8:
                lh.s6 s6Var = (lh.s6) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList2 = s6Var.h;
                ArrayList arrayList3 = s6Var.g;
                int i13 = s6Var.a;
                FileLog.d("StoriesController update stories for dialog " + j10);
                s6Var.n0(j10, Collections.singletonList(tL_updateStory.story), false);
                s6Var.l0(j10, Collections.singletonList(tL_updateStory.story), true);
                a0.h hVar = s6Var.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) hVar.f(j10);
                ArrayList arrayList4 = new ArrayList();
                int i14 = s6Var.u;
                if (peerStories == null) {
                    c3 = 1;
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        if (!lh.l7.w(i13, storyItem2)) {
                            if (j10 > 0 && (user == null || (!user.self && !s6Var.M(user)))) {
                                FileLog.d("StoriesController can't add user cause is not contact");
                                break;
                            } else {
                                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                                tL_peerStories.peer = tL_updateStory.peer;
                                tL_peerStories.stories.add(tL_updateStory.story);
                                j7.l1.t(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                                long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                                s6Var.b0(peerDialogId, tL_peerStories);
                                if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                                    TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
                                    s6Var.g(tL_peerStories);
                                    if (user2 != null && !user2.stories_hidden) {
                                        s6Var.X(tL_peerStories);
                                    }
                                }
                                FileLog.d("StoriesController applyNewStories " + peerDialogId);
                                s6Var.n0(peerDialogId, tL_peerStories.stories, false);
                                s6Var.u = s6Var.u + 1;
                                s6Var.O(j10);
                            }
                        } else {
                            FileLog.d("StoriesController can't add user " + j10 + " with new story isExpired");
                            break;
                        }
                    } else {
                        FileLog.d("StoriesController can't add user " + j10 + " with new story DELETED");
                        break;
                    }
                } else {
                    TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                    c3 = 1;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i13).processDeleteStory(j10, storyItem3.id);
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i15).id != storyItem3.id) {
                            i15++;
                        } else if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i15);
                            j7.l1.t(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem4 = peerStories.stories.get(i15);
                            storyItem3 = lh.s6.f(storyItem4, storyItem3);
                            arrayList4.add(storyItem3);
                            peerStories.stories.set(i15, storyItem3);
                            if (storyItem3.attachPath == null) {
                                storyItem3.attachPath = storyItem4.attachPath;
                            }
                            if (storyItem3.firstFramePath == null) {
                                storyItem3.firstFramePath = storyItem4.firstFramePath;
                            }
                            j7.l1.t(storyItem3.id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    }
                    z12 = false;
                    if (!z11) {
                        if (!(storyItem3 instanceof TL_stories.TL_storyItemDeleted)) {
                            if (!lh.l7.w(i13, storyItem3)) {
                                if (j10 > 0 && (user == null || (!user.self && !s6Var.M(user)))) {
                                    FileLog.d("StoriesController can't add new story user is not contact");
                                    break;
                                } else {
                                    arrayList4.add(storyItem3);
                                    peerStories.stories.add(storyItem3);
                                    FileLog.d("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                                    s6Var.W(j10, storyItem3);
                                    s6Var.g(peerStories);
                                    z10 = true;
                                    z12 = true;
                                }
                            } else {
                                FileLog.d("StoriesController can't add new story isExpired");
                                break;
                            }
                        } else {
                            FileLog.d("StoriesController can't add new story DELETED");
                            break;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || s6Var.K(j10)) {
                            Collections.sort(peerStories.stories, lh.s6.X);
                        } else {
                            arrayList3.remove(peerStories);
                            arrayList2.remove(peerStories);
                            hVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            s6Var.u--;
                        }
                    }
                    if (i14 != s6Var.u) {
                        s6Var.l.edit().putInt("total_stores", s6Var.u).apply();
                    }
                    s6Var.v(arrayList3);
                    s6Var.v(arrayList2);
                    if (z10) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                            int i16 = NotificationCenter.storyDeleted;
                            Long valueOf = Long.valueOf(j10);
                            Integer valueOf2 = Integer.valueOf(tL_updateStory.story.id);
                            Object[] objArr = new Object[2];
                            i10 = 0;
                            objArr[0] = valueOf;
                            objArr[c3] = valueOf2;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, objArr);
                        } else {
                            i10 = 0;
                        }
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                    }
                    MessagesController.getInstance(i13).checkArchiveFolder();
                    break;
                }
                z10 = true;
                if (i14 != s6Var.u) {
                }
                s6Var.v(arrayList3);
                s6Var.v(arrayList2);
                if (z10) {
                }
                MessagesController.getInstance(i13).checkArchiveFolder();
                break;
            case 9:
                TLObject tLObject2 = (TLObject) obj2;
                ba0 ba0Var = (ba0) obj;
                lh.s6 s6Var2 = ((lh.z5) obj3).c;
                int i17 = s6Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        while (true) {
                            if (i12 < peerStories2.stories.size()) {
                                if (!(peerStories2.stories.get(i12).media instanceof TLRPC.TL_messageMediaVideoStream) || (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItemSkipped)) {
                                    i12++;
                                } else {
                                    a0.h hVar2 = s6Var2.E;
                                    storyItem = peerStories2.stories.get(i12);
                                    hVar2.k(storyItem, j10);
                                }
                            }
                        }
                    }
                }
                ba0Var.accept(storyItem);
                break;
            case 10:
                TLObject tLObject3 = (TLObject) obj2;
                f5.d dVar = (f5.d) obj;
                lh.s6 s6Var3 = ((lh.a6) obj3).c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(s6Var3.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(s6Var3.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar3 = s6Var3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        hVar3.k(storyItem, j10);
                    }
                }
                dVar.accept(storyItem);
                break;
            case 11:
                long j11 = this.c;
                AndroidUtilities.runOnUIThread(new g5.v((lh.k7) obj3, (View) obj2, j11, 10), 500L);
                ((lh.h7) obj).f(j11);
                break;
            case 12:
                nh.y8 y8Var = (nh.y8) obj3;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj2);
                long j12 = this.c;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj).loadChatInfoInQueue(j12, isChannel, true, true, 0);
                if (loadChatInfoInQueue != null && (chatParticipants = loadChatInfoInQueue.participants) != null && ((arrayList = chatParticipants.participants) == null || arrayList.size() >= loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new g5.v(y8Var, j12, loadChatInfoInQueue, 11));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new oa(y8Var, isChannel, j12, 1));
                    break;
                }
                break;
            case 13:
                ((ChatMessagesMetadataController) obj3).lambda$loadStoriesForMessages$1((MessageObject) obj2, j10, (TL_stories.StoryItem) obj);
                break;
            case 14:
                ((MediaDataController) obj3).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj2, j10, (ArrayList) obj);
                break;
            case 15:
                ((MediaDataController) obj3).lambda$loadMusic$141(j10, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 16:
                ((MessagesController) obj3).lambda$getGroupCall$62((TLObject) obj2, j10, (Runnable) obj);
                break;
            case 17:
                ((MessagesController) obj3).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj2, (TLRPC.TL_messages_peerDialogs) obj, j10);
                break;
            case 18:
                ((MessagesController) obj3).lambda$updateChannelUserName$291(j10, (String) obj2, (Runnable) obj);
                break;
            case 19:
                ((MessagesController) obj3).lambda$checkChatInviter$374(j10, (ArrayList) obj2, (TLRPC.TL_channels_channelParticipant) obj);
                break;
            case 20:
                ((MessagesController) obj3).lambda$addUserToChat$300((Utilities.Callback) obj, (TLRPC.TL_messages_invitedUsers) obj2, j10);
                break;
            case 21:
                ((MessagesController) obj3).lambda$reloadMessages$73(j10, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 22:
                ((MessagesStorage) obj3).lambda$deleteUserChatHistory$85((ArrayList) obj2, j10, (ArrayList) obj);
                break;
            case 23:
                ((MessagesStorage) obj3).lambda$updateMessagePollResults$101(j10, (TLRPC.Poll) obj2, (TLRPC.PollResults) obj);
                break;
            case 24:
                ((MessagesStorage) obj3).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj2, (TLRPC.TL_messageReactions) obj, j10);
                break;
            case 25:
                ((MessagesStorage) obj3).lambda$getUserSync$258((TLRPC.User[]) obj2, j10, (CountDownLatch) obj);
                break;
            case 26:
                ((MessagesStorage) obj3).lambda$containsLocalDialog$179(j10, (Boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 27:
                ((MessagesStorage) obj3).lambda$getChannelPtsSync$257(j10, (Integer[]) obj2, (CountDownLatch) obj);
                break;
            case 28:
                ((MessagesStorage) obj3).lambda$getChatSync$259((TLRPC.Chat[]) obj2, j10, (CountDownLatch) obj);
                break;
            default:
                ((MessagesStorage) obj3).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j10);
                break;
        }
    }

    public /* synthetic */ c2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
        this.e = obj3;
    }

    public /* synthetic */ c2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ c2(s7 s7Var, Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = s7Var;
        this.b = obj;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ c2(s7 s7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.a = 5;
        this.d = s7Var;
        this.e = callback;
        this.b = starGift;
        this.c = j10;
    }

    public /* synthetic */ c2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.a = 20;
        this.b = messagesController;
        this.e = callback;
        this.d = tL_messages_invitedUsers;
        this.c = j10;
    }
}
