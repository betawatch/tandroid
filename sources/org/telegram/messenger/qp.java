package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ long c;

    public /* synthetic */ qp(ur urVar, long j3, int i7) {
        this.a = i7;
        this.b = urVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long e10;
        SQLiteCursor queryFinalized;
        SQLiteCursor queryFinalized2;
        int i7 = this.a;
        SQLiteCursor sQLiteCursor = null;
        long j3 = this.c;
        ur urVar = this.b;
        switch (i7) {
            case 0:
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j3).stepThis().dispose();
                    urVar.b.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    urVar.o(e11, true);
                    return;
                }
            case 1:
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    urVar.o(e12, true);
                    return;
                }
            case 2:
                urVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = urVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (SQLiteException e13) {
                    e13.printStackTrace();
                    return;
                }
            case 3:
                ur urVar2 = this.b;
                try {
                    try {
                        e10 = urVar2.getUserConfig().e();
                        queryFinalized = urVar2.b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e10), Long.valueOf(j3));
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    while (queryFinalized.next()) {
                        arrayList.add(Integer.valueOf(queryFinalized.intValue(0)));
                    }
                    queryFinalized.dispose();
                    queryFinalized = urVar2.b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e10));
                    while (queryFinalized.next()) {
                        int intValue = queryFinalized.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                            if (gj.Q1(e10, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j3) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    urVar2.Q0(0, 0, e10, arrayList, true);
                    urVar2.R1(e10, -e10, arrayList, null);
                    try {
                        hr hrVar = new hr(urVar2, e10, arrayList, 8);
                        urVar2 = urVar2;
                        g0.g3(hrVar);
                        return;
                    } catch (Exception e15) {
                        e = e15;
                        urVar2 = urVar2;
                        urVar2.o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            case 4:
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    urVar.o(e17, true);
                    return;
                }
            case 5:
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    urVar.o(e18, true);
                    return;
                }
            case 6:
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM pending_tasks WHERE id = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e19) {
                    urVar.o(e19, true);
                    return;
                }
            default:
                long j10 = this.c;
                boolean z10 = true;
                try {
                    try {
                        queryFinalized2 = urVar.b.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j10, new Object[0]);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e20) {
                    e = e20;
                }
                try {
                    a0.h hVar = new a0.h();
                    while (queryFinalized2.next()) {
                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                        if (byteBufferValue2 != null) {
                            TLRPC.ChannelParticipant TLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                            byteBufferValue2.reuse();
                            if (TLdeserialize != null) {
                                hVar.k(TLdeserialize, queryFinalized2.longValue(0));
                            }
                        }
                    }
                    queryFinalized2.dispose();
                    np messagesController = urVar.getMessagesController();
                    messagesController.getClass();
                    g0.g3(new qg(messagesController, j10, hVar, z10));
                } catch (Exception e21) {
                    e = e21;
                    sQLiteCursor = queryFinalized2;
                    urVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = queryFinalized2;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                return;
        }
    }
}
