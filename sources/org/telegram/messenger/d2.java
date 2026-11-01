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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d2(Object obj, int i10, long j10, Object obj2, Serializable serializable, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
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
        is isVar = (is) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i10 = this.b;
        long j10 = this.c;
        a0.h hVar = isVar.J;
        try {
            isVar.b.beginTransaction();
            SQLitePreparedStatement executeFast = isVar.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            try {
                if (arrayList != null) {
                    int size = arrayList.size();
                    z10 = false;
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i11);
                        long o10 = o5.o(tL_folderPeer.peer);
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
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i12);
                        long n10 = o5.n(tL_inputFolderPeer.peer);
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                        if (tL_inputFolderPeer.folder_id == 1) {
                            z10 = true;
                        }
                        executeFast.bindInteger(2, 0);
                        executeFast.bindLong(3, n10);
                        executeFast.step();
                        hVar.l(n10);
                    }
                } else {
                    executeFast.requery();
                    executeFast.bindInteger(1, i10);
                    boolean z11 = i10 == 1;
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, j10);
                    executeFast.step();
                    z10 = z11;
                }
                executeFast.dispose();
                isVar.b.commitTransaction();
                if (!z10) {
                    isVar.l(1);
                }
                isVar.t1(false);
                SQLiteDatabase sQLiteDatabase2 = isVar.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
            } catch (Exception e) {
                e = e;
                sQLitePreparedStatement = executeFast;
                try {
                    isVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase3 = isVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = isVar.b;
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
                sQLiteDatabase = isVar.b;
                if (sQLiteDatabase != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            sQLitePreparedStatement = null;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
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
        int i10;
        SQLiteCursor queryFinalized;
        boolean z12;
        int i11;
        int i12 = this.a;
        long j10 = this.c;
        int i13 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                j2 j2Var = (j2) obj3;
                long[] jArr = (long[]) obj2;
                Runnable runnable = (Runnable) obj;
                int length = jArr.length;
                while (r13 < length) {
                    long j11 = jArr[r13];
                    is messagesStorage = j2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    messagesStorage.I(new jr(messagesStorage, this.b, this.c, j11, 4));
                    r13++;
                }
                i0.g3(runnable);
                return;
            case 1:
                vi viVar = (vi) obj3;
                TLObject tLObject = (TLObject) obj2;
                r20 r20Var = (r20) obj;
                boolean z13 = tLObject instanceof TLRPC.TL_messages_allStickers;
                int i14 = this.b;
                if (z13) {
                    viVar.r1(i14, (TLRPC.TL_messages_allStickers) tLObject, new qf(r20Var, 1));
                    return;
                } else {
                    viVar.z1(i14, null, false, (int) (System.currentTimeMillis() / 1000), this.c, new qf(r20Var, 2));
                    return;
                }
            case 2:
                int i15 = 1;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                int i16 = 3;
                is isVar = (is) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str = (String) obj;
                try {
                    try {
                        isVar.b.beginTransaction();
                        TLRPC.TL_message e02 = isVar.e0(i13, j10);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        e02.voiceTranscription = str;
                        int i17 = 0;
                        while (i17 < 2) {
                            if (i17 == 0) {
                                try {
                                    executeFast = isVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                                } catch (Exception e) {
                                    e = e;
                                    z10 = i15;
                                    isVar.o(e, z10);
                                    sQLiteDatabase = isVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                }
                            } else {
                                executeFast = isVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            }
                            try {
                                try {
                                    executeFast.requery();
                                    NativeByteBuffer c10 = yi.c(e02);
                                    if (c10 != null) {
                                        int i18 = i15;
                                        try {
                                            executeFast.bindByteBuffer(i18 == true ? 1 : 0, c10);
                                        } catch (Exception e7) {
                                            e = e7;
                                            sQLitePreparedStatement = executeFast;
                                            z10 = i18;
                                            isVar.o(e, z10);
                                            sQLiteDatabase = isVar.b;
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.commitTransaction();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                                return;
                                            }
                                            return;
                                        }
                                    } else {
                                        executeFast.bindNull(i15);
                                    }
                                    executeFast.bindInteger(2, i13);
                                    int i19 = i16;
                                    executeFast.bindLong(i19, j10);
                                    executeFast.step();
                                    executeFast.dispose();
                                    isVar.b.commitTransaction();
                                    if (c10 != null) {
                                        c10.reuse();
                                    }
                                    i17++;
                                    i16 = i19;
                                    i15 = 1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLitePreparedStatement = executeFast;
                                    SQLiteDatabase sQLiteDatabase2 = isVar.b;
                                    if (sQLiteDatabase2 != null) {
                                        sQLiteDatabase2.commitTransaction();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                sQLitePreparedStatement = executeFast;
                                z10 = 1;
                                isVar.o(e, z10);
                                sQLiteDatabase = isVar.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = isVar.b;
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
                is isVar2 = (is) obj3;
                long j12 = this.c;
                TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong = (TLRPC.TL_updates_channelDifferenceTooLong) obj2;
                xk xkVar = (xk) obj;
                long j13 = -j12;
                try {
                    try {
                        i10 = 0;
                        queryFinalized = isVar2.b.queryFinalized("SELECT pinned FROM dialogs WHERE did = " + j13, new Object[0]);
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = null;
                    }
                    try {
                        if (queryFinalized.next()) {
                            i10 = queryFinalized.intValue(0);
                            z12 = false;
                        } else {
                            z12 = i13 != 0;
                        }
                        queryFinalized.dispose();
                        isVar2.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("UPDATE media_counts_v2 SET old = 1 WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM messages_holes WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM topics WHERE did = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM media_topics WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j13).stepThis().dispose();
                        isVar2.b.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j13).stepThis().dispose();
                        vi mediaDataController = isVar2.getMediaDataController();
                        mediaDataController.getClass();
                        i0.g3(new yg(mediaDataController, j13, 0));
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
                                    dialog.pinned = i10 != 0;
                                    dialog.pinnedNum = i10;
                                    tL_messages_dialogs.dialogs.add(dialog);
                                    isVar2.e1(tL_messages_dialogs, 0);
                                    try {
                                        isVar2.R1(j13, j12, new ArrayList(), null);
                                        boolean z14 = z12;
                                        isVar2 = isVar2;
                                        i0.g3(new pr(isVar2, j13, tL_updates_channelDifferenceTooLong, 0));
                                        if (z14) {
                                            i11 = i13;
                                            if (i11 == 1) {
                                                isVar2.getMessagesController().G(j12, true);
                                            } else {
                                                isVar2.getMessagesController().B0(j12, false);
                                            }
                                        } else {
                                            i11 = i13;
                                        }
                                        z11 = true;
                                        if (i11 != 1) {
                                            try {
                                                y00 y00Var = isVar2.getMessagesController().r7;
                                                y00Var.getClass();
                                                i0.g3(new lt(y00Var, j12, z11, 1));
                                            } catch (Exception e12) {
                                                e = e12;
                                                isVar2.o(e, z11);
                                                if (sQLiteCursor != null) {
                                                }
                                                xkVar.run();
                                                return;
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        isVar2 = isVar2;
                                        z11 = true;
                                        isVar2.o(e, z11);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        xkVar.run();
                                        return;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            z11 = true;
                            sQLiteCursor = null;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        z11 = true;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor = null;
                }
                xkVar.run();
                return;
            case 4:
                a();
                return;
            case 5:
                rz rzVar = (rz) obj3;
                kj kjVar = (kj) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                int f12 = kjVar.f1();
                kjVar.k = message2;
                kjVar.K1 = true;
                at notificationCenter = rzVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(f12);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(j10);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, 0, bool);
                rzVar.getNotificationCenter().k(22, Integer.valueOf(f12), Integer.valueOf(message2.id), message2, Long.valueOf(j10), 0L, 0, bool);
                rzVar.d0(i13);
                rzVar.i0(i13, false);
                return;
            case 6:
                i00 i00Var = (i00) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                a0.h hVar = i00Var.l;
                a0.h hVar2 = i00Var.k;
                a0.h hVar3 = i00Var.j;
                if (i13 != i00Var.c) {
                    return;
                }
                hVar3.k(arrayList, j10);
                hVar2.k(arrayList2, j10);
                ArrayList arrayList3 = (ArrayList) hVar.f(j10);
                hVar.l(j10);
                if (j10 == i00Var.d) {
                    android.support.v4.media.session.a0 a0Var = i00Var.b;
                    if (j10 != 0) {
                        ArrayList arrayList4 = (ArrayList) hVar3.f(j10);
                        ArrayList arrayList5 = (ArrayList) hVar2.f(j10);
                        if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                            a0Var.D(arrayList5);
                            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
                            if (o5.E(j10)) {
                                TLRPC.User user = (TLRPC.User) i00Var.h.f(j10);
                                uVar.a.setQueueTitle(user != null ? i5.m(0, user.first_name, user.last_name) : "DELETED USER");
                            } else {
                                TLRPC.Chat chat = (TLRPC.Chat) i00Var.i.f(-j10);
                                uVar.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                            }
                            kj kjVar2 = (kj) arrayList4.get(0);
                            a4.l lVar = new a4.l(1);
                            lVar.C((long) (kjVar2.L0() * 1000.0d));
                            lVar.D("android.media.metadata.ARTIST", kjVar2.x1(true));
                            lVar.D("android.media.metadata.TITLE", kjVar2.z1(true));
                            a0Var.B(new MediaMetadataCompat((Bundle) lVar.b));
                        }
                    }
                }
                if (arrayList3 != null) {
                    while (r13 < arrayList3.size()) {
                        ((Runnable) arrayList3.get(r13)).run();
                        r13++;
                    }
                    return;
                }
                return;
            case 7:
                y00 y00Var2 = (y00) obj3;
                TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) obj2;
                a0.h hVar4 = (a0.h) obj;
                y00Var2.getMessagesStorage().m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                y00Var2.getMessagesController().V3(tL_messages_savedDialogsSlice.users, false);
                y00Var2.getMessagesController().P3(tL_messages_savedDialogsSlice.chats, false);
                LongSparseIntArray longSparseIntArray = y00Var2.c;
                long j14 = this.c;
                longSparseIntArray.put(j14, 0);
                ArrayList l4 = gg.e.l(tL_messages_savedDialogsSlice.dialogs);
                int i20 = tL_messages_savedDialogsSlice.count;
                int i21 = this.b;
                y00Var2.u(j14, l4, hVar4, false, i21, i20);
                y00Var2.y(j14, true);
                y00Var2.getMessagesStorage().C1(y00Var2.getConnectionsManager().getCurrentTime(), -j14, (List) y00Var2.a.f(j14), true);
                y00Var2.getMessagesStorage().j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i21 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i0.a.g(1, tL_messages_savedDialogsSlice.dialogs);
                    TLRPC.Message message3 = (TLRPC.Message) hVar4.f(tL_monoForumDialog.top_message);
                    y00Var2.x(j14, o5.o(tL_monoForumDialog.peer), tL_monoForumDialog.top_message, message3 != null ? message3.date : 0);
                    return;
                } else {
                    if (y00Var2.l(j14) == null || y00Var2.l(j14).size() < tL_messages_savedDialogsSlice.count) {
                        y00Var2.h.l(j14);
                        y00Var2.o(j14);
                        return;
                    }
                    return;
                }
            default:
                y00 y00Var3 = (y00) obj3;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) obj2;
                a0.h hVar5 = (a0.h) obj;
                y00Var3.getMessagesStorage().m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
                y00Var3.getMessagesController().V3(tL_messages_savedDialogs.users, false);
                y00Var3.getMessagesController().P3(tL_messages_savedDialogs.chats, false);
                LongSparseIntArray longSparseIntArray2 = y00Var3.c;
                long j15 = this.c;
                longSparseIntArray2.put(j15, 0);
                ArrayList l10 = gg.e.l(tL_messages_savedDialogs.dialogs);
                int size = tL_messages_savedDialogs.dialogs.size();
                int i22 = this.b;
                y00Var3.u(j15, l10, hVar5, false, i22, size);
                y00Var3.y(j15, true);
                y00Var3.getMessagesStorage().C1(y00Var3.getConnectionsManager().getCurrentTime(), -j15, (List) y00Var3.a.f(j15), true);
                y00Var3.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogs.dialogs.isEmpty() && i22 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) i0.a.g(1, tL_messages_savedDialogs.dialogs);
                    TLRPC.Message message4 = (TLRPC.Message) hVar5.f(tL_monoForumDialog2.top_message);
                    y00Var3.x(j15, o5.o(tL_monoForumDialog2.peer), tL_monoForumDialog2.top_message, message4 != null ? message4.date : 0);
                    return;
                } else {
                    if (y00Var3.l(j15) == null || y00Var3.l(j15).size() < tL_messages_savedDialogs.dialogs.size()) {
                        y00Var3.h.l(j15);
                        y00Var3.o(j15);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ d2(j2 j2Var, long[] jArr, long j10, int i10, Runnable runnable) {
        this.a = 0;
        this.d = j2Var;
        this.e = jArr;
        this.c = j10;
        this.b = i10;
        this.f = runnable;
    }

    public /* synthetic */ d2(vi viVar, TLObject tLObject, int i10, r20 r20Var, long j10) {
        this.a = 1;
        this.d = viVar;
        this.e = tLObject;
        this.b = i10;
        this.f = r20Var;
        this.c = j10;
    }

    public /* synthetic */ d2(is isVar, long j10, int i10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, xk xkVar) {
        this.a = 3;
        this.d = isVar;
        this.c = j10;
        this.b = i10;
        this.e = tL_updates_channelDifferenceTooLong;
        this.f = xkVar;
    }

    public /* synthetic */ d2(is isVar, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.a = 4;
        this.d = isVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ d2(rz rzVar, kj kjVar, TLRPC.Message message, long j10, int i10) {
        this.a = 5;
        this.d = rzVar;
        this.e = kjVar;
        this.f = message;
        this.c = j10;
        this.b = i10;
    }

    public /* synthetic */ d2(y00 y00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.d = y00Var;
        this.e = messages_saveddialogs;
        this.c = j10;
        this.f = hVar;
        this.b = i10;
    }
}
