package mh;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ka0;
import org.telegram.ui.py;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c3;
        boolean z4;
        int i10;
        boolean z10;
        boolean z11;
        int i11 = this.a;
        TL_stories.StoryItem storyItem = null;
        int i12 = 0;
        long j10 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                g5 g5Var = (g5) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (!((t7) obj2).e) {
                    ic Q = g5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    g5Var.v1(j10, callback);
                    break;
                }
            case 1:
                g5.d0((g5) obj3, j10, (TL_stars.TL_starGiftUnique) obj2, (py) obj);
                break;
            case 2:
                g5 g5Var2 = (g5) obj3;
                g5Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                g5Var2.g0.setLoading(false);
                g5Var2.v1(j10, (Utilities.Callback) obj);
                break;
            case 3:
                ((t7) obj2).d0((MessageObject) obj, ((l5) obj3).a, this.c, true, true, null);
                break;
            case 4:
                t7 t7Var = (t7) obj2;
                TLObject tLObject = (TLObject) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    t7Var.getClass();
                    callback2.run(null);
                    break;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    t7Var.M.put(Long.valueOf(j10), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    break;
                }
            case 5:
                t7 t7Var2 = (t7) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                if (!t7Var2.e) {
                    t7.e("NO_BALANCE");
                    callback3.run(null);
                    break;
                } else {
                    t7Var2.H(starGift, this.c, null, true, callback3);
                    break;
                }
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                qc a02 = qc.a0((xn) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j10, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                break;
            case 7:
                ((t7) obj2).h0((LaunchActivity) obj3, j10, (String) obj);
                break;
            case 8:
                oh.t6 t6Var = (oh.t6) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList = t6Var.h;
                ArrayList arrayList2 = t6Var.g;
                int i13 = t6Var.a;
                FileLog.d("StoriesController update stories for dialog " + j10);
                t6Var.n0(j10, Collections.singletonList(tL_updateStory.story), false);
                t6Var.l0(j10, Collections.singletonList(tL_updateStory.story), true);
                a0.h hVar = t6Var.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) hVar.f(j10);
                ArrayList arrayList3 = new ArrayList();
                int i14 = t6Var.u;
                if (peerStories == null) {
                    c3 = 1;
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        if (!oh.m7.w(i13, storyItem2)) {
                            if (j10 > 0 && (user == null || (!user.self && !t6Var.M(user)))) {
                                FileLog.d("StoriesController can't add user cause is not contact");
                                break;
                            } else {
                                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                                tL_peerStories.peer = tL_updateStory.peer;
                                tL_peerStories.stories.add(tL_updateStory.story);
                                l.d.t(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                                long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                                t6Var.b0(peerDialogId, tL_peerStories);
                                if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                                    TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
                                    t6Var.g(tL_peerStories);
                                    if (user2 != null && !user2.stories_hidden) {
                                        t6Var.X(tL_peerStories);
                                    }
                                }
                                FileLog.d("StoriesController applyNewStories " + peerDialogId);
                                t6Var.n0(peerDialogId, tL_peerStories.stories, false);
                                t6Var.u = t6Var.u + 1;
                                t6Var.O(j10);
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
                            z10 = false;
                        } else if (peerStories.stories.get(i15).id != storyItem3.id) {
                            i15++;
                        } else if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i15);
                            l.d.t(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                            z10 = true;
                            z11 = true;
                        } else {
                            TL_stories.StoryItem storyItem4 = peerStories.stories.get(i15);
                            storyItem3 = oh.t6.f(storyItem4, storyItem3);
                            arrayList3.add(storyItem3);
                            peerStories.stories.set(i15, storyItem3);
                            if (storyItem3.attachPath == null) {
                                storyItem3.attachPath = storyItem4.attachPath;
                            }
                            if (storyItem3.firstFramePath == null) {
                                storyItem3.firstFramePath = storyItem4.firstFramePath;
                            }
                            l.d.t(storyItem3.id, new StringBuilder("StoriesController update story id="));
                            z10 = true;
                        }
                    }
                    z11 = false;
                    if (!z10) {
                        if (!(storyItem3 instanceof TL_stories.TL_storyItemDeleted)) {
                            if (!oh.m7.w(i13, storyItem3)) {
                                if (j10 > 0 && (user == null || (!user.self && !t6Var.M(user)))) {
                                    FileLog.d("StoriesController can't add new story user is not contact");
                                    break;
                                } else {
                                    arrayList3.add(storyItem3);
                                    peerStories.stories.add(storyItem3);
                                    FileLog.d("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                                    t6Var.W(j10, storyItem3);
                                    t6Var.g(peerStories);
                                    z4 = true;
                                    z11 = true;
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
                        z4 = false;
                    }
                    if (z11) {
                        if (!peerStories.stories.isEmpty() || t6Var.K(j10)) {
                            Collections.sort(peerStories.stories, oh.t6.X);
                        } else {
                            arrayList2.remove(peerStories);
                            arrayList.remove(peerStories);
                            hVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            t6Var.u--;
                        }
                    }
                    if (i14 != t6Var.u) {
                        t6Var.l.edit().putInt("total_stores", t6Var.u).apply();
                    }
                    t6Var.v(arrayList2);
                    t6Var.v(arrayList);
                    if (z4) {
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
                z4 = true;
                if (i14 != t6Var.u) {
                }
                t6Var.v(arrayList2);
                t6Var.v(arrayList);
                if (z4) {
                }
                MessagesController.getInstance(i13).checkArchiveFolder();
                break;
            case 9:
                TLObject tLObject2 = (TLObject) obj2;
                ka0 ka0Var = (ka0) obj;
                oh.t6 t6Var2 = ((oh.a6) obj3).c;
                int i17 = t6Var2.a;
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
                                    a0.h hVar2 = t6Var2.E;
                                    storyItem = peerStories2.stories.get(i12);
                                    hVar2.k(storyItem, j10);
                                }
                            }
                        }
                    }
                }
                ka0Var.accept(storyItem);
                break;
            case 10:
                TLObject tLObject3 = (TLObject) obj2;
                h5.d dVar = (h5.d) obj;
                oh.t6 t6Var3 = ((oh.b6) obj3).c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(t6Var3.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(t6Var3.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar3 = t6Var3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        hVar3.k(storyItem, j10);
                    }
                }
                dVar.accept(storyItem);
                break;
            case 11:
                long j11 = this.c;
                AndroidUtilities.runOnUIThread(new i5.v((oh.l7) obj3, (View) obj2, j11, 10), 500L);
                ((oh.i7) obj).f(j11);
                break;
            case 12:
                ((ChatMessagesMetadataController) obj3).lambda$loadStoriesForMessages$1((MessageObject) obj2, j10, (TL_stories.StoryItem) obj);
                break;
            case 13:
                ((MediaDataController) obj3).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj2, j10, (ArrayList) obj);
                break;
            case 14:
                ((MediaDataController) obj3).lambda$loadMusic$141(j10, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 15:
                ((MessagesController) obj3).lambda$getGroupCall$62((TLObject) obj2, j10, (Runnable) obj);
                break;
            case 16:
                ((MessagesController) obj3).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj2, (TLRPC.TL_messages_peerDialogs) obj, j10);
                break;
            case 17:
                ((MessagesController) obj3).lambda$updateChannelUserName$291(j10, (String) obj2, (Runnable) obj);
                break;
            case 18:
                ((MessagesController) obj3).lambda$checkChatInviter$374(j10, (ArrayList) obj2, (TLRPC.TL_channels_channelParticipant) obj);
                break;
            case 19:
                ((MessagesController) obj3).lambda$addUserToChat$300((Utilities.Callback) obj, (TLRPC.TL_messages_invitedUsers) obj2, j10);
                break;
            case 20:
                ((MessagesController) obj3).lambda$reloadMessages$73(j10, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 21:
                ((MessagesStorage) obj3).lambda$deleteUserChatHistory$85((ArrayList) obj2, j10, (ArrayList) obj);
                break;
            case 22:
                ((MessagesStorage) obj3).lambda$updateMessagePollResults$101(j10, (TLRPC.Poll) obj2, (TLRPC.PollResults) obj);
                break;
            case 23:
                ((MessagesStorage) obj3).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj2, (TLRPC.TL_messageReactions) obj, j10);
                break;
            case 24:
                ((MessagesStorage) obj3).lambda$getUserSync$258((TLRPC.User[]) obj2, j10, (CountDownLatch) obj);
                break;
            case 25:
                ((MessagesStorage) obj3).lambda$containsLocalDialog$179(j10, (Boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 26:
                ((MessagesStorage) obj3).lambda$getChannelPtsSync$257(j10, (Integer[]) obj2, (CountDownLatch) obj);
                break;
            case 27:
                ((MessagesStorage) obj3).lambda$getChatSync$259((TLRPC.Chat[]) obj2, j10, (CountDownLatch) obj);
                break;
            case 28:
                ((MessagesStorage) obj3).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j10);
                break;
            default:
                ((MessagesStorage) obj3).lambda$getEncryptedChat$177(j10, (ArrayList) obj2, (CountDownLatch) obj);
                break;
        }
    }

    public /* synthetic */ b2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
        this.e = obj3;
    }

    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ b2(t7 t7Var, Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = t7Var;
        this.b = obj;
        this.c = j10;
        this.e = obj2;
    }

    public /* synthetic */ b2(t7 t7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.a = 5;
        this.d = t7Var;
        this.e = callback;
        this.b = starGift;
        this.c = j10;
    }

    public /* synthetic */ b2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.a = 19;
        this.b = messagesController;
        this.e = callback;
        this.d = tL_messages_invitedUsers;
        this.c = j10;
    }
}
