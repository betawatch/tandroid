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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hq6(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r6 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        cf7 cf7Var = (cf7) this.b;
        long j = this.c;
        pa7 pa7Var = (pa7) this.d;
        int[] iArr = new int[1];
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = cf7Var.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                if (sQLiteCursor.next()) {
                    iArr[0] = sQLiteCursor.intValue(0);
                }
            } catch (Exception e) {
                cf7Var.n(e, true);
            }
            sQLiteCursor.dispose();
            gm.c3(new q87(pa7Var, iArr, (byte) 18));
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void b() {
        wr9 wr9Var = (wr9) this.b;
        TLObject tLObject = (TLObject) this.d;
        vh6 vh6Var = wr9Var.p;
        int i = wr9Var.a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            oc7.r1(i).d4(messages_messages.users, false);
            oc7.r1(i).X3(messages_messages.chats, false);
            cf7.Y(i).j1(messages_messages.users, messages_messages.chats, true, true);
            boolean z = size > 0;
            long j = this.c;
            if (size > 0) {
                if (wr9Var.q(size, j, true)) {
                    wr9Var.k();
                } else if (!messages_messages.messages.isEmpty()) {
                    vr9 a = vr9.a(i, messages_messages.messages.get(0));
                    a.e = size;
                    a.i = true;
                    wr9Var.c.add(a);
                    wr9Var.k();
                }
            }
            ArrayList arrayList = (ArrayList) vh6Var.f(j);
            vh6Var.l(j);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((qac) arrayList.get(i2)).a(Boolean.valueOf(z));
                }
            }
        }
    }

    private final void c() {
        wsa wsaVar = (wsa) this.b;
        ((k11) this.d).c(false);
        wsaVar.v2((int) this.c, wsaVar.getContext(), true);
    }

    private final void d() {
        my0[] my0VarArr = (my0[]) this.b;
        TL_stories.Boost boost = (TL_stories.Boost) this.d;
        my0 my0Var = my0VarArr[0];
        if (my0Var != null) {
            my0Var.dismiss();
        }
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        S.presentFragment(yv1.fa(boost.giveaway_msg_id, this.c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0364, code lost:
    
        if (r5 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r5 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018e, code lost:
    
        if (r5 == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v41 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Chat chat;
        TLRPC.InputChannel inputChannel;
        SQLiteCursor sQLiteCursor;
        TLRPC.UserFull userFull;
        SQLiteCursor sQLiteCursor2 = this.a;
        TLRPC.Chat chat2 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor4 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor5 = null;
        r5 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        SQLitePreparedStatement sQLitePreparedStatement5 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement6 = null;
        int i = 0;
        byte b = 1;
        long j = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (sQLiteCursor2) {
            case 0:
                hs6 hs6Var = (hs6) obj2;
                TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) obj;
                hs6Var.getClass();
                try {
                    TL_bots.BotInfo J0 = hs6Var.J0(tL_updateBotCommands.bot_id, j);
                    if (J0 != null) {
                        J0.commands = tL_updateBotCommands.commands;
                    }
                    SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
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
                    fc4.g(e, true);
                    return;
                }
            case 1:
                hs6 hs6Var2 = (hs6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    hs6Var2.getMessagesStorage().b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = hs6Var2.getMessagesStorage().b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
                    int size = arrayList.size();
                    while (i < size) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                        k47.p5(message);
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
                    hs6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 2:
                ((oc7) obj2).getNotificationCenter().k(96, Long.valueOf(j), Integer.valueOf(((TLRPC.TL_chatOnlines) obj).onlines));
                return;
            case 3:
                ((oc7) obj2).getNotificationCenter().k(46, Long.valueOf(j), (SparseArray) obj);
                return;
            case 4:
                oc7 oc7Var = (oc7) obj2;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) obj;
                vh6 vh6Var = oc7Var.Q4;
                if (vh6Var == null) {
                    vh6Var = new vh6();
                    oc7Var.Q4 = vh6Var;
                }
                boolean z = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
                long j2 = this.c;
                if (z) {
                    vh6Var.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j2);
                    oc7Var.getNotificationCenter().k(nm7.j3, Long.valueOf(j2));
                }
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
                if (z) {
                    tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
                }
                if (j2 != 0) {
                    tL_messages_getSavedReactionTags.flags |= 1;
                    tL_messages_getSavedReactionTags.peer = oc7Var.i1(j2);
                }
                oc7Var.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new eu0(oc7Var, j2, (Object) messages_savedreactiontags, (TLObject) tL_messages_getSavedReactionTags, (byte) 3));
                return;
            case 5:
                xe7 xe7Var = (xe7) obj2;
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
                    xe7Var.run(j3);
                    return;
                }
                return;
            case 6:
                oc7 oc7Var2 = (oc7) obj2;
                f92 f92Var = (f92) obj;
                if (f92Var != null) {
                    oc7Var2.getClass();
                    f92Var.run();
                }
                oc7Var2.getNotificationCenter().k(nm7.b5, Long.valueOf(j), 0L);
                return;
            case 7:
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) obj;
                SQLiteDatabase sQLiteDatabase = ((oc7) obj2).getMessagesStorage().b;
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
                        fc4.g(e3, true);
                        if (sQLitePreparedStatement6 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement6.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement6 != null) {
                        sQLitePreparedStatement6.dispose();
                    }
                    throw th;
                }
            case 8:
                cf7 cf7Var = (cf7) obj2;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) obj;
                try {
                    try {
                        sQLiteCursor = cf7Var.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j, new Object[0]);
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
                            if (next && userFull != null && m9c.a(userFull, requirementToContact)) {
                                SQLitePreparedStatement executeFast3 = cf7Var.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
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
                                    cf7Var.n(e, true);
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
                                    sQLiteCursor2 = 0;
                                    if (sQLitePreparedStatement5 != null) {
                                        sQLitePreparedStatement5.dispose();
                                    }
                                    if (sQLiteCursor2 != 0) {
                                        sQLiteCursor2.dispose();
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
                    sQLiteCursor2 = 0;
                }
                break;
            case 9:
                ((cf7) obj2).getMessagesController().i3(j, (TLRPC.Chat) obj);
                return;
            case 10:
                ((cf7) obj2).getMessagesController().g4.q(j, (TLRPC.TL_forumTopic) obj, false);
                return;
            case 11:
                cf7 cf7Var2 = (cf7) obj2;
                jo8 jo8Var = (jo8) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = cf7Var2.b;
                        Locale locale = Locale.US;
                        sQLiteCursor5 = sQLiteDatabase2.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j + " ORDER BY order_index ASC", new Object[0]);
                        while (sQLiteCursor5.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor5.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if (TLdeserialize != null) {
                                    arrayList2.add(a4b.a(TLdeserialize));
                                }
                            }
                        }
                    } catch (Exception e7) {
                        cf7Var2.n(e7, true);
                        break;
                    }
                    sQLiteCursor5.dispose();
                    jo8Var.x(arrayList2);
                    return;
                } catch (Throwable th5) {
                    if (sQLiteCursor5 != null) {
                        sQLiteCursor5.dispose();
                    }
                    throw th5;
                }
            case 12:
                cf7 cf7Var3 = (cf7) obj2;
                vh6 vh6Var2 = (vh6) obj;
                try {
                    try {
                        cf7Var3.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j).stepThis().dispose();
                        cf7Var3.b.beginTransaction();
                        SQLitePreparedStatement executeFast4 = cf7Var3.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                        while (i < vh6Var2.m()) {
                            try {
                                executeFast4.requery();
                                executeFast4.bindLong(1, j);
                                executeFast4.bindLong(2, vh6Var2.j(i));
                                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) vh6Var2.n(i);
                                NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(channelParticipant.getObjectSize());
                                channelParticipant.serializeToStream(nativeByteBuffer5);
                                executeFast4.bindByteBuffer(3, nativeByteBuffer5);
                                executeFast4.step();
                                nativeByteBuffer5.reuse();
                                i++;
                            } catch (Exception e8) {
                                e = e8;
                                sQLitePreparedStatement3 = executeFast4;
                                cf7Var3.n(e, true);
                                SQLiteDatabase sQLiteDatabase3 = cf7Var3.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                }
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                sQLitePreparedStatement3 = executeFast4;
                                SQLiteDatabase sQLiteDatabase4 = cf7Var3.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                }
                                throw th;
                            }
                        }
                        executeFast4.dispose();
                        cf7Var3.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase5 = cf7Var3.b;
                        if (sQLiteDatabase5 != null) {
                            sQLiteDatabase5.commitTransaction();
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                return;
            case 13:
                cf7 cf7Var4 = (cf7) obj2;
                NativeByteBuffer nativeByteBuffer6 = (NativeByteBuffer) obj;
                try {
                    try {
                        SQLitePreparedStatement executeFast5 = cf7Var4.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                        executeFast5.bindLong(1, j);
                        executeFast5.bindByteBuffer(2, nativeByteBuffer6);
                        executeFast5.step();
                        executeFast5.dispose();
                    } finally {
                        nativeByteBuffer6.reuse();
                    }
                } catch (Exception e10) {
                    cf7Var4.n(e10, true);
                }
                return;
            case 14:
                cf7 cf7Var5 = (cf7) obj2;
                SparseArray sparseArray = (SparseArray) obj;
                cf7Var5.getClass();
                if (sparseArray.size() != 0) {
                    int min = Math.min(sparseArray.size(), 100);
                    for (int i3 = 0; i3 < min; i3++) {
                        cf7Var5.getNotificationCenter().k(nm7.o1, Long.valueOf(j), Integer.valueOf(sparseArray.keyAt(i3)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i3));
                    }
                    return;
                }
                return;
            case 15:
                cf7 cf7Var6 = (cf7) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                try {
                    try {
                        cf7Var6.b.beginTransaction();
                        TLRPC.TL_message c0 = cf7Var6.c0(message2.id, j);
                        l37.a(message2, c0);
                        while (true) {
                            SQLiteDatabase sQLiteDatabase6 = cf7Var6.b;
                            if (i >= 2) {
                                sQLiteDatabase6.commitTransaction();
                                SQLiteDatabase sQLiteDatabase7 = cf7Var6.b;
                                if (sQLiteDatabase7 != null) {
                                    sQLiteDatabase7.commitTransaction();
                                    return;
                                }
                                return;
                            }
                            SQLitePreparedStatement executeFast6 = i == 0 ? sQLiteDatabase6.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase6.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast6.requery();
                                NativeByteBuffer c = l37.c(c0);
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
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement2 = executeFast6;
                                cf7Var6.n(e, true);
                                SQLiteDatabase sQLiteDatabase8 = cf7Var6.b;
                                if (sQLiteDatabase8 != null) {
                                    sQLiteDatabase8.commitTransaction();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th8) {
                                th = th8;
                                sQLitePreparedStatement = executeFast6;
                                SQLiteDatabase sQLiteDatabase9 = cf7Var6.b;
                                if (sQLiteDatabase9 != null) {
                                    sQLiteDatabase9.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 16:
                cf7 cf7Var7 = (cf7) obj2;
                wu1 wu1Var = (wu1) obj;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor4 = cf7Var7.b.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(cf7Var7.getUserConfig().e()), Long.valueOf(j));
                        if (sQLiteCursor4.next()) {
                            iArr[0] = sQLiteCursor4.intValue(0);
                        }
                    } catch (Exception e13) {
                        cf7Var7.n(e13, true);
                        break;
                    }
                    sQLiteCursor4.dispose();
                    gm.c3(new q87(wu1Var, iArr, (byte) 24));
                    return;
                } catch (Throwable th10) {
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th10;
                }
            case 17:
                ((cf7) obj2).getNotificationCenter().k(42, Long.valueOf(j), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) obj);
                return;
            case 18:
                cf7 cf7Var8 = (cf7) obj2;
                ra7 ra7Var = (ra7) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase10 = cf7Var8.b;
                        Locale locale2 = Locale.US;
                        sQLiteCursor3 = sQLiteDatabase10.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j, new Object[0]);
                        if (sQLiteCursor3.next()) {
                            if (sQLiteCursor3.intValue(0) != 0) {
                                i = 1;
                            }
                        }
                    } catch (Exception e14) {
                        cf7Var8.n(e14, true);
                        break;
                    }
                    sQLiteCursor3.dispose();
                    if (i == 0) {
                        gm.c3(ra7Var);
                        return;
                    }
                    return;
                } catch (Throwable th11) {
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                    }
                    throw th11;
                }
            case 19:
                a();
                return;
            case 20:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j, (int[]) obj);
                return;
            case 21:
                ((lo7) obj2).E(j, (String) obj);
                return;
            case 22:
                xg8 xg8Var = (xg8) obj2;
                d dVar = (d) obj;
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                dVar.presentFragment(new ProfileActivity(bundle, null));
                xg8Var.b(false);
                return;
            case 23:
                b();
                return;
            case 24:
                ((nha) obj2).y1.presentFragment(yv1.fa(((k47) obj).e1(), j));
                return;
            case 25:
                wsa wsaVar = (wsa) obj2;
                Runnable runnable = (Runnable) obj;
                wsaVar.v2((int) j, wsaVar.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                ((u0b) obj2).C1((TLRPC.TL_messages_emojiGroups) obj, j);
                return;
            default:
                h4b h4bVar = (h4b) obj2;
                TLObject tLObject = (TLObject) obj;
                int i4 = h4bVar.a;
                h4bVar.C.remove(Long.valueOf(j));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    oc7.r1(i4).d4(tL_stories_peerStories.users, false);
                    TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(j));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    h4bVar.i.k(peerStories, pg3.n(peerStories.peer));
                    if (W1 != null && (h4bVar.N(W1) || W1.self)) {
                        h4bVar.f(peerStories);
                        t4b t4bVar = h4bVar.k;
                        t4bVar.b.a.c(new s4b(t4bVar, peerStories, b));
                    }
                    StringBuilder o = wi8.o(j, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    o.append(tL_stories_peerStories.stories.stories.size());
                    fc4.b(o.toString());
                    nm7.f(i4).k(nm7.z5, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ hq6(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
