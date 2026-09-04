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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    a0.i offsets;
    LongSparseIntArray openedTopicsByChatId;
    a0.i topicsByChatId;
    a0.i topicsByTopMsgId;
    LongSparseIntArray topicsIsLoading;
    a0.i topicsMapByChatId;

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public class TopicsLoadOffset {
        int lastMessageDate;
        int lastMessageId;
        long lastTopicId;

        private TopicsLoadOffset() {
        }
    }

    public TopicsController(int i10) {
        super(i10);
        this.topicsByChatId = new a0.i();
        this.topicsMapByChatId = new a0.i();
        this.topicsIsLoading = new LongSparseIntArray();
        this.endIsReached = new LongSparseIntArray();
        this.topicsByTopMsgId = new a0.i();
        this.currentOpenTopicsCounter = new LongSparseIntArray();
        this.openedTopicsByChatId = new LongSparseIntArray();
        this.offsets = new a0.i();
    }

    public static long calculateHashSavedDialogs(ArrayList<TLRPC.TL_forumTopic> arrayList, int i10, int i11) {
        int i12;
        if (arrayList == null || arrayList.size() < (i12 = i11 + i10)) {
            return 0L;
        }
        long j3 = 0;
        while (i10 < i12) {
            TLRPC.TL_forumTopic tL_forumTopic = arrayList.get(i10);
            TLRPC.Message message = tL_forumTopic.topMessage;
            if (message == null || message.id != tL_forumTopic.top_message) {
                return 0L;
            }
            j3 = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(j3, tL_forumTopic.pinned ? 1L : 0L), Math.abs(DialogObject.getPeerDialogId(tL_forumTopic.from_id))), tL_forumTopic.top_message), (message.flags & 32768) != 0 ? message.edit_date : message.date);
            i10++;
        }
        return j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteTopic(final long j3, final int i10, int i11) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j10 = -j3;
        tL_messages_deleteTopicHistory.peer = getMessagesController().getInputPeer(j10);
        tL_messages_deleteTopicHistory.top_msg_id = i10;
        if (i11 == 0) {
            getMessagesStorage().removeTopic(j10, i10);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new RequestDelegate() { // from class: org.telegram.messenger.TopicsController.1
            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    TopicsController.this.getMessagesController().processNewChannelDifferenceParams(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, j3);
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        TopicsController.this.deleteTopic(j3, i10, i12);
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
    public /* synthetic */ void lambda$getTopicRepliesCount$29(TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_forumTopic.totalMessagesCount = messages_messages.count;
            getMessagesStorage().updateTopicData(j3, tL_forumTopic, 16);
            if (messages_messages.count == 0 && getMessagesController().isMonoForum(j3)) {
                getMessagesStorage().removeTopic(j3, j10);
                onTopicsDeletedServerSide(-j3, j10);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(-j3), Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTopicRepliesCount$30(TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new t2(this, tLObject, tL_forumTopic, j3, j10, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopic$27(long j3, ArrayList arrayList, long j10, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            i2.g.o(arrayList == null ? 0 : arrayList.size(), a4.a.t(j3, "loaded from cache ", " topics_count="));
        }
        processTopics(j3, arrayList, null, true, 0, -1);
        sortTopics(j3);
        if (findTopic(j3, j10) != null) {
            runnable.run();
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = new ArrayList<>();
        new TLRPC.TL_forumTopic().id = (int) j10;
        reloadTopics(j3, arrayList2, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopic$28(long j3, long j10, Runnable runnable, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new t2(j3, j10, runnable, arrayList, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$0(long j3, ArrayList arrayList, boolean z10, int i10) {
        if (BuildVars.LOGS_ENABLED) {
            i2.g.o(arrayList == null ? 0 : arrayList.size(), a4.a.t(j3, "loaded from cache ", " topics_count="));
        }
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, arrayList, null, z10, i10, -1);
        sortTopics(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$1(long j3, boolean z10, int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new gg(this, j3, arrayList, z10, i10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$2(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, a0.i iVar, int i10) {
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, og.d.l(tL_messages_savedDialogs.dialogs), iVar, false, i10, tL_messages_savedDialogs.dialogs.size());
        sortTopics(j3);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i2.g.h(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) iVar.f(tL_monoForumDialog.top_message);
            saveLoadOffset(j3, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j3) == null || getTopics(j3).size() < tL_messages_savedDialogs.dialogs.size()) {
            clearLoadingOffset(j3);
            loadTopics(j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$3(TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice, long j3, a0.i iVar, int i10) {
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogsSlice.users, false);
        getMessagesController().putChats(tL_messages_savedDialogsSlice.chats, false);
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, og.d.l(tL_messages_savedDialogsSlice.dialogs), iVar, false, i10, tL_messages_savedDialogsSlice.count);
        sortTopics(j3);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i2.g.h(1, tL_messages_savedDialogsSlice.dialogs);
            TLRPC.Message message = (TLRPC.Message) iVar.f(tL_monoForumDialog.top_message);
            saveLoadOffset(j3, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j3) == null || getTopics(j3).size() < tL_messages_savedDialogsSlice.count) {
            clearLoadingOffset(j3);
            loadTopics(j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$4(long j3, TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified) {
        this.topicsIsLoading.put(j3, 0);
        if ((getTopics(j3) != null ? r0.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
            this.endIsReached.put(j3, 1);
            getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j3, true).apply();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$5(TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, int i10) {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesStorage().putUsersAndChats(tL_messages_forumTopics2.users, tL_messages_forumTopics2.chats, true, true);
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, tL_messages_forumTopics.topics, iVar, false, i10, tL_messages_forumTopics2.count);
        sortTopics(j3);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_forumTopics.topics.isEmpty() && i10 == 1) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i2.g.h(1, tL_messages_forumTopics.topics);
            TLRPC.Message message = (TLRPC.Message) iVar.f(tL_forumTopic.top_message);
            saveLoadOffset(j3, tL_forumTopic.top_message, message == null ? 0 : message.date, tL_forumTopic.id);
        } else if (getTopics(j3) == null || getTopics(j3).size() < tL_messages_forumTopics.count) {
            clearLoadingOffset(j3);
            loadTopics(j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$6(long j3) {
        this.topicsIsLoading.put(j3, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopics$7(long j3, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        a0.i iVar = new a0.i();
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            for (int i11 = 0; i11 < tL_messages_savedDialogs.messages.size(); i11++) {
                iVar.k(tL_messages_savedDialogs.messages.get(i11), tL_messages_savedDialogs.messages.get(i11).id);
            }
            AndroidUtilities.runOnUIThread(new bi.u7(this, tL_messages_savedDialogs, j3, iVar, i10, 7));
            return;
        }
        int i12 = 0;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            while (i12 < tL_messages_savedDialogsSlice.messages.size()) {
                iVar.k(tL_messages_savedDialogsSlice.messages.get(i12), tL_messages_savedDialogsSlice.messages.get(i12).id);
                i12++;
            }
            AndroidUtilities.runOnUIThread(new bi.u7(this, tL_messages_savedDialogsSlice, j3, iVar, i10, 8));
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            AndroidUtilities.runOnUIThread(new b4(this, j3, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 28));
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
            AndroidUtilities.runOnUIThread(new tk(this, j3, 0));
            return;
        }
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
        while (i12 < tL_messages_forumTopics.messages.size()) {
            iVar.k(tL_messages_forumTopics.messages.get(i12), tL_messages_forumTopics.messages.get(i12).id);
            i12++;
        }
        AndroidUtilities.runOnUIThread(new fi.p3(this, tL_messages_forumTopics, j3, tL_messages_forumTopics, iVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTopicsDeletedServerSide$23(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(i10);
            long j3 = -topicKey.dialogId;
            a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
            if (iVar != null) {
                iVar.l(topicKey.topicId);
            }
            ArrayList arrayList2 = (ArrayList) this.topicsByChatId.f(j3);
            if (arrayList2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    if ((getMessagesController().isMonoForum(topicKey.dialogId) ? DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList2.get(i11)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i11)).id) == topicKey.topicId) {
                        arrayList2.remove(i11);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogDeleted, Long.valueOf(-j3), Long.valueOf(topicKey.topicId));
                        hashSet.add(Long.valueOf(j3));
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
    public void lambda$pinTopic$19(org.telegram.ui.ActionBar.n2 n2Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
        String string = LocaleController.getString(R.string.LimitReached);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString(R.string.LimitReachedPinnedTopics, Integer.valueOf(MessagesController.getInstance(this.currentAccount).topicsPinnedLimit));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(b2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pinTopic$20(org.telegram.ui.ActionBar.n2 n2Var, long j3, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (!"PINNED_TOO_MUCH".equals(tL_error.text)) {
                if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                    reloadTopics(j3, false);
                }
            } else {
                if (n2Var == null) {
                    return;
                }
                applyPinnedOrder(j3, arrayList);
                AndroidUtilities.runOnUIThread(new wg(12, this, n2Var));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processTopics$8(long j3) {
        loadTopics(j3, false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUpdate$22(List list) {
        HashSet hashSet = new HashSet();
        a0.i iVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            TopicUpdate topicUpdate = (TopicUpdate) list.get(i10);
            if (topicUpdate.reloadTopic) {
                if (iVar == null) {
                    iVar = new a0.i();
                }
                ArrayList arrayList = (ArrayList) iVar.f(topicUpdate.dialogId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    iVar.k(arrayList, topicUpdate.dialogId);
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
        if (iVar != null) {
            for (int i15 = 0; i15 < iVar.m(); i15++) {
                reloadTopics(-iVar.j(i15), (ArrayList) iVar.n(i15), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$13(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        int i10 = 0;
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        processTopics(j3, arrayList, iVar, false, 2, -1);
        long j10 = -j3;
        getMessagesStorage().saveTopics(j10, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
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
            getMessagesStorage().removeTopic(j10, longValue);
            onTopicsDeletedServerSide(j3, longValue);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$14(TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        processTopics(j3, tL_messages_forumTopics.topics, iVar, false, 2, -1);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$15(TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        int i10 = 0;
        if (tLObject != null && z10) {
            a0.i iVar = new a0.i();
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            ArrayList l4 = og.d.l(tL_messages_savedDialogs.dialogs);
            while (i10 < tL_messages_savedDialogs.messages.size()) {
                iVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).id);
                i10++;
            }
            AndroidUtilities.runOnUIThread(new l8(this, tL_messages_savedDialogs, j3, l4, iVar, hashSet, runnable));
            return;
        }
        if (tLObject != null) {
            a0.i iVar2 = new a0.i();
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            while (i10 < tL_messages_forumTopics.messages.size()) {
                iVar2.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).id);
                i10++;
            }
            AndroidUtilities.runOnUIThread(new el(this, tLObject, j3, tL_messages_forumTopics, iVar2, runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$16(boolean z10, long j3, HashSet hashSet, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new kd(this, tLObject, z10, j3, hashSet, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadTopics$24(long j3, boolean z10) {
        getUserConfig().getPreferences().edit().remove("topics_end_reached_" + j3).apply();
        this.topicsByChatId.l(j3);
        this.topicsMapByChatId.l(j3);
        this.endIsReached.delete(j3);
        clearLoadingOffset(j3);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (chat != null && (chat.forum || chat.monoforum)) {
            loadTopics(j3, z10, 0);
        }
        sortTopics(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortTopics$9(TLRPC.TL_forumTopic tL_forumTopic, TLRPC.TL_forumTopic tL_forumTopic2) {
        boolean z10 = tL_forumTopic.hidden;
        if (z10 != tL_forumTopic2.hidden) {
            return z10 ? -1 : 1;
        }
        boolean z11 = tL_forumTopic.pinned;
        boolean z12 = tL_forumTopic2.pinned;
        if (z11 != z12) {
            return z11 ? -1 : 1;
        }
        if (z11 && z12) {
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
    public /* synthetic */ void lambda$updateMentionsUnread$21(long j3, long j10, int i10) {
        long j11 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, j10);
        if (findTopic != null) {
            findTopic.unread_mentions_count = i10;
            sortTopics(j11, true);
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
    public /* synthetic */ void lambda$updateTopicsWithDeletedMessages$10(ArrayList arrayList, long j3) {
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i10);
            a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
            if (iVar != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) iVar.f(tL_forumTopic.id);
                if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                    this.topicsByTopMsgId.l(messageHash(tL_forumTopic2.top_message, j3));
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    int i11 = message.id;
                    tL_forumTopic2.top_message = i11;
                    tL_forumTopic2.topMessage = message;
                    tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                    this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(i11, j3));
                    z10 = true;
                } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(tL_forumTopic);
                }
            }
        }
        if (z10) {
            sortTopics(j3);
        }
        if (arrayList2 != null) {
            reloadTopics(j3, arrayList2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$updateTopicsWithDeletedMessages$11(long j3, ArrayList arrayList, boolean z10, long j10) {
        Exception exc;
        ArrayList<TLRPC.TL_forumTopic> arrayList2;
        NativeByteBuffer byteBufferValue;
        ArrayList<TLRPC.TL_forumTopic> arrayList3 = null;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT topic_id, top_message FROM topics WHERE did = " + j3 + " AND top_message IN (" + TextUtils.join(",", arrayList) + ")", new Object[0]);
            ArrayList<TLRPC.TL_forumTopic> arrayList4 = null;
            while (queryFinalized.next()) {
                try {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                    tL_forumTopic.id = queryFinalized.intValue(0);
                    tL_forumTopic.top_message = queryFinalized.intValue(1);
                    if (z10) {
                        tL_forumTopic.from_id = getMessagesController().getPeer(tL_forumTopic.id);
                    } else {
                        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().getClientUserId());
                    }
                    tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                    arrayList4.add(tL_forumTopic);
                } catch (Exception e7) {
                    exc = e7;
                    arrayList3 = arrayList4;
                    exc.printStackTrace();
                    arrayList2 = arrayList3;
                    getMessagesStorage().loadGroupedMessagesForTopics(j3, arrayList2);
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
                    SQLiteCursor queryFinalized2 = database2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j3 + " AND topic_id = " + tL_forumTopic2.id + " ORDER BY mid DESC LIMIT 1", new Object[0]);
                    if (queryFinalized2.next() && (byteBufferValue = queryFinalized2.byteBufferValue(1)) != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                        byteBufferValue.reuse();
                        this.topicsByTopMsgId.l(messageHash(tL_forumTopic2.top_message, j10));
                        int i11 = TLdeserialize.id;
                        tL_forumTopic2.top_message = i11;
                        tL_forumTopic2.topMessage = TLdeserialize;
                        tL_forumTopic2.groupedMessages = null;
                        this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(i11, j10));
                    }
                    queryFinalized2.dispose();
                }
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                    Locale locale3 = Locale.US;
                    database3.executeFast("UPDATE topics SET top_message = " + arrayList4.get(i12).top_message + " WHERE did = " + j3 + " AND topic_id = " + arrayList4.get(i12).id).stepThis().dispose();
                }
            }
            arrayList2 = arrayList4;
        } catch (Exception e10) {
            exc = e10;
        }
        getMessagesStorage().loadGroupedMessagesForTopics(j3, arrayList2);
        if (arrayList2 == null) {
            AndroidUtilities.runOnUIThread(new b4(this, arrayList2, j10, 29));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTopicsWithDeletedMessages$12(long j3, ArrayList arrayList, boolean z10, long j10) {
        getMessagesStorage().getStorageQueue().postRunnable(new sk(this, j3, arrayList, z10, j10, 0));
    }

    private long messageHash(int i10, long j3) {
        return j3 + (i10 << 12);
    }

    private void sortTopics(long j3) {
        sortTopics(j3, true);
    }

    public void applyPinnedOrder(long j3, ArrayList<Integer> arrayList) {
        applyPinnedOrder(j3, arrayList, true);
    }

    public void clearLoadingOffset(long j3) {
        this.offsets.l(j3);
    }

    public void databaseCleared() {
        AndroidUtilities.runOnUIThread(new uk(this, 1));
    }

    public void deleteTopics(long j3, ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = (ArrayList) this.topicsByChatId.f(j3);
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
        if (iVar != null && arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long intValue = arrayList.get(i10).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) iVar.f(intValue);
                iVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.topicsByTopMsgId.l(messageHash(tL_forumTopic.top_message, j3));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            sortTopics(j3);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            deleteTopic(j3, arrayList.get(i11).intValue(), 0);
        }
    }

    public boolean endIsReached(long j3) {
        return this.endIsReached.get(j3, 0) == 1;
    }

    public TLRPC.TL_forumTopic findTopic(long j3, long j10) {
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
        if (iVar == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) iVar.f(j10);
        if (tL_forumTopic != null || !getMessagesController().isMonoForum(-j3)) {
            return tL_forumTopic;
        }
        int i10 = og.d.a;
        return (TLRPC.TL_forumTopic) iVar.f((int) ((j10 >>> 32) ^ j10));
    }

    public ArrayList<Integer> getCurrentPinnedOrder(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
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

    public int[] getForumUnreadCount(long j3) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j3);
        Arrays.fill(countsTmp, 0);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i10);
                int[] iArr = countsTmp;
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
        return countsTmp;
    }

    public TopicsLoadOffset getLoadOffset(long j3) {
        TopicsLoadOffset topicsLoadOffset = (TopicsLoadOffset) this.offsets.f(j3);
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
    public void getTopicRepliesCount(long j3, long j10) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic findTopic = findTopic(-j3, j10);
        if (findTopic == null || findTopic.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().isMonoForum(j3)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().getInputPeer(j10);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().getInputPeer(j3);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().getInputPeer(j3);
            tL_messages_getReplies2.msg_id = (int) j10;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new z6(this, findTopic, j3, j10, 3));
    }

    public ArrayList<TLRPC.TL_forumTopic> getTopics(long j3) {
        return (ArrayList) this.topicsByChatId.f(j3);
    }

    public int getTopicsCount(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics;
        if (!endIsReached(j3) || (topics = getTopics(j3)) == null) {
            return 0;
        }
        return topics.size();
    }

    public boolean isLoading(long j3) {
        return this.topicsIsLoading.get(j3, 0) == 1 && (this.topicsByChatId.f(j3) == null || ((ArrayList) this.topicsByChatId.f(j3)).isEmpty());
    }

    public void loadTopic(final long j3, final long j10, final Runnable runnable) {
        getMessagesStorage().loadTopics(-j3, new Consumer() { // from class: org.telegram.messenger.wk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                long j11 = j3;
                long j12 = j10;
                TopicsController.this.lambda$loadTopic$28(j11, j12, runnable, (ArrayList) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        });
    }

    public void loadTopics(long j3) {
        loadTopics(j3, false, 1);
    }

    public void markAllPollVotesAsRead(long j3, long j10) {
        TLRPC.TL_forumTopic findTopic = findTopic(j3, j10);
        if (findTopic == null || findTopic.unread_poll_votes_count <= 0) {
            return;
        }
        findTopic.unread_poll_votes_count = 0;
        sortTopics(j3);
    }

    public void markAllReactionsAsRead(long j3, long j10) {
        TLRPC.TL_forumTopic findTopic = findTopic(j3, j10);
        if (findTopic == null || findTopic.unread_reactions_count <= 0) {
            return;
        }
        findTopic.unread_reactions_count = 0;
        sortTopics(j3);
    }

    public void onTopicCreated(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        long j10 = -j3;
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j10);
        if (findTopic(j10, tL_forumTopic.id) != null) {
            return;
        }
        if (iVar == null) {
            iVar = new a0.i();
            this.topicsMapByChatId.k(iVar, j10);
        }
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.topicsByChatId.k(arrayList, j10);
        }
        iVar.k(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z10) {
            getMessagesStorage().saveTopics(j3, Collections.singletonList(tL_forumTopic), false, true, getConnectionsManager().getCurrentTime());
        }
        sortTopics(j10, true);
    }

    public void onTopicEdited(long j3, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesStorage().updateTopicData(j3, tL_forumTopic, 35);
        sortTopics(-j3);
    }

    public void onTopicFragmentPause(long j3) {
        int i10 = this.openedTopicsByChatId.get(j3, 0) - 1;
        this.openedTopicsByChatId.put(j3, i10 >= 0 ? i10 : 0);
    }

    public void onTopicFragmentResume(long j3) {
        this.openedTopicsByChatId.put(j3, this.openedTopicsByChatId.get(j3, 0) + 1);
        sortTopics(j3);
    }

    public void onTopicsDeletedServerSide(long j3, long j10) {
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>(1);
        arrayList.add(MessagesStorage.TopicKey.of(-j3, j10));
        onTopicsDeletedServerSide(arrayList);
    }

    public void pinTopic(long j3, int i10, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().getInputPeer(-j3);
        tL_messages_updatePinnedForumTopic.topic_id = i10;
        tL_messages_updatePinnedForumTopic.pinned = z10;
        ArrayList<Integer> currentPinnedOrder = getCurrentPinnedOrder(j3);
        ArrayList<Integer> arrayList = new ArrayList<>(currentPinnedOrder);
        arrayList.remove(Integer.valueOf(i10));
        if (z10) {
            arrayList.add(0, Integer.valueOf(i10));
        }
        applyPinnedOrder(j3, arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new ja(this, n2Var, j3, currentPinnedOrder, 3));
    }

    public void preloadTopics(long j3) {
        loadTopics(j3, true, 0);
    }

    public void processEditedMessage(TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.f(messageHash(message.id, -message.dialog_id));
        if (tL_forumTopic != null) {
            tL_forumTopic.topMessage = message;
            sortTopics(-message.dialog_id, true);
        }
    }

    public void processEditedMessages(a0.i iVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            ArrayList arrayList = (ArrayList) iVar.n(i10);
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
    public void processTopics(long j3, ArrayList<TLRPC.TL_forumTopic> arrayList, a0.i iVar, boolean z10, int i10, int i11) {
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.TL_forumTopic> arrayList3;
        boolean z11;
        ?? r32;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        ArrayList<TLRPC.TL_forumTopic> arrayList4 = arrayList;
        a0.i iVar2 = iVar;
        if (i10 == 3 && getMessagesController().isMonoForum(-j3)) {
            getUserConfig().getPreferences().edit().remove("topics_end_reached_" + j3).apply();
            this.topicsByChatId.l(j3);
            this.topicsMapByChatId.l(j3);
            this.endIsReached.delete(j3);
            clearLoadingOffset(j3);
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("processTopics=new_topics_size=");
            sb2.append(arrayList4 == null ? 0 : arrayList4.size());
            sb2.append(" fromCache=");
            sb2.append(z10);
            sb2.append(" load_type=");
            sb2.append(i10);
            sb2.append(" totalCount=");
            sb2.append(i11);
            FileLog.d(sb2.toString());
        }
        ArrayList arrayList5 = (ArrayList) this.topicsByChatId.f(j3);
        a0.i iVar3 = (a0.i) this.topicsMapByChatId.f(j3);
        if (arrayList5 == null) {
            arrayList5 = new ArrayList();
            this.topicsByChatId.k(arrayList5, j3);
        }
        if (iVar3 == null) {
            iVar3 = new a0.i();
            this.topicsMapByChatId.k(iVar3, j3);
        }
        if (arrayList4 != null) {
            int i13 = 0;
            ArrayList<Long> arrayList6 = null;
            ArrayList<TLRPC.TL_forumTopic> arrayList7 = null;
            z11 = false;
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
                    if (!iVar3.d(tL_forumTopic2.id)) {
                        if (iVar2 != null) {
                            tL_forumTopic2.topMessage = (TLRPC.Message) iVar2.f(tL_forumTopic2.top_message);
                            tL_forumTopic2.topicStartMessage = (TLRPC.Message) iVar2.f(tL_forumTopic2.id);
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
                            tL_message.peer_id = getMessagesController().getPeer(-j3);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList5.add(tL_forumTopic2);
                        iVar3.k(tL_forumTopic2, tL_forumTopic2.id);
                        this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(tL_forumTopic2.top_message, j3));
                    } else if (!tL_forumTopic2.isShort && (tL_forumTopic = (TLRPC.TL_forumTopic) iVar3.f(tL_forumTopic2.id)) != null) {
                        boolean z12 = tL_forumTopic.closed;
                        boolean z13 = tL_forumTopic2.closed;
                        if (z12 != z13) {
                            tL_forumTopic.closed = z13;
                            getMessagesStorage().updateTopicData(-j3, tL_forumTopic2, 8);
                        }
                    }
                    z11 = true;
                }
                i13 = i12 + 1;
                arrayList4 = arrayList;
                iVar2 = iVar;
            }
            arrayList2 = arrayList6;
            arrayList3 = arrayList7;
        } else {
            arrayList2 = null;
            arrayList3 = null;
            z11 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) arrayList5.get(i15);
            if (tL_forumTopic3 != null && tL_forumTopic3.pinned) {
                int i16 = i14 + 1;
                if (tL_forumTopic3.pinnedOrder != i14) {
                    tL_forumTopic3.pinnedOrder = i14;
                    i14 = i16;
                    z11 = true;
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
            getMessagesStorage().removeTopics(j3, arrayList2);
        }
        if (arrayList3 == null || i10 == 2) {
            if (i10 != 0 || z10) {
                r32 = 1;
                r32 = 1;
                if (i10 != 1) {
                }
            } else {
                r32 = 1;
            }
            if (arrayList5.size() >= i11 && i11 >= 0 && !endIsReached(j3)) {
                this.endIsReached.put(j3, r32);
                getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j3, r32).apply();
                z11 = true;
            }
        } else {
            reloadTopics(j3, arrayList3, null);
        }
        if (iVar3.m() > arrayList5.size()) {
            FileLog.e("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(iVar3.m());
            for (int i19 = 0; i19 < iVar3.m(); i19++) {
                hashSet.add(Long.valueOf(iVar3.j(i19)));
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
                iVar3.l(((Long) it.next()).longValue());
            }
            z11 = true;
        }
        if (z11) {
            sortTopics(j3, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.TRUE);
        if ((i10 == 0 || (i10 == 0 && !z10)) && z10 && ((ArrayList) this.topicsByChatId.f(j3)).isEmpty()) {
            AndroidUtilities.runOnUIThread(new tk(this, j3, 1));
        }
    }

    public void processUpdate(List<TopicUpdate> list) {
        AndroidUtilities.runOnUIThread(new wg(11, this, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reloadTopics(long j3, ArrayList<TLRPC.TL_forumTopic> arrayList, Runnable runnable) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j10 = -j3;
        boolean isMonoForum = getMessagesController().isMonoForum(j10);
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
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().getInputPeer(j10);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i10 < arrayList.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(arrayList.get(i10).id, i10, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().getInputPeer(j10);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new oa(this, isMonoForum, j3, hashSet, runnable));
    }

    public void reorderPinnedTopics(long j3, ArrayList<Integer> arrayList) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().getInputPeer(-j3);
        if (arrayList != null) {
            tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        }
        tL_messages_reorderPinnedForumTopics.force = true;
        applyPinnedOrder(j3, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public void saveLoadOffset(long j3, int i10, int i11, long j10) {
        TopicsLoadOffset topicsLoadOffset = new TopicsLoadOffset();
        topicsLoadOffset.lastMessageId = i10;
        topicsLoadOffset.lastMessageDate = i11;
        topicsLoadOffset.lastTopicId = j10;
        this.offsets.k(topicsLoadOffset, j3);
    }

    public void saveTopics(long j3) {
        if (((ArrayList) this.topicsByChatId.f(j3)) != null) {
            getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        }
    }

    public void toggleCloseTopic(long j3, int i10, boolean z10) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j10);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z10;
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
        if (iVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) iVar.f(i10)) != null) {
            tL_forumTopic.closed = z10;
            getMessagesStorage().updateTopicData(j10, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new RequestDelegate() { // from class: org.telegram.messenger.TopicsController.2
            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void toggleShowTopic(long j3, int i10, boolean z10) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j10);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z10;
        TLRPC.TL_forumTopic findTopic = findTopic(j3, i10);
        if (findTopic != null) {
            boolean z11 = tL_messages_editForumTopic.hidden;
            findTopic.hidden = z11;
            if (z11) {
                findTopic.closed = true;
            }
            updateTopicInUi(j10, findTopic, 44);
            getMessagesStorage().updateTopicData(j10, findTopic, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public void toggleViewForumAsMessages(long j3, boolean z10) {
        TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
        tL_channels_toggleViewForumAsMessages.channel_id = getMessagesController().getInputChannel(j3);
        tL_channels_toggleViewForumAsMessages.enabled = z10;
        getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new g0(this, 9));
    }

    public void updateMaxReadId(long j3, long j10, int i10, int i11, int i12) {
        TLRPC.TL_forumTopic findTopic = findTopic(j3, j10);
        if (findTopic != null) {
            findTopic.read_inbox_max_id = i10;
            findTopic.unread_count = i11;
            if (i12 >= 0) {
                findTopic.unread_mentions_count = i12;
            }
            sortTopics(j3);
        }
    }

    public void updateMentionsUnread(long j3, long j10, int i10) {
        AndroidUtilities.runOnUIThread(new t7(this, j3, j10, i10, 2));
    }

    public int updatePollVotesUnread(long j3, long j10, int i10, boolean z10) {
        long j11 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, j10);
        if (findTopic == null) {
            return -1;
        }
        if (z10) {
            int i11 = findTopic.unread_poll_votes_count + i10;
            findTopic.unread_poll_votes_count = i11;
            if (i11 < 0) {
                findTopic.unread_poll_votes_count = 0;
            }
        } else {
            findTopic.unread_poll_votes_count = i10;
        }
        int i12 = findTopic.unread_poll_votes_count;
        sortTopics(j11, true);
        return i12;
    }

    public int updateReactionsUnread(long j3, long j10, int i10, boolean z10) {
        long j11 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, j10);
        if (findTopic == null) {
            return -1;
        }
        if (z10) {
            int i11 = findTopic.unread_reactions_count + i10;
            findTopic.unread_reactions_count = i11;
            if (i11 < 0) {
                findTopic.unread_reactions_count = 0;
            }
        } else {
            findTopic.unread_reactions_count = i10;
        }
        int i12 = findTopic.unread_reactions_count;
        sortTopics(j11, true);
        return i12;
    }

    public void updateReadOutbox(HashMap<MessagesStorage.TopicKey, Integer> hashMap) {
        AndroidUtilities.runOnUIThread(new wg(14, this, hashMap));
    }

    public void updateTopicInUi(long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        long j10 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j10, tL_forumTopic.id);
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
            sortTopics(j10);
        }
    }

    public void updateTopicsWithDeletedMessages(long j3, ArrayList<Integer> arrayList) {
        if (j3 > 0) {
            return;
        }
        long j10 = -j3;
        AndroidUtilities.runOnUIThread(new sk(this, j3, arrayList, ChatObject.isMonoForum(getMessagesController().getChat(Long.valueOf(j10))), j10, 1));
    }

    public void applyPinnedOrder(long j3, ArrayList<Integer> arrayList, boolean z10) {
        if (arrayList == null) {
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        boolean z11 = true;
        if (topics != null) {
            boolean z12 = false;
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                    boolean z13 = indexOf >= 0;
                    if (tL_forumTopic.pinned != z13 || (z13 && tL_forumTopic.pinnedOrder != indexOf)) {
                        tL_forumTopic.pinned = z13;
                        tL_forumTopic.pinnedOrder = indexOf;
                        getMessagesStorage().updateTopicData(j3, tL_forumTopic, 4);
                        z12 = true;
                    }
                }
            }
            z11 = z12;
        }
        if (z10 && z11) {
            AndroidUtilities.runOnUIThread(new uk(this, 0));
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
        return og.d.j(findTopic, textPaint, drawableArr);
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
    public void loadTopics(final long j3, final boolean z10, final int i10) {
        TLObject tL_messages_getForumTopics;
        long j10;
        if (this.topicsIsLoading.get(j3, 0) != 0) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load topics " + j3 + " fromCache=" + z10 + " loadType=" + i10);
        }
        this.topicsIsLoading.put(j3, 1);
        if (z10) {
            getMessagesStorage().loadTopics(-j3, new Consumer() { // from class: org.telegram.messenger.vk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    long j11 = j3;
                    TopicsController.this.lambda$loadTopics$1(j11, z10, i10, (ArrayList) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        long j11 = -j3;
        if (getMessagesController().isMonoForum(j11)) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
            tL_messages_getForumTopics.flags |= 2;
            TopicsLoadOffset loadOffset = getLoadOffset(j3);
            if (i10 != 0 && i10 != 3) {
                j10 = i10 != 1 ? 0L : 0L;
                if (i10 == 1) {
                    tL_messages_getForumTopics.limit = 100;
                    tL_messages_getForumTopics.offset_date = loadOffset.lastMessageDate;
                    tL_messages_getForumTopics.offset_id = loadOffset.lastMessageId;
                    tL_messages_getForumTopics.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(loadOffset.lastTopicId);
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb2 = new StringBuilder("offset_date=");
                        sb2.append(loadOffset.lastMessageDate);
                        sb2.append(" offset_id=");
                        sb2.append(loadOffset.lastMessageId);
                        sb2.append(" offset_topic=");
                        i2.g.w(sb2, loadOffset.lastTopicId);
                    }
                }
            }
            ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
            tL_messages_getForumTopics.limit = 20;
            tL_messages_getForumTopics.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
            tL_messages_getForumTopics.offset_date = 0;
            tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
            tL_messages_getForumTopics.hash = topics != null ? calculateHashSavedDialogs(topics, 0, Math.min(topics.size(), 20)) : j10;
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().getInputPeer(j11);
            if (i10 == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i10 == 1) {
                tL_messages_getForumTopics.limit = 100;
                TopicsLoadOffset loadOffset2 = getLoadOffset(j3);
                tL_messages_getForumTopics.offset_date = loadOffset2.lastMessageDate;
                tL_messages_getForumTopics.offset_id = loadOffset2.lastMessageId;
                tL_messages_getForumTopics.offset_topic = (int) loadOffset2.lastTopicId;
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb3 = new StringBuilder("offset_date=");
                    sb3.append(loadOffset2.lastMessageDate);
                    sb3.append(" offset_id=");
                    sb3.append(loadOffset2.lastMessageId);
                    sb3.append(" offset_topic=");
                    i2.g.w(sb3, loadOffset2.lastTopicId);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new de(this, j3, i10, 1));
    }

    public void sortTopics(long j3, boolean z10) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j3);
        if (arrayList != null) {
            if (this.openedTopicsByChatId.get(j3, 0) > 0) {
                Collections.sort(arrayList, new bi(4));
            }
            if (z10) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.TRUE);
            }
        }
    }

    public void onTopicsDeletedServerSide(ArrayList<MessagesStorage.TopicKey> arrayList) {
        AndroidUtilities.runOnUIThread(new wg(13, this, arrayList));
    }

    public void markAllPollVotesAsRead(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_poll_votes_count = 0;
                }
            }
            sortTopics(j3);
        }
    }

    public void markAllReactionsAsRead(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_reactions_count = 0;
                }
            }
            sortTopics(j3);
        }
    }

    public void reloadTopics(long j3) {
        reloadTopics(j3, true);
    }

    public void reloadTopics(long j3, boolean z10) {
        AndroidUtilities.runOnUIThread(new di.q9(this, j3, z10, 4));
    }
}
