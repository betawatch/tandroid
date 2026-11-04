package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ qr a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ nq(qr qrVar, int i3, ArrayList arrayList, int i10, int i11, int i12) {
        this.a = qrVar;
        this.b = i3;
        this.c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z10;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor queryFinalized;
        long j10;
        qr qrVar = this.a;
        int i3 = this.b;
        int i10 = this.d;
        int i11 = this.f;
        try {
            long F = m5.F(i3);
            SparseArray sparseArray = new SparseArray();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = this.c;
            int i12 = this.e;
            int i13 = 0;
            if (arrayList2 == null) {
                SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase3.queryFinalized("SELECT mid, ttl FROM messages_v2 WHERE uid = " + F + " AND out = " + i10 + " AND read_state > 0 AND ttl > 0 AND date <= " + i12 + " AND send_state = 0 AND media != 1", new Object[0]);
            } else {
                String join = TextUtils.join(",", arrayList2);
                SQLiteDatabase sQLiteDatabase4 = qrVar.b;
                Locale locale2 = Locale.US;
                queryFinalized = sQLiteDatabase4.queryFinalized("SELECT m.mid, m.ttl FROM messages_v2 as m INNER JOIN randoms_v2 as r ON m.mid = r.mid AND m.uid = r.uid WHERE r.random_id IN (" + join + ")", new Object[0]);
            }
            int i14 = Integer.MAX_VALUE;
            while (queryFinalized.next()) {
                try {
                    int intValue = queryFinalized.intValue(1);
                    int intValue2 = queryFinalized.intValue(i13);
                    if (arrayList2 != null) {
                        arrayList.add(Integer.valueOf(intValue2));
                    }
                    if (intValue > 0) {
                        int max = Math.max(i12, i11) + intValue;
                        i14 = Math.min(i14, max);
                        ArrayList arrayList3 = (ArrayList) sparseArray.get(max);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            sparseArray.put(max, arrayList3);
                        }
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(intValue2);
                        arrayList3.add(Integer.valueOf(intValue2));
                    }
                    i13 = 0;
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = queryFinalized;
                    z10 = true;
                    sQLitePreparedStatement = null;
                    try {
                        qrVar.o(e, z10);
                        sQLiteDatabase2 = qrVar.b;
                        if (sQLiteDatabase2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor == null) {
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
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    sQLiteDatabase = qrVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                j10 = F;
                g0.h3(new dr(qrVar, j10, arrayList, 8));
            } else {
                j10 = F;
            }
            if (sparseArray.size() != 0) {
                qrVar.b.beginTransaction();
                SQLitePreparedStatement executeFast = qrVar.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                    try {
                        int keyAt = sparseArray.keyAt(i15);
                        ArrayList arrayList4 = (ArrayList) sparseArray.get(keyAt);
                        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                            executeFast.requery();
                            executeFast.bindInteger(1, ((Integer) arrayList4.get(i16)).intValue());
                            executeFast.bindLong(2, j10);
                            executeFast.bindInteger(3, keyAt);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLitePreparedStatement = executeFast;
                        z10 = true;
                        sQLiteCursor = null;
                        qrVar.o(e, z10);
                        sQLiteDatabase2 = qrVar.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor == null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        sQLiteDatabase = qrVar.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                qrVar.b.commitTransaction();
                SQLiteDatabase sQLiteDatabase5 = qrVar.b;
                Locale locale3 = Locale.US;
                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid IN(" + sb2.toString() + ") AND uid = " + j10).stepThis().dispose();
                qrVar.getMessagesController().n0(i14, j10, sparseArray);
            }
            SQLiteDatabase sQLiteDatabase6 = qrVar.b;
            if (sQLiteDatabase6 != null) {
                sQLiteDatabase6.commitTransaction();
            }
        } catch (Exception e12) {
            e = e12;
            z10 = true;
            sQLitePreparedStatement = null;
        } catch (Throwable th5) {
            th = th5;
            sQLitePreparedStatement = null;
        }
    }
}
