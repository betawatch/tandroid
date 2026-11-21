package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.nu0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d4(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    private final void a() {
        ri riVar = (ri) this.c;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
        long j3 = this.b;
        riVar.getClass();
        try {
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j3);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void b() {
        ri riVar = (ri) this.c;
        TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
        long j3 = this.b;
        riVar.getClass();
        try {
            TL_bots.BotInfo K0 = riVar.K0(tL_updateBotCommands.bot_id, j3);
            if (K0 != null) {
                K0.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(K0.getObjectSize());
            K0.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, K0.user_id);
            executeFast.bindLong(2, j3);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void c() {
        ri riVar = (ri) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        long j3 = this.b;
        try {
            riVar.getMessagesStorage().b.beginTransaction();
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
                fj.q5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j3);
                executeFast.bindInteger(2, message.id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            riVar.getMessagesStorage().b.commitTransaction();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void d() {
        mp mpVar = (mp) this.c;
        TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
        if (mpVar.g8 == null) {
            mpVar.g8 = new a0.h();
        }
        boolean z10 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        long j3 = this.b;
        if (z10) {
            mpVar.g8.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j3);
            mpVar.getNotificationCenter().k(ks.j3, Long.valueOf(j3));
        }
        TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z10) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j3 != 0) {
            tL_messages_getSavedReactionTags.flags |= 1;
            tL_messages_getSavedReactionTags.peer = mpVar.l1(j3);
        }
        mpVar.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new pm(mpVar, j3, messages_savedreactiontags, tL_messages_getSavedReactionTags, 0));
    }

    private final void f() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        or orVar = (or) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            chat = null;
            if (i10 >= updates.chats.size()) {
                chat2 = null;
                break;
            }
            chat2 = updates.chats.get(i10);
            if (this.b == chat2.id) {
                break;
            } else {
                i10++;
            }
        }
        if (chat2 == null || (inputChannel = chat2.migrated_to) == null) {
            return;
        }
        long j3 = inputChannel.channel_id;
        while (true) {
            if (i7 >= updates.chats.size()) {
                break;
            }
            TLRPC.Chat chat3 = updates.chats.get(i7);
            if (j3 == chat3.id) {
                chat = chat3;
                break;
            }
            i7++;
        }
        if (chat != null) {
            orVar.run(j3);
        }
    }

    private final void g() {
        mp mpVar = (mp) this.c;
        long j3 = this.b;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
        SQLiteDatabase sQLiteDatabase = mpVar.getMessagesStorage().b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteDatabase.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j3).stepThis().dispose();
                sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                sQLitePreparedStatement.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindLong(1, j3);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.UserFull userFull;
        tr trVar = (tr) this.c;
        long j3 = this.b;
        TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = trVar.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j3, new Object[0]);
                try {
                    boolean next = sQLiteCursor2.next();
                    if (next) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(1);
                        userFull = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (userFull != null) {
                            userFull.pinned_msg_id = sQLiteCursor2.intValue(2);
                        }
                        byteBufferValue.reuse();
                    } else {
                        userFull = null;
                    }
                    sQLiteCursor2.dispose();
                    if (next && userFull != null && o10.a(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = trVar.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                            userFull.serializeToStream(nativeByteBuffer);
                            executeFast.bindLong(1, j3);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.bindInteger(3, userFull.pinned_msg_id);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor2 = null;
                            sQLitePreparedStatement = executeFast;
                            trVar.o(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = 0;
                            sQLitePreparedStatement = executeFast;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = "SELECT uid, info, pinned FROM user_settings WHERE uid = ";
            }
        } catch (Exception e12) {
            e = e12;
            sQLiteCursor2 = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = 0;
        }
    }

    private final void i() {
        tr trVar = (tr) this.c;
        trVar.getMessagesController().k3((TLRPC.Chat) this.d, this.b);
    }

    private final void j() {
        tr trVar = (tr) this.c;
        trVar.getMessagesController().t7.q(this.b, (TLRPC.TL_forumTopic) this.d, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void k() {
        tr trVar = (tr) this.c;
        long j3 = this.b;
        fi.c6 c6Var = (fi.c6) this.d;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = trVar.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j3 + " ORDER BY order_index ASC", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(fi.i6.a(TLdeserialize));
                        }
                    }
                }
            } catch (Exception e10) {
                trVar.o(e10, true);
            }
            sQLiteCursor.dispose();
            c6Var.x(arrayList);
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.telegram.SQLite.SQLiteDatabase] */
    private final void l() {
        tr trVar = (tr) this.c;
        long j3 = this.b;
        a0.h hVar = (a0.h) this.d;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                trVar.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j3).stepThis().dispose();
                trVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = trVar.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j3);
                        executeFast.bindLong(2, hVar.j(i7));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.n(i7);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        trVar.o(e, true);
                        trVar = trVar.b;
                        if (trVar != 0) {
                            trVar.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase = trVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                trVar.b.commitTransaction();
                trVar = trVar.b;
                if (trVar != 0) {
                    trVar.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final void m() {
        tr trVar = (tr) this.c;
        long j3 = this.b;
        NativeByteBuffer nativeByteBuffer = (NativeByteBuffer) this.d;
        trVar.getClass();
        try {
            SQLitePreparedStatement executeFast = trVar.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j3);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            trVar.o(e10, true);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r6 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void n() {
        tr trVar = (tr) this.c;
        long j3 = this.b;
        List list = (List) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                trVar.b.beginTransaction();
                trVar.b.executeFast("DELETE FROM profile_stories_albums WHERE dialog_id = " + j3).stepThis().dispose();
                sQLitePreparedStatement = trVar.b.executeFast("REPLACE INTO profile_stories_albums VALUES(?, ?, ?, ?)");
                for (int i7 = 0; i7 < list.size(); i7++) {
                    fi.i6 i6Var = (fi.i6) list.get(i7);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, j3);
                    sQLitePreparedStatement.bindInteger(2, i6Var.a);
                    sQLitePreparedStatement.bindInteger(3, i7);
                    TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                    tL_storyAlbum.album_id = i6Var.a;
                    tL_storyAlbum.title = i6Var.b;
                    tL_storyAlbum.icon_photo = i6Var.c;
                    tL_storyAlbum.icon_video = i6Var.d;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_storyAlbum.getObjectSize());
                    tL_storyAlbum.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer.reuse();
                }
            } catch (Exception e10) {
                trVar.o(e10, true);
            }
        } finally {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            trVar.b.commitTransaction();
        }
    }

    private final void o() {
        tr trVar = (tr) this.c;
        SparseArray sparseArray = (SparseArray) this.d;
        trVar.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i7 = 0; i7 < min; i7++) {
                trVar.getNotificationCenter().k(ks.o1, Long.valueOf(this.b), Integer.valueOf(sparseArray.keyAt(i7)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i7));
            }
        }
    }

    private final void p() {
        tr trVar = (tr) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        long j3 = this.b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                trVar.b.beginTransaction();
                TLRPC.TL_message e02 = trVar.e0(message.id, j3);
                ui.a(message, e02);
                int i7 = 0;
                while (i7 < 2) {
                    SQLitePreparedStatement executeFast = i7 == 0 ? trVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : trVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    try {
                        executeFast.requery();
                        NativeByteBuffer c10 = ui.c(e02);
                        if (c10 != null) {
                            executeFast.bindByteBuffer(1, c10);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindLong(3, j3);
                        executeFast.step();
                        executeFast.dispose();
                        if (c10 != null) {
                            c10.reuse();
                        }
                        i7++;
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        trVar.o(e, true);
                        SQLiteDatabase sQLiteDatabase = trVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = trVar.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                trVar.b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = trVar.b;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0633 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05d4 A[Catch: all -> 0x0418, Exception -> 0x05dc, TryCatch #8 {Exception -> 0x05dc, blocks: (B:303:0x05c1, B:305:0x05d4, B:306:0x05e0, B:308:0x05e6, B:309:0x05ea), top: B:302:0x05c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05e6 A[Catch: all -> 0x0418, Exception -> 0x05dc, TryCatch #8 {Exception -> 0x05dc, blocks: (B:303:0x05c1, B:305:0x05d4, B:306:0x05e0, B:308:0x05e6, B:309:0x05ea), top: B:302:0x05c1 }] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v32 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Consumer consumer;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList3;
        ArrayList arrayList4;
        a0.h hVar;
        int size;
        int i7;
        SparseArray sparseArray;
        String str;
        String str2;
        HashSet hashSet;
        NativeByteBuffer byteBufferValue;
        ArrayList arrayList5;
        SparseArray sparseArray2;
        HashSet hashSet2;
        int i10;
        char c10;
        char c11;
        ArrayList arrayList6;
        Boolean bool;
        int i11 = 5;
        SQLiteCursor sQLiteCursor2 = 0;
        r4 = null;
        SQLiteCursor sQLiteCursor3 = null;
        ArrayList arrayList7 = null;
        int i12 = 1;
        ?? r72 = 0;
        switch (this.a) {
            case 0:
                ks.f(((f4) this.c).currentAccount).k(67, Long.valueOf(this.b), (TLRPC.UserFull) this.d);
                return;
            case 1:
                qd qdVar = (qd) this.c;
                long j3 = this.b;
                TLObject tLObject = (TLObject) this.d;
                qdVar.H.e(j3);
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i13 = 0;
                while (i13 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i13).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                qdVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                qdVar.getMessagesController().f4(messages_messages.users, false);
                qdVar.getMessagesController().Z3(messages_messages.chats, false);
                qdVar.c.k(messages_messages.messages, j3);
                ks.e().k(ks.I4, Long.valueOf(j3), Integer.valueOf(qdVar.currentAccount));
                return;
            case 2:
                mp mpVar = (mp) this.c;
                long j10 = this.b;
                TL_update.TL_updateMessageWidgetData tL_updateMessageWidgetData = (TL_update.TL_updateMessageWidgetData) this.d;
                int i14 = mpVar.currentAccount;
                int i15 = tL_updateMessageWidgetData.msg_id;
                String str3 = tL_updateMessageWidgetData.public_data;
                long j11 = tL_updateMessageWidgetData.public_data_hash;
                String str4 = tL_updateMessageWidgetData.chat_data;
                for (org.telegram.utils.twidget.k0 k0Var : org.telegram.utils.twidget.n0.a.values()) {
                    if (!k0Var.k && k0Var.b == i14 && k0Var.c == j10 && k0Var.d == i15) {
                        if (str3 != null) {
                            k0Var.q = j11;
                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var.r;
                            if (tL_messageMediaWidget != null) {
                                tL_messageMediaWidget.public_data_hash = j11;
                            }
                        }
                        org.telegram.utils.twidget.n0.c(k0Var, str4 != null ? org.telegram.utils.twidget.n0.C(str4) : k0Var.o, str3 != null ? org.telegram.utils.twidget.n0.C(str3) : k0Var.p);
                    }
                }
                return;
            case 3:
                mp mpVar2 = (mp) this.c;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.d;
                long j12 = this.b;
                mpVar2.getClass();
                mpVar2.f4(tL_chatInviteJoinResultWebView.users, false);
                l2.b(mpVar2.currentAccount).c(-j12, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 4:
                mp mpVar3 = (mp) this.c;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.d;
                long j13 = this.b;
                mpVar3.getClass();
                mpVar3.f4(tL_messages_invitedUsers.updates.users, false);
                mpVar3.Z3(tL_messages_invitedUsers.updates.chats, false);
                org.telegram.ui.Components.c5.f(mpVar3.currentAccount, mpVar3.O0(Long.valueOf(j13)), tL_messages_invitedUsers);
                return;
            case 5:
                tr trVar = (tr) this.c;
                long j14 = this.b;
                Consumer consumer2 = (Consumer) this.d;
                String str5 = ")";
                String str6 = " AND mid IN (";
                try {
                    sQLiteDatabase = trVar.b;
                    Locale locale = Locale.US;
                } catch (Exception e10) {
                    e = e10;
                    consumer = consumer2;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT top_message, data, topic_message, unread_count, max_read_id, unread_mentions, unread_reactions, read_outbox, pinned, total_messages_count, nopaid_messages_exception, unread_poll_votes FROM topics WHERE did = " + j14 + " ORDER BY pinned ASC", new Object[0]);
                    arrayList = null;
                    SparseArray sparseArray3 = null;
                    HashSet hashSet3 = null;
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                if (arrayList == null) {
                                    try {
                                        try {
                                            arrayList5 = new ArrayList();
                                        } catch (Exception e11) {
                                            e = e11;
                                            z10 = i12;
                                            consumer = consumer2;
                                            sQLiteCursor2 = sQLiteCursor2;
                                        }
                                        try {
                                            sparseArray2 = new SparseArray();
                                            hashSet2 = new HashSet();
                                            arrayList = arrayList5;
                                        } catch (Exception e12) {
                                            e = e12;
                                            z10 = i12;
                                            consumer = consumer2;
                                            arrayList = arrayList5;
                                            sQLiteCursor2 = sQLiteCursor2;
                                            trVar.o(e, z10);
                                            consumer.x(arrayList);
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (sQLiteCursor2 != 0) {
                                            sQLiteCursor2.dispose();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sparseArray2 = sparseArray3;
                                    hashSet2 = hashSet3;
                                }
                                try {
                                    int intValue = sQLiteCursor2.intValue(r72);
                                    NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(i12);
                                    if (byteBufferValue2 != 0) {
                                        i10 = i12;
                                        try {
                                            TLRPC.TL_forumTopic TLdeserialize = TLRPC.TL_forumTopic.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r72), r72);
                                            if (TLdeserialize != null) {
                                                TLdeserialize.top_message = intValue;
                                                ArrayList arrayList8 = (ArrayList) sparseArray2.get(intValue);
                                                if (arrayList8 == null) {
                                                    arrayList6 = new ArrayList();
                                                    sparseArray2.put(intValue, arrayList6);
                                                } else {
                                                    arrayList6 = arrayList8;
                                                }
                                                arrayList6.add(TLdeserialize);
                                                hashSet2.add(Integer.valueOf(intValue));
                                                arrayList.add(TLdeserialize);
                                                NativeByteBuffer byteBufferValue3 = sQLiteCursor2.byteBufferValue(2);
                                                sparseArray3 = sparseArray2;
                                                TLdeserialize.topicStartMessage = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                byteBufferValue3.reuse();
                                                c10 = 3;
                                                TLdeserialize.unread_count = sQLiteCursor2.intValue(3);
                                                TLdeserialize.read_inbox_max_id = sQLiteCursor2.intValue(4);
                                                c11 = 5;
                                                TLdeserialize.unread_mentions_count = sQLiteCursor2.intValue(5);
                                                TLdeserialize.unread_reactions_count = sQLiteCursor2.intValue(6);
                                                TLdeserialize.read_outbox_max_id = sQLiteCursor2.intValue(7);
                                                int intValue2 = sQLiteCursor2.intValue(8) - 1;
                                                TLdeserialize.pinnedOrder = intValue2;
                                                TLdeserialize.pinned = intValue2 >= 0 ? i10 : 0;
                                                TLdeserialize.totalMessagesCount = sQLiteCursor2.intValue(9);
                                                TLdeserialize.nopaid_messages_exception = sQLiteCursor2.intValue(10) != 0 ? i10 : 0;
                                                TLdeserialize.unread_poll_votes_count = sQLiteCursor2.intValue(11);
                                            } else {
                                                sparseArray3 = sparseArray2;
                                                c10 = 3;
                                                c11 = 5;
                                            }
                                            byteBufferValue2.reuse();
                                        } catch (Exception e13) {
                                            e = e13;
                                            consumer = consumer2;
                                            z10 = i10;
                                            sQLiteCursor2 = sQLiteCursor2;
                                            trVar.o(e, z10);
                                            consumer.x(arrayList);
                                            return;
                                        }
                                    } else {
                                        sparseArray3 = sparseArray2;
                                        i10 = i12;
                                        c10 = 3;
                                        c11 = 5;
                                    }
                                    hashSet3 = hashSet2;
                                    i12 = i10;
                                    r72 = 0;
                                } catch (Exception e14) {
                                    e = e14;
                                    i10 = i12;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            consumer = consumer2;
                        }
                    }
                    int i16 = i12;
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    consumer = consumer2;
                    try {
                        a0.h hVar2 = new a0.h();
                        a0.h hVar3 = new a0.h();
                        if (arrayList == null || arrayList.isEmpty()) {
                            sQLiteCursor = sQLiteCursor2;
                            arrayList3 = arrayList;
                        } else {
                            SQLiteDatabase sQLiteDatabase2 = trVar.b;
                            StringBuilder sb2 = new StringBuilder();
                            sQLiteCursor = sQLiteCursor2;
                            try {
                                try {
                                    sb2.append("SELECT mid, data, replydata FROM messages_v2 WHERE uid = ");
                                    sb2.append(j14);
                                    sb2.append(" AND mid IN (");
                                    HashSet hashSet4 = hashSet3;
                                    try {
                                        sb2.append(TextUtils.join(",", hashSet4));
                                        sb2.append(")");
                                        String sb3 = sb2.toString();
                                        int i17 = 0;
                                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized(sb3, new Object[0]);
                                        while (queryFinalized.next()) {
                                            try {
                                                int intValue3 = queryFinalized.intValue(i17);
                                                NativeByteBuffer byteBufferValue4 = queryFinalized.byteBufferValue(i16);
                                                if (byteBufferValue4 != null) {
                                                    arrayList4 = arrayList;
                                                    try {
                                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                                        if (TLdeserialize2 != null) {
                                                            str = str5;
                                                            str2 = str6;
                                                            TLdeserialize2.readAttachPath(byteBufferValue4, j10.i(trVar.currentAccount).n);
                                                        } else {
                                                            str = str5;
                                                            str2 = str6;
                                                        }
                                                        byteBufferValue4.reuse();
                                                        hashSet4.remove(Integer.valueOf(intValue3));
                                                        SparseArray sparseArray4 = sparseArray3;
                                                        ArrayList arrayList11 = (ArrayList) sparseArray4.get(intValue3);
                                                        if (arrayList11 != null) {
                                                            for (int i18 = 0; i18 < arrayList11.size(); i18++) {
                                                                ((TLRPC.TL_forumTopic) arrayList11.get(i18)).topMessage = TLdeserialize2;
                                                            }
                                                        }
                                                        tr.e(TLdeserialize2, arrayList9, arrayList10, null);
                                                        try {
                                                            TLRPC.MessageReplyHeader messageReplyHeader = TLdeserialize2.reply_to;
                                                            if (messageReplyHeader == null || messageReplyHeader.reply_to_msg_id == 0 || !tr.v0(TLdeserialize2.action)) {
                                                                hashSet = hashSet4;
                                                                sparseArray3 = sparseArray4;
                                                            } else {
                                                                if (queryFinalized.isNull(2) || (byteBufferValue = queryFinalized.byteBufferValue(2)) == null) {
                                                                    hashSet = hashSet4;
                                                                    sparseArray3 = sparseArray4;
                                                                } else {
                                                                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                                    TLdeserialize2.replyMessage = TLdeserialize3;
                                                                    hashSet = hashSet4;
                                                                    sparseArray3 = sparseArray4;
                                                                    try {
                                                                        TLdeserialize3.readAttachPath(byteBufferValue, trVar.getUserConfig().n);
                                                                        byteBufferValue.reuse();
                                                                        TLRPC.Message message = TLdeserialize2.replyMessage;
                                                                        if (message != null) {
                                                                            tr.e(message, arrayList9, arrayList10, null);
                                                                        }
                                                                    } catch (Exception e16) {
                                                                        e = e16;
                                                                        trVar.o(e, true);
                                                                        hashSet4 = hashSet;
                                                                        arrayList = arrayList4;
                                                                        str5 = str;
                                                                        str6 = str2;
                                                                        i17 = 0;
                                                                        i16 = 1;
                                                                    }
                                                                }
                                                                if (TLdeserialize2.replyMessage == null) {
                                                                    tr.d(TLdeserialize2, hVar2, hVar3);
                                                                }
                                                            }
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            hashSet = hashSet4;
                                                            sparseArray3 = sparseArray4;
                                                        }
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        consumer = consumer;
                                                        arrayList2 = sQLiteCursor;
                                                        arrayList = arrayList4;
                                                        z10 = 1;
                                                        sQLiteCursor2 = arrayList2;
                                                        trVar.o(e, z10);
                                                        consumer.x(arrayList);
                                                        return;
                                                    }
                                                } else {
                                                    str = str5;
                                                    str2 = str6;
                                                    arrayList4 = arrayList;
                                                    hashSet = hashSet4;
                                                }
                                                hashSet4 = hashSet;
                                                arrayList = arrayList4;
                                                str5 = str;
                                                str6 = str2;
                                                i17 = 0;
                                                i16 = 1;
                                            } catch (Exception e19) {
                                                e = e19;
                                                consumer = consumer;
                                                arrayList2 = sQLiteCursor;
                                                z10 = 1;
                                                sQLiteCursor2 = arrayList2;
                                                trVar.o(e, z10);
                                                consumer.x(arrayList);
                                                return;
                                            }
                                        }
                                        String str7 = str5;
                                        String str8 = str6;
                                        arrayList4 = arrayList;
                                        HashSet hashSet5 = hashSet4;
                                        try {
                                            queryFinalized.dispose();
                                            if (!hashSet5.isEmpty()) {
                                                ?? r73 = 0;
                                                SQLiteCursor queryFinalized2 = trVar.b.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j14 + str8 + TextUtils.join(",", hashSet5) + str7, new Object[0]);
                                                while (queryFinalized2.next()) {
                                                    try {
                                                        int intValue4 = queryFinalized2.intValue(r73);
                                                        NativeByteBuffer byteBufferValue5 = queryFinalized2.byteBufferValue(1);
                                                        if (byteBufferValue5 != 0) {
                                                            TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(r73), r73);
                                                            if (TLdeserialize4 != null) {
                                                                hVar = hVar3;
                                                                try {
                                                                    TLdeserialize4.readAttachPath(byteBufferValue5, j10.i(trVar.currentAccount).n);
                                                                } catch (Exception e20) {
                                                                    e = e20;
                                                                    trVar.o(e, true);
                                                                    size = arrayList4.size();
                                                                    i7 = 0;
                                                                    while (i7 < size) {
                                                                    }
                                                                    consumer = consumer;
                                                                    arrayList3 = arrayList4;
                                                                    trVar.K0(hVar2, hVar, arrayList9, arrayList10, 0);
                                                                    ArrayList arrayList12 = new ArrayList();
                                                                    ArrayList arrayList13 = new ArrayList();
                                                                    if (!arrayList10.isEmpty()) {
                                                                    }
                                                                    if (!arrayList9.isEmpty()) {
                                                                    }
                                                                    g0.g3(new sp(trVar, arrayList13, arrayList12, 1));
                                                                    trVar.J0(arrayList3, j14);
                                                                    sQLiteCursor.dispose();
                                                                    arrayList = arrayList3;
                                                                    consumer.x(arrayList);
                                                                    return;
                                                                }
                                                            } else {
                                                                hVar = hVar3;
                                                            }
                                                            byteBufferValue5.reuse();
                                                            hashSet5.remove(Integer.valueOf(intValue4));
                                                            tr.e(TLdeserialize4, arrayList9, arrayList10, null);
                                                            sparseArray = sparseArray3;
                                                            ArrayList arrayList14 = (ArrayList) sparseArray.get(intValue4);
                                                            if (arrayList14 != null) {
                                                                for (int i19 = 0; i19 < arrayList14.size(); i19++) {
                                                                    ((TLRPC.TL_forumTopic) arrayList14.get(i19)).topMessage = TLdeserialize4;
                                                                }
                                                            }
                                                        } else {
                                                            hVar = hVar3;
                                                            sparseArray = sparseArray3;
                                                        }
                                                        sparseArray3 = sparseArray;
                                                        hVar3 = hVar;
                                                        r73 = 0;
                                                    } catch (Exception e21) {
                                                        e = e21;
                                                        hVar = hVar3;
                                                    }
                                                }
                                            }
                                            hVar = hVar3;
                                            size = arrayList4.size();
                                            i7 = 0;
                                            while (i7 < size) {
                                                arrayList = arrayList4;
                                                try {
                                                    Object obj = arrayList.get(i7);
                                                    i7++;
                                                    long o4 = n5.o(((TLRPC.TL_forumTopic) obj).from_id);
                                                    if (o4 != 0) {
                                                        if (o4 > 0) {
                                                            if (!arrayList9.contains(Long.valueOf(o4))) {
                                                                arrayList9.add(Long.valueOf(o4));
                                                            }
                                                        } else if (!arrayList10.contains(Long.valueOf(o4))) {
                                                            arrayList10.add(Long.valueOf(o4));
                                                        }
                                                    }
                                                    arrayList4 = arrayList;
                                                } catch (Exception e22) {
                                                    e = e22;
                                                    consumer = consumer;
                                                    arrayList2 = sQLiteCursor;
                                                    z10 = 1;
                                                    sQLiteCursor2 = arrayList2;
                                                    trVar.o(e, z10);
                                                    consumer.x(arrayList);
                                                    return;
                                                }
                                            }
                                            consumer = consumer;
                                            arrayList3 = arrayList4;
                                        } catch (Exception e23) {
                                            e = e23;
                                            consumer = consumer;
                                            arrayList3 = arrayList4;
                                        }
                                        try {
                                            trVar.K0(hVar2, hVar, arrayList9, arrayList10, 0);
                                            ArrayList arrayList122 = new ArrayList();
                                            ArrayList arrayList132 = new ArrayList();
                                            if (!arrayList10.isEmpty()) {
                                                trVar.Q(TextUtils.join(",", arrayList10), arrayList122);
                                            }
                                            if (!arrayList9.isEmpty()) {
                                                trVar.n0(arrayList9, arrayList132, false);
                                            }
                                            g0.g3(new sp(trVar, arrayList132, arrayList122, 1));
                                            trVar.J0(arrayList3, j14);
                                        } catch (Exception e24) {
                                            e = e24;
                                            arrayList = arrayList3;
                                            arrayList2 = sQLiteCursor;
                                            z10 = 1;
                                            sQLiteCursor2 = arrayList2;
                                            trVar.o(e, z10);
                                            consumer.x(arrayList);
                                            return;
                                        }
                                    } catch (Exception e25) {
                                        e = e25;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteCursor2 = sQLiteCursor;
                                    if (sQLiteCursor2 != 0) {
                                    }
                                    throw th;
                                }
                            } catch (Exception e26) {
                                e = e26;
                            }
                        }
                        sQLiteCursor.dispose();
                        arrayList = arrayList3;
                    } catch (Exception e27) {
                        e = e27;
                        arrayList2 = sQLiteCursor2;
                        z10 = 1;
                        sQLiteCursor2 = arrayList2;
                        trVar.o(e, z10);
                        consumer.x(arrayList);
                        return;
                    }
                } catch (Exception e28) {
                    e = e28;
                    consumer = consumer2;
                    arrayList7 = null;
                    arrayList = arrayList7;
                    arrayList2 = arrayList7;
                    z10 = 1;
                    sQLiteCursor2 = arrayList2;
                    trVar.o(e, z10);
                    consumer.x(arrayList);
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor2 = 0;
                }
                consumer.x(arrayList);
                return;
            case 6:
                xs xsVar = (xs) this.c;
                long j15 = this.b;
                nu0 nu0Var = (nu0) this.d;
                HashSet hashSet6 = new HashSet();
                Iterator<Map.Entry<String, ?>> it = mp.u1(xsVar.currentAccount).g7.getAll().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (key.startsWith("notify2_" + j15)) {
                        Integer z11 = Utilities.z(key.replace("notify2_" + j15, ""));
                        int intValue5 = z11.intValue();
                        if (intValue5 != 0 && xsVar.getMessagesController().u2(j15, intValue5, null) != xsVar.getMessagesController().u2(j15, 0L, null)) {
                            hashSet6.add(z11);
                        }
                    }
                }
                g0.g3(new rq(15, nu0Var, hashSet6));
                return;
            case 7:
                xv xvVar = (xv) this.c;
                TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.d;
                long j16 = this.b;
                xvVar.getClass();
                if (tL_dialog.folder_id == 1) {
                    SharedPreferences.Editor edit = mp.u1(xvVar.currentAccount).g7.edit();
                    edit.putBoolean("dialog_bar_archived" + j16, true);
                    edit.commit();
                }
                xvVar.getMessagesController().R.k(tL_dialog, tL_dialog.id);
                xvVar.getMessagesController().y.add(tL_dialog);
                xvVar.getMessagesController().f5(null);
                xvVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                z00 z00Var = (z00) this.c;
                ks.f(z00Var.currentAccount).k(128, (fj) this.d, Boolean.FALSE, Boolean.valueOf(z00Var.B(this.b)));
                return;
            case 9:
                z00 z00Var2 = (z00) this.c;
                long j17 = this.b;
                String str9 = (String) this.d;
                synchronized (z00Var2) {
                    z00Var2.d.put(Long.valueOf(j17), str9);
                    LongSparseArray longSparseArray = z00Var2.a;
                    bool = Boolean.TRUE;
                    longSparseArray.put(j17, bool);
                    z00Var2.H();
                }
                ks.f(z00Var2.currentAccount).k(ks.P1, Long.valueOf(j17), bool);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.c;
                long j18 = this.b;
                org.telegram.ui.Components.nc[] ncVarArr = (org.telegram.ui.Components.nc[]) this.d;
                zArr[0] = false;
                if (j18 == -1) {
                    ncVarArr[0].setText(gd.N0(2131743670, null));
                    org.telegram.ui.ActionBar.t6.U(ncVarArr[0], org.telegram.ui.ActionBar.m6.p7, null);
                    return;
                } else {
                    ncVarArr[0].setText(gd.a0(null, null, 2131747041, Long.valueOf(j18)));
                    org.telegram.ui.ActionBar.t6.U(ncVarArr[0], org.telegram.ui.ActionBar.m6.w6, null);
                    return;
                }
            case 11:
                u9 u9Var = (u9) this.c;
                r9 r9Var = (r9) this.d;
                long j19 = this.b;
                r9Var.d = null;
                u9Var.m(j19);
                return;
            case 12:
                a();
                return;
            case 13:
                b();
                return;
            case 14:
                c();
                return;
            case 15:
                ((mp) this.c).getNotificationCenter().k(45, Long.valueOf(this.b), (SparseArray) this.d);
                return;
            case 16:
                d();
                return;
            case 17:
                f();
                return;
            case 18:
                g();
                return;
            case 19:
                ((mp) this.c).getNotificationCenter().k(95, Long.valueOf(this.b), Integer.valueOf(((TLRPC.TL_chatOnlines) this.d).onlines));
                return;
            case 20:
                h();
                return;
            case 21:
                i();
                return;
            case 22:
                j();
                return;
            case 23:
                k();
                return;
            case 24:
                l();
                return;
            case 25:
                m();
                return;
            case 26:
                n();
                return;
            case 27:
                o();
                return;
            case 28:
                p();
                return;
            default:
                tr trVar2 = (tr) this.c;
                long j20 = this.b;
                bn bnVar = (bn) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor3 = trVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(trVar2.getUserConfig().e()), Long.valueOf(j20));
                        if (sQLiteCursor3.next()) {
                            iArr[0] = sQLiteCursor3.intValue(0);
                        }
                    } finally {
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                    }
                } catch (Exception e29) {
                    trVar2.o(e29, true);
                    break;
                }
                sQLiteCursor3.dispose();
                g0.g3(new rq(i11, bnVar, iArr));
                return;
        }
    }

    public /* synthetic */ d4(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
