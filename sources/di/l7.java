package di;

import android.text.TextUtils;
import bi.ab;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a00;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yr;
import org.telegram.messenger.zz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l7 {
    public int a;
    public yr b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024d A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(l7 l7Var, y5 y5Var) {
        boolean z9;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        int i7;
        int i10;
        int i11;
        TLRPC.Peer peer;
        yr yrVar = l7Var.b;
        SQLiteDatabase sQLiteDatabase2 = yrVar.b;
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = l7Var.a;
        ConnectionsManager.getInstance(i12).getCurrentTime();
        boolean z10 = true;
        try {
            int i13 = 0;
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
                    } catch (Throwable th2) {
                        th = th2;
                        z9 = true;
                        sQLiteCursor = queryFinalized;
                        try {
                            org.telegram.messenger.a8.g(th, z9);
                            org.telegram.messenger.g0.h3(new ab(y5Var, 28));
                            return;
                        } finally {
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        }
                    }
                }
                queryFinalized.dispose();
                int i14 = 0;
                while (i14 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i14);
                    int valueAt = longSparseIntArray.valueAt(i14);
                    Locale locale = Locale.US;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + keyAt, new Object[i13]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        ?? r82 = z10;
                        while (sQLiteCursor2.next()) {
                            LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
                            NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(i13);
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(r82);
                            if (byteBufferValue != 0) {
                                sQLiteDatabase = sQLiteDatabase2;
                                TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                TLdeserialize.dialogId = keyAt;
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                    yr.c(peer, arrayList2, arrayList3);
                                }
                                int i15 = 0;
                                while (i15 < TLdeserialize.media_areas.size()) {
                                    if (TLdeserialize.media_areas.get(i15) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i10 = i12;
                                        i11 = i15;
                                        long j3 = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i15)).channel_id;
                                        if (!arrayList3.contains(Long.valueOf(j3))) {
                                            arrayList3.add(Long.valueOf(j3));
                                        }
                                    } else {
                                        i10 = i12;
                                        i11 = i15;
                                    }
                                    i15 = i11 + 1;
                                    i12 = i10;
                                }
                                i7 = i12;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    yr.c(peer2, arrayList2, arrayList3);
                                }
                                m8.a(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = sQLiteDatabase2;
                                i7 = i12;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            i12 = i7;
                            r82 = 1;
                            i13 = 0;
                        }
                        LongSparseIntArray longSparseIntArray3 = longSparseIntArray;
                        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
                        int i16 = i12;
                        sQLiteCursor2.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = valueAt;
                        tL_peerStories.peer = qp.s1(i16).z1(keyAt);
                        arrayList.add(tL_peerStories);
                        i14++;
                        longSparseIntArray = longSparseIntArray3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        i12 = i16;
                        z10 = true;
                        i13 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        z9 = true;
                        sQLiteCursor = sQLiteCursor2;
                        org.telegram.messenger.a8.g(th, z9);
                        org.telegram.messenger.g0.h3(new ab(y5Var, 28));
                        return;
                    }
                }
                int i17 = i12;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = yrVar.l0(arrayList2);
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    yrVar.Q(TextUtils.join(",", arrayList3), arrayList5);
                } catch (Exception e10) {
                    arrayList5.clear();
                    yrVar.o(e10, true);
                }
                tL_stories_allStories.chats = arrayList5;
                int i18 = 0;
                while (i18 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i18);
                    long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                    SQLiteDatabase sQLiteDatabase4 = yrVar.b;
                    int i19 = 0;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i19 < arrayList6.size()) {
                        TL_stories.StoryItem storyItem = arrayList6.get(i19);
                        if (currentTime > arrayList6.get(i19).expire_date) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                                arrayList7 = new ArrayList();
                            }
                            arrayList8.add(Integer.valueOf(storyItem.id));
                            arrayList7.add(storyItem);
                            arrayList6.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                    if (arrayList7 != null) {
                        String join = TextUtils.join(", ", arrayList8);
                        try {
                            Locale locale2 = Locale.US;
                            sQLiteDatabase4.executeFast("DELETE FROM stories WHERE dialog_id = " + o4 + " AND story_id IN (" + join + ")").stepThis().dispose();
                        } catch (SQLiteException e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i18);
                        i18--;
                    }
                    Collections.sort(peerStories.stories, y6.X);
                    i18++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$-CC.comparingInt(new bg.d(9)));
                org.telegram.messenger.g0.h3(new z0(18, y5Var, tL_stories_allStories));
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor2 = queryFinalized;
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
            sQLiteCursor = null;
        }
    }

    public static void b(int i7, long j3, ij ijVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = ijVar.k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = c(i7, j3, storyItem);
        }
        int i10 = ijVar.D;
        if (i10 == 23 || i10 == 24) {
            j1 j1Var = new j1();
            j1Var.user_id = org.telegram.messenger.m5.o(ijVar.k.media.peer);
            TLRPC.MessageMedia messageMedia = ijVar.k.media;
            j1Var.peer = messageMedia.peer;
            j1Var.id = messageMedia.id;
            j1Var.storyItem = c(i7, j3, storyItem);
            TLRPC.Message message2 = ijVar.k;
            j1Var.via_mention = message2.media.via_mention;
            message2.media = j1Var;
        }
        TLRPC.MessageMedia messageMedia2 = ijVar.k.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i11 = 0; i11 < ijVar.k.media.webpage.attributes.size(); i11++) {
            TLRPC.WebPageAttribute webPageAttribute = ijVar.k.media.webpage.attributes.get(i11);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = c(i7, j3, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i7, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        int i10 = storyItem.expire_date;
        boolean z9 = false;
        if (i10 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i10) {
            z9 = true;
        }
        if (storyItem.pinned || !z9 || j3 == 0 || j3 == p10.i(i7).n) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int e(ij ijVar) {
        TLRPC.WebPage webPage;
        int i7 = ijVar.D;
        if (i7 == 23 || i7 == 24) {
            return ijVar.k.media.id;
        }
        TLRPC.MessageMedia messageMedia = ijVar.k.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i10 = 0; i10 < ijVar.k.media.webpage.attributes.size(); i10++) {
                TLRPC.WebPageAttribute webPageAttribute = ijVar.k.media.webpage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return ijVar.k.reply_to.story_id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i7, boolean z9, a00 a00Var) {
        l7 l7Var = this;
        a00 a00Var2 = a00Var;
        int i10 = l7Var.a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        zz d = a00.d(a00Var2, "fillMessagesWithStories: applying stories for existing array");
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j3 = hVar.j(i11);
            ArrayList arrayList2 = (ArrayList) hVar.n(i11);
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                ij ijVar = (ij) arrayList2.get(i12);
                TL_stories.StoryItem f10 = l7Var.f(e(ijVar), j3);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i10, j3, ijVar, f10);
                    arrayList.add(ijVar);
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
        a00.a(d);
        if (z9) {
            l7Var.j(arrayList);
        }
        if (hVar.i()) {
            runnable.run();
            return;
        }
        int[] iArr = {hVar.m()};
        int i13 = 0;
        while (i13 < hVar.m()) {
            long j10 = hVar.j(i13);
            ArrayList arrayList3 = (ArrayList) hVar.n(i13);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = qp.s1(i10).j1(j10);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(e((ij) arrayList3.get(i14))));
            }
            StringBuilder t6 = a8.p0.t(j10, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            t6.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new k7(l7Var, a00.d(a00Var2, t6.toString()), arrayList3, j10, z9, a00Var2, iArr, runnable));
            if (i7 != 0) {
                ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequest, i7);
            }
            i13++;
            l7Var = this;
            a00Var2 = a00Var;
        }
    }

    public final TL_stories.StoryItem f(int i7, long j3) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j3 + " AND story_id = " + i7, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j3;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    m8.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e10) {
            org.telegram.messenger.a8.g(e10, true);
            return storyItem;
        }
    }

    public final void g(long j3, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i7);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j3);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = m8.b(storyItem);
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
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(long j3, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j3);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = m8.b(storyItem);
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
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void i(int i7, long j3) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.a;
        yr yrVar = this.b;
        if (j3 > 0) {
            TLRPC.UserFull b22 = qp.s1(i10).b2(j3);
            if (b22 != null && (peerStories2 = b22.stories) != null) {
                peerStories2.max_read_id = i7;
                yrVar.j2(b22, false);
            }
        } else {
            TLRPC.ChatFull N0 = qp.s1(i10).N0(-j3);
            if (N0 != null && (peerStories = N0.stories) != null) {
                peerStories.max_read_id = i7;
                yrVar.N1(N0, false);
            }
        }
        yrVar.a.c(new i7(this, j3, i7, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        yr yrVar = this.b;
        int i7 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = yrVar.b;
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            int i10 = 0;
            while (i10 < list.size()) {
                ij ijVar = (ij) list.get(i10);
                int i11 = 0;
                while (i11 < 2) {
                    if (ijVar.k.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i11 == 0 ? executeFast : executeFast2;
                        if (sQLitePreparedStatement2 == null) {
                            sQLitePreparedStatement = executeFast;
                        } else {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ijVar.k.replyStory.getObjectSize());
                            ijVar.k.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(i7, nativeByteBuffer);
                            sQLitePreparedStatement2.bindInteger(2, ijVar.f1());
                            sQLitePreparedStatement = executeFast;
                            sQLitePreparedStatement2.bindLong(3, ij.B0(ijVar.k));
                            sQLitePreparedStatement2.step();
                        }
                    } else {
                        sQLitePreparedStatement = executeFast;
                        SQLitePreparedStatement sQLitePreparedStatement3 = i11 == 0 ? executeFast3 : executeFast4;
                        if (sQLitePreparedStatement3 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(ijVar.k.getObjectSize());
                            ijVar.k.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement3.requery();
                            sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement3.bindInteger(2, ijVar.f1());
                            sQLitePreparedStatement3.bindLong(3, ij.B0(ijVar.k));
                            sQLitePreparedStatement3.step();
                        }
                    }
                    i11++;
                    executeFast = sQLitePreparedStatement;
                    i7 = 1;
                }
                i10++;
                i7 = 1;
            }
            executeFast.dispose();
            executeFast2.dispose();
            executeFast3.dispose();
            executeFast4.dispose();
        } catch (Throwable th2) {
            yrVar.o(th2, true);
        }
    }

    public final void k(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0) {
            return;
        }
        this.b.a.c(new bi.d3(this, j3, storyItem, 7));
    }

    public final void l(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            org.telegram.messenger.a8.d("StoriesStorage: try write deleted story");
        }
        if (r7.w(this.a, storyItem)) {
            org.telegram.messenger.a8.d("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j3);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = m8.b(storyItem);
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
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
