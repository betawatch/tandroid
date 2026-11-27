// default package

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class cq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cq6(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    private final void a() {
        jf7 jf7Var = (jf7) this.b;
        SparseArray sparseArray = (SparseArray) this.d;
        jf7Var.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i = 0; i < min; i++) {
                jf7Var.getNotificationCenter().k(jn7.o1, Long.valueOf(this.c), Integer.valueOf(sparseArray.keyAt(i)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i));
            }
        }
    }

    private final void b() {
        ((ip7) this.b).E(this.c, (String) this.d);
    }

    private final void c() {
        ji8 ji8Var = (ji8) this.b;
        e eVar = (e) this.d;
        Bundle bundle = new Bundle();
        long j = this.c;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        eVar.presentFragment(new ProfileActivity(bundle, null));
        ji8Var.b(false);
    }

    private final void d() {
        nt9 nt9Var = (nt9) this.b;
        TLObject tLObject = (TLObject) this.d;
        zh6 zh6Var = nt9Var.p;
        int i = nt9Var.a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            uc7.s1(i).j4(messages_messages.users, false);
            uc7.s1(i).c4(messages_messages.chats, false);
            jf7.Y(i).j1(messages_messages.users, messages_messages.chats, true, true);
            boolean z = size > 0;
            long j = this.c;
            if (size > 0) {
                if (nt9Var.q(size, j, true)) {
                    nt9Var.k();
                } else if (!messages_messages.messages.isEmpty()) {
                    mt9 a = mt9.a(i, messages_messages.messages.get(0));
                    a.e = size;
                    a.i = true;
                    nt9Var.c.add(a);
                    nt9Var.k();
                }
            }
            ArrayList arrayList = (ArrayList) zh6Var.f(j);
            zh6Var.l(j);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((pcc) arrayList.get(i2)).a(Boolean.valueOf(z));
                }
            }
        }
    }

    private final void e() {
        ((eja) this.b).y1.presentFragment(zu1.ga(((r47) this.d).e1(), this.c));
    }

    private final void f() {
        wua wuaVar = (wua) this.b;
        Runnable runnable = (Runnable) this.d;
        wuaVar.w2((int) this.c, wuaVar.getContext(), true);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void g() {
        wua wuaVar = (wua) this.b;
        ((l01) this.d).c(false);
        wuaVar.w2((int) this.c, wuaVar.getContext(), true);
    }

    private final void h() {
        nx0[] nx0VarArr = (nx0[]) this.b;
        TL_stories.Boost boost = (TL_stories.Boost) this.d;
        nx0 nx0Var = nx0VarArr[0];
        if (nx0Var != null) {
            nx0Var.dismiss();
        }
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        S.presentFragment(zu1.ga(boost.giveaway_msg_id, this.c));
    }

    private final void i() {
        ((t2b) this.b).D1((TLRPC.TL_messages_emojiGroups) this.d, this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
    
        if (r4 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018f, code lost:
    
        if (r4 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v49 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Chat chat;
        TLRPC.InputChannel inputChannel;
        SQLiteCursor sQLiteCursor;
        TLRPC.UserFull userFull;
        Exception exc;
        Throwable th;
        byte b = this.a;
        TLRPC.Chat chat2 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor4 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor5 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r4 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        SQLitePreparedStatement sQLitePreparedStatement5 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement6 = null;
        int i = 0;
        byte b2 = 1;
        long j = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ls6 ls6Var = (ls6) obj2;
                TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) obj;
                ls6Var.getClass();
                try {
                    TL_bots.BotInfo J0 = ls6Var.J0(tL_updateBotCommands.bot_id, j);
                    if (J0 != null) {
                        J0.commands = tL_updateBotCommands.commands;
                    }
                    SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(J0.getObjectSize());
                    J0.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, J0.user_id);
                    executeFast.bindLong(2, j);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                ls6 ls6Var2 = (ls6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    ls6Var2.getMessagesStorage().b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = ls6Var2.getMessagesStorage().b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
                    int size = arrayList.size();
                    while (i < size) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                        r47.p5(message);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(message.getObjectSize());
                        message.serializeToStream(nativeByteBuffer2);
                        executeFast2.requery();
                        executeFast2.bindLong(1, j);
                        executeFast2.bindInteger(2, message.id);
                        executeFast2.bindByteBuffer(3, nativeByteBuffer2);
                        executeFast2.step();
                        nativeByteBuffer2.reuse();
                        i++;
                    }
                    executeFast2.dispose();
                    ls6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 2:
                ((uc7) obj2).getNotificationCenter().k(96, Long.valueOf(j), Integer.valueOf(((TLRPC.TL_chatOnlines) obj).onlines));
                return;
            case 3:
                ((uc7) obj2).getNotificationCenter().k(46, Long.valueOf(j), (SparseArray) obj);
                return;
            case 4:
                uc7 uc7Var = (uc7) obj2;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) obj;
                zh6 zh6Var = uc7Var.P4;
                if (zh6Var == null) {
                    zh6Var = new zh6();
                    uc7Var.P4 = zh6Var;
                }
                boolean z = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
                long j2 = this.c;
                if (z) {
                    zh6Var.k(j2, (TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags);
                    uc7Var.getNotificationCenter().k(jn7.j3, Long.valueOf(j2));
                }
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
                if (z) {
                    tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
                }
                if (j2 != 0) {
                    tL_messages_getSavedReactionTags.flags |= 1;
                    tL_messages_getSavedReactionTags.peer = uc7Var.j1(j2);
                }
                uc7Var.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new ft0(uc7Var, j2, (Object) messages_savedreactiontags, (TLObject) tL_messages_getSavedReactionTags, (byte) 3));
                return;
            case 5:
                uc7 uc7Var2 = (uc7) obj2;
                l82 l82Var = (l82) obj;
                if (l82Var != null) {
                    uc7Var2.getClass();
                    l82Var.run();
                }
                uc7Var2.getNotificationCenter().k(jn7.a5, Long.valueOf(j), 0L);
                return;
            case 6:
                ef7 ef7Var = (ef7) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                int i2 = 0;
                while (true) {
                    if (i2 < updates.chats.size()) {
                        chat = updates.chats.get(i2);
                        if (j != chat.id) {
                            i2++;
                        }
                    } else {
                        chat = null;
                    }
                }
                if (chat == null || (inputChannel = chat.migrated_to) == null) {
                    return;
                }
                long j3 = inputChannel.channel_id;
                while (true) {
                    if (i < updates.chats.size()) {
                        TLRPC.Chat chat3 = updates.chats.get(i);
                        if (j3 == chat3.id) {
                            chat2 = chat3;
                        } else {
                            i++;
                        }
                    }
                }
                if (chat2 != null) {
                    ef7Var.run(j3);
                    return;
                }
                return;
            case 7:
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) obj;
                SQLiteDatabase sQLiteDatabase = ((uc7) obj2).getMessagesStorage().b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j).stepThis().dispose();
                        sQLitePreparedStatement6 = sQLiteDatabase.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                        sQLitePreparedStatement6.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                        tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer3);
                        sQLitePreparedStatement6.bindLong(1, j);
                        sQLitePreparedStatement6.bindByteBuffer(2, nativeByteBuffer3);
                        sQLitePreparedStatement6.step();
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                        if (sQLitePreparedStatement6 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement6.dispose();
                    return;
                } finally {
                }
            case 8:
                jf7 jf7Var = (jf7) obj2;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) obj;
                SQLiteCursor sQLiteCursor6 = "SELECT uid, info, pinned FROM user_settings WHERE uid = ";
                try {
                    try {
                        sQLiteCursor = jf7Var.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j, new Object[0]);
                        try {
                            boolean next = sQLiteCursor.next();
                            if (next) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                                userFull = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                                if (userFull != null) {
                                    userFull.pinned_msg_id = sQLiteCursor.intValue(2);
                                }
                                byteBufferValue.reuse();
                            } else {
                                userFull = null;
                            }
                            sQLiteCursor.dispose();
                            if (next && userFull != null && lbc.a(userFull, requirementToContact)) {
                                SQLitePreparedStatement executeFast3 = jf7Var.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                                try {
                                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(userFull.getObjectSize());
                                    userFull.serializeToStream(nativeByteBuffer4);
                                    executeFast3.bindLong(1, j);
                                    executeFast3.bindByteBuffer(2, nativeByteBuffer4);
                                    executeFast3.bindInteger(3, userFull.pinned_msg_id);
                                    executeFast3.step();
                                    executeFast3.dispose();
                                    nativeByteBuffer4.reuse();
                                    return;
                                } catch (Exception e4) {
                                    e = e4;
                                    sQLitePreparedStatement4 = executeFast3;
                                    sQLiteCursor = null;
                                    jf7Var.n(e, true);
                                    if (sQLitePreparedStatement4 != null) {
                                        sQLitePreparedStatement4.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLitePreparedStatement5 = executeFast3;
                                    sQLiteCursor6 = 0;
                                    if (sQLitePreparedStatement5 != null) {
                                        sQLitePreparedStatement5.dispose();
                                    }
                                    if (sQLiteCursor6 != 0) {
                                        sQLiteCursor6.dispose();
                                    }
                                    throw th;
                                }
                            }
                            return;
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e6) {
                    e = e6;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor6 = 0;
                }
                break;
            case 9:
                ((jf7) obj2).getMessagesController().m3(j, (TLRPC.Chat) obj);
                return;
            case 10:
                ((jf7) obj2).getMessagesController().g4.q(j, (TLRPC.TL_forumTopic) obj, false);
                return;
            case 11:
                jf7 jf7Var2 = (jf7) obj2;
                zh6 zh6Var2 = (zh6) obj;
                try {
                    try {
                        jf7Var2.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j).stepThis().dispose();
                        jf7Var2.b.beginTransaction();
                        SQLitePreparedStatement executeFast4 = jf7Var2.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                        while (i < zh6Var2.m()) {
                            try {
                                executeFast4.requery();
                                executeFast4.bindLong(1, j);
                                executeFast4.bindLong(2, zh6Var2.j(i));
                                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) zh6Var2.n(i);
                                NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(channelParticipant.getObjectSize());
                                channelParticipant.serializeToStream(nativeByteBuffer5);
                                executeFast4.bindByteBuffer(3, nativeByteBuffer5);
                                executeFast4.step();
                                nativeByteBuffer5.reuse();
                                i++;
                            } catch (Exception e7) {
                                e = e7;
                                sQLitePreparedStatement3 = executeFast4;
                                jf7Var2.n(e, true);
                                SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                }
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement3 = executeFast4;
                                SQLiteDatabase sQLiteDatabase3 = jf7Var2.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                }
                                throw th;
                            }
                        }
                        executeFast4.dispose();
                        jf7Var2.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase4 = jf7Var2.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
                return;
            case 12:
                jf7 jf7Var3 = (jf7) obj2;
                NativeByteBuffer nativeByteBuffer6 = (NativeByteBuffer) obj;
                try {
                    try {
                        SQLitePreparedStatement executeFast5 = jf7Var3.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                        executeFast5.bindLong(1, j);
                        executeFast5.bindByteBuffer(2, nativeByteBuffer6);
                        executeFast5.step();
                        executeFast5.dispose();
                    } finally {
                        nativeByteBuffer6.reuse();
                    }
                } catch (Exception e9) {
                    jf7Var3.n(e9, true);
                }
                return;
            case 13:
                jf7 jf7Var4 = (jf7) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                try {
                    try {
                        jf7Var4.b.beginTransaction();
                        TLRPC.TL_message c0 = jf7Var4.c0(message2.id, j);
                        s37.a(message2, c0);
                        while (true) {
                            SQLiteDatabase sQLiteDatabase5 = jf7Var4.b;
                            if (i >= 2) {
                                sQLiteDatabase5.commitTransaction();
                                SQLiteDatabase sQLiteDatabase6 = jf7Var4.b;
                                if (sQLiteDatabase6 != null) {
                                    sQLiteDatabase6.commitTransaction();
                                    return;
                                }
                                return;
                            }
                            SQLitePreparedStatement executeFast6 = i == 0 ? sQLiteDatabase5.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase5.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast6.requery();
                                NativeByteBuffer c = s37.c(c0);
                                if (c != null) {
                                    executeFast6.bindByteBuffer(1, c);
                                } else {
                                    executeFast6.bindNull(1);
                                }
                                executeFast6.bindInteger(2, message2.id);
                                executeFast6.bindLong(3, j);
                                executeFast6.step();
                                executeFast6.dispose();
                                if (c != null) {
                                    c.reuse();
                                }
                                i++;
                            } catch (Exception e10) {
                                exc = e10;
                                sQLitePreparedStatement2 = executeFast6;
                                jf7Var4.n(exc, true);
                                SQLiteDatabase sQLiteDatabase7 = jf7Var4.b;
                                if (sQLiteDatabase7 != null) {
                                    sQLiteDatabase7.commitTransaction();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement = executeFast6;
                                SQLiteDatabase sQLiteDatabase8 = jf7Var4.b;
                                if (sQLiteDatabase8 != null) {
                                    sQLiteDatabase8.commitTransaction();
                                }
                                if (sQLitePreparedStatement == null) {
                                    throw th;
                                }
                                sQLitePreparedStatement.dispose();
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            case 14:
                jf7 jf7Var5 = (jf7) obj2;
                tp8 tp8Var = (tp8) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase9 = jf7Var5.b;
                        Locale locale = Locale.US;
                        sQLiteCursor5 = sQLiteDatabase9.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j + " ORDER BY order_index ASC", new Object[0]);
                        while (sQLiteCursor5.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor5.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if (TLdeserialize != null) {
                                    arrayList2.add(v5b.a(TLdeserialize));
                                }
                            }
                        }
                    } catch (Exception e12) {
                        jf7Var5.n(e12, true);
                        break;
                    }
                    sQLiteCursor5.dispose();
                    tp8Var.x(arrayList2);
                    return;
                } catch (Throwable th9) {
                    if (sQLiteCursor5 == null) {
                        throw th9;
                    }
                    sQLiteCursor5.dispose();
                    throw th9;
                }
            case 15:
                jf7 jf7Var6 = (jf7) obj2;
                xa7 xa7Var = (xa7) obj;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor4 = jf7Var6.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        if (sQLiteCursor4.next()) {
                            iArr[0] = sQLiteCursor4.intValue(0);
                        }
                    } catch (Exception e13) {
                        jf7Var6.n(e13, true);
                        break;
                    }
                    sQLiteCursor4.dispose();
                    hl.c3(new t87(xa7Var, iArr, (byte) 14));
                    return;
                } catch (Throwable th10) {
                    if (sQLiteCursor4 == null) {
                        throw th10;
                    }
                    sQLiteCursor4.dispose();
                    throw th10;
                }
            case 16:
                jf7 jf7Var7 = (jf7) obj2;
                wt1 wt1Var = (wt1) obj;
                int[] iArr2 = new int[1];
                try {
                    try {
                        sQLiteCursor3 = jf7Var7.b.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(jf7Var7.getUserConfig().e()), Long.valueOf(j));
                        if (sQLiteCursor3.next()) {
                            iArr2[0] = sQLiteCursor3.intValue(0);
                        }
                    } catch (Exception e14) {
                        jf7Var7.n(e14, true);
                        break;
                    }
                    sQLiteCursor3.dispose();
                    hl.c3(new t87(wt1Var, iArr2, (byte) 22));
                    return;
                } catch (Throwable th11) {
                    if (sQLiteCursor3 == null) {
                        throw th11;
                    }
                    sQLiteCursor3.dispose();
                    throw th11;
                }
            case 17:
                ((jf7) obj2).getNotificationCenter().k(42, Long.valueOf(j), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) obj);
                return;
            case 18:
                jf7 jf7Var8 = (jf7) obj2;
                ya7 ya7Var = (ya7) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase10 = jf7Var8.b;
                        Locale locale2 = Locale.US;
                        sQLiteCursor2 = sQLiteDatabase10.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j, new Object[0]);
                        if (sQLiteCursor2.next()) {
                            if (sQLiteCursor2.intValue(0) != 0) {
                                i = 1;
                            }
                        }
                    } catch (Exception e15) {
                        jf7Var8.n(e15, true);
                        break;
                    }
                    sQLiteCursor2.dispose();
                    if (i == 0) {
                        hl.c3(ya7Var);
                        return;
                    }
                    return;
                } catch (Throwable th12) {
                    if (sQLiteCursor2 == null) {
                        throw th12;
                    }
                    sQLiteCursor2.dispose();
                    throw th12;
                }
            case 19:
                a();
                return;
            case 20:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j, (int[]) obj);
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                d();
                return;
            case 24:
                e();
                return;
            case 25:
                f();
                return;
            case 26:
                g();
                return;
            case 27:
                h();
                return;
            case 28:
                i();
                return;
            default:
                c6b c6bVar = (c6b) obj2;
                TLObject tLObject = (TLObject) obj;
                int i3 = c6bVar.a;
                c6bVar.C.remove(Long.valueOf(j));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    uc7.s1(i3).j4(tL_stories_peerStories.users, false);
                    TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    c6bVar.i.k(wf3.n(peerStories.peer), peerStories);
                    if (X1 != null && (c6bVar.N(X1) || X1.self)) {
                        c6bVar.f(peerStories);
                        o6b o6bVar = c6bVar.k;
                        o6bVar.b.a.c(new n6b(o6bVar, peerStories, b2));
                    }
                    StringBuilder o = ik8.o(j, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    o.append(tL_stories_peerStories.stories.stories.size());
                    cc4.b(o.toString());
                    jn7.f(i3).k(jn7.y5, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ cq6(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
