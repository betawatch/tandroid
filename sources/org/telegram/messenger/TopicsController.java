package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class TopicsController extends BaseController {
    public static final int LOAD_TYPE_HASH_CHECK = 3;
    public static final int LOAD_TYPE_LOAD_NEXT = 1;
    public static final int LOAD_TYPE_LOAD_UNKNOWN = 2;
    public static final int LOAD_TYPE_PRELOAD = 0;
    private static final int MAX_PRELOAD_COUNT = 20;
    public static final int TOPIC_FLAG_CLOSE = 8;
    public static final int TOPIC_FLAG_HIDE = 32;
    public static final int TOPIC_FLAG_ICON = 2;
    public static final int TOPIC_FLAG_PIN = 4;
    public static final int TOPIC_FLAG_TITLE = 1;
    public static final int TOPIC_FLAG_TOTAL_MESSAGES_COUNT = 16;
    private static final int[] countsTmp = new int[5];
    LongSparseIntArray currentOpenTopicsCounter;
    LongSparseIntArray endIsReached;
    a0.h offsets;
    LongSparseIntArray openedTopicsByChatId;
    a0.h topicsByChatId;
    a0.h topicsByTopMsgId;
    LongSparseIntArray topicsIsLoading;
    a0.h topicsMapByChatId;

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public static class TopicUpdate {
        boolean checkForDelete;
        long dialogId;
        ArrayList<MessageObject> groupedMessages;
        boolean onlyCounters;
        boolean reloadTopic;
        TLRPC.Message topMessage;
        int topMessageId;
        long topicId;
        public int totalMessagesCount = -1;
        int unreadCount;
        int unreadMentions;
    }

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public class TopicsLoadOffset {
        int lastMessageDate;
        int lastMessageId;
        long lastTopicId;

        private TopicsLoadOffset() {
        }
    }

    public TopicsController(int i10) {
        super(i10);
        this.topicsByChatId = new a0.h();
        this.topicsMapByChatId = new a0.h();
        this.topicsIsLoading = new LongSparseIntArray();
        this.endIsReached = new LongSparseIntArray();
        this.topicsByTopMsgId = new a0.h();
        this.currentOpenTopicsCounter = new LongSparseIntArray();
        this.openedTopicsByChatId = new LongSparseIntArray();
        this.offsets = new a0.h();
    }

    public static long calculateHashSavedDialogs(ArrayList<TLRPC.TL_forumTopic> arrayList, int i10, int i11) {
        int i12;
        if (arrayList == null || arrayList.size() < (i12 = i11 + i10)) {
            return 0L;
        }
        long j10 = 0;
        while (i10 < i12) {
            TLRPC.TL_forumTopic tL_forumTopic = arrayList.get(i10);
            TLRPC.Message message = tL_forumTopic.topMessage;
            if (message == null || message.id != tL_forumTopic.top_message) {
                return 0L;
            }
            j10 = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(j10, tL_forumTopic.pinned ? 1L : 0L), Math.abs(DialogObject.getPeerDialogId(tL_forumTopic.from_id))), tL_forumTopic.top_message), (message.flags & 32768) != 0 ? message.edit_date : message.date);
            i10++;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteTopic(final long j10, final int i10, int i11) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j11 = -j10;
        tL_messages_deleteTopicHistory.peer = getMessagesController().getInputPeer(j11);
        tL_messages_deleteTopicHistory.top_msg_id = i10;
        if (i11 == 0) {
            getMessagesStorage().removeTopic(j11, i10);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new RequestDelegate() { // from class: org.telegram.messenger.TopicsController.1
            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    TopicsController.this.getMessagesController().processNewChannelDifferenceParams(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, j10);
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        TopicsController.this.deleteTopic(j10, i10, i12);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyPinnedOrder$17() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_SELECT_DIALOG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$databaseCleared$25() {
        this.topicsByChatId.b();
        this.topicsMapByChatId.b();
        this.endIsReached.clear();
        SharedPreferences.Editor edit = getUserConfig().getPreferences().edit();
        for (String str : getUserConfig().getPreferences().getAll().keySet()) {
            if (str.startsWith("topics_load_offset_message_id_")) {
                edit.remove(str);
            }
            if (str.startsWith("topics_load_offset_date_")) {
                edit.remove(str);
            }
            if (str.startsWith("topics_load_offset_topic_id_")) {
                edit.remove(str);
            }
            if (str.startsWith("topics_end_reached_")) {
                edit.remove(str);
            }
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTopicRepliesCount$29(TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_forumTopic.totalMessagesCount = messages_messages.count;
            getMessagesStorage().updateTopicData(j10, tL_forumTopic, 16);
            if (messages_messages.count == 0 && getMessagesController().isMonoForum(j10)) {
                getMessagesStorage().removeTopic(j10, j11);
                onTopicsDeletedServerSide(-j10, j11);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(-j10), Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTopicRepliesCount$30(TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new hg.s0(this, tLObject, tL_forumTopic, j10, j11, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopic$27(long j10, ArrayList arrayList, long j11, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            l.d.t(arrayList == null ? 0 : arrayList.size(), android.support.v4.media.a.s(j10, "loaded from cache ", " topics_count="));
        }
        processTopics(j10, arrayList, null, true, 0, -1);
        sortTopics(j10);
        if (findTopic(j10, j11) != null) {
            runnable.run();
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = new ArrayList<>();
        new TLRPC.TL_forumTopic().id = (int) j11;
        reloadTopics(j10, arrayList2, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopic$28(long j10, long j11, Runnable runnable, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new hg.s0(j10, j11, runnable, arrayList, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$0(long j10, ArrayList arrayList, boolean z4, int i10) {
        if (BuildVars.LOGS_ENABLED) {
            l.d.t(arrayList == null ? 0 : arrayList.size(), android.support.v4.media.a.s(j10, "loaded from cache ", " topics_count="));
        }
        this.topicsIsLoading.put(j10, 0);
        processTopics(j10, arrayList, null, z4, i10, -1);
        sortTopics(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$1(long j10, boolean z4, int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new hg(this, j10, arrayList, z4, i10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$2(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, a0.h hVar, int i10) {
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        this.topicsIsLoading.put(j10, 0);
        processTopics(j10, bg.e.l(tL_messages_savedDialogs.dialogs), hVar, false, i10, tL_messages_savedDialogs.dialogs.size());
        sortTopics(j10);
        getMessagesStorage().saveTopics(-j10, (List) this.topicsByChatId.f(j10), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) l.d.i(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_monoForumDialog.top_message);
            saveLoadOffset(j10, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j10) == null || getTopics(j10).size() < tL_messages_savedDialogs.dialogs.size()) {
            clearLoadingOffset(j10);
            loadTopics(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$3(TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice, long j10, a0.h hVar, int i10) {
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogsSlice.users, false);
        getMessagesController().putChats(tL_messages_savedDialogsSlice.chats, false);
        this.topicsIsLoading.put(j10, 0);
        processTopics(j10, bg.e.l(tL_messages_savedDialogsSlice.dialogs), hVar, false, i10, tL_messages_savedDialogsSlice.count);
        sortTopics(j10);
        getMessagesStorage().saveTopics(-j10, (List) this.topicsByChatId.f(j10), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) l.d.i(1, tL_messages_savedDialogsSlice.dialogs);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_monoForumDialog.top_message);
            saveLoadOffset(j10, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j10) == null || getTopics(j10).size() < tL_messages_savedDialogsSlice.count) {
            clearLoadingOffset(j10);
            loadTopics(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$4(long j10, TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified) {
        this.topicsIsLoading.put(j10, 0);
        if ((getTopics(j10) != null ? r0.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
            this.endIsReached.put(j10, 1);
            getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j10, true).apply();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j10), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$5(TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, int i10) {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesStorage().putUsersAndChats(tL_messages_forumTopics2.users, tL_messages_forumTopics2.chats, true, true);
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        this.topicsIsLoading.put(j10, 0);
        processTopics(j10, tL_messages_forumTopics.topics, hVar, false, i10, tL_messages_forumTopics2.count);
        sortTopics(j10);
        getMessagesStorage().saveTopics(-j10, (List) this.topicsByChatId.f(j10), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_forumTopics.topics.isEmpty() && i10 == 1) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.d.i(1, tL_messages_forumTopics.topics);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
            saveLoadOffset(j10, tL_forumTopic.top_message, message == null ? 0 : message.date, tL_forumTopic.id);
        } else if (getTopics(j10) == null || getTopics(j10).size() < tL_messages_forumTopics.count) {
            clearLoadingOffset(j10);
            loadTopics(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$6(long j10) {
        this.topicsIsLoading.put(j10, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j10), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$7(long j10, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        a0.h hVar = new a0.h();
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            for (int i11 = 0; i11 < tL_messages_savedDialogs.messages.size(); i11++) {
                hVar.k(tL_messages_savedDialogs.messages.get(i11), tL_messages_savedDialogs.messages.get(i11).id);
            }
            AndroidUtilities.runOnUIThread(new lh.x(this, tL_messages_savedDialogs, j10, hVar, i10, 10));
            return;
        }
        int i12 = 0;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            while (i12 < tL_messages_savedDialogsSlice.messages.size()) {
                hVar.k(tL_messages_savedDialogsSlice.messages.get(i12), tL_messages_savedDialogsSlice.messages.get(i12).id);
                i12++;
            }
            AndroidUtilities.runOnUIThread(new lh.x(this, tL_messages_savedDialogsSlice, j10, hVar, i10, 11));
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            AndroidUtilities.runOnUIThread(new d4(this, j10, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 28));
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
            AndroidUtilities.runOnUIThread(new vk(this, j10, 0));
            return;
        }
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
        while (i12 < tL_messages_forumTopics.messages.size()) {
            hVar.k(tL_messages_forumTopics.messages.get(i12), tL_messages_forumTopics.messages.get(i12).id);
            i12++;
        }
        AndroidUtilities.runOnUIThread(new mh.u6(this, tL_messages_forumTopics, j10, tL_messages_forumTopics, hVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTopicsDeletedServerSide$23(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(i10);
            long j10 = -topicKey.dialogId;
            a0.h hVar = (a0.h) this.topicsMapByChatId.f(j10);
            if (hVar != null) {
                hVar.l(topicKey.topicId);
            }
            ArrayList arrayList2 = (ArrayList) this.topicsByChatId.f(j10);
            if (arrayList2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    if ((getMessagesController().isMonoForum(topicKey.dialogId) ? DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList2.get(i11)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i11)).id) == topicKey.topicId) {
                        arrayList2.remove(i11);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogDeleted, Long.valueOf(-j10), Long.valueOf(topicKey.topicId));
                        hashSet.add(Long.valueOf(j10));
                        break;
                    }
                    i11++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$pinTopic$19(org.telegram.ui.ActionBar.p2 p2Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getContext());
        String string = LocaleController.getString(R.string.LimitReached);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString(R.string.LimitReachedPinnedTopics, Integer.valueOf(MessagesController.getInstance(this.currentAccount).topicsPinnedLimit));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        p2Var.showDialog(d2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pinTopic$20(org.telegram.ui.ActionBar.p2 p2Var, long j10, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (!"PINNED_TOO_MUCH".equals(tL_error.text)) {
                if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                    reloadTopics(j10, false);
                }
            } else {
                if (p2Var == null) {
                    return;
                }
                applyPinnedOrder(j10, arrayList);
                AndroidUtilities.runOnUIThread(new yg(12, this, p2Var));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processTopics$8(long j10) {
        loadTopics(j10, false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUpdate$22(List list) {
        HashSet hashSet = new HashSet();
        a0.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            TopicUpdate topicUpdate = (TopicUpdate) list.get(i10);
            if (topicUpdate.reloadTopic) {
                if (hVar == null) {
                    hVar = new a0.h();
                }
                ArrayList arrayList = (ArrayList) hVar.f(topicUpdate.dialogId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hVar.k(arrayList, topicUpdate.dialogId);
                }
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                if (ChatObject.isMonoForum(this.currentAccount, topicUpdate.dialogId)) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_forumTopic.from_id = tL_peerUser;
                    tL_peerUser.user_id = topicUpdate.topicId;
                } else {
                    tL_forumTopic.id = (int) topicUpdate.topicId;
                }
                arrayList.add(tL_forumTopic);
            } else {
                TLRPC.TL_forumTopic findTopic = findTopic(-topicUpdate.dialogId, topicUpdate.topicId);
                if (findTopic != null) {
                    if (topicUpdate.onlyCounters) {
                        int i11 = topicUpdate.unreadCount;
                        if (i11 >= 0) {
                            findTopic.unread_count = i11;
                        }
                        int i12 = topicUpdate.unreadMentions;
                        if (i12 >= 0) {
                            findTopic.unread_mentions_count = i12;
                        }
                    } else {
                        this.topicsByTopMsgId.l(messageHash(findTopic.top_message, -topicUpdate.dialogId));
                        findTopic.topMessage = topicUpdate.topMessage;
                        findTopic.groupedMessages = topicUpdate.groupedMessages;
                        int i13 = topicUpdate.topMessageId;
                        findTopic.top_message = i13;
                        findTopic.unread_count = topicUpdate.unreadCount;
                        findTopic.unread_mentions_count = topicUpdate.unreadMentions;
                        this.topicsByTopMsgId.k(findTopic, messageHash(i13, -topicUpdate.dialogId));
                    }
                    int i14 = topicUpdate.totalMessagesCount;
                    if (i14 > 0) {
                        findTopic.totalMessagesCount = i14;
                    }
                    hashSet.add(Long.valueOf(-topicUpdate.dialogId));
                }
                if (findTopic != null && topicUpdate.checkForDelete) {
                    findTopic.totalMessagesCount = 0;
                    getTopicRepliesCount(topicUpdate.dialogId, topicUpdate.topicId);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
        if (hVar != null) {
            for (int i15 = 0; i15 < hVar.m(); i15++) {
                reloadTopics(-hVar.j(i15), (ArrayList) hVar.n(i15), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$13(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        int i10 = 0;
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        processTopics(j10, arrayList, hVar, false, 2, -1);
        long j11 = -j10;
        getMessagesStorage().saveTopics(j11, (List) this.topicsByChatId.f(j10), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hashSet.remove(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) obj).from_id)));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            getMessagesStorage().removeTopic(j11, longValue);
            onTopicsDeletedServerSide(j10, longValue);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$14(TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        processTopics(j10, tL_messages_forumTopics.topics, hVar, false, 2, -1);
        getMessagesStorage().saveTopics(-j10, (List) this.topicsByChatId.f(j10), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$15(TLObject tLObject, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        int i10 = 0;
        if (tLObject != null && z4) {
            a0.h hVar = new a0.h();
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            ArrayList l10 = bg.e.l(tL_messages_savedDialogs.dialogs);
            while (i10 < tL_messages_savedDialogs.messages.size()) {
                hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).id);
                i10++;
            }
            AndroidUtilities.runOnUIThread(new o8(this, tL_messages_savedDialogs, j10, l10, hVar, hashSet, runnable));
            return;
        }
        if (tLObject != null) {
            a0.h hVar2 = new a0.h();
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            while (i10 < tL_messages_forumTopics.messages.size()) {
                hVar2.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).id);
                i10++;
            }
            AndroidUtilities.runOnUIThread(new gl(this, tLObject, j10, tL_messages_forumTopics, hVar2, runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$16(boolean z4, long j10, HashSet hashSet, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new nd(this, tLObject, z4, j10, hashSet, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$24(long j10, boolean z4) {
        getUserConfig().getPreferences().edit().remove("topics_end_reached_" + j10).apply();
        this.topicsByChatId.l(j10);
        this.topicsMapByChatId.l(j10);
        this.endIsReached.delete(j10);
        clearLoadingOffset(j10);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (chat != null && (chat.forum || chat.monoforum)) {
            loadTopics(j10, z4, 0);
        }
        sortTopics(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortTopics$9(TLRPC.TL_forumTopic tL_forumTopic, TLRPC.TL_forumTopic tL_forumTopic2) {
        boolean z4 = tL_forumTopic.hidden;
        if (z4 != tL_forumTopic2.hidden) {
            return z4 ? -1 : 1;
        }
        boolean z10 = tL_forumTopic.pinned;
        boolean z11 = tL_forumTopic2.pinned;
        if (z10 != z11) {
            return z10 ? -1 : 1;
        }
        if (z10 && z11) {
            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
        }
        TLRPC.Message message = tL_forumTopic2.topMessage;
        int i10 = message != null ? message.date : 0;
        TLRPC.Message message2 = tL_forumTopic.topMessage;
        return i10 - (message2 != null ? message2.date : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleViewForumAsMessages$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMentionsUnread$21(long j10, long j11, int i10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic findTopic = findTopic(j12, j11);
        if (findTopic != null) {
            findTopic.unread_mentions_count = i10;
            sortTopics(j12, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateReadOutbox$26(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        for (MessagesStorage.TopicKey topicKey : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(topicKey)).intValue();
            TLRPC.TL_forumTopic findTopic = findTopic(-topicKey.dialogId, topicKey.topicId);
            if (findTopic != null) {
                findTopic.read_outbox_max_id = Math.max(findTopic.read_outbox_max_id, intValue);
                hashSet.add(Long.valueOf(-topicKey.dialogId));
                TLRPC.Message message = findTopic.topMessage;
                if (message != null && findTopic.read_outbox_max_id >= message.id) {
                    message.unread = false;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, (Long) it.next(), Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTopicsWithDeletedMessages$10(ArrayList arrayList, long j10) {
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = null;
        boolean z4 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i10);
            a0.h hVar = (a0.h) this.topicsMapByChatId.f(j10);
            if (hVar != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar.f(tL_forumTopic.id);
                if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                    this.topicsByTopMsgId.l(messageHash(tL_forumTopic2.top_message, j10));
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    int i11 = message.id;
                    tL_forumTopic2.top_message = i11;
                    tL_forumTopic2.topMessage = message;
                    tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                    this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(i11, j10));
                    z4 = true;
                } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(tL_forumTopic);
                }
            }
        }
        if (z4) {
            sortTopics(j10);
        }
        if (arrayList2 != null) {
            reloadTopics(j10, arrayList2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$updateTopicsWithDeletedMessages$11(long j10, ArrayList arrayList, boolean z4, long j11) {
        Exception exc;
        ArrayList<TLRPC.TL_forumTopic> arrayList2;
        NativeByteBuffer byteBufferValue;
        ArrayList<TLRPC.TL_forumTopic> arrayList3 = null;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT topic_id, top_message FROM topics WHERE did = " + j10 + " AND top_message IN (" + TextUtils.join(",", arrayList) + ")", new Object[0]);
            ArrayList<TLRPC.TL_forumTopic> arrayList4 = null;
            while (queryFinalized.next()) {
                try {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                    tL_forumTopic.id = queryFinalized.intValue(0);
                    tL_forumTopic.top_message = queryFinalized.intValue(1);
                    if (z4) {
                        tL_forumTopic.from_id = getMessagesController().getPeer(tL_forumTopic.id);
                    } else {
                        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().getClientUserId());
                    }
                    tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                    arrayList4.add(tL_forumTopic);
                } catch (Exception e6) {
                    exc = e6;
                    arrayList3 = arrayList4;
                    exc.printStackTrace();
                    arrayList2 = arrayList3;
                    getMessagesStorage().loadGroupedMessagesForTopics(j10, arrayList2);
                    if (arrayList2 == null) {
                    }
                }
            }
            queryFinalized.dispose();
            if (arrayList4 != null) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic2 = arrayList4.get(i10);
                    SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized2 = database2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j10 + " AND topic_id = " + tL_forumTopic2.id + " ORDER BY mid DESC LIMIT 1", new Object[0]);
                    if (queryFinalized2.next() && (byteBufferValue = queryFinalized2.byteBufferValue(1)) != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                        byteBufferValue.reuse();
                        this.topicsByTopMsgId.l(messageHash(tL_forumTopic2.top_message, j11));
                        int i11 = TLdeserialize.id;
                        tL_forumTopic2.top_message = i11;
                        tL_forumTopic2.topMessage = TLdeserialize;
                        tL_forumTopic2.groupedMessages = null;
                        this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(i11, j11));
                    }
                    queryFinalized2.dispose();
                }
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                    Locale locale3 = Locale.US;
                    database3.executeFast("UPDATE topics SET top_message = " + arrayList4.get(i12).top_message + " WHERE did = " + j10 + " AND topic_id = " + arrayList4.get(i12).id).stepThis().dispose();
                }
            }
            arrayList2 = arrayList4;
        } catch (Exception e10) {
            exc = e10;
        }
        getMessagesStorage().loadGroupedMessagesForTopics(j10, arrayList2);
        if (arrayList2 == null) {
            AndroidUtilities.runOnUIThread(new d4(this, arrayList2, j11, 29));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTopicsWithDeletedMessages$12(long j10, ArrayList arrayList, boolean z4, long j11) {
        getMessagesStorage().getStorageQueue().postRunnable(new uk(this, j10, arrayList, z4, j11, 0));
    }

    private long messageHash(int i10, long j10) {
        return j10 + (i10 << 12);
    }

    private void sortTopics(long j10) {
        sortTopics(j10, true);
    }

    public void applyPinnedOrder(long j10, ArrayList<Integer> arrayList) {
        applyPinnedOrder(j10, arrayList, true);
    }

    public void clearLoadingOffset(long j10) {
        this.offsets.l(j10);
    }

    public void databaseCleared() {
        AndroidUtilities.runOnUIThread(new wk(this, 1));
    }

    public void deleteTopics(long j10, ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = (ArrayList) this.topicsByChatId.f(j10);
        a0.h hVar = (a0.h) this.topicsMapByChatId.f(j10);
        if (hVar != null && arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long intValue = arrayList.get(i10).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.topicsByTopMsgId.l(messageHash(tL_forumTopic.top_message, j10));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            sortTopics(j10);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            deleteTopic(j10, arrayList.get(i11).intValue(), 0);
        }
    }

    public boolean endIsReached(long j10) {
        return this.endIsReached.get(j10, 0) == 1;
    }

    public TLRPC.TL_forumTopic findTopic(long j10, long j11) {
        a0.h hVar = (a0.h) this.topicsMapByChatId.f(j10);
        if (hVar == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(j11);
        if (tL_forumTopic != null || !getMessagesController().isMonoForum(-j10)) {
            return tL_forumTopic;
        }
        int i10 = bg.e.a;
        return (TLRPC.TL_forumTopic) hVar.f((int) ((j11 >>> 32) ^ j11));
    }

    public ArrayList<Integer> getCurrentPinnedOrder(long j10) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j10);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
        }
        return arrayList;
    }

    public int[] getForumUnreadCount(long j10) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j10);
        Arrays.fill(countsTmp, 0);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i10);
                int[] iArr = countsTmp;
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
        return countsTmp;
    }

    public TopicsLoadOffset getLoadOffset(long j10) {
        TopicsLoadOffset topicsLoadOffset = (TopicsLoadOffset) this.offsets.f(j10);
        return topicsLoadOffset != null ? topicsLoadOffset : new TopicsLoadOffset();
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint) {
        return getTopicIconName(chat, messageObject, textPaint, null);
    }

    public String getTopicName(TLRPC.Chat chat, MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i10 = messageReplyHeader.reply_to_top_id;
        if (i10 == 0) {
            i10 = messageReplyHeader.reply_to_msg_id;
        }
        return (i10 == 0 || (findTopic = findTopic(chat.id, (long) i10)) == null) ? "" : findTopic.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getTopicRepliesCount(long j10, long j11) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic findTopic = findTopic(-j10, j11);
        if (findTopic == null || findTopic.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().isMonoForum(j10)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().getInputPeer(j11);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().getInputPeer(j10);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().getInputPeer(j10);
            tL_messages_getReplies2.msg_id = (int) j11;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new mh.a2(this, findTopic, j10, j11, 4));
    }

    public ArrayList<TLRPC.TL_forumTopic> getTopics(long j10) {
        return (ArrayList) this.topicsByChatId.f(j10);
    }

    public int getTopicsCount(long j10) {
        ArrayList<TLRPC.TL_forumTopic> topics;
        if (!endIsReached(j10) || (topics = getTopics(j10)) == null) {
            return 0;
        }
        return topics.size();
    }

    public boolean isLoading(long j10) {
        return this.topicsIsLoading.get(j10, 0) == 1 && (this.topicsByChatId.f(j10) == null || ((ArrayList) this.topicsByChatId.f(j10)).isEmpty());
    }

    public void loadTopic(final long j10, final long j11, final Runnable runnable) {
        getMessagesStorage().loadTopics(-j10, new Consumer() { // from class: org.telegram.messenger.yk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                long j12 = j10;
                long j13 = j11;
                TopicsController.this.lambda$loadTopic$28(j12, j13, runnable, (ArrayList) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        });
    }

    public void loadTopics(long j10) {
        loadTopics(j10, false, 1);
    }

    public void markAllPollVotesAsRead(long j10, long j11) {
        TLRPC.TL_forumTopic findTopic = findTopic(j10, j11);
        if (findTopic == null || findTopic.unread_poll_votes_count <= 0) {
            return;
        }
        findTopic.unread_poll_votes_count = 0;
        sortTopics(j10);
    }

    public void markAllReactionsAsRead(long j10, long j11) {
        TLRPC.TL_forumTopic findTopic = findTopic(j10, j11);
        if (findTopic == null || findTopic.unread_reactions_count <= 0) {
            return;
        }
        findTopic.unread_reactions_count = 0;
        sortTopics(j10);
    }

    public void onTopicCreated(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        long j11 = -j10;
        a0.h hVar = (a0.h) this.topicsMapByChatId.f(j11);
        if (findTopic(j11, tL_forumTopic.id) != null) {
            return;
        }
        if (hVar == null) {
            hVar = new a0.h();
            this.topicsMapByChatId.k(hVar, j11);
        }
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j11);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.topicsByChatId.k(arrayList, j11);
        }
        hVar.k(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z4) {
            getMessagesStorage().saveTopics(j10, Collections.singletonList(tL_forumTopic), false, true, getConnectionsManager().getCurrentTime());
        }
        sortTopics(j11, true);
    }

    public void onTopicEdited(long j10, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesStorage().updateTopicData(j10, tL_forumTopic, 35);
        sortTopics(-j10);
    }

    public void onTopicFragmentPause(long j10) {
        int i10 = this.openedTopicsByChatId.get(j10, 0) - 1;
        this.openedTopicsByChatId.put(j10, i10 >= 0 ? i10 : 0);
    }

    public void onTopicFragmentResume(long j10) {
        this.openedTopicsByChatId.put(j10, this.openedTopicsByChatId.get(j10, 0) + 1);
        sortTopics(j10);
    }

    public void onTopicsDeletedServerSide(long j10, long j11) {
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>(1);
        arrayList.add(MessagesStorage.TopicKey.of(-j10, j11));
        onTopicsDeletedServerSide(arrayList);
    }

    public void pinTopic(long j10, int i10, boolean z4, org.telegram.ui.ActionBar.p2 p2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().getInputPeer(-j10);
        tL_messages_updatePinnedForumTopic.topic_id = i10;
        tL_messages_updatePinnedForumTopic.pinned = z4;
        ArrayList<Integer> currentPinnedOrder = getCurrentPinnedOrder(j10);
        ArrayList<Integer> arrayList = new ArrayList<>(currentPinnedOrder);
        arrayList.remove(Integer.valueOf(i10));
        if (z4) {
            arrayList.add(0, Integer.valueOf(i10));
        }
        applyPinnedOrder(j10, arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new mh.u(this, p2Var, j10, currentPinnedOrder, 6));
    }

    public void preloadTopics(long j10) {
        loadTopics(j10, true, 0);
    }

    public void processEditedMessage(TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.f(messageHash(message.id, -message.dialog_id));
        if (tL_forumTopic != null) {
            tL_forumTopic.topMessage = message;
            sortTopics(-message.dialog_id, true);
        }
    }

    public void processEditedMessages(a0.h hVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ArrayList arrayList = (ArrayList) hVar.n(i10);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.f(messageHash(((MessageObject) arrayList.get(i11)).getId(), -((MessageObject) arrayList.get(i11)).getDialogId()));
                if (tL_forumTopic != null) {
                    tL_forumTopic.topMessage = ((MessageObject) arrayList.get(i11)).messageOwner;
                    hashSet.add(Long.valueOf(-((MessageObject) arrayList.get(i11)).getDialogId()));
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0206, code lost:
    
        if (r28 != 3) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processTopics(long j10, ArrayList<TLRPC.TL_forumTopic> arrayList, a0.h hVar, boolean z4, int i10, int i11) {
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.TL_forumTopic> arrayList3;
        boolean z10;
        ?? r32;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        ArrayList<TLRPC.TL_forumTopic> arrayList4 = arrayList;
        a0.h hVar2 = hVar;
        if (i10 == 3 && getMessagesController().isMonoForum(-j10)) {
            getUserConfig().getPreferences().edit().remove("topics_end_reached_" + j10).apply();
            this.topicsByChatId.l(j10);
            this.topicsMapByChatId.l(j10);
            this.endIsReached.delete(j10);
            clearLoadingOffset(j10);
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("processTopics=new_topics_size=");
            sb.append(arrayList4 == null ? 0 : arrayList4.size());
            sb.append(" fromCache=");
            sb.append(z4);
            sb.append(" load_type=");
            sb.append(i10);
            sb.append(" totalCount=");
            sb.append(i11);
            FileLog.d(sb.toString());
        }
        ArrayList arrayList5 = (ArrayList) this.topicsByChatId.f(j10);
        a0.h hVar3 = (a0.h) this.topicsMapByChatId.f(j10);
        if (arrayList5 == null) {
            arrayList5 = new ArrayList();
            this.topicsByChatId.k(arrayList5, j10);
        }
        if (hVar3 == null) {
            hVar3 = new a0.h();
            this.topicsMapByChatId.k(hVar3, j10);
        }
        if (arrayList4 != null) {
            int i13 = 0;
            ArrayList<Long> arrayList6 = null;
            ArrayList<TLRPC.TL_forumTopic> arrayList7 = null;
            z10 = false;
            while (i13 < arrayList4.size()) {
                TLRPC.TL_forumTopic tL_forumTopic2 = arrayList4.get(i13);
                if (tL_forumTopic2 instanceof TLRPC.TL_forumTopicDeleted) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList<>();
                    }
                    ArrayList<Long> arrayList8 = arrayList6;
                    i12 = i13;
                    arrayList8.add(Long.valueOf(tL_forumTopic2.id));
                    arrayList6 = arrayList8;
                } else {
                    i12 = i13;
                    if (!hVar3.d(tL_forumTopic2.id)) {
                        if (hVar2 != null) {
                            tL_forumTopic2.topMessage = (TLRPC.Message) hVar2.f(tL_forumTopic2.top_message);
                            tL_forumTopic2.topicStartMessage = (TLRPC.Message) hVar2.f(tL_forumTopic2.id);
                        }
                        if (tL_forumTopic2.topMessage == null && !tL_forumTopic2.isShort) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList<>();
                            }
                            ArrayList<TLRPC.TL_forumTopic> arrayList9 = arrayList7;
                            arrayList9.add(tL_forumTopic2);
                            arrayList7 = arrayList9;
                        }
                        if (tL_forumTopic2.topicStartMessage == null) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_forumTopic2.topicStartMessage = tL_message;
                            tL_message.message = "";
                            tL_message.id = tL_forumTopic2.id;
                            tL_message.peer_id = getMessagesController().getPeer(-j10);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList5.add(tL_forumTopic2);
                        hVar3.k(tL_forumTopic2, tL_forumTopic2.id);
                        this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(tL_forumTopic2.top_message, j10));
                    } else if (!tL_forumTopic2.isShort && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic2.id)) != null) {
                        boolean z11 = tL_forumTopic.closed;
                        boolean z12 = tL_forumTopic2.closed;
                        if (z11 != z12) {
                            tL_forumTopic.closed = z12;
                            getMessagesStorage().updateTopicData(-j10, tL_forumTopic2, 8);
                        }
                    }
                    z10 = true;
                }
                i13 = i12 + 1;
                arrayList4 = arrayList;
                hVar2 = hVar;
            }
            arrayList2 = arrayList6;
            arrayList3 = arrayList7;
        } else {
            arrayList2 = null;
            arrayList3 = null;
            z10 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) arrayList5.get(i15);
            if (tL_forumTopic3 != null && tL_forumTopic3.pinned) {
                int i16 = i14 + 1;
                if (tL_forumTopic3.pinnedOrder != i14) {
                    tL_forumTopic3.pinnedOrder = i14;
                    i14 = i16;
                    z10 = true;
                } else {
                    i14 = i16;
                }
            }
        }
        if (arrayList2 != null && i10 == 2) {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                int i18 = 0;
                while (true) {
                    if (i18 >= arrayList5.size()) {
                        break;
                    }
                    if (((TLRPC.TL_forumTopic) arrayList5.get(i18)).id == arrayList2.get(i17).longValue()) {
                        arrayList5.remove(i18);
                        break;
                    }
                    i18++;
                }
            }
            getMessagesStorage().removeTopics(j10, arrayList2);
        }
        if (arrayList3 == null || i10 == 2) {
            if (i10 != 0 || z4) {
                r32 = 1;
                r32 = 1;
                if (i10 != 1) {
                }
            } else {
                r32 = 1;
            }
            if (arrayList5.size() >= i11 && i11 >= 0 && !endIsReached(j10)) {
                this.endIsReached.put(j10, r32);
                getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j10, r32).apply();
                z10 = true;
            }
        } else {
            reloadTopics(j10, arrayList3, null);
        }
        if (hVar3.m() > arrayList5.size()) {
            FileLog.e("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(hVar3.m());
            for (int i19 = 0; i19 < hVar3.m(); i19++) {
                hashSet.add(Long.valueOf(hVar3.j(i19)));
            }
            int size = arrayList5.size();
            int i20 = 0;
            while (i20 < size) {
                Object obj = arrayList5.get(i20);
                i20++;
                if (((TLRPC.TL_forumTopic) obj) != null) {
                    hashSet.remove(Long.valueOf(r8.id));
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hVar3.l(((Long) it.next()).longValue());
            }
            z10 = true;
        }
        if (z10) {
            sortTopics(j10, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j10), Boolean.TRUE);
        if ((i10 == 0 || (i10 == 0 && !z4)) && z4 && ((ArrayList) this.topicsByChatId.f(j10)).isEmpty()) {
            AndroidUtilities.runOnUIThread(new vk(this, j10, 1));
        }
    }

    public void processUpdate(List<TopicUpdate> list) {
        AndroidUtilities.runOnUIThread(new yg(11, this, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reloadTopics(long j10, ArrayList<TLRPC.TL_forumTopic> arrayList, Runnable runnable) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j11 = -j10;
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        if (isMonoForum) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i10 < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(arrayList.get(i10).from_id);
                hashSet.add(Long.valueOf(peerDialogId));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().getInputPeer(peerDialogId));
                i10++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().getInputPeer(j11);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i10 < arrayList.size()) {
                i10 = org.telegram.ui.yh.d(arrayList.get(i10).id, i10, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().getInputPeer(j11);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new ra(this, isMonoForum, j10, hashSet, runnable));
    }

    public void reorderPinnedTopics(long j10, ArrayList<Integer> arrayList) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().getInputPeer(-j10);
        if (arrayList != null) {
            tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        }
        tL_messages_reorderPinnedForumTopics.force = true;
        applyPinnedOrder(j10, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public void saveLoadOffset(long j10, int i10, int i11, long j11) {
        TopicsLoadOffset topicsLoadOffset = new TopicsLoadOffset();
        topicsLoadOffset.lastMessageId = i10;
        topicsLoadOffset.lastMessageDate = i11;
        topicsLoadOffset.lastTopicId = j11;
        this.offsets.k(topicsLoadOffset, j10);
    }

    public void saveTopics(long j10) {
        if (((ArrayList) this.topicsByChatId.f(j10)) != null) {
            getMessagesStorage().saveTopics(-j10, (List) this.topicsByChatId.f(j10), true, true, getConnectionsManager().getCurrentTime());
        }
    }

    public void toggleCloseTopic(long j10, int i10, boolean z4) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j11);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z4;
        a0.h hVar = (a0.h) this.topicsMapByChatId.f(j10);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i10)) != null) {
            tL_forumTopic.closed = z4;
            getMessagesStorage().updateTopicData(j11, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new RequestDelegate() { // from class: org.telegram.messenger.TopicsController.2
            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void toggleShowTopic(long j10, int i10, boolean z4) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j11);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z4;
        TLRPC.TL_forumTopic findTopic = findTopic(j10, i10);
        if (findTopic != null) {
            boolean z10 = tL_messages_editForumTopic.hidden;
            findTopic.hidden = z10;
            if (z10) {
                findTopic.closed = true;
            }
            updateTopicInUi(j11, findTopic, 44);
            getMessagesStorage().updateTopicData(j11, findTopic, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public void toggleViewForumAsMessages(long j10, boolean z4) {
        TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
        tL_channels_toggleViewForumAsMessages.channel_id = getMessagesController().getInputChannel(j10);
        tL_channels_toggleViewForumAsMessages.enabled = z4;
        getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new h0(this, 9));
    }

    public void updateMaxReadId(long j10, long j11, int i10, int i11, int i12) {
        TLRPC.TL_forumTopic findTopic = findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.read_inbox_max_id = i10;
            findTopic.unread_count = i11;
            if (i12 >= 0) {
                findTopic.unread_mentions_count = i12;
            }
            sortTopics(j10);
        }
    }

    public void updateMentionsUnread(long j10, long j11, int i10) {
        AndroidUtilities.runOnUIThread(new w7(this, j10, j11, i10, 2));
    }

    public int updatePollVotesUnread(long j10, long j11, int i10, boolean z4) {
        long j12 = -j10;
        TLRPC.TL_forumTopic findTopic = findTopic(j12, j11);
        if (findTopic == null) {
            return -1;
        }
        if (z4) {
            int i11 = findTopic.unread_poll_votes_count + i10;
            findTopic.unread_poll_votes_count = i11;
            if (i11 < 0) {
                findTopic.unread_poll_votes_count = 0;
            }
        } else {
            findTopic.unread_poll_votes_count = i10;
        }
        int i12 = findTopic.unread_poll_votes_count;
        sortTopics(j12, true);
        return i12;
    }

    public int updateReactionsUnread(long j10, long j11, int i10, boolean z4) {
        long j12 = -j10;
        TLRPC.TL_forumTopic findTopic = findTopic(j12, j11);
        if (findTopic == null) {
            return -1;
        }
        if (z4) {
            int i11 = findTopic.unread_reactions_count + i10;
            findTopic.unread_reactions_count = i11;
            if (i11 < 0) {
                findTopic.unread_reactions_count = 0;
            }
        } else {
            findTopic.unread_reactions_count = i10;
        }
        int i12 = findTopic.unread_reactions_count;
        sortTopics(j12, true);
        return i12;
    }

    public void updateReadOutbox(HashMap<MessagesStorage.TopicKey, Integer> hashMap) {
        AndroidUtilities.runOnUIThread(new yg(14, this, hashMap));
    }

    public void updateTopicInUi(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        long j11 = -j10;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, tL_forumTopic.id);
        if (findTopic != null) {
            if ((i10 & 1) != 0) {
                findTopic.title = tL_forumTopic.title;
            }
            if ((i10 & 2) != 0) {
                findTopic.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i10 & 8) != 0) {
                findTopic.closed = tL_forumTopic.closed;
            }
            if ((i10 & 4) != 0) {
                findTopic.pinned = tL_forumTopic.pinned;
            }
            if ((i10 & 32) != 0) {
                findTopic.hidden = tL_forumTopic.hidden;
            }
            sortTopics(j11);
        }
    }

    public void updateTopicsWithDeletedMessages(long j10, ArrayList<Integer> arrayList) {
        if (j10 > 0) {
            return;
        }
        long j11 = -j10;
        AndroidUtilities.runOnUIThread(new uk(this, j10, arrayList, ChatObject.isMonoForum(getMessagesController().getChat(Long.valueOf(j11))), j11, 1));
    }

    public void applyPinnedOrder(long j10, ArrayList<Integer> arrayList, boolean z4) {
        if (arrayList == null) {
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j10);
        boolean z10 = true;
        if (topics != null) {
            boolean z11 = false;
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                    boolean z12 = indexOf >= 0;
                    if (tL_forumTopic.pinned != z12 || (z12 && tL_forumTopic.pinnedOrder != indexOf)) {
                        tL_forumTopic.pinned = z12;
                        tL_forumTopic.pinnedOrder = indexOf;
                        getMessagesStorage().updateTopicData(j10, tL_forumTopic, 4);
                        z11 = true;
                    }
                }
            }
            z10 = z11;
        }
        if (z4 && z10) {
            AndroidUtilities.runOnUIThread(new wk(this, 0));
        }
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic findTopic;
        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i10 = messageReplyHeader.reply_to_top_id;
        if (i10 == 0) {
            i10 = messageReplyHeader.reply_to_msg_id;
        }
        if (i10 == 0 || (findTopic = findTopic(chat.id, i10)) == null) {
            return null;
        }
        return bg.e.j(findTopic, textPaint, drawableArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r8.lastTopicId == 0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.telegram.tgnet.tl.TL_forum$TL_messages_getForumTopics] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.tgnet.TLRPC$TL_messages_getSavedDialogs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadTopics(final long j10, final boolean z4, final int i10) {
        TLObject tL_messages_getForumTopics;
        long j11;
        if (this.topicsIsLoading.get(j10, 0) != 0) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load topics " + j10 + " fromCache=" + z4 + " loadType=" + i10);
        }
        this.topicsIsLoading.put(j10, 1);
        if (z4) {
            getMessagesStorage().loadTopics(-j10, new Consumer() { // from class: org.telegram.messenger.xk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    long j12 = j10;
                    TopicsController.this.lambda$loadTopics$1(j12, z4, i10, (ArrayList) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        long j12 = -j10;
        if (getMessagesController().isMonoForum(j12)) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j12);
            tL_messages_getForumTopics.flags |= 2;
            TopicsLoadOffset loadOffset = getLoadOffset(j10);
            if (i10 != 0 && i10 != 3) {
                j11 = i10 != 1 ? 0L : 0L;
                if (i10 == 1) {
                    tL_messages_getForumTopics.limit = 100;
                    tL_messages_getForumTopics.offset_date = loadOffset.lastMessageDate;
                    tL_messages_getForumTopics.offset_id = loadOffset.lastMessageId;
                    tL_messages_getForumTopics.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(loadOffset.lastTopicId);
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb = new StringBuilder("offset_date=");
                        sb.append(loadOffset.lastMessageDate);
                        sb.append(" offset_id=");
                        sb.append(loadOffset.lastMessageId);
                        sb.append(" offset_topic=");
                        l.d.x(sb, loadOffset.lastTopicId);
                    }
                }
            }
            ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j10);
            tL_messages_getForumTopics.limit = 20;
            tL_messages_getForumTopics.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
            tL_messages_getForumTopics.offset_date = 0;
            tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
            tL_messages_getForumTopics.hash = topics != null ? calculateHashSavedDialogs(topics, 0, Math.min(topics.size(), 20)) : j11;
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().getInputPeer(j12);
            if (i10 == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i10 == 1) {
                tL_messages_getForumTopics.limit = 100;
                TopicsLoadOffset loadOffset2 = getLoadOffset(j10);
                tL_messages_getForumTopics.offset_date = loadOffset2.lastMessageDate;
                tL_messages_getForumTopics.offset_id = loadOffset2.lastMessageId;
                tL_messages_getForumTopics.offset_topic = (int) loadOffset2.lastTopicId;
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb2 = new StringBuilder("offset_date=");
                    sb2.append(loadOffset2.lastMessageDate);
                    sb2.append(" offset_id=");
                    sb2.append(loadOffset2.lastMessageId);
                    sb2.append(" offset_topic=");
                    l.d.x(sb2, loadOffset2.lastTopicId);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new he(this, j10, i10, 1));
    }

    public void sortTopics(long j10, boolean z4) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j10);
        if (arrayList != null) {
            if (this.openedTopicsByChatId.get(j10, 0) > 0) {
                Collections.sort(arrayList, new ei(4));
            }
            if (z4) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j10), Boolean.TRUE);
            }
        }
    }

    public void onTopicsDeletedServerSide(ArrayList<MessagesStorage.TopicKey> arrayList) {
        AndroidUtilities.runOnUIThread(new yg(13, this, arrayList));
    }

    public void markAllPollVotesAsRead(long j10) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j10);
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_poll_votes_count = 0;
                }
            }
            sortTopics(j10);
        }
    }

    public void markAllReactionsAsRead(long j10) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j10);
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_reactions_count = 0;
                }
            }
            sortTopics(j10);
        }
    }

    public void reloadTopics(long j10) {
        reloadTopics(j10, true);
    }

    public void reloadTopics(long j10, boolean z4) {
        AndroidUtilities.runOnUIThread(new mh.pa(this, j10, z4, 3));
    }
}
