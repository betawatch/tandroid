package org.telegram.messenger;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = j3;
        this.e = obj2;
        this.f = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        boolean z9;
        yr yrVar = (yr) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i7 = this.b;
        long j3 = this.c;
        a0.h hVar = yrVar.J;
        try {
            yrVar.b.beginTransaction();
            SQLitePreparedStatement executeFast = yrVar.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            try {
                if (arrayList != null) {
                    int size = arrayList.size();
                    z9 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i10);
                        long o4 = m5.o(tL_folderPeer.peer);
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_folderPeer.folder_id);
                        if (tL_folderPeer.folder_id == 1) {
                            z9 = true;
                        }
                        executeFast.bindInteger(2, 0);
                        executeFast.bindLong(3, o4);
                        executeFast.step();
                        hVar.l(o4);
                    }
                } else if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    z9 = false;
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i11);
                        long n10 = m5.n(tL_inputFolderPeer.peer);
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                        if (tL_inputFolderPeer.folder_id == 1) {
                            z9 = true;
                        }
                        executeFast.bindInteger(2, 0);
                        executeFast.bindLong(3, n10);
                        executeFast.step();
                        hVar.l(n10);
                    }
                } else {
                    executeFast.requery();
                    executeFast.bindInteger(1, i7);
                    boolean z10 = i7 == 1;
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, j3);
                    executeFast.step();
                    z9 = z10;
                }
                executeFast.dispose();
                yrVar.b.commitTransaction();
                if (!z9) {
                    yrVar.l(1);
                }
                yrVar.t1(false);
                SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
            } catch (Exception e10) {
                e = e10;
                sQLitePreparedStatement = executeFast;
                try {
                    yrVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = yrVar.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLitePreparedStatement = executeFast;
                sQLiteDatabase = yrVar.b;
                if (sQLiteDatabase != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = null;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        boolean z9;
        int i7;
        SQLiteCursor queryFinalized;
        boolean z10;
        boolean z11;
        int i10;
        int i11 = this.a;
        long j3 = this.c;
        int i12 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                f2 f2Var = (f2) obj3;
                long[] jArr = (long[]) obj2;
                Runnable runnable = (Runnable) obj;
                int length = jArr.length;
                while (r15 < length) {
                    long j10 = jArr[r15];
                    yr messagesStorage = f2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    messagesStorage.I(new yq(messagesStorage, this.b, this.c, j10, 4));
                    r15++;
                }
                g0.h3(runnable);
                return;
            case 1:
                ui uiVar = (ui) obj3;
                TLObject tLObject = (TLObject) obj2;
                c20 c20Var = (c20) obj;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_allStickers;
                int i13 = this.b;
                if (z12) {
                    uiVar.r1(i13, (TLRPC.TL_messages_allStickers) tLObject, new rf(c20Var, 1));
                    return;
                } else {
                    uiVar.z1(i13, null, false, (int) (System.currentTimeMillis() / 1000), this.c, new rf(c20Var, 2));
                    return;
                }
            case 2:
                SQLitePreparedStatement sQLitePreparedStatement = null;
                int i14 = 3;
                yr yrVar = (yr) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str = (String) obj;
                try {
                    try {
                        yrVar.b.beginTransaction();
                        TLRPC.TL_message e02 = yrVar.e0(i12, j3);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        e02.voiceTranscription = str;
                        int i15 = 0;
                        while (i15 < 2) {
                            SQLitePreparedStatement executeFast = i15 == 0 ? yrVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : yrVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast.requery();
                                NativeByteBuffer c10 = xi.c(e02);
                                if (c10 != null) {
                                    executeFast.bindByteBuffer(1, c10);
                                } else {
                                    executeFast.bindNull(1);
                                }
                                executeFast.bindInteger(2, i12);
                                int i16 = i14;
                                executeFast.bindLong(i16, j3);
                                executeFast.step();
                                executeFast.dispose();
                                yrVar.b.commitTransaction();
                                if (c10 != null) {
                                    c10.reuse();
                                }
                                i15++;
                                i14 = i16;
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
                        SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 3:
                yr yrVar2 = (yr) obj3;
                long j11 = this.c;
                TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong = (TLRPC.TL_updates_channelDifferenceTooLong) obj2;
                mk mkVar = (mk) obj;
                long j12 = -j11;
                try {
                    try {
                        i7 = 0;
                        queryFinalized = yrVar2.b.queryFinalized("SELECT pinned FROM dialogs WHERE did = " + j12, new Object[0]);
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = null;
                    }
                    try {
                        if (queryFinalized.next()) {
                            i7 = queryFinalized.intValue(0);
                            z10 = false;
                        } else {
                            z10 = i12 != 0;
                        }
                        queryFinalized.dispose();
                        yrVar2.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("UPDATE media_counts_v2 SET old = 1 WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM messages_holes WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM topics WHERE did = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM media_topics WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j12).stepThis().dispose();
                        yrVar2.b.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j12).stepThis().dispose();
                        ui mediaDataController = yrVar2.getMediaDataController();
                        mediaDataController.getClass();
                        g0.h3(new yg(mediaDataController, j12, 0));
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats.addAll(tL_updates_channelDifferenceTooLong.chats);
                        tL_messages_dialogs.users.addAll(tL_updates_channelDifferenceTooLong.users);
                        tL_messages_dialogs.messages.addAll(tL_updates_channelDifferenceTooLong.messages);
                        TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
                        dialog.id = j12;
                        try {
                            dialog.flags = 1;
                            sQLiteCursor = null;
                            try {
                                try {
                                    dialog.notify_settings = null;
                                    dialog.pinned = i7 != 0;
                                    dialog.pinnedNum = i7;
                                    tL_messages_dialogs.dialogs.add(dialog);
                                    yrVar2.e1(tL_messages_dialogs, 0);
                                    try {
                                        yrVar2.R1(j12, j11, new ArrayList(), null);
                                        z11 = z10;
                                    } catch (Exception e12) {
                                        e = e12;
                                        yrVar2 = yrVar2;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                }
                                try {
                                    g0.h3(new ir(yrVar2, j12, tL_updates_channelDifferenceTooLong, 0));
                                    if (z11) {
                                        i10 = i12;
                                        if (i10 == 1) {
                                            yrVar2.getMessagesController().G(j11, true);
                                        } else {
                                            yrVar2.getMessagesController().B0(j11, false);
                                        }
                                    } else {
                                        i10 = i12;
                                    }
                                    z9 = true;
                                    if (i10 != 1) {
                                        try {
                                            k00 k00Var = yrVar2.getMessagesController().q7;
                                            k00Var.getClass();
                                            g0.h3(new bi.kd(k00Var, j11, z9, 4));
                                        } catch (Exception e14) {
                                            e = e14;
                                            yrVar2.o(e, z9);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            mkVar.run();
                                            return;
                                        }
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    yrVar2 = yrVar2;
                                    z9 = true;
                                    yrVar2.o(e, z9);
                                    if (sQLiteCursor != null) {
                                    }
                                    mkVar.run();
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            z9 = true;
                            sQLiteCursor = null;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        z9 = true;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                } catch (Exception e18) {
                    e = e18;
                    sQLiteCursor = null;
                }
                mkVar.run();
                return;
            case 4:
                a();
                return;
            case 5:
                gz gzVar = (gz) obj3;
                ij ijVar = (ij) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                int e19 = ijVar.e1();
                ijVar.k = message2;
                ijVar.K1 = true;
                qs notificationCenter = gzVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(e19);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(j3);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, 0, bool);
                gzVar.getNotificationCenter().k(22, Integer.valueOf(e19), Integer.valueOf(message2.id), message2, Long.valueOf(j3), 0L, 0, bool);
                gzVar.d0(i12);
                gzVar.i0(i12, false);
                return;
            case 6:
                wz wzVar = (wz) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                a0.h hVar = wzVar.l;
                a0.h hVar2 = wzVar.k;
                a0.h hVar3 = wzVar.j;
                if (i12 != wzVar.c) {
                    return;
                }
                hVar3.k(arrayList, j3);
                hVar2.k(arrayList2, j3);
                ArrayList arrayList3 = (ArrayList) hVar.f(j3);
                hVar.l(j3);
                if (j3 == wzVar.d) {
                    android.support.v4.media.session.a0 a0Var = wzVar.b;
                    if (j3 != 0) {
                        ArrayList arrayList4 = (ArrayList) hVar3.f(j3);
                        ArrayList arrayList5 = (ArrayList) hVar2.f(j3);
                        if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                            a0Var.v(arrayList5);
                            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
                            if (m5.E(j3)) {
                                TLRPC.User user = (TLRPC.User) wzVar.h.f(j3);
                                uVar.a.setQueueTitle(user != null ? g5.m(0, user.first_name, user.last_name) : "DELETED USER");
                            } else {
                                TLRPC.Chat chat = (TLRPC.Chat) wzVar.i.f(-j3);
                                uVar.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                            }
                            ij ijVar2 = (ij) arrayList4.get(0);
                            cb.c cVar = new cb.c(5);
                            cVar.z((long) (ijVar2.L0() * 1000.0d));
                            cVar.B("android.media.metadata.ARTIST", ijVar2.w1(true));
                            cVar.B("android.media.metadata.TITLE", ijVar2.y1(true));
                            a0Var.t(new MediaMetadataCompat((Bundle) cVar.b));
                        }
                    }
                }
                if (arrayList3 != null) {
                    while (r15 < arrayList3.size()) {
                        ((Runnable) arrayList3.get(r15)).run();
                        r15++;
                    }
                    return;
                }
                return;
            case 7:
                k00 k00Var2 = (k00) obj3;
                TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) obj2;
                a0.h hVar4 = (a0.h) obj;
                k00Var2.getMessagesStorage().m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                k00Var2.getMessagesController().Y3(tL_messages_savedDialogsSlice.users, false);
                k00Var2.getMessagesController().S3(tL_messages_savedDialogsSlice.chats, false);
                LongSparseIntArray longSparseIntArray = k00Var2.c;
                long j13 = this.c;
                longSparseIntArray.put(j13, 0);
                ArrayList l10 = qg.d.l(tL_messages_savedDialogsSlice.dialogs);
                int i17 = tL_messages_savedDialogsSlice.count;
                int i18 = this.b;
                k00Var2.u(j13, l10, hVar4, false, i18, i17);
                k00Var2.y(j13, true);
                k00Var2.getMessagesStorage().C1(k00Var2.getConnectionsManager().getCurrentTime(), -j13, (List) k00Var2.a.f(j13), true);
                k00Var2.getMessagesStorage().j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i18 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) jg.g.i(1, tL_messages_savedDialogsSlice.dialogs);
                    TLRPC.Message message3 = (TLRPC.Message) hVar4.f(tL_monoForumDialog.top_message);
                    k00Var2.x(j13, m5.o(tL_monoForumDialog.peer), tL_monoForumDialog.top_message, message3 != null ? message3.date : 0);
                    return;
                } else {
                    if (k00Var2.l(j13) == null || k00Var2.l(j13).size() < tL_messages_savedDialogsSlice.count) {
                        k00Var2.h.l(j13);
                        k00Var2.o(j13);
                        return;
                    }
                    return;
                }
            default:
                k00 k00Var3 = (k00) obj3;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) obj2;
                a0.h hVar5 = (a0.h) obj;
                k00Var3.getMessagesStorage().m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
                k00Var3.getMessagesController().Y3(tL_messages_savedDialogs.users, false);
                k00Var3.getMessagesController().S3(tL_messages_savedDialogs.chats, false);
                LongSparseIntArray longSparseIntArray2 = k00Var3.c;
                long j14 = this.c;
                longSparseIntArray2.put(j14, 0);
                ArrayList l11 = qg.d.l(tL_messages_savedDialogs.dialogs);
                int size = tL_messages_savedDialogs.dialogs.size();
                int i19 = this.b;
                k00Var3.u(j14, l11, hVar5, false, i19, size);
                k00Var3.y(j14, true);
                k00Var3.getMessagesStorage().C1(k00Var3.getConnectionsManager().getCurrentTime(), -j14, (List) k00Var3.a.f(j14), true);
                k00Var3.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogs.dialogs.isEmpty() && i19 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) jg.g.i(1, tL_messages_savedDialogs.dialogs);
                    TLRPC.Message message4 = (TLRPC.Message) hVar5.f(tL_monoForumDialog2.top_message);
                    k00Var3.x(j14, m5.o(tL_monoForumDialog2.peer), tL_monoForumDialog2.top_message, message4 != null ? message4.date : 0);
                    return;
                } else {
                    if (k00Var3.l(j14) == null || k00Var3.l(j14).size() < tL_messages_savedDialogs.dialogs.size()) {
                        k00Var3.h.l(j14);
                        k00Var3.o(j14);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.a = 0;
        this.d = f2Var;
        this.e = jArr;
        this.c = j3;
        this.b = i7;
        this.f = runnable;
    }

    public /* synthetic */ z1(ui uiVar, TLObject tLObject, int i7, c20 c20Var, long j3) {
        this.a = 1;
        this.d = uiVar;
        this.e = tLObject;
        this.b = i7;
        this.f = c20Var;
        this.c = j3;
    }

    public /* synthetic */ z1(yr yrVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, mk mkVar) {
        this.a = 3;
        this.d = yrVar;
        this.c = j3;
        this.b = i7;
        this.e = tL_updates_channelDifferenceTooLong;
        this.f = mkVar;
    }

    public /* synthetic */ z1(yr yrVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.a = 4;
        this.d = yrVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ z1(gz gzVar, ij ijVar, TLRPC.Message message, long j3, int i7) {
        this.a = 5;
        this.d = gzVar;
        this.e = ijVar;
        this.f = message;
        this.c = j3;
        this.b = i7;
    }

    public /* synthetic */ z1(k00 k00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.d = k00Var;
        this.e = messages_saveddialogs;
        this.c = j3;
        this.f = hVar;
        this.b = i7;
    }
}
