package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class bq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ bq(int i10, long j10, long j11, is isVar) {
        this.a = i10;
        this.b = isVar;
        this.c = j10;
        this.d = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        if (r8.id != 1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ?? r14;
        SQLiteCursor queryFinalized;
        ArrayList arrayList2;
        ArrayList arrayList3;
        is isVar;
        switch (this.a) {
            case 0:
                long j10 = this.c;
                is isVar2 = this.b;
                isVar2.getClass();
                try {
                    SQLiteCursor queryFinalized2 = isVar2.b.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j10, new Object[0]);
                    int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) : 0;
                    queryFinalized2.dispose();
                    long j11 = intValue;
                    long j12 = this.d;
                    if (j12 == j11) {
                        return;
                    }
                    SQLiteDatabase sQLiteDatabase = isVar2.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO dialog_settings VALUES(" + j10 + ", " + j12 + ")").stepThis().dispose();
                    isVar2.t1(true);
                    return;
                } catch (Exception e) {
                    isVar2.o(e, true);
                    return;
                }
            case 1:
                long j13 = this.c;
                long j14 = this.d;
                is isVar3 = this.b;
                isVar3.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = isVar3.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM topics WHERE did = " + j13 + " AND topic_id = " + j14).stepThis().dispose();
                    isVar3.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j13 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j13 + " AND topic_id = " + j14 + ")").stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase3 = isVar3.b;
                    StringBuilder sb2 = new StringBuilder("DELETE FROM messages_topics WHERE uid = ");
                    sb2.append(j13);
                    sb2.append(" AND topic_id = ");
                    sb2.append(j14);
                    sQLiteDatabase3.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (SQLiteException e7) {
                    e7.printStackTrace();
                    return;
                }
            case 2:
                long j15 = this.c;
                long j16 = this.d;
                is isVar4 = this.b;
                isVar4.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = isVar4.b.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, j15);
                        sQLitePreparedStatement.bindLong(2, j16);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    isVar4.o(e10, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            case 3:
                is isVar5 = this.b;
                long j17 = this.c;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        arrayList = new ArrayList();
                        r14 = 0;
                        queryFinalized = isVar5.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j17, new Object[0]);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                try {
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        while (queryFinalized.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r14);
                                if (byteBufferValue != 0) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r14), r14);
                                    try {
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, isVar5.getUserConfig().n);
                                            boolean y3 = i20.y(j17);
                                            long j18 = this.d;
                                            if (y3) {
                                                if (kj.C1(TLdeserialize.fwd_from.from_id) != j18) {
                                                }
                                                arrayList.add(Integer.valueOf(TLdeserialize.id));
                                                isVar5.b(TLdeserialize, arrayList4, arrayList6, arrayList5, false);
                                                arrayList2 = arrayList4;
                                                arrayList3 = arrayList5;
                                                byteBufferValue.reuse();
                                            }
                                            if (kj.C1(TLdeserialize.from_id) == j18) {
                                                break;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                    } catch (Exception e12) {
                                        e = e12;
                                        isVar5.o(e, true);
                                        queryFinalized.dispose();
                                        isVar5.D(arrayList6, true);
                                        isVar = isVar5;
                                        i0.g3(new xm(isVar, arrayList3, j17, arrayList, 11));
                                        isVar.Q0(0, 0, j17, arrayList, false);
                                        isVar.S1(j17, !o5.z(j17) ? -j17 : 0L, arrayList, null);
                                        isVar.getFileLoader().getClass();
                                        b8.p(0, arrayList2);
                                        if (!arrayList.isEmpty()) {
                                        }
                                        return;
                                    }
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                } else {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                }
                                arrayList5 = arrayList3;
                                arrayList4 = arrayList2;
                                r14 = 0;
                            } catch (Exception e13) {
                                e = e13;
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                            }
                        }
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        queryFinalized.dispose();
                        isVar5.D(arrayList6, true);
                        isVar = isVar5;
                    } catch (Exception e14) {
                        e = e14;
                        sQLiteCursor = queryFinalized;
                    }
                    try {
                        i0.g3(new xm(isVar, arrayList3, j17, arrayList, 11));
                        isVar.Q0(0, 0, j17, arrayList, false);
                        isVar.S1(j17, !o5.z(j17) ? -j17 : 0L, arrayList, null);
                        isVar.getFileLoader().getClass();
                        b8.p(0, arrayList2);
                        if (!arrayList.isEmpty()) {
                            isVar = isVar;
                            isVar5 = isVar;
                            i0.g3(new ur(isVar, arrayList, j17, 6));
                        }
                    } catch (Exception e15) {
                        e = e15;
                        isVar5 = isVar;
                        isVar5.o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            default:
                long j19 = this.c;
                long j20 = this.d;
                is isVar6 = this.b;
                isVar6.getClass();
                try {
                    isVar6.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j19 + " AND id = " + j20).stepThis().dispose();
                    isVar6.b.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j19 + " AND count > 0").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    isVar6.o(e16, true);
                    return;
                }
        }
    }
}
