package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class cq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ long c;

    public /* synthetic */ cq(hs hsVar, long j10, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long e;
        SQLiteCursor queryFinalized;
        SQLiteCursor queryFinalized2;
        int i10 = this.a;
        SQLiteCursor sQLiteCursor = null;
        long j10 = this.c;
        hs hsVar = this.b;
        switch (i10) {
            case 0:
                hsVar.getClass();
                try {
                    hsVar.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
                    hsVar.b.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    hsVar.o(e7, true);
                    return;
                }
            case 1:
                hsVar.getClass();
                try {
                    hsVar.b.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    hsVar.o(e10, true);
                    return;
                }
            case 2:
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                hs hsVar2 = this.b;
                try {
                    try {
                        e = hsVar2.getUserConfig().e();
                        queryFinalized = hsVar2.b.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(e), Long.valueOf(j10));
                    } catch (Exception e12) {
                        e = e12;
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
                    queryFinalized = hsVar2.b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e));
                    while (queryFinalized.next()) {
                        int intValue = queryFinalized.intValue(0);
                        if (!arrayList.contains(Integer.valueOf(intValue))) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                            if (jj.R1(e, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j10) {
                                arrayList.add(Integer.valueOf(intValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    hsVar2.Q0(0, 0, e, arrayList, true);
                    hsVar2.R1(e, -e, arrayList, null);
                    try {
                        tr trVar = new tr(hsVar2, e, arrayList, 7);
                        hsVar2 = hsVar2;
                        i0.g3(trVar);
                        return;
                    } catch (Exception e13) {
                        e = e13;
                        hsVar2 = hsVar2;
                        hsVar2.o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
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
                hsVar.getClass();
                try {
                    hsVar.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    hsVar.o(e15, true);
                    return;
                }
            case 5:
                hsVar.getClass();
                try {
                    hsVar.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    hsVar.o(e16, true);
                    return;
                }
            case 6:
                hsVar.getClass();
                try {
                    hsVar.b.executeFast("DELETE FROM pending_tasks WHERE id = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    hsVar.o(e17, true);
                    return;
                }
            default:
                long j11 = this.c;
                boolean z10 = true;
                try {
                    try {
                        queryFinalized2 = hsVar.b.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j11, new Object[0]);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e18) {
                    e = e18;
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
                    vp messagesController = hsVar.getMessagesController();
                    messagesController.getClass();
                    i0.g3(new qg(messagesController, j11, hVar, z10));
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor = queryFinalized2;
                    hsVar.o(e, true);
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
