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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class go6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ go6(Object obj, long j, Object obj2, byte b) {
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
        ad7 ad7Var = (ad7) this.b;
        long j = this.c;
        o87 o87Var = (o87) this.d;
        int[] iArr = new int[1];
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = ad7Var.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                if (sQLiteCursor.next()) {
                    iArr[0] = sQLiteCursor.intValue(0);
                }
            } catch (Exception e) {
                ad7Var.n(e, true);
            }
            sQLiteCursor.dispose();
            gl.c3(new t67(o87Var, iArr, (byte) 17));
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void b() {
        vp9 vp9Var = (vp9) this.b;
        TLObject tLObject = (TLObject) this.d;
        vf6 vf6Var = vp9Var.p;
        int i = vp9Var.a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            na7.q1(i).b4(messages_messages.users, false);
            na7.q1(i).V3(messages_messages.chats, false);
            ad7.Y(i).j1(messages_messages.users, messages_messages.chats, true, true);
            boolean z = size > 0;
            long j = this.c;
            if (size > 0) {
                if (vp9Var.q(size, j, true)) {
                    vp9Var.k();
                } else if (!messages_messages.messages.isEmpty()) {
                    up9 a = up9.a(i, messages_messages.messages.get(0));
                    a.e = size;
                    a.i = true;
                    vp9Var.c.add(a);
                    vp9Var.k();
                }
            }
            ArrayList arrayList = (ArrayList) vf6Var.f(j);
            vf6Var.l(j);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((p8c) arrayList.get(i2)).a(Boolean.valueOf(z));
                }
            }
        }
    }

    private final void c() {
        vqa vqaVar = (vqa) this.b;
        ((c01) this.d).c(false);
        vqaVar.v2((int) this.c, vqaVar.getContext(), true);
    }

    private final void d() {
        fx0[] fx0VarArr = (fx0[]) this.b;
        TL_stories.Boost boost = (TL_stories.Boost) this.d;
        fx0 fx0Var = fx0VarArr[0];
        if (fx0Var != null) {
            fx0Var.dismiss();
        }
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        S.presentFragment(mu1.V9(boost.giveaway_msg_id, this.c));
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
                hq6 hq6Var = (hq6) obj2;
                TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) obj;
                hq6Var.getClass();
                try {
                    TL_bots.BotInfo J0 = hq6Var.J0(tL_updateBotCommands.bot_id, j);
                    if (J0 != null) {
                        J0.commands = tL_updateBotCommands.commands;
                    }
                    SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
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
                    fa4.g(e, true);
                    return;
                }
            case 1:
                hq6 hq6Var2 = (hq6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    hq6Var2.getMessagesStorage().b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = hq6Var2.getMessagesStorage().b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
                    int size = arrayList.size();
                    while (i < size) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                        k27.p5(message);
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
                    hq6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                ((na7) obj2).getNotificationCenter().k(95, Long.valueOf(j), Integer.valueOf(((TLRPC.TL_chatOnlines) obj).onlines));
                return;
            case 3:
                ((na7) obj2).getNotificationCenter().k(45, Long.valueOf(j), (SparseArray) obj);
                return;
            case 4:
                na7 na7Var = (na7) obj2;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) obj;
                vf6 vf6Var = na7Var.O4;
                if (vf6Var == null) {
                    vf6Var = new vf6();
                    na7Var.O4 = vf6Var;
                }
                boolean z = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
                long j2 = this.c;
                if (z) {
                    vf6Var.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j2);
                    na7Var.getNotificationCenter().k(kk7.i3, Long.valueOf(j2));
                }
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
                if (z) {
                    tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
                }
                if (j2 != 0) {
                    tL_messages_getSavedReactionTags.flags |= 1;
                    tL_messages_getSavedReactionTags.peer = na7Var.h1(j2);
                }
                na7Var.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new ws0(na7Var, j2, (Object) messages_savedreactiontags, (TLObject) tL_messages_getSavedReactionTags, (byte) 3));
                return;
            case 5:
                vc7 vc7Var = (vc7) obj2;
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
                    vc7Var.run(j3);
                    return;
                }
                return;
            case 6:
                na7 na7Var2 = (na7) obj2;
                u72 u72Var = (u72) obj;
                if (u72Var != null) {
                    na7Var2.getClass();
                    u72Var.run();
                }
                na7Var2.getNotificationCenter().k(kk7.Z4, Long.valueOf(j), 0L);
                return;
            case 7:
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) obj;
                SQLiteDatabase sQLiteDatabase = ((na7) obj2).getMessagesStorage().b;
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
                        fa4.g(e3, true);
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
                ad7 ad7Var = (ad7) obj2;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) obj;
                try {
                    try {
                        sQLiteCursor = ad7Var.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j, new Object[0]);
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
                            if (next && userFull != null && l7c.a(userFull, requirementToContact)) {
                                SQLitePreparedStatement executeFast3 = ad7Var.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
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
                                    ad7Var.n(e, true);
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
                ((ad7) obj2).getMessagesController().g3(j, (TLRPC.Chat) obj);
                return;
            case 10:
                ((ad7) obj2).getMessagesController().g4.q(j, (TLRPC.TL_forumTopic) obj, false);
                return;
            case 11:
                ad7 ad7Var2 = (ad7) obj2;
                km8 km8Var = (km8) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                        Locale locale = Locale.US;
                        sQLiteCursor5 = sQLiteDatabase2.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j + " ORDER BY order_index ASC", new Object[0]);
                        while (sQLiteCursor5.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor5.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if (TLdeserialize != null) {
                                    arrayList2.add(z1b.a(TLdeserialize));
                                }
                            }
                        }
                    } catch (Exception e7) {
                        ad7Var2.n(e7, true);
                        break;
                    }
                    sQLiteCursor5.dispose();
                    km8Var.x(arrayList2);
                    return;
                } catch (Throwable th5) {
                    if (sQLiteCursor5 != null) {
                        sQLiteCursor5.dispose();
                    }
                    throw th5;
                }
            case 12:
                ad7 ad7Var3 = (ad7) obj2;
                vf6 vf6Var2 = (vf6) obj;
                try {
                    try {
                        ad7Var3.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j).stepThis().dispose();
                        ad7Var3.b.beginTransaction();
                        SQLitePreparedStatement executeFast4 = ad7Var3.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                        while (i < vf6Var2.m()) {
                            try {
                                executeFast4.requery();
                                executeFast4.bindLong(1, j);
                                executeFast4.bindLong(2, vf6Var2.j(i));
                                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) vf6Var2.n(i);
                                NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(channelParticipant.getObjectSize());
                                channelParticipant.serializeToStream(nativeByteBuffer5);
                                executeFast4.bindByteBuffer(3, nativeByteBuffer5);
                                executeFast4.step();
                                nativeByteBuffer5.reuse();
                                i++;
                            } catch (Exception e8) {
                                e = e8;
                                sQLitePreparedStatement3 = executeFast4;
                                ad7Var3.n(e, true);
                                SQLiteDatabase sQLiteDatabase3 = ad7Var3.b;
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
                                SQLiteDatabase sQLiteDatabase4 = ad7Var3.b;
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
                        ad7Var3.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase5 = ad7Var3.b;
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
                ad7 ad7Var4 = (ad7) obj2;
                NativeByteBuffer nativeByteBuffer6 = (NativeByteBuffer) obj;
                try {
                    try {
                        SQLitePreparedStatement executeFast5 = ad7Var4.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                        executeFast5.bindLong(1, j);
                        executeFast5.bindByteBuffer(2, nativeByteBuffer6);
                        executeFast5.step();
                        executeFast5.dispose();
                    } finally {
                        nativeByteBuffer6.reuse();
                    }
                } catch (Exception e10) {
                    ad7Var4.n(e10, true);
                }
                return;
            case 14:
                ad7 ad7Var5 = (ad7) obj2;
                SparseArray sparseArray = (SparseArray) obj;
                ad7Var5.getClass();
                if (sparseArray.size() != 0) {
                    int min = Math.min(sparseArray.size(), 100);
                    for (int i3 = 0; i3 < min; i3++) {
                        ad7Var5.getNotificationCenter().k(kk7.n1, Long.valueOf(j), Integer.valueOf(sparseArray.keyAt(i3)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i3));
                    }
                    return;
                }
                return;
            case 15:
                ad7 ad7Var6 = (ad7) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                try {
                    try {
                        ad7Var6.b.beginTransaction();
                        TLRPC.TL_message c0 = ad7Var6.c0(message2.id, j);
                        l17.a(message2, c0);
                        while (true) {
                            SQLiteDatabase sQLiteDatabase6 = ad7Var6.b;
                            if (i >= 2) {
                                sQLiteDatabase6.commitTransaction();
                                SQLiteDatabase sQLiteDatabase7 = ad7Var6.b;
                                if (sQLiteDatabase7 != null) {
                                    sQLiteDatabase7.commitTransaction();
                                    return;
                                }
                                return;
                            }
                            SQLitePreparedStatement executeFast6 = i == 0 ? sQLiteDatabase6.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase6.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast6.requery();
                                NativeByteBuffer c = l17.c(c0);
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
                                ad7Var6.n(e, true);
                                SQLiteDatabase sQLiteDatabase8 = ad7Var6.b;
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
                                SQLiteDatabase sQLiteDatabase9 = ad7Var6.b;
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
                ad7 ad7Var7 = (ad7) obj2;
                kt1 kt1Var = (kt1) obj;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor4 = ad7Var7.b.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(ad7Var7.getUserConfig().e()), Long.valueOf(j));
                        if (sQLiteCursor4.next()) {
                            iArr[0] = sQLiteCursor4.intValue(0);
                        }
                    } catch (Exception e13) {
                        ad7Var7.n(e13, true);
                        break;
                    }
                    sQLiteCursor4.dispose();
                    gl.c3(new t67(kt1Var, iArr, (byte) 23));
                    return;
                } catch (Throwable th10) {
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th10;
                }
            case 17:
                ((ad7) obj2).getNotificationCenter().k(41, Long.valueOf(j), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) obj);
                return;
            case 18:
                ad7 ad7Var8 = (ad7) obj2;
                q87 q87Var = (q87) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase10 = ad7Var8.b;
                        Locale locale2 = Locale.US;
                        sQLiteCursor3 = sQLiteDatabase10.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j, new Object[0]);
                        if (sQLiteCursor3.next()) {
                            if (sQLiteCursor3.intValue(0) != 0) {
                                i = 1;
                            }
                        }
                    } catch (Exception e14) {
                        ad7Var8.n(e14, true);
                        break;
                    }
                    sQLiteCursor3.dispose();
                    if (i == 0) {
                        gl.c3(q87Var);
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
                ((im7) obj2).E(j, (String) obj);
                return;
            case 22:
                ve8 ve8Var = (ve8) obj2;
                d dVar = (d) obj;
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                dVar.presentFragment(new ProfileActivity(bundle, null));
                ve8Var.b(false);
                return;
            case 23:
                b();
                return;
            case 24:
                ((nfa) obj2).y1.presentFragment(mu1.V9(((k27) obj).e1(), j));
                return;
            case 25:
                vqa vqaVar = (vqa) obj2;
                Runnable runnable = (Runnable) obj;
                vqaVar.v2((int) j, vqaVar.getContext(), true);
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
                ((tya) obj2).C1((TLRPC.TL_messages_emojiGroups) obj, j);
                return;
            default:
                g2b g2bVar = (g2b) obj2;
                TLObject tLObject = (TLObject) obj;
                int i4 = g2bVar.a;
                g2bVar.C.remove(Long.valueOf(j));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    na7.q1(i4).b4(tL_stories_peerStories.users, false);
                    TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(j));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    g2bVar.i.k(peerStories, cf3.n(peerStories.peer));
                    if (V1 != null && (g2bVar.N(V1) || V1.self)) {
                        g2bVar.f(peerStories);
                        s2b s2bVar = g2bVar.k;
                        s2bVar.b.a.c(new r2b(s2bVar, peerStories, b));
                    }
                    StringBuilder o = ug8.o(j, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    o.append(tL_stories_peerStories.stories.stories.size());
                    fa4.b(o.toString());
                    kk7.f(i4).k(kk7.x5, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ go6(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
