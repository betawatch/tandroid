package org.telegram.ui.Stories;

import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.ToIntFunction;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* loaded from: classes5.dex */
public class StoriesStorage {
    int currentAccount;
    MessagesStorage storage;

    public StoriesStorage(int i) {
        this.currentAccount = i;
        this.storage = MessagesStorage.getInstance(i);
    }

    public void getAllStories(final Consumer consumer) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$9u6F3myX5xQvhHtjDkuGo-UPy7E(StoriesStorage.this, consumer);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$9u6F3myX5xQvhHtjDkuGo-UPy7E(StoriesStorage storiesStorage, final Consumer consumer) {
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        SQLiteDatabase database = storiesStorage.storage.getDatabase();
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        ConnectionsManager.getInstance(storiesStorage.currentAccount).getCurrentTime();
        try {
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            try {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(0);
                    longSparseIntArray.put(longValue, queryFinalized.intValue(1));
                    if (longValue > 0) {
                        arrayList2.add(Long.valueOf(longValue));
                    } else {
                        arrayList3.add(Long.valueOf(longValue));
                    }
                }
                queryFinalized.dispose();
                int i6 = 0;
                while (i6 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i6);
                    int valueAt = longSparseIntArray.valueAt(i6);
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[i5];
                    objArr[i4] = Long.valueOf(keyAt);
                    sQLiteCursor = database.queryFinalized(String.format(locale, "SELECT data, custom_params FROM stories WHERE dialog_id = %d", objArr), new Object[i4]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        ?? r3 = i5;
                        sQLiteCursor = sQLiteCursor;
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(i4);
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(r3);
                            if (byteBufferValue != 0) {
                                sQLiteDatabase = database;
                                TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r3), r3);
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
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda11
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Consumer.this.accept(null);
                                                }
                                            });
                                            return;
                                        } finally {
                                            if (sQLiteCursor != 0) {
                                                sQLiteCursor.dispose();
                                            }
                                        }
                                    }
                                }
                                obj = sQLiteCursor;
                                int i7 = 0;
                                while (i7 < TLdeserialize.media_areas.size()) {
                                    try {
                                        if (TLdeserialize.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                            i3 = i6;
                                            long j = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i7)).channel_id;
                                            i2 = i7;
                                            if (!arrayList3.contains(Long.valueOf(j))) {
                                                arrayList3.add(Long.valueOf(j));
                                            }
                                        } else {
                                            i2 = i7;
                                            i3 = i6;
                                        }
                                        i7 = i2 + 1;
                                        i6 = i3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteCursor = obj;
                                        FileLog.e(th);
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda11
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Consumer.this.accept(null);
                                            }
                                        });
                                        return;
                                    }
                                }
                                i = i6;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    MessagesStorage.addLoadPeerInfo(peer2, arrayList2, arrayList3);
                                }
                                StoryCustomParamsHelper.readLocalParams(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = database;
                                obj = sQLiteCursor;
                                i = i6;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            database = sQLiteDatabase;
                            sQLiteCursor = obj;
                            i6 = i;
                            i4 = 0;
                            r3 = 1;
                        }
                        SQLiteDatabase sQLiteDatabase2 = database;
                        int i8 = i6;
                        sQLiteCursor.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = valueAt;
                        tL_peerStories.peer = MessagesController.getInstance(storiesStorage.currentAccount).getPeer(keyAt);
                        arrayList.add(tL_peerStories);
                        i6 = i8 + 1;
                        database = sQLiteDatabase2;
                        i4 = 0;
                        i5 = 1;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                final TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = storiesStorage.storage.getUsers(arrayList2);
                tL_stories_allStories.chats = storiesStorage.storage.getChats(arrayList3);
                int i9 = 0;
                while (i9 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i9);
                    storiesStorage.checkExpiredStories(DialogObject.getPeerDialogId(peerStories.peer), peerStories.stories);
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i9);
                        i9--;
                    }
                    Collections.sort(peerStories.stories, StoriesController.storiesComparator);
                    i9++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda9
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj2) {
                        return StoriesStorage.$r8$lambda$oObnqwHhX94CgPGTFQagIu0JO2g((TL_stories.PeerStories) obj2);
                    }
                }));
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        Consumer.this.accept(tL_stories_allStories);
                    }
                });
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor = queryFinalized;
            }
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = 0;
        }
    }

    public static /* synthetic */ int $r8$lambda$oObnqwHhX94CgPGTFQagIu0JO2g(TL_stories.PeerStories peerStories) {
        return -peerStories.stories.get(r1.size() - 1).date;
    }

    private void checkExpiredStories(long j, ArrayList arrayList) {
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        SQLiteDatabase database = this.storage.getDatabase();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        while (i < arrayList.size()) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i);
            if (currentTime > ((TL_stories.StoryItem) arrayList.get(i)).expire_date) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    arrayList2 = new ArrayList();
                }
                arrayList3.add(Integer.valueOf(storyItem.id));
                arrayList2.add(storyItem);
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (arrayList2 != null) {
            try {
                database.executeFast(String.format(Locale.US, "DELETE FROM stories WHERE dialog_id = %d AND story_id IN (%s)", Long.valueOf(j), TextUtils.join(", ", arrayList3))).stepThis().dispose();
            } catch (SQLiteException e) {
                FileLog.e(e);
            }
        }
    }

    public void putStoriesInternal(long j, TL_stories.PeerStories peerStories) {
        SQLiteDatabase database = this.storage.getDatabase();
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i = 0; i < arrayList.size(); i++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.e("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer writeLocalParams = StoryCustomParamsHelper.writeLocalParams(storyItem);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(4, writeLocalParams);
                        } else {
                            executeFast.bindNull(4);
                        }
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                database.executeFast(String.format(Locale.US, "REPLACE INTO stories_counter VALUES(%d, %d, %d)", Long.valueOf(j), 0, Integer.valueOf(peerStories.max_read_id))).stepThis().dispose();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void putStoryInternal(long j, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.storage.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                FileLog.e("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer writeLocalParams = StoryCustomParamsHelper.writeLocalParams(storyItem);
            if (writeLocalParams != null) {
                executeFast.bindByteBuffer(4, writeLocalParams);
            } else {
                executeFast.bindNull(4);
            }
            if (writeLocalParams != null) {
                writeLocalParams.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveAllStories(final ArrayList arrayList, final boolean z, final boolean z2, final Runnable runnable) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$cEMW7KIIg8IWNomCfG0c8G3HjbU(StoriesStorage.this, arrayList, z, z2, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$cEMW7KIIg8IWNomCfG0c8G3HjbU(StoriesStorage storiesStorage, ArrayList arrayList, boolean z, boolean z2, Runnable runnable) {
        SQLiteDatabase database = storiesStorage.storage.getDatabase();
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i);
            storiesStorage.fillSkippedStories(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
        }
        if (!z) {
            try {
                SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                ArrayList arrayList2 = new ArrayList();
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(0);
                    if (longValue > 0) {
                        TLRPC.User user = MessagesController.getInstance(storiesStorage.currentAccount).getUser(Long.valueOf(longValue));
                        if (user == null) {
                            user = MessagesStorage.getInstance(storiesStorage.currentAccount).getUser(longValue);
                        }
                        if (user == null || (user.stories_hidden == z2 && !arrayList2.contains(Long.valueOf(longValue)))) {
                            arrayList2.add(Long.valueOf(longValue));
                        }
                    } else {
                        long j = -longValue;
                        TLRPC.Chat chat = MessagesController.getInstance(storiesStorage.currentAccount).getChat(Long.valueOf(j));
                        if (chat == null) {
                            chat = MessagesStorage.getInstance(storiesStorage.currentAccount).getChat(j);
                        }
                        if (chat == null || (chat.stories_hidden == z2 && !arrayList2.contains(Long.valueOf(longValue)))) {
                            arrayList2.add(Long.valueOf(longValue));
                        }
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList2));
                }
                database.executeFast(String.format(Locale.US, "DELETE FROM stories WHERE dialog_id IN(%s)", TextUtils.join(",", arrayList2))).stepThis().dispose();
            } catch (Throwable th) {
                storiesStorage.storage.checkSQLException(th);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i2);
            storiesStorage.putStoriesInternal(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    private void fillSkippedStories(long j, TL_stories.PeerStories peerStories) {
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                        TL_stories.StoryItem storyInternal = getStoryInternal(j, arrayList.get(i).id);
                        if (storyInternal instanceof TL_stories.TL_storyItem) {
                            arrayList.set(i, storyInternal);
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private TL_stories.StoryItem getStoryInternal(long j, int i) {
        TL_stories.StoryItem storyItem = null;
        try {
            SQLiteCursor queryFinalized = this.storage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, custom_params FROM stories WHERE dialog_id = %d AND story_id = %d", Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    StoryCustomParamsHelper.readLocalParams(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e) {
            FileLog.e(e);
            return storyItem;
        }
    }

    public void updateStoryItem(final long j, final TL_stories.StoryItem storyItem) {
        if (j == 0) {
            return;
        }
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.this.updateStoryItemInternal(j, storyItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStoryItemInternal(long j, TL_stories.StoryItem storyItem) {
        if (j == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            FileLog.e("StoriesStorage: try write deleted story");
        }
        if (StoriesUtilities.isExpired(this.currentAccount, storyItem)) {
            FileLog.e("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement executeFast = this.storage.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer writeLocalParams = StoryCustomParamsHelper.writeLocalParams(storyItem);
            if (writeLocalParams != null) {
                executeFast.bindByteBuffer(4, writeLocalParams);
            } else {
                executeFast.bindNull(4);
            }
            if (writeLocalParams != null) {
                writeLocalParams.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateMaxReadId(final long j, final int i) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
            if (userFull != null && (peerStories2 = userFull.stories) != null) {
                peerStories2.max_read_id = i;
                this.storage.updateUserInfo(userFull, false);
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
            if (chatFull != null && (peerStories = chatFull.stories) != null) {
                peerStories.max_read_id = i;
                this.storage.updateChatInfo(chatFull, false);
            }
        }
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$AuajkYelCKau3o_eAmqICG165jA(StoriesStorage.this, j, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$AuajkYelCKau3o_eAmqICG165jA(StoriesStorage storiesStorage, long j, int i) {
        try {
            storiesStorage.storage.getDatabase().executeFast(String.format(Locale.US, "REPLACE INTO stories_counter VALUES(%d, 0, %d)", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
        } catch (Throwable th) {
            storiesStorage.storage.checkSQLException(th);
        }
    }

    public void processUpdate(final TL_stories.TL_updateStory tL_updateStory) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$mZqFznBnJbMFCY3azE97BUgFojY(StoriesStorage.this, tL_updateStory);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0009, B:5:0x0017, B:7:0x0039, B:9:0x0043, B:11:0x0057, B:13:0x005d, B:16:0x00b2, B:18:0x00cf, B:19:0x00d5, B:26:0x0083, B:28:0x0087), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$mZqFznBnJbMFCY3azE97BUgFojY(StoriesStorage storiesStorage, TL_stories.TL_updateStory tL_updateStory) {
        int i;
        boolean z;
        SQLiteDatabase database = storiesStorage.storage.getDatabase();
        try {
            long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
            TL_stories.StoryItem storyItem = tL_updateStory.story;
            int i2 = storyItem.id;
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = database.queryFinalized(String.format(locale, "SELECT data, custom_params FROM stories WHERE dialog_id = %d AND story_id = %d", Long.valueOf(peerDialogId), Integer.valueOf(i2)), new Object[0]);
                if (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        StoryCustomParamsHelper.readLocalParams(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                        byteBufferValue.reuse();
                    }
                    if (byteBufferValue2 != null) {
                        byteBufferValue2.reuse();
                    }
                    z = true;
                } else {
                    z = false;
                }
                queryFinalized.dispose();
                database.executeFast(String.format(locale, "DELETE FROM stories WHERE dialog_id = %d AND story_id = %d", Long.valueOf(peerDialogId), Integer.valueOf(i2))).stepThis().dispose();
                if (z) {
                    i = -1;
                    SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    int intValue = !queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                    queryFinalized2.dispose();
                    database.executeFast(String.format(Locale.US, "UPDATE stories_counter SET count = %d WHERE dialog_id = %d", Integer.valueOf(intValue + i), Long.valueOf(peerDialogId))).stepThis().dispose();
                }
                i = 0;
                SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                if (!queryFinalized22.next()) {
                }
                queryFinalized22.dispose();
                database.executeFast(String.format(Locale.US, "UPDATE stories_counter SET count = %d WHERE dialog_id = %d", Integer.valueOf(intValue + i), Long.valueOf(peerDialogId))).stepThis().dispose();
            }
            if (storyItem instanceof TL_stories.TL_storyItem) {
                storiesStorage.updateStoryItemInternal(peerDialogId, storyItem);
                SQLiteCursor queryFinalized3 = database.queryFinalized(String.format(Locale.US, "SELECT story_id FROM stories WHERE dialog_id = %d AND story_id = %d", Long.valueOf(peerDialogId), Integer.valueOf(i2)), new Object[0]);
                boolean next = queryFinalized3.next();
                queryFinalized3.dispose();
                if (!next) {
                    i = 1;
                    SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    if (!queryFinalized222.next()) {
                    }
                    queryFinalized222.dispose();
                    database.executeFast(String.format(Locale.US, "UPDATE stories_counter SET count = %d WHERE dialog_id = %d", Integer.valueOf(intValue + i), Long.valueOf(peerDialogId))).stepThis().dispose();
                }
            }
            i = 0;
            SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
            if (!queryFinalized2222.next()) {
            }
            queryFinalized2222.dispose();
            database.executeFast(String.format(Locale.US, "UPDATE stories_counter SET count = %d WHERE dialog_id = %d", Integer.valueOf(intValue + i), Long.valueOf(peerDialogId))).stepThis().dispose();
        } catch (Throwable th) {
            storiesStorage.storage.checkSQLException(th);
        }
    }

    public void updateStories(final TL_stories.PeerStories peerStories) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$GFELulQoI13tlGnwYSU_X-KzFYk(StoriesStorage.this, peerStories);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$GFELulQoI13tlGnwYSU_X-KzFYk(StoriesStorage storiesStorage, TL_stories.PeerStories peerStories) {
        storiesStorage.getClass();
        for (int i = 0; i < peerStories.stories.size(); i++) {
            storiesStorage.updateStoryItemInternal(DialogObject.getPeerDialogId(peerStories.peer), peerStories.stories.get(i));
        }
    }

    public void deleteStory(final long j, final int i) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$yW1NvjprxT_aISSA6ZIYCnFektg(StoriesStorage.this, j, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$yW1NvjprxT_aISSA6ZIYCnFektg(StoriesStorage storiesStorage, long j, int i) {
        try {
            storiesStorage.storage.getDatabase().executeFast(String.format(Locale.US, "DELETE FROM stories WHERE dialog_id = %d AND story_id = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
        } catch (Throwable th) {
            storiesStorage.storage.checkSQLException(th);
        }
    }

    public void deleteStories(final long j, final ArrayList arrayList) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$IbGsdsPBiaXDdutN0YFkAcpaJtc(StoriesStorage.this, arrayList, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$IbGsdsPBiaXDdutN0YFkAcpaJtc(StoriesStorage storiesStorage, ArrayList arrayList, long j) {
        SQLiteDatabase database = storiesStorage.storage.getDatabase();
        try {
            database.executeFast(String.format(Locale.US, "DELETE FROM stories WHERE dialog_id = %d AND story_id IN (%s)", Long.valueOf(j), TextUtils.join(", ", arrayList))).stepThis().dispose();
        } catch (Throwable th) {
            storiesStorage.storage.checkSQLException(th);
        }
    }

    public void fillMessagesWithStories(LongSparseArray longSparseArray, Runnable runnable, int i, Timer timer) {
        fillMessagesWithStories(longSparseArray, runnable, i, true, timer);
    }

    public void fillMessagesWithStories(LongSparseArray longSparseArray, final Runnable runnable, int i, final boolean z, Timer timer) {
        final Timer timer2 = timer;
        if (runnable == null) {
            return;
        }
        if (longSparseArray == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Timer.Task start = Timer.start(timer2, "fillMessagesWithStories: applying stories for existing array");
        int i2 = 0;
        while (i2 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i2);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i2);
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i3);
                TL_stories.StoryItem storyInternal = getStoryInternal(keyAt, getStoryId(messageObject));
                if (storyInternal != null && !(storyInternal instanceof TL_stories.TL_storyItemSkipped)) {
                    applyStory(this.currentAccount, keyAt, messageObject, storyInternal);
                    arrayList.add(messageObject);
                    arrayList2.remove(i3);
                    i3--;
                    if (arrayList2.isEmpty()) {
                        longSparseArray.removeAt(i2);
                        i2--;
                    }
                }
                i3++;
            }
            i2++;
        }
        Timer.done(start);
        if (z) {
            updateMessagesWithStories(arrayList);
        }
        if (!longSparseArray.isEmpty()) {
            final int[] iArr = {longSparseArray.size()};
            int i4 = 0;
            while (i4 < longSparseArray.size()) {
                final long keyAt2 = longSparseArray.keyAt(i4);
                final ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i4);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(keyAt2);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(getStoryId((MessageObject) arrayList3.get(i5))));
                }
                final Timer.Task start2 = Timer.start(timer2, "fillMessagesWithStories: getStoriesByID did=" + keyAt2 + " ids=" + TextUtils.join(",", tL_stories_getStoriesByID.id));
                int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StoriesStorage.$r8$lambda$utWQU-wJSy8Hgkkvu7-nb4tyueM(StoriesStorage.this, start2, arrayList3, keyAt2, z, timer2, iArr, runnable, tLObject, tL_error);
                    }
                });
                if (i != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, i);
                }
                i4++;
                timer2 = timer;
            }
            return;
        }
        runnable.run();
    }

    public static /* synthetic */ void $r8$lambda$utWQU-wJSy8Hgkkvu7-nb4tyueM(final StoriesStorage storiesStorage, Timer.Task task, final ArrayList arrayList, long j, boolean z, Timer timer, int[] iArr, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesStorage.getClass();
        Timer.done(task);
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < tL_stories_stories.stories.size()) {
                        if (tL_stories_stories.stories.get(i2).id == getStoryId(messageObject)) {
                            applyStory(storiesStorage.currentAccount, j, messageObject, tL_stories_stories.stories.get(i2));
                            break;
                        }
                        i2++;
                    } else {
                        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                        tL_storyItemDeleted.id = getStoryId(messageObject);
                        applyStory(storiesStorage.currentAccount, j, messageObject, tL_storyItemDeleted);
                        break;
                    }
                }
                if (z) {
                    storiesStorage.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            StoriesStorage.this.updateMessagesWithStories(arrayList);
                        }
                    });
                }
            }
        } else if (tL_error != null) {
            Timer.log(timer, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
        }
        int i3 = iArr[0] - 1;
        iArr[0] = i3;
        if (i3 == 0) {
            runnable.run();
        }
    }

    public static void applyStory(int i, long j, MessageObject messageObject, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = checkExpiredStateLocal(i, j, storyItem);
        }
        int i2 = messageObject.type;
        if (i2 == 23 || i2 == 24) {
            MessageMediaStoryFull messageMediaStoryFull = new MessageMediaStoryFull();
            messageMediaStoryFull.user_id = DialogObject.getPeerDialogId(messageObject.messageOwner.media.peer);
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            messageMediaStoryFull.peer = messageMedia.peer;
            messageMediaStoryFull.id = messageMedia.id;
            messageMediaStoryFull.storyItem = checkExpiredStateLocal(i, j, storyItem);
            TLRPC.Message message2 = messageObject.messageOwner;
            messageMediaStoryFull.via_mention = message2.media.via_mention;
            message2.media = messageMediaStoryFull;
        }
        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i3 = 0; i3 < messageObject.messageOwner.media.webpage.attributes.size(); i3++) {
            TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i3);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = checkExpiredStateLocal(i, j, storyItem);
                }
            }
        }
    }

    private static int getStoryId(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        int i = messageObject.type;
        if (i == 23 || i == 24) {
            return messageObject.messageOwner.media.id;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i2 = 0; i2 < messageObject.messageOwner.media.webpage.attributes.size(); i2++) {
                TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i2);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return messageObject.messageOwner.reply_to.story_id;
    }

    public void updateMessagesWithStories(List list) {
        try {
            SQLiteDatabase database = this.storage.getDatabase();
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement executeFast = database.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast2 = database.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast3 = database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast4 = database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            for (int i = 0; i < list.size(); i++) {
                MessageObject messageObject = (MessageObject) list.get(i);
                int i2 = 0;
                while (i2 < 2) {
                    if (messageObject.messageOwner.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement = i2 == 0 ? executeFast : executeFast2;
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
                        SQLitePreparedStatement sQLitePreparedStatement2 = i2 == 0 ? executeFast3 : executeFast4;
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
                    i2++;
                }
            }
            executeFast.dispose();
            executeFast2.dispose();
            executeFast3.dispose();
            executeFast4.dispose();
        } catch (Throwable th) {
            this.storage.checkSQLException(th);
        }
    }

    public static TL_stories.StoryItem checkExpiredStateLocal(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        int i2 = storyItem.expire_date;
        boolean z = i2 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i2;
        if (storyItem.pinned || !z || j == 0 || j == UserConfig.getInstance(i).clientUserId) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public void getMaxReadIds(final Consumer consumer) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$Iigzwfpurb5ZkJ-Nj0Rzj2cctUY(StoriesStorage.this, consumer);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Iigzwfpurb5ZkJ-Nj0Rzj2cctUY(StoriesStorage storiesStorage, final Consumer consumer) {
        SQLiteDatabase database = storiesStorage.storage.getDatabase();
        final LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        try {
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            while (queryFinalized.next()) {
                longSparseIntArray.put(queryFinalized.longValue(0), queryFinalized.intValue(1));
            }
        } catch (Exception e) {
            storiesStorage.storage.checkSQLException(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Consumer.this.accept(longSparseIntArray);
            }
        });
    }

    public void putPeerStories(final TL_stories.PeerStories peerStories) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$2q3trS93R5ZsuJpcM6-B6KcCFWQ(StoriesStorage.this, peerStories);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$2q3trS93R5ZsuJpcM6-B6KcCFWQ(StoriesStorage storiesStorage, TL_stories.PeerStories peerStories) {
        storiesStorage.getClass();
        storiesStorage.putStoriesInternal(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
    }

    public void deleteAllUserStories(final long j) {
        this.storage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StoriesStorage.$r8$lambda$MAdiU7YTC9DdCdZumHASVeuug34(StoriesStorage.this, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$MAdiU7YTC9DdCdZumHASVeuug34(StoriesStorage storiesStorage, long j) {
        try {
            storiesStorage.storage.getDatabase().executeFast(String.format(Locale.US, "DELETE FROM stories WHERE dialog_id = %d", Long.valueOf(j))).stepThis().dispose();
        } catch (Throwable th) {
            storiesStorage.storage.checkSQLException(th);
        }
    }
}
