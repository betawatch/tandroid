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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z1(Object obj, int i3, long j10, Object obj2, Serializable serializable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i3;
        this.c = j10;
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
        boolean z10;
        qr qrVar = (qr) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i3 = this.b;
        long j10 = this.c;
        a0.h hVar = qrVar.K;
        try {
            qrVar.b.beginTransaction();
            SQLitePreparedStatement executeFast = qrVar.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            try {
                if (arrayList != null) {
                    int size = arrayList.size();
                    z10 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i10);
                        long o10 = m5.o(tL_folderPeer.peer);
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_folderPeer.folder_id);
                        if (tL_folderPeer.folder_id == 1) {
                            z10 = true;
                        }
                        executeFast.bindInteger(2, 0);
                        executeFast.bindLong(3, o10);
                        executeFast.step();
                        hVar.l(o10);
                    }
                } else if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    z10 = false;
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i11);
                        long n4 = m5.n(tL_inputFolderPeer.peer);
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                        if (tL_inputFolderPeer.folder_id == 1) {
                            z10 = true;
                        }
                        executeFast.bindInteger(2, 0);
                        executeFast.bindLong(3, n4);
                        executeFast.step();
                        hVar.l(n4);
                    }
                } else {
                    executeFast.requery();
                    executeFast.bindInteger(1, i3);
                    boolean z11 = i3 == 1;
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, j10);
                    executeFast.step();
                    z10 = z11;
                }
                executeFast.dispose();
                qrVar.b.commitTransaction();
                if (!z10) {
                    qrVar.l(1);
                }
                qrVar.t1(false);
                SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
            } catch (Exception e10) {
                e = e10;
                sQLitePreparedStatement = executeFast;
                try {
                    qrVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = qrVar.b;
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
                sQLiteDatabase = qrVar.b;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor;
        boolean z11;
        boolean z12;
        boolean z13;
        int i3;
        int i10 = this.a;
        long j10 = this.c;
        int i11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj3;
                long[] jArr = (long[]) obj2;
                Runnable runnable = (Runnable) obj;
                int length = jArr.length;
                while (r14 < length) {
                    long j11 = jArr[r14];
                    qr messagesStorage = f2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    messagesStorage.I(new qq(messagesStorage, this.b, this.c, j11, 4));
                    r14++;
                }
                g0.h3(runnable);
                return;
            case 1:
                li liVar = (li) obj3;
                TLObject tLObject = (TLObject) obj2;
                u10 u10Var = (u10) obj;
                boolean z14 = tLObject instanceof TLRPC.TL_messages_allStickers;
                int i12 = this.b;
                if (z14) {
                    liVar.r1(i12, (TLRPC.TL_messages_allStickers) tLObject, new jf(u10Var, 1));
                    return;
                } else {
                    liVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), this.c, new jf(u10Var, 2));
                    return;
                }
            case 2:
                int i13 = 1;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                int i14 = 3;
                qr qrVar = (qr) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str = (String) obj;
                try {
                    try {
                        qrVar.b.beginTransaction();
                        TLRPC.TL_message e02 = qrVar.e0(i11, j10);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        e02.voiceTranscription = str;
                        int i15 = 0;
                        while (i15 < 2) {
                            if (i15 == 0) {
                                try {
                                    executeFast = qrVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                                } catch (Exception e10) {
                                    e = e10;
                                    z10 = i13;
                                    qrVar.o(e, z10);
                                    sQLiteDatabase = qrVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                }
                            } else {
                                executeFast = qrVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            }
                            try {
                                try {
                                    executeFast.requery();
                                    NativeByteBuffer c2 = oi.c(e02);
                                    if (c2 != null) {
                                        int i16 = i13;
                                        try {
                                            executeFast.bindByteBuffer(i16 == true ? 1 : 0, c2);
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLitePreparedStatement = executeFast;
                                            z10 = i16;
                                            qrVar.o(e, z10);
                                            sQLiteDatabase = qrVar.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                        }
                                    } else {
                                        executeFast.bindNull(i13);
                                    }
                                    executeFast.bindInteger(2, i11);
                                    int i17 = i14;
                                    executeFast.bindLong(i17, j10);
                                    executeFast.step();
                                    executeFast.dispose();
                                    qrVar.b.commitTransaction();
                                    if (c2 != null) {
                                        c2.reuse();
                                    }
                                    i15++;
                                    i14 = i17;
                                    i13 = 1;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLitePreparedStatement = executeFast;
                                    z10 = 1;
                                    qrVar.o(e, z10);
                                    sQLiteDatabase = qrVar.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement = executeFast;
                                SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 3:
                qr qrVar2 = (qr) obj3;
                long j12 = this.c;
                TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong = (TLRPC.TL_updates_channelDifferenceTooLong) obj2;
                dk dkVar = (dk) obj;
                long j13 = -j12;
                try {
                    try {
                        int i18 = 0;
                        SQLiteCursor queryFinalized = qrVar2.b.queryFinalized("SELECT pinned FROM dialogs WHERE did = " + j13, new Object[0]);
                        try {
                            if (queryFinalized.next()) {
                                i18 = queryFinalized.intValue(0);
                                z12 = false;
                            } else {
                                z12 = i11 != 0;
                            }
                            queryFinalized.dispose();
                            qrVar2.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("UPDATE media_counts_v2 SET old = 1 WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM messages_holes WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM topics WHERE did = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM media_topics WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j13).stepThis().dispose();
                            qrVar2.b.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j13).stepThis().dispose();
                            li mediaDataController = qrVar2.getMediaDataController();
                            mediaDataController.getClass();
                            g0.h3(new qg(mediaDataController, j13, 0));
                            TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                            tL_messages_dialogs.chats.addAll(tL_updates_channelDifferenceTooLong.chats);
                            tL_messages_dialogs.users.addAll(tL_updates_channelDifferenceTooLong.users);
                            tL_messages_dialogs.messages.addAll(tL_updates_channelDifferenceTooLong.messages);
                            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
                            dialog.id = j13;
                            try {
                                dialog.flags = 1;
                                sQLiteCursor = null;
                                try {
                                    try {
                                        dialog.notify_settings = null;
                                        dialog.pinned = i18 != 0;
                                        dialog.pinnedNum = i18;
                                        tL_messages_dialogs.dialogs.add(dialog);
                                        qrVar2.e1(tL_messages_dialogs, 0);
                                        qrVar2.R1(j13, j12, new ArrayList(), null);
                                        z13 = z12;
                                        try {
                                        } catch (Exception e14) {
                                            e = e14;
                                            qrVar2 = qrVar2;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                    }
                                    try {
                                        zq zqVar = new zq(qrVar2, j13, tL_updates_channelDifferenceTooLong, 0);
                                        qrVar2 = qrVar2;
                                        g0.h3(zqVar);
                                        if (z13) {
                                            i3 = i11;
                                            if (i3 == 1) {
                                                qrVar2.getMessagesController().G(j12, true);
                                            } else {
                                                qrVar2.getMessagesController().B0(j12, false);
                                            }
                                        } else {
                                            i3 = i11;
                                        }
                                        z11 = true;
                                        if (i3 != 1) {
                                            try {
                                                c00 c00Var = qrVar2.getMessagesController().q7;
                                                c00Var.getClass();
                                                g0.h3(new ci.cc(c00Var, j12, z11, 4));
                                            } catch (Exception e16) {
                                                e = e16;
                                                qrVar2.o(e, z11);
                                                if (sQLiteCursor != null) {
                                                }
                                                dkVar.run();
                                                return;
                                            }
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        qrVar2 = qrVar2;
                                        z11 = true;
                                        qrVar2.o(e, z11);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        dkVar.run();
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                z11 = true;
                                sQLiteCursor = null;
                            }
                        } catch (Exception e19) {
                            e = e19;
                            z11 = true;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor = queryFinalized;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = null;
                    }
                } catch (Exception e20) {
                    e = e20;
                    sQLiteCursor = null;
                }
                dkVar.run();
                return;
            case 4:
                a();
                return;
            case 5:
                yy yyVar = (yy) obj3;
                zi ziVar = (zi) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                int f12 = ziVar.f1();
                ziVar.k = message2;
                ziVar.K1 = true;
                hs notificationCenter = yyVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(f12);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(j10);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, 0, bool);
                yyVar.getNotificationCenter().k(22, Integer.valueOf(f12), Integer.valueOf(message2.id), message2, Long.valueOf(j10), 0L, 0, bool);
                yyVar.d0(i11);
                yyVar.i0(i11, false);
                return;
            case 6:
                oz ozVar = (oz) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                a0.h hVar = ozVar.l;
                a0.h hVar2 = ozVar.k;
                a0.h hVar3 = ozVar.j;
                if (i11 != ozVar.c) {
                    return;
                }
                hVar3.k(arrayList, j10);
                hVar2.k(arrayList2, j10);
                ArrayList arrayList3 = (ArrayList) hVar.f(j10);
                hVar.l(j10);
                if (j10 == ozVar.d) {
                    android.support.v4.media.session.a0 a0Var = ozVar.b;
                    if (j10 != 0) {
                        ArrayList arrayList4 = (ArrayList) hVar3.f(j10);
                        ArrayList arrayList5 = (ArrayList) hVar2.f(j10);
                        if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                            a0Var.u(arrayList5);
                            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
                            if (m5.E(j10)) {
                                TLRPC.User user = (TLRPC.User) ozVar.h.f(j10);
                                uVar.a.setQueueTitle(user != null ? g5.m(0, user.first_name, user.last_name) : "DELETED USER");
                            } else {
                                TLRPC.Chat chat = (TLRPC.Chat) ozVar.i.f(-j10);
                                uVar.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                            }
                            zi ziVar2 = (zi) arrayList4.get(0);
                            android.support.v4.media.c cVar = new android.support.v4.media.c(0);
                            cVar.l0((long) (ziVar2.L0() * 1000.0d));
                            cVar.m0("android.media.metadata.ARTIST", ziVar2.x1(true));
                            cVar.m0("android.media.metadata.TITLE", ziVar2.z1(true));
                            a0Var.s(new MediaMetadataCompat((Bundle) cVar.b));
                        }
                    }
                }
                if (arrayList3 != null) {
                    while (r14 < arrayList3.size()) {
                        ((Runnable) arrayList3.get(r14)).run();
                        r14++;
                    }
                    return;
                }
                return;
            case 7:
                c00 c00Var2 = (c00) obj3;
                TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) obj2;
                a0.h hVar4 = (a0.h) obj;
                c00Var2.getMessagesStorage().m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                c00Var2.getMessagesController().Y3(tL_messages_savedDialogsSlice.users, false);
                c00Var2.getMessagesController().S3(tL_messages_savedDialogsSlice.chats, false);
                LongSparseIntArray longSparseIntArray = c00Var2.c;
                long j14 = this.c;
                longSparseIntArray.put(j14, 0);
                ArrayList l10 = rg.c.l(tL_messages_savedDialogsSlice.dialogs);
                int i19 = tL_messages_savedDialogsSlice.count;
                int i20 = this.b;
                c00Var2.u(j14, l10, hVar4, false, i20, i19);
                c00Var2.y(j14, true);
                c00Var2.getMessagesStorage().C1(c00Var2.getConnectionsManager().getCurrentTime(), -j14, (List) c00Var2.a.f(j14), true);
                c00Var2.getMessagesStorage().j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i20 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) k2.p1.h(1, tL_messages_savedDialogsSlice.dialogs);
                    TLRPC.Message message3 = (TLRPC.Message) hVar4.f(tL_monoForumDialog.top_message);
                    c00Var2.x(j14, m5.o(tL_monoForumDialog.peer), tL_monoForumDialog.top_message, message3 != null ? message3.date : 0);
                    return;
                } else {
                    if (c00Var2.l(j14) == null || c00Var2.l(j14).size() < tL_messages_savedDialogsSlice.count) {
                        c00Var2.h.l(j14);
                        c00Var2.o(j14);
                        return;
                    }
                    return;
                }
            default:
                c00 c00Var3 = (c00) obj3;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) obj2;
                a0.h hVar5 = (a0.h) obj;
                c00Var3.getMessagesStorage().m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
                c00Var3.getMessagesController().Y3(tL_messages_savedDialogs.users, false);
                c00Var3.getMessagesController().S3(tL_messages_savedDialogs.chats, false);
                LongSparseIntArray longSparseIntArray2 = c00Var3.c;
                long j15 = this.c;
                longSparseIntArray2.put(j15, 0);
                ArrayList l11 = rg.c.l(tL_messages_savedDialogs.dialogs);
                int size = tL_messages_savedDialogs.dialogs.size();
                int i21 = this.b;
                c00Var3.u(j15, l11, hVar5, false, i21, size);
                c00Var3.y(j15, true);
                c00Var3.getMessagesStorage().C1(c00Var3.getConnectionsManager().getCurrentTime(), -j15, (List) c00Var3.a.f(j15), true);
                c00Var3.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogs.dialogs.isEmpty() && i21 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) k2.p1.h(1, tL_messages_savedDialogs.dialogs);
                    TLRPC.Message message4 = (TLRPC.Message) hVar5.f(tL_monoForumDialog2.top_message);
                    c00Var3.x(j15, m5.o(tL_monoForumDialog2.peer), tL_monoForumDialog2.top_message, message4 != null ? message4.date : 0);
                    return;
                } else {
                    if (c00Var3.l(j15) == null || c00Var3.l(j15).size() < tL_messages_savedDialogs.dialogs.size()) {
                        c00Var3.h.l(j15);
                        c00Var3.o(j15);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ z1(f2 f2Var, long[] jArr, long j10, int i3, Runnable runnable) {
        this.a = 0;
        this.d = f2Var;
        this.e = jArr;
        this.c = j10;
        this.b = i3;
        this.f = runnable;
    }

    public /* synthetic */ z1(li liVar, TLObject tLObject, int i3, u10 u10Var, long j10) {
        this.a = 1;
        this.d = liVar;
        this.e = tLObject;
        this.b = i3;
        this.f = u10Var;
        this.c = j10;
    }

    public /* synthetic */ z1(qr qrVar, long j10, int i3, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, dk dkVar) {
        this.a = 3;
        this.d = qrVar;
        this.c = j10;
        this.b = i3;
        this.e = tL_updates_channelDifferenceTooLong;
        this.f = dkVar;
    }

    public /* synthetic */ z1(qr qrVar, ArrayList arrayList, ArrayList arrayList2, int i3, long j10) {
        this.a = 4;
        this.d = qrVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i3;
        this.c = j10;
    }

    public /* synthetic */ z1(yy yyVar, zi ziVar, TLRPC.Message message, long j10, int i3) {
        this.a = 5;
        this.d = yyVar;
        this.e = ziVar;
        this.f = message;
        this.c = j10;
        this.b = i3;
    }

    public /* synthetic */ z1(c00 c00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i3, int i10) {
        this.a = i10;
        this.d = c00Var;
        this.e = messages_saveddialogs;
        this.c = j10;
        this.f = hVar;
        this.b = i3;
    }
}
