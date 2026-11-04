package ei;

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
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.rz;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.sz;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m7 {
    public int a;
    public qr b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024d A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(m7 m7Var, y5 y5Var) {
        boolean z10;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        int i3;
        int i10;
        int i11;
        TLRPC.Peer peer;
        qr qrVar = m7Var.b;
        SQLiteDatabase sQLiteDatabase2 = qrVar.b;
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = m7Var.a;
        ConnectionsManager.getInstance(i12).getCurrentTime();
        boolean z11 = true;
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
                        z10 = true;
                        sQLiteCursor = queryFinalized;
                        try {
                            org.telegram.messenger.a8.g(th, z10);
                            org.telegram.messenger.g0.h3(new z5(y5Var, 3));
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
                        ?? r82 = z11;
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
                                    qr.c(peer, arrayList2, arrayList3);
                                }
                                int i15 = 0;
                                while (i15 < TLdeserialize.media_areas.size()) {
                                    if (TLdeserialize.media_areas.get(i15) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i10 = i12;
                                        i11 = i15;
                                        long j10 = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i15)).channel_id;
                                        if (!arrayList3.contains(Long.valueOf(j10))) {
                                            arrayList3.add(Long.valueOf(j10));
                                        }
                                    } else {
                                        i10 = i12;
                                        i11 = i15;
                                    }
                                    i15 = i11 + 1;
                                    i12 = i10;
                                }
                                i3 = i12;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    qr.c(peer2, arrayList2, arrayList3);
                                }
                                m8.a(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = sQLiteDatabase2;
                                i3 = i12;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            i12 = i3;
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
                        tL_peerStories.peer = hp.s1(i16).z1(keyAt);
                        arrayList.add(tL_peerStories);
                        i14++;
                        longSparseIntArray = longSparseIntArray3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        i12 = i16;
                        z11 = true;
                        i13 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = true;
                        sQLiteCursor = sQLiteCursor2;
                        org.telegram.messenger.a8.g(th, z10);
                        org.telegram.messenger.g0.h3(new z5(y5Var, 3));
                        return;
                    }
                }
                int i17 = i12;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = qrVar.l0(arrayList2);
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    qrVar.Q(TextUtils.join(",", arrayList3), arrayList5);
                } catch (Exception e10) {
                    arrayList5.clear();
                    qrVar.o(e10, true);
                }
                tL_stories_allStories.chats = arrayList5;
                int i18 = 0;
                while (i18 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i18);
                    long o10 = org.telegram.messenger.m5.o(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                    SQLiteDatabase sQLiteDatabase4 = qrVar.b;
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
                            sQLiteDatabase4.executeFast("DELETE FROM stories WHERE dialog_id = " + o10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                        } catch (SQLiteException e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i18);
                        i18--;
                    }
                    Collections.sort(peerStories.stories, z6.X);
                    i18++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$-CC.comparingInt(new cg.d(9)));
                org.telegram.messenger.g0.h3(new b0(21, y5Var, tL_stories_allStories));
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor2 = queryFinalized;
            }
        } catch (Throwable th5) {
            th = th5;
            z10 = true;
            sQLiteCursor = null;
        }
    }

    public static void b(int i3, long j10, zi ziVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = ziVar.k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = c(i3, j10, storyItem);
        }
        int i10 = ziVar.D;
        if (i10 == 23 || i10 == 24) {
            o1 o1Var = new o1();
            o1Var.user_id = org.telegram.messenger.m5.o(ziVar.k.media.peer);
            TLRPC.MessageMedia messageMedia = ziVar.k.media;
            o1Var.peer = messageMedia.peer;
            o1Var.id = messageMedia.id;
            o1Var.storyItem = c(i3, j10, storyItem);
            TLRPC.Message message2 = ziVar.k;
            o1Var.via_mention = message2.media.via_mention;
            message2.media = o1Var;
        }
        TLRPC.MessageMedia messageMedia2 = ziVar.k.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i11 = 0; i11 < ziVar.k.media.webpage.attributes.size(); i11++) {
            TLRPC.WebPageAttribute webPageAttribute = ziVar.k.media.webpage.attributes.get(i11);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = c(i3, j10, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i3, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        int i10 = storyItem.expire_date;
        boolean z10 = false;
        if (i10 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i10) {
            z10 = true;
        }
        if (storyItem.pinned || !z10 || j10 == 0 || j10 == h10.i(i3).n) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int e(zi ziVar) {
        TLRPC.WebPage webPage;
        int i3 = ziVar.D;
        if (i3 == 23 || i3 == 24) {
            return ziVar.k.media.id;
        }
        TLRPC.MessageMedia messageMedia = ziVar.k.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i10 = 0; i10 < ziVar.k.media.webpage.attributes.size(); i10++) {
                TLRPC.WebPageAttribute webPageAttribute = ziVar.k.media.webpage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return ziVar.k.reply_to.story_id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i3, boolean z10, sz szVar) {
        m7 m7Var = this;
        sz szVar2 = szVar;
        int i10 = m7Var.a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        rz d = sz.d(szVar2, "fillMessagesWithStories: applying stories for existing array");
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j10 = hVar.j(i11);
            ArrayList arrayList2 = (ArrayList) hVar.n(i11);
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                zi ziVar = (zi) arrayList2.get(i12);
                TL_stories.StoryItem f10 = m7Var.f(e(ziVar), j10);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i10, j10, ziVar, f10);
                    arrayList.add(ziVar);
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
        sz.a(d);
        if (z10) {
            m7Var.j(arrayList);
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
            tL_stories_getStoriesByID.peer = hp.s1(i10).j1(j11);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(e((zi) arrayList3.get(i14))));
            }
            StringBuilder t10 = a1.g.t(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            t10.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new l7(m7Var, sz.d(szVar2, t10.toString()), arrayList3, j11, z10, szVar2, iArr, runnable));
            if (i3 != 0) {
                ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequest, i3);
            }
            i13++;
            m7Var = this;
            szVar2 = szVar;
        }
    }

    public final TL_stories.StoryItem f(int i3, long j10) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i3, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j10;
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

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i3);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j10);
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
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(long j10, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j10);
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

    public final void i(int i3, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.a;
        qr qrVar = this.b;
        if (j10 > 0) {
            TLRPC.UserFull b22 = hp.s1(i10).b2(j10);
            if (b22 != null && (peerStories2 = b22.stories) != null) {
                peerStories2.max_read_id = i3;
                qrVar.j2(b22, false);
            }
        } else {
            TLRPC.ChatFull N0 = hp.s1(i10).N0(-j10);
            if (N0 != null && (peerStories = N0.stories) != null) {
                peerStories.max_read_id = i3;
                qrVar.N1(N0, false);
            }
        }
        qrVar.a.c(new j7(this, j10, i3, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        qr qrVar = this.b;
        int i3 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = qrVar.b;
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            int i10 = 0;
            while (i10 < list.size()) {
                zi ziVar = (zi) list.get(i10);
                int i11 = 0;
                while (i11 < 2) {
                    if (ziVar.k.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i11 == 0 ? executeFast : executeFast2;
                        if (sQLitePreparedStatement2 == null) {
                            sQLitePreparedStatement = executeFast;
                        } else {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ziVar.k.replyStory.getObjectSize());
                            ziVar.k.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(i3, nativeByteBuffer);
                            sQLitePreparedStatement2.bindInteger(2, ziVar.f1());
                            sQLitePreparedStatement = executeFast;
                            sQLitePreparedStatement2.bindLong(3, zi.B0(ziVar.k));
                            sQLitePreparedStatement2.step();
                        }
                    } else {
                        sQLitePreparedStatement = executeFast;
                        SQLitePreparedStatement sQLitePreparedStatement3 = i11 == 0 ? executeFast3 : executeFast4;
                        if (sQLitePreparedStatement3 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(ziVar.k.getObjectSize());
                            ziVar.k.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement3.requery();
                            sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement3.bindInteger(2, ziVar.f1());
                            sQLitePreparedStatement3.bindLong(3, zi.B0(ziVar.k));
                            sQLitePreparedStatement3.step();
                        }
                    }
                    i11++;
                    executeFast = sQLitePreparedStatement;
                    i3 = 1;
                }
                i10++;
                i3 = 1;
            }
            executeFast.dispose();
            executeFast2.dispose();
            executeFast3.dispose();
            executeFast4.dispose();
        } catch (Throwable th2) {
            qrVar.o(th2, true);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.b.a.c(new ai.r1(this, j10, storyItem, 8));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            org.telegram.messenger.a8.d("StoriesStorage: try write deleted story");
        }
        if (s7.w(this.a, storyItem)) {
            org.telegram.messenger.a8.d("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
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
