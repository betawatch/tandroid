package oh;

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g7 {
    public int a;
    public MessagesStorage b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024e A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(g7 g7Var, w5 w5Var) {
        SQLiteCursor sQLiteCursor;
        boolean z4;
        SQLiteDatabase sQLiteDatabase;
        int i10;
        Object obj;
        int i11;
        Object obj2;
        MessagesStorage messagesStorage = g7Var.b;
        SQLiteDatabase database = messagesStorage.getDatabase();
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int i12 = g7Var.a;
        ConnectionsManager.getInstance(i12).getCurrentTime();
        try {
            int i13 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            try {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                while (true) {
                    z4 = true;
                    if (!queryFinalized.next()) {
                        break;
                    }
                    long longValue = queryFinalized.longValue(0);
                    longSparseIntArray.put(longValue, queryFinalized.intValue(1));
                    if (longValue > 0) {
                        arrayList2.add(Long.valueOf(longValue));
                    } else {
                        arrayList3.add(Long.valueOf(longValue));
                    }
                }
                queryFinalized.dispose();
                int i14 = 0;
                while (i14 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i14);
                    int valueAt = longSparseIntArray.valueAt(i14);
                    Locale locale = Locale.US;
                    sQLiteCursor = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + keyAt, new Object[i13]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        sQLiteCursor = sQLiteCursor;
                        ?? r12 = z4;
                        while (sQLiteCursor.next()) {
                            LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(i13);
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(r12);
                            if (byteBufferValue != 0) {
                                sQLiteDatabase = database;
                                TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                                TLdeserialize.dialogId = keyAt;
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader != null) {
                                    try {
                                        TLRPC.Peer peer = storyFwdHeader.from;
                                        if (peer != null) {
                                            MessagesStorage.addLoadPeerInfo(peer, arrayList2, arrayList3);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            FileLog.e(th);
                                            AndroidUtilities.runOnUIThread(new t3(w5Var, 7));
                                            return;
                                        } finally {
                                            if (sQLiteCursor != 0) {
                                                sQLiteCursor.dispose();
                                            }
                                        }
                                    }
                                }
                                int i15 = 0;
                                Object obj3 = sQLiteCursor;
                                while (i15 < TLdeserialize.media_areas.size()) {
                                    if (TLdeserialize.media_areas.get(i15) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i11 = i12;
                                        obj2 = obj3;
                                        try {
                                            long j10 = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i15)).channel_id;
                                            if (!arrayList3.contains(Long.valueOf(j10))) {
                                                arrayList3.add(Long.valueOf(j10));
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteCursor = obj2;
                                            FileLog.e(th);
                                            AndroidUtilities.runOnUIThread(new t3(w5Var, 7));
                                            return;
                                        }
                                    } else {
                                        i11 = i12;
                                        obj2 = obj3;
                                    }
                                    i15++;
                                    obj3 = obj2;
                                    i12 = i11;
                                }
                                i10 = i12;
                                obj = obj3;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    MessagesStorage.addLoadPeerInfo(peer2, arrayList2, arrayList3);
                                }
                                f8.a(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = database;
                                i10 = i12;
                                obj = sQLiteCursor;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            database = sQLiteDatabase;
                            sQLiteCursor = obj;
                            i12 = i10;
                            i13 = 0;
                            r12 = 1;
                        }
                        LongSparseIntArray longSparseIntArray3 = longSparseIntArray;
                        SQLiteDatabase sQLiteDatabase2 = database;
                        int i16 = i12;
                        sQLiteCursor.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = valueAt;
                        tL_peerStories.peer = MessagesController.getInstance(i16).getPeer(keyAt);
                        arrayList.add(tL_peerStories);
                        i14++;
                        longSparseIntArray = longSparseIntArray3;
                        database = sQLiteDatabase2;
                        i12 = i16;
                        i13 = 0;
                        z4 = true;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                int i17 = i12;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = messagesStorage.getUsers(arrayList2);
                tL_stories_allStories.chats = messagesStorage.getChats(arrayList3);
                int i18 = 0;
                while (i18 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i18);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList5 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                    SQLiteDatabase database2 = messagesStorage.getDatabase();
                    int i19 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    while (i19 < arrayList5.size()) {
                        TL_stories.StoryItem storyItem = arrayList5.get(i19);
                        if (currentTime > arrayList5.get(i19).expire_date) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                                arrayList6 = new ArrayList();
                            }
                            arrayList7.add(Integer.valueOf(storyItem.id));
                            arrayList6.add(storyItem);
                            arrayList5.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                    if (arrayList6 != null) {
                        String join = TextUtils.join(", ", arrayList7);
                        try {
                            Locale locale2 = Locale.US;
                            database2.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id IN (" + join + ")").stepThis().dispose();
                        } catch (SQLiteException e6) {
                            FileLog.e(e6);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i18);
                        i18--;
                    }
                    Collections.sort(peerStories.stories, t6.X);
                    i18++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$-CC.comparingInt(new lf.d(9)));
                AndroidUtilities.runOnUIThread(new z1(12, w5Var, tL_stories_allStories));
            } catch (Throwable th5) {
                th = th5;
                sQLiteCursor = queryFinalized;
            }
        } catch (Throwable th6) {
            th = th6;
            sQLiteCursor = 0;
        }
    }

    public static void b(int i10, long j10, MessageObject messageObject, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = c(i10, j10, storyItem);
        }
        int i11 = messageObject.type;
        if (i11 == 23 || i11 == 24) {
            k1 k1Var = new k1();
            k1Var.user_id = DialogObject.getPeerDialogId(messageObject.messageOwner.media.peer);
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            k1Var.peer = messageMedia.peer;
            k1Var.id = messageMedia.id;
            k1Var.storyItem = c(i10, j10, storyItem);
            TLRPC.Message message2 = messageObject.messageOwner;
            k1Var.via_mention = message2.media.via_mention;
            message2.media = k1Var;
        }
        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
            TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = c(i10, j10, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        int i11 = storyItem.expire_date;
        boolean z4 = false;
        if (i11 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i11) {
            z4 = true;
        }
        if (storyItem.pinned || !z4 || j10 == 0 || j10 == UserConfig.getInstance(i10).clientUserId) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int e(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        int i10 = messageObject.type;
        if (i10 == 23 || i10 == 24) {
            return messageObject.messageOwner.media.id;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return messageObject.messageOwner.reply_to.story_id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i10, boolean z4, Timer timer) {
        g7 g7Var = this;
        Timer timer2 = timer;
        int i11 = g7Var.a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Timer.Task start = Timer.start(timer2, "fillMessagesWithStories: applying stories for existing array");
        int i12 = 0;
        while (i12 < hVar.m()) {
            long j10 = hVar.j(i12);
            ArrayList arrayList2 = (ArrayList) hVar.n(i12);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                TL_stories.StoryItem f10 = g7Var.f(e(messageObject), j10);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i11, j10, messageObject, f10);
                    arrayList.add(messageObject);
                    arrayList2.remove(i13);
                    i13--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = hVar.c;
                        Object obj = objArr[i12];
                        Object obj2 = a0.i.a;
                        if (obj != obj2) {
                            objArr[i12] = obj2;
                            hVar.a = true;
                        }
                        i12--;
                    }
                }
                i13++;
            }
            i12++;
        }
        Timer.done(start);
        if (z4) {
            g7Var.j(arrayList);
        }
        if (hVar.i()) {
            runnable.run();
            return;
        }
        int[] iArr = {hVar.m()};
        int i14 = 0;
        while (i14 < hVar.m()) {
            long j11 = hVar.j(i14);
            ArrayList arrayList3 = (ArrayList) hVar.n(i14);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j11);
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(e((MessageObject) arrayList3.get(i15))));
            }
            StringBuilder s6 = android.support.v4.media.a.s(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            s6.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new f7(g7Var, Timer.start(timer2, s6.toString()), arrayList3, j11, z4, timer2, iArr, runnable));
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, i10);
            }
            i14++;
            g7Var = this;
            timer2 = timer;
        }
    }

    public final TL_stories.StoryItem f(int i10, long j10) {
        SQLiteDatabase database = this.b.getDatabase();
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j10;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    f8.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e6) {
            FileLog.e(e6);
            return storyItem;
        }
    }

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase database = this.b.getDatabase();
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i10);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.e("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = f8.b(storyItem);
                        if (b10 != null) {
                            executeFast.bindByteBuffer(4, b10);
                        } else {
                            executeFast.bindNull(4);
                        }
                        if (b10 != null) {
                            b10.reuse();
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                Locale locale = Locale.US;
                database.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void h(long j10, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                FileLog.e("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j10);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = f8.b(storyItem);
            if (b10 != null) {
                executeFast.bindByteBuffer(4, b10);
            } else {
                executeFast.bindNull(4);
            }
            if (b10 != null) {
                b10.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void i(int i10, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i11 = this.a;
        MessagesStorage messagesStorage = this.b;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null) {
                peerStories2.max_read_id = i10;
                messagesStorage.updateUserInfo(userFull, false);
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
            if (chatFull != null && (peerStories = chatFull.stories) != null) {
                peerStories.max_read_id = i10;
                messagesStorage.updateChatInfo(chatFull, false);
            }
        }
        messagesStorage.getStorageQueue().postRunnable(new e7(this, j10, i10, 1));
    }

    public final void j(List list) {
        MessagesStorage messagesStorage = this.b;
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement executeFast = database.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast2 = database.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast3 = database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast4 = database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            for (int i10 = 0; i10 < list.size(); i10++) {
                MessageObject messageObject = (MessageObject) list.get(i10);
                int i11 = 0;
                while (i11 < 2) {
                    if (messageObject.messageOwner.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement = i11 == 0 ? executeFast : executeFast2;
                        if (sQLitePreparedStatement != null) {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.replyStory.getObjectSize());
                            messageObject.messageOwner.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, messageObject.getId());
                            sQLitePreparedStatement.bindLong(3, messageObject.getDialogId());
                            sQLitePreparedStatement.step();
                        }
                    } else {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i11 == 0 ? executeFast3 : executeFast4;
                        if (sQLitePreparedStatement2 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
                            messageObject.messageOwner.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement2.bindInteger(2, messageObject.getId());
                            sQLitePreparedStatement2.bindLong(3, messageObject.getDialogId());
                            sQLitePreparedStatement2.step();
                        }
                    }
                    i11++;
                }
            }
            executeFast.dispose();
            executeFast2.dispose();
            executeFast3.dispose();
            executeFast4.dispose();
        } catch (Throwable th2) {
            messagesStorage.checkSQLException(th2);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.b.getStorageQueue().postRunnable(new i5.v(this, j10, storyItem, 9));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            FileLog.e("StoriesStorage: try write deleted story");
        }
        if (m7.w(this.a, storyItem)) {
            FileLog.e("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement executeFast = this.b.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = f8.b(storyItem);
            if (b10 != null) {
                executeFast.bindByteBuffer(4, b10);
            } else {
                executeFast.bindNull(4);
            }
            if (b10 != null) {
                b10.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
