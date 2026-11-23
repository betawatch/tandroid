package org.telegram.messenger;

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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        boolean z10;
        ur urVar = (ur) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i7 = this.b;
        long j3 = this.c;
        a0.h hVar = urVar.K;
        try {
            urVar.b.beginTransaction();
            SQLitePreparedStatement executeFast = urVar.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            try {
                if (arrayList != null) {
                    int size = arrayList.size();
                    z10 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i10);
                        long o4 = n5.o(tL_folderPeer.peer);
                        executeFast.requery();
                        executeFast.bindInteger(1, tL_folderPeer.folder_id);
                        if (tL_folderPeer.folder_id == 1) {
                            z10 = true;
                        }
                        executeFast.bindInteger(2, 0);
                        executeFast.bindLong(3, o4);
                        executeFast.step();
                        hVar.l(o4);
                    }
                } else if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    z10 = false;
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i11);
                        long n10 = n5.n(tL_inputFolderPeer.peer);
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
                    executeFast.bindInteger(1, i7);
                    boolean z11 = i7 == 1;
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, j3);
                    executeFast.step();
                    z10 = z11;
                }
                executeFast.dispose();
                urVar.b.commitTransaction();
                if (!z10) {
                    urVar.l(1);
                }
                urVar.t1(false);
                SQLiteDatabase sQLiteDatabase2 = urVar.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
            } catch (Exception e10) {
                e = e10;
                sQLitePreparedStatement = executeFast;
                try {
                    urVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase3 = urVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = urVar.b;
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
                sQLiteDatabase = urVar.b;
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

    private final void b() {
        f00 f00Var = (f00) this.d;
        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.e;
        a0.h hVar = (a0.h) this.f;
        f00Var.getMessagesStorage().m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        f00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
        f00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
        LongSparseIntArray longSparseIntArray = f00Var.c;
        long j3 = this.c;
        longSparseIntArray.put(j3, 0);
        ArrayList m10 = qg.c.m(tL_messages_savedDialogs.dialogs);
        int size = tL_messages_savedDialogs.dialogs.size();
        int i7 = this.b;
        f00Var.u(j3, m10, hVar, false, i7, size);
        f00Var.y(j3, true);
        f00Var.getMessagesStorage().C1(f00Var.getConnectionsManager().getCurrentTime(), -j3, (List) f00Var.a.f(j3), true);
        f00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i7 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i5.c.h(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_monoForumDialog.top_message);
            f00Var.x(j3, n5.o(tL_monoForumDialog.peer), tL_monoForumDialog.top_message, message != null ? message.date : 0);
        } else if (f00Var.l(j3) == null || f00Var.l(j3).size() < tL_messages_savedDialogs.dialogs.size()) {
            f00Var.s.l(j3);
            f00Var.o(j3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d7  */
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
        int i7;
        int i10 = this.a;
        long j3 = this.c;
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
                    long j10 = jArr[r14];
                    ur messagesStorage = f2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    messagesStorage.I(new vq(messagesStorage, this.b, this.c, j10, 4));
                    r14++;
                }
                g0.g3(runnable);
                return;
            case 1:
                si siVar = (si) obj3;
                TLObject tLObject = (TLObject) obj2;
                y10 y10Var = (y10) obj;
                boolean z14 = tLObject instanceof TLRPC.TL_messages_allStickers;
                int i12 = this.b;
                if (z14) {
                    siVar.u1(i12, (TLRPC.TL_messages_allStickers) tLObject, new gg(y10Var, 0));
                    return;
                } else {
                    siVar.C1(i12, null, false, (int) (System.currentTimeMillis() / 1000), this.c, new gg(y10Var, 1));
                    return;
                }
            case 2:
                int i13 = 1;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                int i14 = 3;
                ur urVar = (ur) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str = (String) obj;
                try {
                    try {
                        urVar.b.beginTransaction();
                        TLRPC.TL_message e02 = urVar.e0(i11, j3);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        e02.voiceTranscription = str;
                        e02.voiceTranscriptionLocal = message.voiceTranscriptionLocal;
                        e02.voiceTranscriptionWords = message.voiceTranscriptionWords;
                        int i15 = 0;
                        while (i15 < 2) {
                            if (i15 == 0) {
                                try {
                                    executeFast = urVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                                } catch (Exception e10) {
                                    e = e10;
                                    z10 = i13;
                                    urVar.o(e, z10);
                                    sQLiteDatabase = urVar.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                }
                            } else {
                                executeFast = urVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            }
                            try {
                                try {
                                    executeFast.requery();
                                    NativeByteBuffer c10 = vi.c(e02);
                                    if (c10 != null) {
                                        int i16 = i13;
                                        try {
                                            executeFast.bindByteBuffer(i16 == true ? 1 : 0, c10);
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLitePreparedStatement = executeFast;
                                            z10 = i16;
                                            urVar.o(e, z10);
                                            sQLiteDatabase = urVar.b;
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
                                    executeFast.bindLong(i17, j3);
                                    executeFast.step();
                                    executeFast.dispose();
                                    urVar.b.commitTransaction();
                                    if (c10 != null) {
                                        c10.reuse();
                                    }
                                    i15++;
                                    i14 = i17;
                                    i13 = 1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLitePreparedStatement = executeFast;
                                    SQLiteDatabase sQLiteDatabase2 = urVar.b;
                                    if (sQLiteDatabase2 != null) {
                                        sQLiteDatabase2.commitTransaction();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                sQLitePreparedStatement = executeFast;
                                z10 = 1;
                                urVar.o(e, z10);
                                sQLiteDatabase = urVar.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = urVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            case 3:
                ur urVar2 = (ur) obj3;
                long j11 = this.c;
                TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong = (TLRPC.TL_updates_channelDifferenceTooLong) obj2;
                jk jkVar = (jk) obj;
                long j12 = -j11;
                try {
                    try {
                        int i18 = 0;
                        SQLiteCursor queryFinalized = urVar2.b.queryFinalized("SELECT pinned FROM dialogs WHERE did = " + j12, new Object[0]);
                        try {
                            if (queryFinalized.next()) {
                                i18 = queryFinalized.intValue(0);
                                z12 = false;
                            } else {
                                z12 = i11 != 0;
                            }
                            queryFinalized.dispose();
                            urVar2.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("UPDATE media_counts_v2 SET old = 1 WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM messages_holes WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM topics WHERE did = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM media_topics WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j12).stepThis().dispose();
                            urVar2.b.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j12).stepThis().dispose();
                            si mediaDataController = urVar2.getMediaDataController();
                            mediaDataController.getClass();
                            g0.g3(new xg(mediaDataController, j12, 0));
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
                                        dialog.pinned = i18 != 0;
                                        dialog.pinnedNum = i18;
                                        tL_messages_dialogs.dialogs.add(dialog);
                                        urVar2.e1(tL_messages_dialogs, 0);
                                        urVar2.R1(j12, j11, new ArrayList(), null);
                                        z13 = z12;
                                        try {
                                        } catch (Exception e14) {
                                            e = e14;
                                            urVar2 = urVar2;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                    }
                                    try {
                                        cr crVar = new cr(urVar2, j12, tL_updates_channelDifferenceTooLong, 0);
                                        urVar2 = urVar2;
                                        g0.g3(crVar);
                                        if (z13) {
                                            i7 = i11;
                                            if (i7 == 1) {
                                                urVar2.getMessagesController().G(j11, true);
                                            } else {
                                                urVar2.getMessagesController().D0(j11, false);
                                            }
                                        } else {
                                            i7 = i11;
                                        }
                                        z11 = true;
                                        if (i7 != 1) {
                                            try {
                                                f00 f00Var = urVar2.getMessagesController().t7;
                                                f00Var.getClass();
                                                g0.g3(new di.vb(f00Var, j11, z11, 4));
                                            } catch (Exception e16) {
                                                e = e16;
                                                urVar2.o(e, z11);
                                                if (sQLiteCursor != null) {
                                                }
                                                jkVar.run();
                                                return;
                                            }
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        urVar2 = urVar2;
                                        z11 = true;
                                        urVar2.o(e, z11);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        jkVar.run();
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
                jkVar.run();
                return;
            case 4:
                a();
                return;
            case 5:
                az azVar = (az) obj3;
                gj gjVar = (gj) obj2;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                int e110 = gjVar.e1();
                gjVar.k = message2;
                gjVar.M1 = true;
                ls notificationCenter = azVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(e110);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(j3);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, 0, bool);
                azVar.getNotificationCenter().k(22, Integer.valueOf(e110), Integer.valueOf(message2.id), message2, Long.valueOf(j3), 0L, 0, bool);
                azVar.d0(i11);
                azVar.i0(i11, false);
                return;
            case 6:
                rz rzVar = (rz) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                a0.h hVar = rzVar.l;
                a0.h hVar2 = rzVar.k;
                a0.h hVar3 = rzVar.j;
                if (i11 != rzVar.c) {
                    return;
                }
                hVar3.k(arrayList, j3);
                hVar2.k(arrayList2, j3);
                ArrayList arrayList3 = (ArrayList) hVar.f(j3);
                hVar.l(j3);
                if (j3 == rzVar.d) {
                    android.support.v4.media.session.a0 a0Var = rzVar.b;
                    if (j3 != 0) {
                        ArrayList arrayList4 = (ArrayList) hVar3.f(j3);
                        ArrayList arrayList5 = (ArrayList) hVar2.f(j3);
                        if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                            a0Var.v(arrayList5);
                            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
                            if (n5.E(j3)) {
                                TLRPC.User user = (TLRPC.User) rzVar.h.f(j3);
                                uVar.a.setQueueTitle(user != null ? i5.m(0, user.first_name, user.last_name) : "DELETED USER");
                            } else {
                                TLRPC.Chat chat = (TLRPC.Chat) rzVar.i.f(-j3);
                                uVar.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                            }
                            gj gjVar2 = (gj) arrayList4.get(0);
                            ab.w wVar = new ab.w();
                            wVar.i((long) (gjVar2.L0() * 1000.0d));
                            wVar.j("android.media.metadata.ARTIST", gjVar2.w1(true));
                            wVar.j("android.media.metadata.TITLE", gjVar2.y1(true));
                            a0Var.t(new MediaMetadataCompat(wVar.a));
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
                b();
                return;
            default:
                f00 f00Var2 = (f00) obj3;
                TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) obj2;
                a0.h hVar4 = (a0.h) obj;
                f00Var2.getMessagesStorage().m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                f00Var2.getMessagesController().f4(tL_messages_savedDialogsSlice.users, false);
                f00Var2.getMessagesController().Z3(tL_messages_savedDialogsSlice.chats, false);
                LongSparseIntArray longSparseIntArray = f00Var2.c;
                long j13 = this.c;
                longSparseIntArray.put(j13, 0);
                ArrayList m10 = qg.c.m(tL_messages_savedDialogsSlice.dialogs);
                int i19 = tL_messages_savedDialogsSlice.count;
                int i20 = this.b;
                f00Var2.u(j13, m10, hVar4, false, i20, i19);
                f00Var2.y(j13, true);
                f00Var2.getMessagesStorage().C1(f00Var2.getConnectionsManager().getCurrentTime(), -j13, (List) f00Var2.a.f(j13), true);
                f00Var2.getMessagesStorage().j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i20 == 1) {
                    TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i5.c.h(1, tL_messages_savedDialogsSlice.dialogs);
                    TLRPC.Message message3 = (TLRPC.Message) hVar4.f(tL_monoForumDialog.top_message);
                    f00Var2.x(j13, n5.o(tL_monoForumDialog.peer), tL_monoForumDialog.top_message, message3 != null ? message3.date : 0);
                    return;
                } else {
                    if (f00Var2.l(j13) == null || f00Var2.l(j13).size() < tL_messages_savedDialogsSlice.count) {
                        f00Var2.s.l(j13);
                        f00Var2.o(j13);
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

    public /* synthetic */ z1(si siVar, TLObject tLObject, int i7, y10 y10Var, long j3) {
        this.a = 1;
        this.d = siVar;
        this.e = tLObject;
        this.b = i7;
        this.f = y10Var;
        this.c = j3;
    }

    public /* synthetic */ z1(ur urVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, jk jkVar) {
        this.a = 3;
        this.d = urVar;
        this.c = j3;
        this.b = i7;
        this.e = tL_updates_channelDifferenceTooLong;
        this.f = jkVar;
    }

    public /* synthetic */ z1(ur urVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.a = 4;
        this.d = urVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ z1(az azVar, gj gjVar, TLRPC.Message message, long j3, int i7) {
        this.a = 5;
        this.d = azVar;
        this.e = gjVar;
        this.f = message;
        this.c = j3;
        this.b = i7;
    }

    public /* synthetic */ z1(f00 f00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.d = f00Var;
        this.e = messages_saveddialogs;
        this.c = j3;
        this.f = hVar;
        this.b = i7;
    }
}
