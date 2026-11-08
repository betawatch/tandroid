package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class vp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ vp(int i7, long j3, long j10, yr yrVar) {
        this.a = i7;
        this.b = yrVar;
        this.c = j3;
        this.d = j10;
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
        yr yrVar;
        switch (this.a) {
            case 0:
                long j3 = this.c;
                yr yrVar2 = this.b;
                yrVar2.getClass();
                try {
                    SQLiteCursor queryFinalized2 = yrVar2.b.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j3, new Object[0]);
                    int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) : 0;
                    queryFinalized2.dispose();
                    long j10 = intValue;
                    long j11 = this.d;
                    if (j11 == j10) {
                        return;
                    }
                    SQLiteDatabase sQLiteDatabase = yrVar2.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO dialog_settings VALUES(" + j3 + ", " + j11 + ")").stepThis().dispose();
                    yrVar2.t1(true);
                    return;
                } catch (Exception e10) {
                    yrVar2.o(e10, true);
                    return;
                }
            case 1:
                long j12 = this.c;
                long j13 = this.d;
                yr yrVar3 = this.b;
                yrVar3.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = yrVar3.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM topics WHERE did = " + j12 + " AND topic_id = " + j13).stepThis().dispose();
                    yrVar3.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j12 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j12 + " AND topic_id = " + j13 + ")").stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase3 = yrVar3.b;
                    StringBuilder sb2 = new StringBuilder("DELETE FROM messages_topics WHERE uid = ");
                    sb2.append(j12);
                    sb2.append(" AND topic_id = ");
                    sb2.append(j13);
                    sQLiteDatabase3.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (SQLiteException e11) {
                    e11.printStackTrace();
                    return;
                }
            case 2:
                long j14 = this.c;
                long j15 = this.d;
                yr yrVar4 = this.b;
                yrVar4.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar4.b.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, j14);
                        sQLitePreparedStatement.bindLong(2, j15);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    yrVar4.o(e12, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            case 3:
                yr yrVar5 = this.b;
                long j16 = this.c;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        arrayList = new ArrayList();
                        r14 = 0;
                        queryFinalized = yrVar5.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j16, new Object[0]);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e13) {
                    e = e13;
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
                                            TLdeserialize.readAttachPath(byteBufferValue, yrVar5.getUserConfig().n);
                                            boolean y10 = t10.y(j16);
                                            long j17 = this.d;
                                            if (y10) {
                                                if (ij.C1(TLdeserialize.fwd_from.from_id) != j17) {
                                                }
                                                arrayList.add(Integer.valueOf(TLdeserialize.id));
                                                yrVar5.b(TLdeserialize, arrayList4, arrayList6, arrayList5, false);
                                                arrayList2 = arrayList4;
                                                arrayList3 = arrayList5;
                                                byteBufferValue.reuse();
                                            }
                                            if (ij.C1(TLdeserialize.from_id) == j17) {
                                                break;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                    } catch (Exception e14) {
                                        e = e14;
                                        yrVar5.o(e, true);
                                        queryFinalized.dispose();
                                        yrVar5.D(arrayList6, true);
                                        yrVar = yrVar5;
                                        g0.h3(new jm(yrVar, arrayList3, j16, arrayList, 10));
                                        yrVar.Q0(0, 0, j16, arrayList, false);
                                        yrVar.S1(j16, !m5.z(j16) ? -j16 : 0L, arrayList, null);
                                        yrVar.getFileLoader().getClass();
                                        w7.p(0, arrayList2);
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
                            } catch (Exception e15) {
                                e = e15;
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                            }
                        }
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        queryFinalized.dispose();
                        yrVar5.D(arrayList6, true);
                        yrVar = yrVar5;
                    } catch (Exception e16) {
                        e = e16;
                        sQLiteCursor = queryFinalized;
                    }
                    try {
                        g0.h3(new jm(yrVar, arrayList3, j16, arrayList, 10));
                        yrVar.Q0(0, 0, j16, arrayList, false);
                        yrVar.S1(j16, !m5.z(j16) ? -j16 : 0L, arrayList, null);
                        yrVar.getFileLoader().getClass();
                        w7.p(0, arrayList2);
                        if (!arrayList.isEmpty()) {
                            yrVar = yrVar;
                            yrVar5 = yrVar;
                            g0.h3(new lr(yrVar, arrayList, j16, 6));
                        }
                    } catch (Exception e17) {
                        e = e17;
                        yrVar5 = yrVar;
                        yrVar5.o(e, true);
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
                long j18 = this.c;
                long j19 = this.d;
                yr yrVar6 = this.b;
                yrVar6.getClass();
                try {
                    yrVar6.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j18 + " AND id = " + j19).stepThis().dispose();
                    yrVar6.b.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j18 + " AND count > 0").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    yrVar6.o(e18, true);
                    return;
                }
        }
    }
}
