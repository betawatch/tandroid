package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i7 {
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
    public static void a(i7 i7Var, y5 y5Var) {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        int i9;
        Object obj;
        int i10;
        Object obj2;
        MessagesStorage messagesStorage = i7Var.b;
        SQLiteDatabase database = messagesStorage.getDatabase();
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int i11 = i7Var.a;
        ConnectionsManager.getInstance(i11).getCurrentTime();
        try {
            int i12 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            try {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                while (true) {
                    z10 = true;
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
                int i13 = 0;
                while (i13 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i13);
                    int valueAt = longSparseIntArray.valueAt(i13);
                    Locale locale = Locale.US;
                    sQLiteCursor = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + keyAt, new Object[i12]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        sQLiteCursor = sQLiteCursor;
                        ?? r12 = z10;
                        while (sQLiteCursor.next()) {
                            LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(i12);
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
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            FileLog.e(th);
                                            AndroidUtilities.runOnUIThread(new g(y5Var, 13));
                                            return;
                                        } finally {
                                            if (sQLiteCursor != 0) {
                                                sQLiteCursor.dispose();
                                            }
                                        }
                                    }
                                }
                                int i14 = 0;
                                Object obj3 = sQLiteCursor;
                                while (i14 < TLdeserialize.media_areas.size()) {
                                    if (TLdeserialize.media_areas.get(i14) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i10 = i11;
                                        obj2 = obj3;
                                        try {
                                            long j10 = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i14)).channel_id;
                                            if (!arrayList3.contains(Long.valueOf(j10))) {
                                                arrayList3.add(Long.valueOf(j10));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor = obj2;
                                            FileLog.e(th);
                                            AndroidUtilities.runOnUIThread(new g(y5Var, 13));
                                            return;
                                        }
                                    } else {
                                        i10 = i11;
                                        obj2 = obj3;
                                    }
                                    i14++;
                                    obj3 = obj2;
                                    i11 = i10;
                                }
                                i9 = i11;
                                obj = obj3;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    MessagesStorage.addLoadPeerInfo(peer2, arrayList2, arrayList3);
                                }
                                j8.a(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = database;
                                i9 = i11;
                                obj = sQLiteCursor;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            database = sQLiteDatabase;
                            sQLiteCursor = obj;
                            i11 = i9;
                            i12 = 0;
                            r12 = 1;
                        }
                        LongSparseIntArray longSparseIntArray3 = longSparseIntArray;
                        SQLiteDatabase sQLiteDatabase2 = database;
                        int i15 = i11;
                        sQLiteCursor.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = valueAt;
                        tL_peerStories.peer = MessagesController.getInstance(i15).getPeer(keyAt);
                        arrayList.add(tL_peerStories);
                        i13++;
                        longSparseIntArray = longSparseIntArray3;
                        database = sQLiteDatabase2;
                        i11 = i15;
                        i12 = 0;
                        z10 = true;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                int i16 = i11;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = messagesStorage.getUsers(arrayList2);
                tL_stories_allStories.chats = messagesStorage.getChats(arrayList3);
                int i17 = 0;
                while (i17 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i17);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList5 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    SQLiteDatabase database2 = messagesStorage.getDatabase();
                    int i18 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    while (i18 < arrayList5.size()) {
                        TL_stories.StoryItem storyItem = arrayList5.get(i18);
                        if (currentTime > arrayList5.get(i18).expire_date) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                                arrayList6 = new ArrayList();
                            }
                            arrayList7.add(Integer.valueOf(storyItem.id));
                            arrayList6.add(storyItem);
                            arrayList5.remove(i18);
                            i18--;
                        }
                        i18++;
                    }
                    if (arrayList6 != null) {
                        String join = TextUtils.join(", ", arrayList7);
                        try {
                            Locale locale2 = Locale.US;
                            database2.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id IN (" + join + ")").stepThis().dispose();
                        } catch (SQLiteException e10) {
                            FileLog.e(e10);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i17);
                        i17--;
                    }
                    Collections.sort(peerStories.stories, v6.X);
                    i17++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$-CC.comparingInt(new ff.d(9)));
                AndroidUtilities.runOnUIThread(new h3.g0(24, y5Var, tL_stories_allStories));
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor = queryFinalized;
            }
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = 0;
        }
    }

    public static void b(int i9, long j10, MessageObject messageObject, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = c(i9, j10, storyItem);
        }
        int i10 = messageObject.type;
        if (i10 == 23 || i10 == 24) {
            l1 l1Var = new l1();
            l1Var.user_id = DialogObject.getPeerDialogId(messageObject.messageOwner.media.peer);
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            l1Var.peer = messageMedia.peer;
            l1Var.id = messageMedia.id;
            l1Var.storyItem = c(i9, j10, storyItem);
            TLRPC.Message message2 = messageObject.messageOwner;
            l1Var.via_mention = message2.media.via_mention;
            message2.media = l1Var;
        }
        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
            TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = c(i9, j10, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i9, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        int i10 = storyItem.expire_date;
        boolean z10 = false;
        if (i10 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i10) {
            z10 = true;
        }
        if (storyItem.pinned || !z10 || j10 == 0 || j10 == UserConfig.getInstance(i9).clientUserId) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int e(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        int i9 = messageObject.type;
        if (i9 == 23 || i9 == 24) {
            return messageObject.messageOwner.media.id;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i10 = 0; i10 < messageObject.messageOwner.media.webpage.attributes.size(); i10++) {
                TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return messageObject.messageOwner.reply_to.story_id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i9, boolean z10, Timer timer) {
        i7 i7Var = this;
        Timer timer2 = timer;
        int i10 = i7Var.a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Timer.Task start = Timer.start(timer2, "fillMessagesWithStories: applying stories for existing array");
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j10 = hVar.j(i11);
            ArrayList arrayList2 = (ArrayList) hVar.n(i11);
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                TL_stories.StoryItem f10 = i7Var.f(e(messageObject), j10);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i10, j10, messageObject, f10);
                    arrayList.add(messageObject);
                    arrayList2.remove(i12);
                    i12--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = hVar.c;
                        Object obj = objArr[i11];
                        Object obj2 = a0.i.a;
                        if (obj != obj2) {
                            objArr[i11] = obj2;
                            hVar.a = true;
                        }
                        i11--;
                    }
                }
                i12++;
            }
            i11++;
        }
        Timer.done(start);
        if (z10) {
            i7Var.j(arrayList);
        }
        if (hVar.i()) {
            runnable.run();
            return;
        }
        int[] iArr = {hVar.m()};
        int i13 = 0;
        while (i13 < hVar.m()) {
            long j11 = hVar.j(i13);
            ArrayList arrayList3 = (ArrayList) hVar.n(i13);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i10).getInputPeer(j11);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(e((MessageObject) arrayList3.get(i14))));
            }
            StringBuilder s10 = aa.d.s(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            s10.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new h7(i7Var, Timer.start(timer2, s10.toString()), arrayList3, j11, z10, timer2, iArr, runnable));
            if (i9 != 0) {
                ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequest, i9);
            }
            i13++;
            i7Var = this;
            timer2 = timer;
        }
    }

    public final TL_stories.StoryItem f(int i9, long j10) {
        SQLiteDatabase database = this.b.getDatabase();
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i9, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j10;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    j8.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e10) {
            FileLog.e(e10);
            return storyItem;
        }
    }

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase database = this.b.getDatabase();
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i9);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.e("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = j8.b(storyItem);
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
            } catch (Exception e10) {
                FileLog.e(e10);
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
            NativeByteBuffer b10 = j8.b(storyItem);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void i(int i9, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.a;
        MessagesStorage messagesStorage = this.b;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null) {
                peerStories2.max_read_id = i9;
                messagesStorage.updateUserInfo(userFull, false);
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null && (peerStories = chatFull.stories) != null) {
                peerStories.max_read_id = i9;
                messagesStorage.updateChatInfo(chatFull, false);
            }
        }
        messagesStorage.getStorageQueue().postRunnable(new g7(this, j10, i9, 1));
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
            for (int i9 = 0; i9 < list.size(); i9++) {
                MessageObject messageObject = (MessageObject) list.get(i9);
                int i10 = 0;
                while (i10 < 2) {
                    if (messageObject.messageOwner.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement = i10 == 0 ? executeFast : executeFast2;
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
                        SQLitePreparedStatement sQLitePreparedStatement2 = i10 == 0 ? executeFast3 : executeFast4;
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
                    i10++;
                }
            }
            executeFast.dispose();
            executeFast2.dispose();
            executeFast3.dispose();
            executeFast4.dispose();
        } catch (Throwable th) {
            messagesStorage.checkSQLException(th);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.b.getStorageQueue().postRunnable(new e5.w(this, j10, storyItem, 9));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            FileLog.e("StoriesStorage: try write deleted story");
        }
        if (p7.w(this.a, storyItem)) {
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
            NativeByteBuffer b10 = j8.b(storyItem);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
