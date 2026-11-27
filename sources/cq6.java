// default package

import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r6 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        kf7 kf7Var = (kf7) this.b;
        long j = this.c;
        ya7 ya7Var = (ya7) this.d;
        boolean z = false;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = kf7Var.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j, new Object[0]);
                if (sQLiteCursor.next()) {
                    z = sQLiteCursor.intValue(0) != 0;
                }
            } catch (Exception e) {
                kf7Var.p(e, true);
            }
            sQLiteCursor.dispose();
            if (z) {
                return;
            }
            hl.c3(ya7Var);
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void b() {
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

    private final void c() {
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
            kf7.a0(i).n1(messages_messages.users, messages_messages.chats, true, true);
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

    private final void d() {
        wua wuaVar = (wua) this.b;
        ((l01) this.d).c(false);
        wuaVar.w2((int) this.c, wuaVar.getContext(), true);
    }

    private final void e() {
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

    /* JADX WARN: Can't wrap try/catch for region: R(10:110|111|(3:116|(8:118|119|120|121|122|(1:124)(1:127)|125|126)(1:137)|112)|139|120|121|122|(0)(0)|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0215, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0216, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0227, code lost:
    
        cc4.g(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026c, code lost:
    
        kf7.t0.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0272, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        if (r4 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d5, code lost:
    
        if (r4 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Chat chat;
        TLRPC.InputChannel inputChannel;
        Throwable th;
        SQLiteCursor sQLiteCursor;
        Exception exc;
        TLRPC.UserFull userFull;
        Throwable th2;
        Exception exc2;
        Exception exc3;
        Throwable th3;
        boolean z;
        FileInputStream fileInputStream;
        TLRPC.Chat chat2 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r4 = null;
        SQLiteCursor sQLiteCursor4 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement5 = null;
        byte b = 2;
        int i = 0;
        switch (this.a) {
            case 0:
                ls6 ls6Var = (ls6) this.b;
                TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
                long j = this.c;
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
                ls6 ls6Var2 = (ls6) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                long j2 = this.c;
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
                        executeFast2.bindLong(1, j2);
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
                ((uc7) this.b).getNotificationCenter().k(96, Long.valueOf(this.c), Integer.valueOf(((TLRPC.TL_chatOnlines) this.d).onlines));
                return;
            case 3:
                ((uc7) this.b).getNotificationCenter().k(46, Long.valueOf(this.c), (SparseArray) this.d);
                return;
            case 4:
                uc7 uc7Var = (uc7) this.b;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
                long j3 = this.c;
                zh6 zh6Var = uc7Var.Q4;
                if (zh6Var == null) {
                    zh6Var = new zh6();
                    uc7Var.Q4 = zh6Var;
                }
                boolean z2 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
                if (z2) {
                    zh6Var.k(j3, (TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags);
                    uc7Var.getNotificationCenter().k(jn7.j3, Long.valueOf(j3));
                }
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
                if (z2) {
                    tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
                }
                if (j3 != 0) {
                    tL_messages_getSavedReactionTags.flags |= 1;
                    tL_messages_getSavedReactionTags.peer = uc7Var.j1(j3);
                }
                uc7Var.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new ft0(uc7Var, j3, (Object) messages_savedreactiontags, (TLObject) tL_messages_getSavedReactionTags, (byte) 3));
                return;
            case 5:
                uc7 uc7Var2 = (uc7) this.b;
                l82 l82Var = (l82) this.d;
                long j4 = this.c;
                if (l82Var != null) {
                    uc7Var2.getClass();
                    l82Var.run();
                }
                uc7Var2.getNotificationCenter().k(jn7.a5, Long.valueOf(j4), 0L);
                return;
            case 6:
                ff7 ff7Var = (ff7) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j5 = this.c;
                int i2 = 0;
                while (true) {
                    if (i2 < updates.chats.size()) {
                        chat = updates.chats.get(i2);
                        if (j5 != chat.id) {
                            i2++;
                        }
                    } else {
                        chat = null;
                    }
                }
                if (chat == null || (inputChannel = chat.migrated_to) == null) {
                    return;
                }
                long j6 = inputChannel.channel_id;
                while (true) {
                    if (i < updates.chats.size()) {
                        TLRPC.Chat chat3 = updates.chats.get(i);
                        if (j6 == chat3.id) {
                            chat2 = chat3;
                        } else {
                            i++;
                        }
                    }
                }
                if (chat2 != null) {
                    ff7Var.run(j6);
                    return;
                }
                return;
            case 7:
                uc7 uc7Var3 = (uc7) this.b;
                long j7 = this.c;
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
                SQLiteDatabase sQLiteDatabase = uc7Var3.getMessagesStorage().b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j7).stepThis().dispose();
                        sQLitePreparedStatement5 = sQLiteDatabase.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                        sQLitePreparedStatement5.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                        tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer3);
                        sQLitePreparedStatement5.bindLong(1, j7);
                        sQLitePreparedStatement5.bindByteBuffer(2, nativeByteBuffer3);
                        sQLitePreparedStatement5.step();
                    } finally {
                    }
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    if (sQLitePreparedStatement5 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement5.dispose();
                return;
            case 8:
                kf7 kf7Var = (kf7) this.b;
                long j8 = this.c;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
                try {
                    sQLiteCursor = kf7Var.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j8, new Object[0]);
                    try {
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
                            if (!next || userFull == null || !lbc.a(userFull, requirementToContact)) {
                                return;
                            }
                            SQLitePreparedStatement executeFast3 = kf7Var.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                            try {
                                NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(userFull.getObjectSize());
                                userFull.serializeToStream(nativeByteBuffer4);
                                executeFast3.bindLong(1, j8);
                                executeFast3.bindByteBuffer(2, nativeByteBuffer4);
                                executeFast3.bindInteger(3, userFull.pinned_msg_id);
                                executeFast3.step();
                                executeFast3.dispose();
                                nativeByteBuffer4.reuse();
                                return;
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor = null;
                                sQLitePreparedStatement4 = executeFast3;
                                exc = e;
                                kf7Var.p(exc, true);
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = null;
                                sQLitePreparedStatement4 = executeFast3;
                                th = th;
                                if (sQLitePreparedStatement4 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e6) {
                    exc = e6;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                    if (sQLitePreparedStatement4 != null) {
                        sQLitePreparedStatement4.dispose();
                    }
                    if (sQLiteCursor != null) {
                        throw th;
                    }
                    sQLiteCursor.dispose();
                    throw th;
                }
                break;
            case 9:
                ((kf7) this.b).getMessagesController().h4.q(this.c, (TLRPC.TL_forumTopic) this.d, false);
                return;
            case 10:
                kf7 kf7Var2 = (kf7) this.b;
                long j9 = this.c;
                zh6 zh6Var2 = (zh6) this.d;
                try {
                    try {
                        kf7Var2.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j9).stepThis().dispose();
                        kf7Var2.b.beginTransaction();
                        SQLitePreparedStatement executeFast4 = kf7Var2.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                        while (i < zh6Var2.m()) {
                            try {
                                executeFast4.requery();
                                executeFast4.bindLong(1, j9);
                                executeFast4.bindLong(2, zh6Var2.j(i));
                                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) zh6Var2.n(i);
                                NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(channelParticipant.getObjectSize());
                                channelParticipant.serializeToStream(nativeByteBuffer5);
                                executeFast4.bindByteBuffer(3, nativeByteBuffer5);
                                executeFast4.step();
                                nativeByteBuffer5.reuse();
                                i++;
                            } catch (Exception e7) {
                                exc2 = e7;
                                sQLitePreparedStatement3 = executeFast4;
                                kf7Var2.p(exc2, true);
                                SQLiteDatabase sQLiteDatabase2 = kf7Var2.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th7) {
                                th2 = th7;
                                sQLitePreparedStatement3 = executeFast4;
                                SQLiteDatabase sQLiteDatabase3 = kf7Var2.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 == null) {
                                    throw th2;
                                }
                                sQLitePreparedStatement3.dispose();
                                throw th2;
                            }
                        }
                        executeFast4.dispose();
                        kf7Var2.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase4 = kf7Var2.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e8) {
                        exc2 = e8;
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                }
            case 11:
                ((kf7) this.b).getMessagesController().m3(this.c, (TLRPC.Chat) this.d);
                return;
            case 12:
                kf7 kf7Var3 = (kf7) this.b;
                long j10 = this.c;
                NativeByteBuffer nativeByteBuffer6 = (NativeByteBuffer) this.d;
                try {
                    try {
                        SQLitePreparedStatement executeFast5 = kf7Var3.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                        executeFast5.bindLong(1, j10);
                        executeFast5.bindByteBuffer(2, nativeByteBuffer6);
                        executeFast5.step();
                        executeFast5.dispose();
                    } finally {
                        nativeByteBuffer6.reuse();
                    }
                } catch (Exception e9) {
                    kf7Var3.p(e9, true);
                }
                return;
            case 13:
                kf7 kf7Var4 = (kf7) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                long j11 = this.c;
                try {
                    try {
                        kf7Var4.b.beginTransaction();
                        TLRPC.TL_message e0 = kf7Var4.e0(message2.id, j11);
                        s37.a(message2, e0);
                        while (true) {
                            SQLiteDatabase sQLiteDatabase5 = kf7Var4.b;
                            if (i >= 2) {
                                sQLiteDatabase5.commitTransaction();
                                SQLiteDatabase sQLiteDatabase6 = kf7Var4.b;
                                if (sQLiteDatabase6 != null) {
                                    sQLiteDatabase6.commitTransaction();
                                    return;
                                }
                                return;
                            }
                            SQLitePreparedStatement executeFast6 = i == 0 ? sQLiteDatabase5.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase5.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast6.requery();
                                NativeByteBuffer c = s37.c(e0);
                                if (c != null) {
                                    executeFast6.bindByteBuffer(1, c);
                                } else {
                                    executeFast6.bindNull(1);
                                }
                                executeFast6.bindInteger(2, message2.id);
                                executeFast6.bindLong(3, j11);
                                executeFast6.step();
                                executeFast6.dispose();
                                if (c != null) {
                                    c.reuse();
                                }
                                i++;
                            } catch (Exception e10) {
                                exc3 = e10;
                                sQLitePreparedStatement2 = executeFast6;
                                kf7Var4.p(exc3, true);
                                SQLiteDatabase sQLiteDatabase7 = kf7Var4.b;
                                if (sQLiteDatabase7 != null) {
                                    sQLiteDatabase7.commitTransaction();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th9) {
                                th3 = th9;
                                sQLitePreparedStatement = executeFast6;
                                SQLiteDatabase sQLiteDatabase8 = kf7Var4.b;
                                if (sQLiteDatabase8 != null) {
                                    sQLiteDatabase8.commitTransaction();
                                }
                                if (sQLitePreparedStatement == null) {
                                    throw th3;
                                }
                                sQLitePreparedStatement.dispose();
                                throw th3;
                            }
                        }
                    } catch (Throwable th10) {
                        th3 = th10;
                    }
                } catch (Exception e11) {
                    exc3 = e11;
                }
            case 14:
                kf7 kf7Var5 = (kf7) this.b;
                File file = (File) this.d;
                long j12 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Throwable th11) {
                    Throwable th12 = th11;
                    z = false;
                    break;
                }
                try {
                    byte[] bArr = new byte[TLObject.FLAG_20];
                    while (a.x && VoIPService.getSharedInstance() == null) {
                        if (fileInputStream.read(bArr) < 0) {
                            z = true;
                            fileInputStream.close();
                            kf7.t0.set(false);
                            StringBuilder sb = new StringBuilder("deferred index prewarm ");
                            sb.append(z ? "read " : "stopped, ");
                            sb.append((j12 / 1024) / 1024);
                            sb.append("MB in ");
                            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                            sb.append("ms");
                            cc4.b(sb.toString());
                            kf7Var5.a.c(new ke7(kf7Var5, z, b));
                            return;
                        }
                    }
                    z = false;
                    fileInputStream.close();
                    kf7.t0.set(false);
                    StringBuilder sb2 = new StringBuilder("deferred index prewarm ");
                    sb2.append(z ? "read " : "stopped, ");
                    sb2.append((j12 / 1024) / 1024);
                    sb2.append("MB in ");
                    sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    sb2.append("ms");
                    cc4.b(sb2.toString());
                    kf7Var5.a.c(new ke7(kf7Var5, z, b));
                    return;
                } finally {
                }
            case 15:
                kf7 kf7Var6 = (kf7) this.b;
                long j13 = this.c;
                tp8 tp8Var = (tp8) this.d;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase9 = kf7Var6.b;
                        Locale locale = Locale.US;
                        sQLiteCursor4 = sQLiteDatabase9.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j13 + " ORDER BY order_index ASC", new Object[0]);
                        while (sQLiteCursor4.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor4.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if (TLdeserialize != null) {
                                    arrayList2.add(w5b.a(TLdeserialize));
                                }
                            }
                        }
                    } catch (Exception e12) {
                        kf7Var6.p(e12, true);
                        break;
                    }
                    sQLiteCursor4.dispose();
                    tp8Var.x(arrayList2);
                    return;
                } catch (Throwable th13) {
                    if (sQLiteCursor4 == null) {
                        throw th13;
                    }
                    sQLiteCursor4.dispose();
                    throw th13;
                }
            case 16:
                kf7 kf7Var7 = (kf7) this.b;
                long j14 = this.c;
                xa7 xa7Var = (xa7) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor3 = kf7Var7.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j14, new Object[0]);
                        if (sQLiteCursor3.next()) {
                            iArr[0] = sQLiteCursor3.intValue(0);
                        }
                    } catch (Exception e13) {
                        kf7Var7.p(e13, true);
                        break;
                    }
                    sQLiteCursor3.dispose();
                    hl.c3(new t87(xa7Var, iArr, (byte) 26));
                    return;
                } catch (Throwable th14) {
                }
            case 17:
                kf7 kf7Var8 = (kf7) this.b;
                long j15 = this.c;
                wt1 wt1Var = (wt1) this.d;
                int[] iArr2 = new int[1];
                try {
                    try {
                        sQLiteCursor2 = kf7Var8.b.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(kf7Var8.getUserConfig().e()), Long.valueOf(j15));
                        if (sQLiteCursor2.next()) {
                            iArr2[0] = sQLiteCursor2.intValue(0);
                        }
                    } catch (Exception e14) {
                        kf7Var8.p(e14, true);
                        break;
                    }
                    sQLiteCursor2.dispose();
                    hl.c3(new t87(wt1Var, iArr2, (byte) 22));
                    return;
                } finally {
                    if (sQLiteCursor2 == null) {
                        throw th;
                    }
                    sQLiteCursor2.dispose();
                }
            case 18:
                ((kf7) this.b).getNotificationCenter().k(42, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 19:
                a();
                return;
            case 20:
                kf7 kf7Var9 = (kf7) this.b;
                SparseArray sparseArray = (SparseArray) this.d;
                long j16 = this.c;
                kf7Var9.getClass();
                if (sparseArray.size() != 0) {
                    int min = Math.min(sparseArray.size(), 100);
                    for (int i3 = 0; i3 < min; i3++) {
                        kf7Var9.getNotificationCenter().k(jn7.o1, Long.valueOf(j16), Integer.valueOf(sparseArray.keyAt(i3)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i3));
                    }
                    return;
                }
                return;
            case 21:
                ((NativeInstance) this.b).lambda$onParticipantDescriptionsRequired$2(this.c, (int[]) this.d);
                return;
            case 22:
                ((ip7) this.b).E(this.c, (String) this.d);
                return;
            case 23:
                b();
                return;
            case 24:
                c();
                return;
            case 25:
                ((eja) this.b).y1.presentFragment(zu1.ga(((r47) this.d).e1(), this.c));
                return;
            case 26:
                wua wuaVar = (wua) this.b;
                long j17 = this.c;
                Runnable runnable = (Runnable) this.d;
                wuaVar.w2((int) j17, wuaVar.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                ((t2b) this.b).D1((TLRPC.TL_messages_emojiGroups) this.d, this.c);
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
