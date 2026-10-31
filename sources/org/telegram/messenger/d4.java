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
import org.telegram.ui.xv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d4(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    private final void a() {
        boolean[] zArr = (boolean[]) this.c;
        org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) this.d;
        zArr[0] = false;
        long j10 = this.b;
        if (j10 == -1) {
            ecVarArr[0].setText(cd.L0(2131743938, null));
            org.telegram.ui.ActionBar.a7.V(ecVarArr[0], org.telegram.ui.ActionBar.t6.p7, null);
        } else {
            ecVarArr[0].setText(cd.a0(null, null, 2131747251, Long.valueOf(j10)));
            org.telegram.ui.ActionBar.a7.V(ecVarArr[0], org.telegram.ui.ActionBar.t6.w6, null);
        }
    }

    private final void b() {
        ui uiVar = (ui) this.c;
        TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
        long j10 = this.b;
        uiVar.getClass();
        try {
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void c() {
        ui uiVar = (ui) this.c;
        TL_update.TL_updateBotCommands tL_updateBotCommands = (TL_update.TL_updateBotCommands) this.d;
        long j10 = this.b;
        uiVar.getClass();
        try {
            TL_bots.BotInfo H0 = uiVar.H0(tL_updateBotCommands.bot_id, j10);
            if (H0 != null) {
                H0.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(H0.getObjectSize());
            H0.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, H0.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void d() {
        ui uiVar = (ui) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        long j10 = this.b;
        try {
            uiVar.getMessagesStorage().b.beginTransaction();
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                jj.q5(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindInteger(2, message.id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            uiVar.getMessagesStorage().b.commitTransaction();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    private final void f() {
        vp vpVar = (vp) this.c;
        TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.d;
        if (vpVar.b8 == null) {
            vpVar.b8 = new a0.h();
        }
        boolean z10 = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        long j10 = this.b;
        if (z10) {
            vpVar.b8.k((TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags, j10);
            vpVar.getNotificationCenter().k(zs.h3, Long.valueOf(j10));
        }
        TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z10) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j10 != 0) {
            tL_messages_getSavedReactionTags.flags |= 1;
            tL_messages_getSavedReactionTags.peer = vpVar.i1(j10);
        }
        vpVar.getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new hm(vpVar, j10, messages_savedreactiontags, tL_messages_getSavedReactionTags, 0));
    }

    private final void g() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        cs csVar = (cs) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            chat = null;
            if (i11 >= updates.chats.size()) {
                chat2 = null;
                break;
            }
            chat2 = updates.chats.get(i11);
            if (this.b == chat2.id) {
                break;
            } else {
                i11++;
            }
        }
        if (chat2 == null || (inputChannel = chat2.migrated_to) == null) {
            return;
        }
        long j10 = inputChannel.channel_id;
        while (true) {
            if (i10 >= updates.chats.size()) {
                break;
            }
            TLRPC.Chat chat3 = updates.chats.get(i10);
            if (j10 == chat3.id) {
                chat = chat3;
                break;
            }
            i10++;
        }
        if (chat != null) {
            csVar.run(j10);
        }
    }

    private final void h() {
        vp vpVar = (vp) this.c;
        long j10 = this.b;
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.d;
        SQLiteDatabase sQLiteDatabase = vpVar.getMessagesStorage().b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteDatabase.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j10).stepThis().dispose();
                sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                sQLitePreparedStatement.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindLong(1, j10);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                f8.g(e, true);
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

    private final void i() {
        ((vp) this.c).getNotificationCenter().k(zs.g1, Long.valueOf(this.b), Integer.valueOf(((TLRPC.TL_chatOnlines) this.d).onlines));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.UserFull userFull;
        hs hsVar = (hs) this.c;
        long j10 = this.b;
        TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.d;
        hsVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = hsVar.b.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j10, new Object[0]);
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
                    if (next && userFull != null && h20.a(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                            userFull.serializeToStream(nativeByteBuffer);
                            executeFast.bindLong(1, j10);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.bindInteger(3, userFull.pinned_msg_id);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor2 = null;
                            sQLitePreparedStatement = executeFast;
                            hsVar.o(e, true);
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
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = "SELECT uid, info, pinned FROM user_settings WHERE uid = ";
            }
        } catch (Exception e10) {
            e = e10;
            sQLiteCursor2 = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = 0;
        }
    }

    private final void k() {
        hs hsVar = (hs) this.c;
        hsVar.getMessagesController().c3((TLRPC.Chat) this.d, this.b);
    }

    private final void l() {
        hs hsVar = (hs) this.c;
        hsVar.getMessagesController().r7.q(this.b, (TLRPC.TL_forumTopic) this.d, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m() {
        hs hsVar = (hs) this.c;
        long j10 = this.b;
        th.s4 s4Var = (th.s4) this.d;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM profile_stories_albums WHERE dialog_id = " + j10 + " ORDER BY order_index ASC", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TL_stories.TL_storyAlbum TLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(th.y4.a(TLdeserialize));
                        }
                    }
                }
            } catch (Exception e) {
                hsVar.o(e, true);
            }
            sQLiteCursor.dispose();
            s4Var.x(arrayList);
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.telegram.SQLite.SQLiteDatabase] */
    private final void n() {
        hs hsVar = (hs) this.c;
        long j10 = this.b;
        a0.h hVar = (a0.h) this.d;
        hsVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                hsVar.b.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j10).stepThis().dispose();
                hsVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, hVar.j(i10));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.n(i10);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        hsVar.o(e, true);
                        hsVar = hsVar.b;
                        if (hsVar != 0) {
                            hsVar.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
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
                hsVar.b.commitTransaction();
                hsVar = hsVar.b;
                if (hsVar != 0) {
                    hsVar.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    private final void o() {
        hs hsVar = (hs) this.c;
        long j10 = this.b;
        NativeByteBuffer nativeByteBuffer = (NativeByteBuffer) this.d;
        hsVar.getClass();
        try {
            SQLitePreparedStatement executeFast = hsVar.b.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j10);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            hsVar.o(e, true);
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
    private final void p() {
        hs hsVar = (hs) this.c;
        long j10 = this.b;
        List list = (List) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                hsVar.b.beginTransaction();
                hsVar.b.executeFast("DELETE FROM profile_stories_albums WHERE dialog_id = " + j10).stepThis().dispose();
                sQLitePreparedStatement = hsVar.b.executeFast("REPLACE INTO profile_stories_albums VALUES(?, ?, ?, ?)");
                for (int i10 = 0; i10 < list.size(); i10++) {
                    th.y4 y4Var = (th.y4) list.get(i10);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, j10);
                    sQLitePreparedStatement.bindInteger(2, y4Var.a);
                    sQLitePreparedStatement.bindInteger(3, i10);
                    TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                    tL_storyAlbum.album_id = y4Var.a;
                    tL_storyAlbum.title = y4Var.b;
                    tL_storyAlbum.icon_photo = y4Var.c;
                    tL_storyAlbum.icon_video = y4Var.d;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_storyAlbum.getObjectSize());
                    tL_storyAlbum.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer.reuse();
                }
            } catch (Exception e) {
                hsVar.o(e, true);
            }
        } finally {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            hsVar.b.commitTransaction();
        }
    }

    private final void q() {
        hs hsVar = (hs) this.c;
        SparseArray sparseArray = (SparseArray) this.d;
        hsVar.getClass();
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i10 = 0; i10 < min; i10++) {
                hsVar.getNotificationCenter().k(zs.o1, Long.valueOf(this.b), Integer.valueOf(sparseArray.keyAt(i10)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r6 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void r() {
        hs hsVar = (hs) this.c;
        long j10 = this.b;
        nn nnVar = (nn) this.d;
        int i10 = 1;
        int[] iArr = new int[1];
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = hsVar.b.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(hsVar.getUserConfig().e()), Long.valueOf(j10));
                if (sQLiteCursor.next()) {
                    iArr[0] = sQLiteCursor.intValue(0);
                }
            } catch (Exception e) {
                hsVar.o(e, true);
            }
            sQLiteCursor.dispose();
            i0.g3(new hr(i10, nnVar, iArr));
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    private final void s() {
        Boolean bool;
        t10 t10Var = (t10) this.c;
        long j10 = this.b;
        String str = (String) this.d;
        synchronized (t10Var) {
            t10Var.d.put(Long.valueOf(j10), str);
            LongSparseArray longSparseArray = t10Var.a;
            bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            t10Var.H();
        }
        zs.f(t10Var.currentAccount).k(zs.P1, Long.valueOf(j10), bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0559 A[Catch: all -> 0x0392, Exception -> 0x0527, TryCatch #7 {Exception -> 0x0527, blocks: (B:299:0x04fc, B:302:0x0515, B:304:0x051f, B:308:0x052b, B:310:0x0535, B:317:0x053d, B:319:0x0559, B:320:0x0560, B:322:0x0566, B:323:0x056a), top: B:298:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0566 A[Catch: all -> 0x0392, Exception -> 0x0527, TryCatch #7 {Exception -> 0x0527, blocks: (B:299:0x04fc, B:302:0x0515, B:304:0x051f, B:308:0x052b, B:310:0x0535, B:317:0x053d, B:319:0x0559, B:320:0x0560, B:322:0x0566, B:323:0x056a), top: B:298:0x04fc }] */
    /* JADX WARN: Type inference failed for: r0v57, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r11v10, types: [org.telegram.messenger.f1, org.telegram.messenger.hs] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v9, types: [org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r14v4, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v13, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v19, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Consumer consumer;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? r10;
        SQLiteDatabase sQLiteDatabase;
        ?? r17;
        ArrayList arrayList3;
        String sb2;
        int i10;
        ArrayList arrayList4;
        a0.h hVar;
        String str;
        a0.h hVar2;
        int size;
        int i11;
        String str2;
        String str3;
        SparseArray sparseArray;
        String str4;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer byteBufferValue;
        ArrayList arrayList5;
        SparseArray sparseArray2;
        HashSet hashSet;
        int i12;
        char c10;
        char c11;
        ArrayList arrayList6;
        int i13 = this.a;
        int i14 = 11;
        ?? r42 = 0;
        r4 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList7 = null;
        int i15 = 1;
        ?? r72 = 0;
        int i16 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i13) {
            case 0:
                zs.f(((g4) obj2).currentAccount).k(67, Long.valueOf(j10), (TLRPC.UserFull) obj);
                return;
            case 1:
                nd ndVar = (nd) obj2;
                ndVar.G.e(j10);
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj);
                int i17 = 0;
                while (i17 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i17).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i17);
                        i17--;
                    }
                    i17++;
                }
                ndVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                ndVar.getMessagesController().V3(messages_messages.users, false);
                ndVar.getMessagesController().P3(messages_messages.chats, false);
                ndVar.c.k(messages_messages.messages, j10);
                zs.e().k(zs.F4, Long.valueOf(j10), Integer.valueOf(ndVar.currentAccount));
                return;
            case 2:
                TL_update.TL_updateMessageWidgetData tL_updateMessageWidgetData = (TL_update.TL_updateMessageWidgetData) obj;
                int i18 = ((vp) obj2).currentAccount;
                int i19 = tL_updateMessageWidgetData.msg_id;
                String str5 = tL_updateMessageWidgetData.public_data;
                long j11 = tL_updateMessageWidgetData.public_data_hash;
                String str6 = tL_updateMessageWidgetData.chat_data;
                for (org.telegram.utils.twidget.m mVar : org.telegram.utils.twidget.p.a.values()) {
                    if (!mVar.k && mVar.b == i18 && mVar.c == j10 && mVar.d == i19) {
                        if (str5 != null) {
                            mVar.r = j11;
                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar.s;
                            if (tL_messageMediaWidget != null) {
                                tL_messageMediaWidget.public_data_hash = j11;
                            }
                        }
                        org.telegram.utils.twidget.p.c(mVar, str6 != null ? org.telegram.utils.twidget.p.A(str6) : mVar.p, str5 != null ? org.telegram.utils.twidget.p.A(str5) : mVar.q);
                    }
                }
                return;
            case 3:
                vp vpVar = (vp) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                vpVar.getClass();
                vpVar.V3(tL_chatInviteJoinResultWebView.users, false);
                o2.b(vpVar.currentAccount).c(-j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 4:
                vp vpVar2 = (vp) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                vpVar2.getClass();
                vpVar2.V3(tL_messages_invitedUsers.updates.users, false);
                vpVar2.P3(tL_messages_invitedUsers.updates.chats, false);
                org.telegram.ui.Components.s4.f(vpVar2.currentAccount, vpVar2.L0(Long.valueOf(j10)), tL_messages_invitedUsers);
                return;
            case 5:
                ?? r11 = (hs) obj2;
                Consumer consumer2 = (Consumer) obj;
                String str7 = ")";
                String str8 = " AND mid IN (";
                String str9 = ",";
                try {
                    sQLiteDatabase = r11.b;
                    Locale locale = Locale.US;
                } catch (Exception e) {
                    e = e;
                    consumer = consumer2;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    r42 = sQLiteDatabase.queryFinalized("SELECT top_message, data, topic_message, unread_count, max_read_id, unread_mentions, unread_reactions, read_outbox, pinned, total_messages_count, nopaid_messages_exception, unread_poll_votes FROM topics WHERE did = " + j10 + " ORDER BY pinned ASC", new Object[0]);
                    arrayList = null;
                    SparseArray sparseArray3 = null;
                    HashSet hashSet2 = null;
                    while (r42.next()) {
                        try {
                            if (arrayList == null) {
                                try {
                                    try {
                                        arrayList5 = new ArrayList();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (r42 != 0) {
                                            r42.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    consumer = consumer2;
                                }
                                try {
                                    sparseArray2 = new SparseArray();
                                    hashSet = new HashSet();
                                    arrayList = arrayList5;
                                } catch (Exception e10) {
                                    e = e10;
                                    consumer = consumer2;
                                    arrayList = arrayList5;
                                    r10 = i15;
                                    r42 = r42;
                                    r11.o(e, r10);
                                    if (r42 != 0) {
                                    }
                                    consumer.x(arrayList);
                                    return;
                                }
                            } else {
                                sparseArray2 = sparseArray3;
                                hashSet = hashSet2;
                            }
                            try {
                                int intValue = r42.intValue(r72);
                                ?? byteBufferValue2 = r42.byteBufferValue(i15);
                                if (byteBufferValue2 != 0) {
                                    i12 = i15;
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
                                            hashSet.add(Integer.valueOf(intValue));
                                            arrayList.add(TLdeserialize);
                                            NativeByteBuffer byteBufferValue3 = r42.byteBufferValue(2);
                                            sparseArray3 = sparseArray2;
                                            TLdeserialize.topicStartMessage = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                            byteBufferValue3.reuse();
                                            c10 = 3;
                                            TLdeserialize.unread_count = r42.intValue(3);
                                            TLdeserialize.read_inbox_max_id = r42.intValue(4);
                                            TLdeserialize.unread_mentions_count = r42.intValue(5);
                                            TLdeserialize.unread_reactions_count = r42.intValue(6);
                                            TLdeserialize.read_outbox_max_id = r42.intValue(7);
                                            int intValue2 = r42.intValue(8) - 1;
                                            TLdeserialize.pinnedOrder = intValue2;
                                            TLdeserialize.pinned = intValue2 >= 0 ? i12 : 0;
                                            TLdeserialize.totalMessagesCount = r42.intValue(9);
                                            TLdeserialize.nopaid_messages_exception = r42.intValue(10) != 0 ? i12 : 0;
                                            c11 = 11;
                                            TLdeserialize.unread_poll_votes_count = r42.intValue(11);
                                        } else {
                                            sparseArray3 = sparseArray2;
                                            c10 = 3;
                                            c11 = 11;
                                        }
                                        byteBufferValue2.reuse();
                                    } catch (Exception e11) {
                                        e = e11;
                                        consumer = consumer2;
                                        r10 = i12;
                                        r42 = r42;
                                        r11.o(e, r10);
                                        if (r42 != 0) {
                                        }
                                        consumer.x(arrayList);
                                        return;
                                    }
                                } else {
                                    sparseArray3 = sparseArray2;
                                    i12 = i15;
                                    c10 = 3;
                                    c11 = 11;
                                }
                                hashSet2 = hashSet;
                                i15 = i12;
                                r72 = 0;
                            } catch (Exception e12) {
                                e = e12;
                                i12 = i15;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            r17 = r42;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    int i20 = i15;
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    if (arrayList == null || arrayList.isEmpty()) {
                        r17 = r42;
                        consumer = consumer2;
                        arrayList3 = arrayList;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = r11.b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SELECT mid, data, replydata FROM messages_v2 WHERE uid = ");
                        sb3.append(j10);
                        sb3.append(" AND mid IN (");
                        r17 = r42;
                        HashSet hashSet3 = hashSet2;
                        try {
                            try {
                                sb3.append(TextUtils.join(",", hashSet3));
                                sb3.append(")");
                                sb2 = sb3.toString();
                                consumer = consumer2;
                                i10 = 0;
                            } catch (Exception e14) {
                                e = e14;
                                consumer = consumer2;
                                arrayList2 = r17;
                                r10 = 1;
                                r42 = arrayList2;
                                r11.o(e, r10);
                                if (r42 != 0) {
                                }
                                consumer.x(arrayList);
                                return;
                            }
                            try {
                                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized(sb2, new Object[0]);
                                while (queryFinalized.next()) {
                                    try {
                                        int intValue3 = queryFinalized.intValue(i10);
                                        NativeByteBuffer byteBufferValue4 = queryFinalized.byteBufferValue(i20);
                                        if (byteBufferValue4 != null) {
                                            arrayList4 = arrayList;
                                            try {
                                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                                if (TLdeserialize2 != null) {
                                                    str2 = str7;
                                                    str3 = str8;
                                                    TLdeserialize2.readAttachPath(byteBufferValue4, d20.i(r11.currentAccount).n);
                                                } else {
                                                    str2 = str7;
                                                    str3 = str8;
                                                }
                                                byteBufferValue4.reuse();
                                                hashSet3.remove(Integer.valueOf(intValue3));
                                                sparseArray = sparseArray3;
                                                ArrayList arrayList11 = (ArrayList) sparseArray.get(intValue3);
                                                if (arrayList11 != null) {
                                                    for (int i21 = 0; i21 < arrayList11.size(); i21++) {
                                                        ((TLRPC.TL_forumTopic) arrayList11.get(i21)).topMessage = TLdeserialize2;
                                                    }
                                                }
                                                hs.e(TLdeserialize2, arrayList9, arrayList10, null);
                                                try {
                                                    messageReplyHeader = TLdeserialize2.reply_to;
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    str4 = str9;
                                                }
                                                if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0 && hs.v0(TLdeserialize2.action)) {
                                                    if (queryFinalized.isNull(2) || (byteBufferValue = queryFinalized.byteBufferValue(2)) == null) {
                                                        str4 = str9;
                                                    } else {
                                                        TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        TLdeserialize2.replyMessage = TLdeserialize3;
                                                        str4 = str9;
                                                        try {
                                                            TLdeserialize3.readAttachPath(byteBufferValue, r11.getUserConfig().n);
                                                            byteBufferValue.reuse();
                                                            TLRPC.Message message = TLdeserialize2.replyMessage;
                                                            if (message != null) {
                                                                hs.e(message, arrayList9, arrayList10, null);
                                                            }
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            r11.o(e, true);
                                                            str9 = str4;
                                                            arrayList = arrayList4;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            i20 = 1;
                                                            sparseArray3 = sparseArray;
                                                            i10 = 0;
                                                        }
                                                    }
                                                    if (TLdeserialize2.replyMessage == null) {
                                                        hs.d(TLdeserialize2, hVar3, hVar4);
                                                    }
                                                    str9 = str4;
                                                    arrayList = arrayList4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    i20 = 1;
                                                    sparseArray3 = sparseArray;
                                                    i10 = 0;
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                arrayList2 = r17;
                                                arrayList = arrayList4;
                                                r10 = 1;
                                                r42 = arrayList2;
                                                r11.o(e, r10);
                                                if (r42 != 0) {
                                                }
                                                consumer.x(arrayList);
                                                return;
                                            }
                                        } else {
                                            str2 = str7;
                                            str3 = str8;
                                            arrayList4 = arrayList;
                                            sparseArray = sparseArray3;
                                        }
                                        str4 = str9;
                                        str9 = str4;
                                        arrayList = arrayList4;
                                        str7 = str2;
                                        str8 = str3;
                                        i20 = 1;
                                        sparseArray3 = sparseArray;
                                        i10 = 0;
                                    } catch (Exception e18) {
                                        e = e18;
                                        arrayList2 = r17;
                                        r10 = 1;
                                        r42 = arrayList2;
                                        r11.o(e, r10);
                                        if (r42 != 0) {
                                        }
                                        consumer.x(arrayList);
                                        return;
                                    }
                                }
                                String str10 = str7;
                                String str11 = str8;
                                arrayList4 = arrayList;
                                SparseArray sparseArray4 = sparseArray3;
                                String str12 = str9;
                                try {
                                    queryFinalized.dispose();
                                    if (hashSet3.isEmpty()) {
                                        hVar = hVar3;
                                        str = str12;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase3 = r11.b;
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("SELECT mid, data FROM messages_topics WHERE uid = ");
                                        sb4.append(j10);
                                        sb4.append(str11);
                                        str = str12;
                                        sb4.append(TextUtils.join(str, hashSet3));
                                        sb4.append(str10);
                                        ?? r12 = 0;
                                        ?? queryFinalized2 = sQLiteDatabase3.queryFinalized(sb4.toString(), new Object[0]);
                                        while (queryFinalized2.next()) {
                                            try {
                                                int intValue4 = queryFinalized2.intValue(r12);
                                                ?? byteBufferValue5 = queryFinalized2.byteBufferValue(1);
                                                if (byteBufferValue5 != 0) {
                                                    ?? TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(r12), r12);
                                                    if (TLdeserialize4 != 0) {
                                                        hVar = hVar3;
                                                        hVar2 = hVar4;
                                                        try {
                                                            TLdeserialize4.readAttachPath(byteBufferValue5, d20.i(r11.currentAccount).n);
                                                        } catch (Exception e19) {
                                                            e = e19;
                                                            r11.o(e, true);
                                                            size = arrayList4.size();
                                                            i11 = 0;
                                                            while (i11 < size) {
                                                            }
                                                            arrayList3 = arrayList4;
                                                            r11.K0(hVar, hVar2, arrayList9, arrayList10, 0);
                                                            ArrayList arrayList12 = new ArrayList();
                                                            ArrayList arrayList13 = new ArrayList();
                                                            if (!arrayList10.isEmpty()) {
                                                            }
                                                            if (!arrayList9.isEmpty()) {
                                                            }
                                                            i0.g3(new eq(r11, arrayList13, arrayList12, 1));
                                                            r11.J0(arrayList3, j10);
                                                            r17.dispose();
                                                            arrayList = arrayList3;
                                                            consumer.x(arrayList);
                                                            return;
                                                        }
                                                    } else {
                                                        hVar = hVar3;
                                                        hVar2 = hVar4;
                                                    }
                                                    byteBufferValue5.reuse();
                                                    hashSet3.remove(Integer.valueOf(intValue4));
                                                    hs.e(TLdeserialize4, arrayList9, arrayList10, null);
                                                    ArrayList arrayList14 = (ArrayList) sparseArray4.get(intValue4);
                                                    if (arrayList14 != null) {
                                                        for (int i22 = 0; i22 < arrayList14.size(); i22++) {
                                                            ((TLRPC.TL_forumTopic) arrayList14.get(i22)).topMessage = TLdeserialize4;
                                                        }
                                                    }
                                                } else {
                                                    hVar = hVar3;
                                                    hVar2 = hVar4;
                                                }
                                                hVar3 = hVar;
                                                hVar4 = hVar2;
                                                r12 = 0;
                                            } catch (Exception e20) {
                                                e = e20;
                                                hVar = hVar3;
                                                hVar2 = hVar4;
                                            }
                                        }
                                        hVar = hVar3;
                                    }
                                    hVar2 = hVar4;
                                    size = arrayList4.size();
                                    i11 = 0;
                                    while (i11 < size) {
                                        arrayList3 = arrayList4;
                                        try {
                                            Object obj3 = arrayList3.get(i11);
                                            i11++;
                                            long o10 = o5.o(((TLRPC.TL_forumTopic) obj3).from_id);
                                            if (o10 != 0) {
                                                if (o10 > 0) {
                                                    if (!arrayList9.contains(Long.valueOf(o10))) {
                                                        arrayList9.add(Long.valueOf(o10));
                                                    }
                                                } else if (!arrayList10.contains(Long.valueOf(o10))) {
                                                    arrayList10.add(Long.valueOf(o10));
                                                }
                                            }
                                            arrayList4 = arrayList3;
                                        } catch (Exception e21) {
                                            e = e21;
                                            arrayList = arrayList3;
                                            arrayList2 = r17;
                                            r10 = 1;
                                            r42 = arrayList2;
                                            r11.o(e, r10);
                                            if (r42 != 0) {
                                                r42.dispose();
                                            }
                                            consumer.x(arrayList);
                                            return;
                                        }
                                    }
                                    arrayList3 = arrayList4;
                                    r11.K0(hVar, hVar2, arrayList9, arrayList10, 0);
                                    ArrayList arrayList122 = new ArrayList();
                                    ArrayList arrayList132 = new ArrayList();
                                    if (!arrayList10.isEmpty()) {
                                        r11.Q(TextUtils.join(str, arrayList10), arrayList122);
                                    }
                                    if (!arrayList9.isEmpty()) {
                                        r11.n0(arrayList9, arrayList132, false);
                                    }
                                    i0.g3(new eq(r11, arrayList132, arrayList122, 1));
                                    r11.J0(arrayList3, j10);
                                } catch (Exception e22) {
                                    e = e22;
                                    arrayList3 = arrayList4;
                                }
                            } catch (Exception e23) {
                                e = e23;
                                arrayList2 = r17;
                                r10 = 1;
                                r42 = arrayList2;
                                r11.o(e, r10);
                                if (r42 != 0) {
                                }
                                consumer.x(arrayList);
                                return;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r42 = r17;
                            if (r42 != 0) {
                            }
                            throw th;
                        }
                    }
                    r17.dispose();
                    arrayList = arrayList3;
                } catch (Exception e24) {
                    e = e24;
                    consumer = consumer2;
                    arrayList7 = null;
                    arrayList = arrayList7;
                    arrayList2 = arrayList7;
                    r10 = 1;
                    r42 = arrayList2;
                    r11.o(e, r10);
                    if (r42 != 0) {
                    }
                    consumer.x(arrayList);
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    r42 = 0;
                }
                consumer.x(arrayList);
                return;
            case 6:
                ot otVar = (ot) obj2;
                xv0 xv0Var = (xv0) obj;
                HashSet hashSet4 = new HashSet();
                Iterator<Map.Entry<String, ?>> it = vp.r1(otVar.currentAccount).e7.getAll().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    StringBuilder sb5 = new StringBuilder("notify2_");
                    long j12 = this.b;
                    sb5.append(j12);
                    if (key.startsWith(sb5.toString())) {
                        Integer z10 = Utilities.z(key.replace("notify2_" + j12, ""));
                        int intValue5 = z10.intValue();
                        if (intValue5 != 0 && otVar.getMessagesController().q2(j12, intValue5, null) != otVar.getMessagesController().q2(j12, 0L, null)) {
                            hashSet4.add(z10);
                        }
                    }
                }
                i0.g3(new hr(i14, xv0Var, hashSet4));
                return;
            case 7:
                ow owVar = (ow) obj2;
                TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) obj;
                owVar.getClass();
                if (tL_dialog.folder_id == 1) {
                    SharedPreferences.Editor edit = vp.r1(owVar.currentAccount).e7.edit();
                    edit.putBoolean("dialog_bar_archived" + j10, true);
                    edit.commit();
                }
                owVar.getMessagesController().Q.k(tL_dialog, tL_dialog.id);
                owVar.getMessagesController().y.add(tL_dialog);
                owVar.getMessagesController().Q4(null);
                owVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                t10 t10Var = (t10) obj2;
                zs.f(t10Var.currentAccount).k(128, (jj) obj, Boolean.FALSE, Boolean.valueOf(t10Var.B(j10)));
                return;
            case 9:
                s();
                return;
            case 10:
                a();
                return;
            case 11:
                ((u9) obj).d = null;
                ((x9) obj2).m(j10);
                return;
            case 12:
                b();
                return;
            case 13:
                c();
                return;
            case 14:
                d();
                return;
            case 15:
                ((vp) obj2).getNotificationCenter().k(45, Long.valueOf(j10), (SparseArray) obj);
                return;
            case 16:
                f();
                return;
            case 17:
                g();
                return;
            case 18:
                h();
                return;
            case 19:
                i();
                return;
            case 20:
                j();
                return;
            case 21:
                k();
                return;
            case 22:
                l();
                return;
            case 23:
                m();
                return;
            case 24:
                n();
                return;
            case 25:
                o();
                return;
            case 26:
                p();
                return;
            case 27:
                q();
                return;
            case 28:
                r();
                return;
            default:
                hs hsVar = (hs) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                try {
                    try {
                        hsVar.b.beginTransaction();
                        TLRPC.TL_message e02 = hsVar.e0(message2.id, j10);
                        xi.a(message2, e02);
                        while (i16 < 2) {
                            SQLitePreparedStatement executeFast = i16 == 0 ? hsVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : hsVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast.requery();
                                NativeByteBuffer c12 = xi.c(e02);
                                if (c12 != null) {
                                    executeFast.bindByteBuffer(1, c12);
                                } else {
                                    executeFast.bindNull(1);
                                }
                                executeFast.bindInteger(2, message2.id);
                                executeFast.bindLong(3, j10);
                                executeFast.step();
                                executeFast.dispose();
                                if (c12 != null) {
                                    c12.reuse();
                                }
                                i16++;
                            } catch (Exception e25) {
                                e = e25;
                                sQLitePreparedStatement = executeFast;
                                hsVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase4 = hsVar.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement = executeFast;
                                SQLiteDatabase sQLiteDatabase5 = hsVar.b;
                                if (sQLiteDatabase5 != null) {
                                    sQLiteDatabase5.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                        hsVar.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase6 = hsVar.b;
                        if (sQLiteDatabase6 != null) {
                            sQLiteDatabase6.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e26) {
                        e = e26;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
        }
    }

    public /* synthetic */ d4(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
