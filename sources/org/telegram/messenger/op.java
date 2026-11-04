package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ long c;

    public /* synthetic */ op(qr qrVar, long j10, int i3) {
        this.a = i3;
        this.b = qrVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long e10;
        SQLiteCursor queryFinalized;
        SQLiteCursor queryFinalized2;
        int i3 = this.a;
        SQLiteCursor sQLiteCursor = null;
        long j10 = this.c;
        qr qrVar = this.b;
        switch (i3) {
            case 0:
                qrVar.getClass();
                try {
                    qrVar.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
                    qrVar.b.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    qrVar.o(e11, true);
                    return;
                }
            case 1:
                qrVar.getClass();
                try {
                    qrVar.b.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    qrVar.o(e12, true);
                    return;
                }
            case 2:
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e13) {
                    e13.printStackTrace();
                    return;
                }
            case 3:
                qr qrVar2 = this.b;
                try {
                    try {
                        e10 = qrVar2.getUserConfig().e();
                        queryFinalized = qrVar2.b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e10), Long.valueOf(j10));
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
                    queryFinalized = qrVar2.b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e10));
                    while (queryFinalized.next()) {
                        int intValue = queryFinalized.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                            if (zi.R1(e10, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j10) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    qrVar2.Q0(0, 0, e10, arrayList, true);
                    qrVar2.R1(e10, -e10, arrayList, null);
                    try {
                        dr drVar = new dr(qrVar2, e10, arrayList, 7);
                        qrVar2 = qrVar2;
                        g0.h3(drVar);
                        return;
                    } catch (Exception e15) {
                        e = e15;
                        qrVar2 = qrVar2;
                        qrVar2.o(e, true);
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
                qrVar.getClass();
                try {
                    qrVar.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    qrVar.o(e17, true);
                    return;
                }
            case 5:
                qrVar.getClass();
                try {
                    qrVar.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    qrVar.o(e18, true);
                    return;
                }
            case 6:
                qrVar.getClass();
                try {
                    qrVar.b.executeFast("DELETE FROM pending_tasks WHERE id = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e19) {
                    qrVar.o(e19, true);
                    return;
                }
            default:
                long j11 = this.c;
                boolean z10 = true;
                try {
                    try {
                        queryFinalized2 = qrVar.b.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j11, new Object[0]);
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
                    hp messagesController = qrVar.getMessagesController();
                    messagesController.getClass();
                    g0.h3(new jg(messagesController, j11, hVar, z10));
                } catch (Exception e21) {
                    e = e21;
                    sQLiteCursor = queryFinalized2;
                    qrVar.o(e, true);
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
