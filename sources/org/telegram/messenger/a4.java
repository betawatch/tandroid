package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a4(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    private final void a() {
        ui uiVar = (ui) this.c;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
        long j3 = this.b;
        uiVar.getClass();
        try {
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
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
        ui uiVar = (ui) this.c;
        TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
        long j3 = this.b;
        uiVar.getClass();
        try {
            TL_bots.BotInfo H0 = uiVar.H0(tL_updateBotCommands.bot_id, j3);
            if (H0 != null) {
                H0.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(H0.getObjectSize());
            H0.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, H0.user_id);
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
        ui uiVar = (ui) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        long j3 = this.b;
        try {
            uiVar.getMessagesStorage().b.beginTransaction();
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
                ij.r5(message);
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
            uiVar.getMessagesStorage().b.commitTransaction();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void d() {
        qp qpVar = (qp) this.c;
        TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
        if (qpVar.a8 == null) {
            qpVar.a8 = new a0.h();
        }
        boolean z9 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        long j3 = this.b;
        if (z9) {
            qpVar.a8.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j3);
            qpVar.getNotificationCenter().k(qs.h3, Long.valueOf(j3));
        }
        TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z9) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j3 != 0) {
            tL_messages_getSavedReactionTags.flags |= 1;
            tL_messages_getSavedReactionTags.peer = qpVar.j1(j3);
        }
        qpVar.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new wm(qpVar, j3, messages_savedreactiontags, tL_messages_getSavedReactionTags, 0));
    }

    private final void f() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        tr trVar = (tr) this.c;
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
            trVar.run(j3);
        }
    }

    private final void g() {
        qp qpVar = (qp) this.c;
        long j3 = this.b;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
        SQLiteDatabase sQLiteDatabase = qpVar.getMessagesStorage().b;
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
        yr yrVar = (yr) this.c;
        long j3 = this.b;
        TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
        yrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = yrVar.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j3, new Object[0]);
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
                    if (next && userFull != null && t10.a(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
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
                            yrVar.o(e, true);
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
        yr yrVar = (yr) this.c;
        yrVar.getMessagesController().e3((TLRPC.Chat) this.d, this.b);
    }

    private final void j() {
        yr yrVar = (yr) this.c;
        yrVar.getMessagesController().q7.q(this.b, (TLRPC.TL_forumTopic) this.d, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void k() {
        yr yrVar = (yr) this.c;
        long j3 = this.b;
        di.l6 l6Var = (di.l6) this.d;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j3 + " ORDER BY order_index ASC", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(di.r6.a(TLdeserialize));
                        }
                    }
                }
            } catch (Exception e10) {
                yrVar.o(e10, true);
            }
            sQLiteCursor.dispose();
            l6Var.x(arrayList);
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
        yr yrVar = (yr) this.c;
        long j3 = this.b;
        a0.h hVar = (a0.h) this.d;
        yrVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                yrVar.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j3).stepThis().dispose();
                yrVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
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
                        yrVar.o(e, true);
                        yrVar = yrVar.b;
                        if (yrVar != 0) {
                            yrVar.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
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
                yrVar.b.commitTransaction();
                yrVar = yrVar.b;
                if (yrVar != 0) {
                    yrVar.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final void m() {
        yr yrVar = (yr) this.c;
        long j3 = this.b;
        NativeByteBuffer nativeByteBuffer = (NativeByteBuffer) this.d;
        yrVar.getClass();
        try {
            SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j3);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            yrVar.o(e10, true);
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
        yr yrVar = (yr) this.c;
        long j3 = this.b;
        List list = (List) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                yrVar.b.beginTransaction();
                yrVar.b.executeFast("DELETE FROM profile_stories_albums WHERE dialog_id = " + j3).stepThis().dispose();
                sQLitePreparedStatement = yrVar.b.executeFast("REPLACE INTO profile_stories_albums VALUES(?, ?, ?, ?)");
                for (int i7 = 0; i7 < list.size(); i7++) {
                    di.r6 r6Var = (di.r6) list.get(i7);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, j3);
                    sQLitePreparedStatement.bindInteger(2, r6Var.a);
                    sQLitePreparedStatement.bindInteger(3, i7);
                    TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                    tL_storyAlbum.album_id = r6Var.a;
                    tL_storyAlbum.title = r6Var.b;
                    tL_storyAlbum.icon_photo = r6Var.c;
                    tL_storyAlbum.icon_video = r6Var.d;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_storyAlbum.getObjectSize());
                    tL_storyAlbum.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer.reuse();
                }
            } catch (Exception e10) {
                yrVar.o(e10, true);
            }
        } finally {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            yrVar.b.commitTransaction();
        }
    }

    private final void o() {
        yr yrVar = (yr) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        long j3 = this.b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                yrVar.b.beginTransaction();
                TLRPC.TL_message e02 = yrVar.e0(message.id, j3);
                xi.a(message, e02);
                int i7 = 0;
                while (i7 < 2) {
                    SQLitePreparedStatement executeFast = i7 == 0 ? yrVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : yrVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    try {
                        executeFast.requery();
                        NativeByteBuffer c10 = xi.c(e02);
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
                        yrVar.o(e, true);
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
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
                        SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                yrVar.b.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
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

    private final void p() {
        yr yrVar = (yr) this.c;
        SparseArray sparseArray = (SparseArray) this.d;
        yrVar.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i7 = 0; i7 < min; i7++) {
                yrVar.getNotificationCenter().k(qs.o1, Long.valueOf(this.b), Integer.valueOf(sparseArray.keyAt(i7)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i7));
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r12v12 ?? I:??[OBJECT, ARRAY]), method size: 1982
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 1982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a4.run():void");
    }

    public /* synthetic */ a4(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
