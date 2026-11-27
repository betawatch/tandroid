// default package

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
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o6b {
    public int a;
    public kf7 b;

    public static void a(int i, long j, r47 r47Var, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = r47Var.k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = b(i, j, storyItem);
        }
        int i2 = r47Var.D;
        if (i2 == 23 || i2 == 24) {
            f47 f47Var = new f47();
            f47Var.user_id = wf3.n(r47Var.k.media.peer);
            TLRPC.MessageMedia messageMedia = r47Var.k.media;
            f47Var.peer = messageMedia.peer;
            f47Var.id = messageMedia.id;
            f47Var.storyItem = b(i, j, storyItem);
            TLRPC.Message message2 = r47Var.k;
            f47Var.via_mention = message2.media.via_mention;
            message2.media = f47Var;
        }
        TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i3 = 0; i3 < r47Var.k.media.webpage.attributes.size(); i3++) {
            TLRPC.WebPageAttribute webPageAttribute = r47Var.k.media.webpage.attributes.get(i3);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = b(i, j, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem b(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        int i2 = storyItem.expire_date;
        boolean z = false;
        if (i2 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i2) {
            z = true;
        }
        if (storyItem.pinned || !z || j == 0 || j == yac.h(i).n) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int d(r47 r47Var) {
        TLRPC.WebPage webPage;
        int i = r47Var.D;
        if (i == 23 || i == 24) {
            return r47Var.k.media.id;
        }
        TLRPC.MessageMedia messageMedia = r47Var.k.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i2 = 0; i2 < r47Var.k.media.webpage.attributes.size(); i2++) {
                TLRPC.WebPageAttribute webPageAttribute = r47Var.k.media.webpage.attributes.get(i2);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return r47Var.k.reply_to.story_id;
    }

    public final void c(zh6 zh6Var, Runnable runnable, int i, boolean z, qsb qsbVar) {
        o6b o6bVar = this;
        qsb qsbVar2 = qsbVar;
        int i2 = o6bVar.a;
        if (zh6Var == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        psb d = qsb.d(qsbVar2, "fillMessagesWithStories: applying stories for existing array");
        int i3 = 0;
        while (i3 < zh6Var.m()) {
            long j = zh6Var.j(i3);
            ArrayList arrayList2 = (ArrayList) zh6Var.n(i3);
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                r47 r47Var = (r47) arrayList2.get(i4);
                TL_stories.StoryItem e = o6bVar.e(d(r47Var), j);
                if (e != null && !(e instanceof TL_stories.TL_storyItemSkipped)) {
                    a(i2, j, r47Var, e);
                    arrayList.add(r47Var);
                    arrayList2.remove(i4);
                    i4--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = zh6Var.c;
                        Object obj = objArr[i3];
                        Object obj2 = ifd.a;
                        if (obj != obj2) {
                            objArr[i3] = obj2;
                            zh6Var.a = true;
                        }
                        i3--;
                    }
                }
                i4++;
            }
            i3++;
        }
        qsb.a(d);
        if (z) {
            o6bVar.j(arrayList);
        }
        if (zh6Var.i()) {
            runnable.run();
            return;
        }
        int[] iArr = {zh6Var.m()};
        int i5 = 0;
        while (i5 < zh6Var.m()) {
            long j2 = zh6Var.j(i5);
            ArrayList arrayList3 = (ArrayList) zh6Var.n(i5);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = uc7.s1(i2).j1(j2);
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(d((r47) arrayList3.get(i6))));
            }
            StringBuilder o = ik8.o(j2, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            o.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new fq6(o6bVar, qsb.d(qsbVar2, o.toString()), arrayList3, j2, z, qsbVar2, iArr, runnable));
            if (i != 0) {
                ConnectionsManager.getInstance(i2).bindRequestToGuid(sendRequest, i);
            }
            i5++;
            o6bVar = this;
            qsbVar2 = qsbVar;
        }
    }

    public final TL_stories.StoryItem e(int i, long j) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j + " AND story_id = " + i, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    w7b.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e) {
            cc4.g(e, true);
            return storyItem;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0253 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(h5b h5bVar) {
        boolean z;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        int i;
        int i2;
        int i3;
        TLRPC.Peer peer;
        kf7 kf7Var = this.b;
        SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i4 = this.a;
        ConnectionsManager.getInstance(i4).getCurrentTime();
        boolean z2 = true;
        try {
            int i5 = 0;
            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            try {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                while (queryFinalized.next()) {
                    try {
                        long longValue = queryFinalized.longValue(0);
                        longSparseIntArray.put(longValue, queryFinalized.intValue(1));
                        if (longValue > 0) {
                            arrayList2.add(Long.valueOf(longValue));
                        } else {
                            arrayList3.add(Long.valueOf(longValue));
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        sQLiteCursor = queryFinalized;
                        try {
                            cc4.g(th, z);
                            hl.c3(new uoa((Object) h5bVar, (byte) 24));
                            return;
                        } finally {
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        }
                    }
                }
                queryFinalized.dispose();
                int i6 = 0;
                while (i6 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i6);
                    int valueAt = longSparseIntArray.valueAt(i6);
                    Locale locale = Locale.US;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + keyAt, new Object[i5]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        ?? r8 = z2;
                        while (sQLiteCursor2.next()) {
                            LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
                            NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(i5);
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(r8);
                            if (byteBufferValue != 0) {
                                sQLiteDatabase = sQLiteDatabase2;
                                TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r8), r8);
                                TLdeserialize.dialogId = keyAt;
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                    kf7.b(peer, arrayList2, arrayList3);
                                }
                                int i7 = 0;
                                while (i7 < TLdeserialize.media_areas.size()) {
                                    if (TLdeserialize.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i2 = i4;
                                        i3 = i7;
                                        long j = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i7)).channel_id;
                                        if (!arrayList3.contains(Long.valueOf(j))) {
                                            arrayList3.add(Long.valueOf(j));
                                        }
                                    } else {
                                        i2 = i4;
                                        i3 = i7;
                                    }
                                    i7 = i3 + 1;
                                    i4 = i2;
                                }
                                i = i4;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    kf7.b(peer2, arrayList2, arrayList3);
                                }
                                w7b.a(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = sQLiteDatabase2;
                                i = i4;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            i4 = i;
                            r8 = 1;
                            i5 = 0;
                        }
                        LongSparseIntArray longSparseIntArray3 = longSparseIntArray;
                        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
                        int i8 = i4;
                        sQLiteCursor2.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = valueAt;
                        tL_peerStories.peer = uc7.s1(i8).y1(keyAt);
                        arrayList.add(tL_peerStories);
                        i6++;
                        longSparseIntArray = longSparseIntArray3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        i4 = i8;
                        z2 = true;
                        i5 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        sQLiteCursor = sQLiteCursor2;
                        cc4.g(th, z);
                        hl.c3(new uoa((Object) h5bVar, (byte) 24));
                        return;
                    }
                }
                int i9 = i4;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = kf7Var.k0(arrayList2);
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    kf7Var.R(TextUtils.join(",", arrayList3), arrayList5);
                } catch (Exception e) {
                    arrayList5.clear();
                    kf7Var.p(e, true);
                }
                tL_stories_allStories.chats = arrayList5;
                int i10 = 0;
                while (true) {
                    int size = tL_stories_allStories.peer_stories.size();
                    ArrayList<TL_stories.PeerStories> arrayList6 = tL_stories_allStories.peer_stories;
                    if (i10 >= size) {
                        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new nm((byte) 21)));
                        hl.c3(new n3b(h5bVar, tL_stories_allStories, (byte) 16));
                        return;
                    }
                    TL_stories.PeerStories peerStories = arrayList6.get(i10);
                    long n = wf3.n(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList7 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
                    SQLiteDatabase sQLiteDatabase4 = kf7Var.b;
                    int i11 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    while (i11 < arrayList7.size()) {
                        TL_stories.StoryItem storyItem = arrayList7.get(i11);
                        if (currentTime > arrayList7.get(i11).expire_date) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                arrayList8 = new ArrayList();
                            }
                            arrayList9.add(Integer.valueOf(storyItem.id));
                            arrayList8.add(storyItem);
                            arrayList7.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    if (arrayList8 != null) {
                        String join = TextUtils.join(", ", arrayList9);
                        try {
                            Locale locale2 = Locale.US;
                            sQLiteDatabase4.executeFast("DELETE FROM stories WHERE dialog_id = " + n + " AND story_id IN (" + join + ")").stepThis().dispose();
                        } catch (SQLiteException e2) {
                            cc4.g(e2, true);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i10);
                        i10--;
                    }
                    Collections.sort(peerStories.stories, c6b.X);
                    i10++;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor2 = queryFinalized;
            }
        } catch (Throwable th4) {
            th = th4;
            z = true;
            sQLiteCursor = null;
        }
    }

    public final void g(long j, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i = 0; i < arrayList.size(); i++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        cc4.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b = w7b.b(storyItem);
                        if (b != null) {
                            executeFast.bindByteBuffer(4, b);
                            b.reuse();
                        } else {
                            executeFast.bindNull(4);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void h(long j, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                cc4.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b = w7b.b(storyItem);
            if (b != null) {
                executeFast.bindByteBuffer(4, b);
                b.reuse();
            } else {
                executeFast.bindNull(4);
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void i(int i, long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        kf7 kf7Var = this.b;
        int i2 = this.a;
        if (j > 0) {
            TLRPC.UserFull Y1 = uc7.s1(i2).Y1(j);
            if (Y1 != null && (peerStories2 = Y1.stories) != null) {
                peerStories2.max_read_id = i;
                kf7Var.l2(Y1, false);
            }
        } else {
            TLRPC.ChatFull N0 = uc7.s1(i2).N0(-j);
            if (N0 != null && (peerStories = N0.stories) != null) {
                peerStories.max_read_id = i;
                kf7Var.P1(N0, false);
            }
        }
        kf7Var.a.c(new m6b(this, j, i, (byte) 1));
    }

    public final void j(List list) {
        kf7 kf7Var = this.b;
        try {
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            for (int i = 0; i < list.size(); i++) {
                r47 r47Var = (r47) list.get(i);
                int i2 = 0;
                while (i2 < 2) {
                    if (r47Var.k.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement = i2 == 0 ? executeFast : executeFast2;
                        if (sQLitePreparedStatement != null) {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(r47Var.k.replyStory.getObjectSize());
                            r47Var.k.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, r47Var.e1());
                            sQLitePreparedStatement.bindLong(3, r47.B0(r47Var.k));
                            sQLitePreparedStatement.step();
                        }
                    } else {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i2 == 0 ? executeFast3 : executeFast4;
                        if (sQLitePreparedStatement2 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(r47Var.k.getObjectSize());
                            r47Var.k.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement2.bindInteger(2, r47Var.e1());
                            sQLitePreparedStatement2.bindLong(3, r47.B0(r47Var.k));
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
            kf7Var.p(th, true);
        }
    }

    public final void k(long j, TL_stories.StoryItem storyItem) {
        if (j == 0) {
            return;
        }
        this.b.a.c(new j5b((Object) this, j, (Object) storyItem, (byte) 2));
    }

    public final void l(long j, TL_stories.StoryItem storyItem) {
        if (j == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            cc4.d("StoriesStorage: try write deleted story");
        }
        if (t6b.w(this.a, storyItem)) {
            cc4.d("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b = w7b.b(storyItem);
            if (b != null) {
                executeFast.bindByteBuffer(4, b);
                b.reuse();
            } else {
                executeFast.bindNull(4);
            }
            executeFast.step();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
