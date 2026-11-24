// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ac7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ ac7(ad7 ad7Var, int i, int i2, int i3, int i4, long j) {
        this.a = (byte) 0;
        this.b = ad7Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = i4;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ee  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ad7 ad7Var;
        SQLitePreparedStatement sQLitePreparedStatement;
        int max;
        SparseArray sparseArray;
        ArrayList arrayList;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement3;
        boolean z;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        int intValue;
        long longValue;
        int i;
        int i2;
        SQLitePreparedStatement executeFast2;
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement sQLitePreparedStatement4;
        int intValue2;
        byte b = this.a;
        int i3 = 0;
        int i4 = this.h;
        int i5 = this.f;
        int i6 = this.e;
        int i7 = this.d;
        switch (b) {
            case 0:
                ad7 ad7Var2 = this.b;
                long j = this.c;
                try {
                    try {
                        max = Math.max(i7, i6) + i5;
                        sparseArray = new SparseArray();
                        arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i4));
                        sparseArray.put(max, arrayList);
                        ad7Var = ad7Var2;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = null;
                    }
                } catch (Exception e) {
                    e = e;
                    ad7Var = ad7Var2;
                }
                try {
                    gl.c3(new jc7(ad7Var, j, arrayList, (byte) 7));
                    SQLitePreparedStatement executeFast3 = ad7Var.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i8 = 0;
                    while (i8 < sparseArray.size()) {
                        try {
                            int keyAt = sparseArray.keyAt(i8);
                            ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                            for (int i9 = i3; i9 < arrayList2.size(); i9++) {
                                executeFast3.requery();
                                executeFast3.bindInteger(1, ((Integer) arrayList2.get(i9)).intValue());
                                executeFast3.bindLong(2, j);
                                executeFast3.bindInteger(3, keyAt);
                                executeFast3.bindInteger(4, 1);
                                executeFast3.step();
                            }
                            i8++;
                            i3 = 0;
                        } catch (Exception e2) {
                            e = e2;
                            sQLitePreparedStatement = executeFast3;
                            try {
                                ad7Var.n(e, true);
                                if (sQLitePreparedStatement == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement = executeFast3;
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    executeFast3.dispose();
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid = " + i4 + " AND uid = " + j).stepThis().dispose();
                    ad7Var.getMessagesController().k0(max, j, sparseArray);
                    return;
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = null;
                    ad7Var.n(e, true);
                    if (sQLitePreparedStatement == null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            case 1:
                ad7 ad7Var3 = this.b;
                long j2 = this.c;
                try {
                    executeFast = ad7Var3.b.executeFast("REPLACE INTO widget_heights VALUES(?, ?, ?, ?, ?, ?)");
                } catch (Exception e4) {
                    e = e4;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement2 = null;
                }
                try {
                    executeFast.bindLong(1, j2);
                    executeFast.bindInteger(2, i7);
                    executeFast.bindInteger(3, i6);
                    executeFast.bindInteger(4, i5);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.bindInteger(6, i4);
                    executeFast.step();
                    executeFast.dispose();
                    SQLiteDatabase sQLiteDatabase4 = ad7Var3.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM widget_heights WHERE uid = " + j2 + " AND mid = " + i7 + " AND width NOT IN (SELECT width FROM widget_heights WHERE uid = " + j2 + " AND mid = " + i7 + " ORDER BY date DESC LIMIT 4)").stepThis().dispose();
                    return;
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement2 = executeFast;
                    try {
                        ad7Var3.n(e, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement2 = executeFast;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            default:
                ad7 ad7Var4 = this.b;
                long j3 = this.c;
                try {
                    SQLiteCursor queryFinalized2 = ad7Var4.b.queryFinalized("SELECT unread_count, inbox_max, last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                    try {
                        if (queryFinalized2.next()) {
                            try {
                                intValue = queryFinalized2.intValue(0);
                                int intValue3 = queryFinalized2.intValue(1);
                                longValue = queryFinalized2.longValue(2);
                                i = intValue3;
                                i2 = intValue;
                            } catch (Exception e6) {
                                e = e6;
                                sQLiteCursor = queryFinalized2;
                                z = true;
                                sQLitePreparedStatement3 = null;
                                try {
                                    ad7Var4.n(e, z);
                                    if (sQLitePreparedStatement3 != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = ad7Var4.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (sQLitePreparedStatement3 != null) {
                                        sQLitePreparedStatement3.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    sQLiteDatabase = ad7Var4.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteCursor = queryFinalized2;
                                sQLitePreparedStatement3 = null;
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = ad7Var4.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            intValue = 0;
                            i2 = 0;
                            longValue = 0;
                            i = 0;
                        }
                        queryFinalized2.dispose();
                        ad7Var4.b.beginTransaction();
                        if (cf3.B(j3)) {
                            executeFast2 = ad7Var4.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid >= ? AND read_state IN(0,2) AND out = 0");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, j3);
                                executeFast2.bindInteger(2, i4);
                                executeFast2.step();
                                executeFast2.dispose();
                                if (i4 <= longValue) {
                                    queryFinalized = null;
                                } else {
                                    queryFinalized = ad7Var4.b.queryFinalized("SELECT changes()", new Object[0]);
                                    try {
                                        if (queryFinalized.next()) {
                                            try {
                                                intValue2 = queryFinalized.intValue(0) + i6;
                                            } catch (Exception e7) {
                                                e = e7;
                                                sQLiteCursor = queryFinalized;
                                                z = true;
                                                sQLitePreparedStatement3 = null;
                                                ad7Var4.n(e, z);
                                                if (sQLitePreparedStatement3 != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase2 = ad7Var4.b;
                                                if (sQLiteDatabase2 == null) {
                                                }
                                                sQLiteDatabase2.commitTransaction();
                                                return;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                sQLiteCursor = queryFinalized;
                                                sQLitePreparedStatement3 = null;
                                                if (sQLitePreparedStatement3 != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase = ad7Var4.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            intValue2 = 0;
                                        }
                                        queryFinalized.dispose();
                                        i3 = Math.max(0, intValue - intValue2);
                                    } catch (Exception e8) {
                                        e = e8;
                                        sQLitePreparedStatement4 = null;
                                        executeFast2 = sQLitePreparedStatement4;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement3 = executeFast2;
                                        z = true;
                                        ad7Var4.n(e, z);
                                        if (sQLitePreparedStatement3 != null) {
                                            sQLitePreparedStatement3.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        sQLiteDatabase2 = ad7Var4.b;
                                        if (sQLiteDatabase2 == null) {
                                            return;
                                        }
                                        sQLiteDatabase2.commitTransaction();
                                        return;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        sQLitePreparedStatement4 = null;
                                        SQLitePreparedStatement sQLitePreparedStatement5 = sQLitePreparedStatement4;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement3 = sQLitePreparedStatement5;
                                        if (sQLitePreparedStatement3 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase = ad7Var4.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                sQLiteCursor = null;
                                sQLitePreparedStatement3 = executeFast2;
                                z = true;
                                ad7Var4.n(e, z);
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = ad7Var4.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                sQLiteCursor = null;
                                sQLitePreparedStatement3 = executeFast2;
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = ad7Var4.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            try {
                                i4 = Math.max(i, i7);
                                executeFast2 = ad7Var4.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
                            } catch (Exception e10) {
                                e = e10;
                                z = true;
                                sQLitePreparedStatement3 = null;
                            } catch (Throwable th12) {
                                th = th12;
                                sQLitePreparedStatement3 = null;
                            }
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, j3);
                                executeFast2.bindInteger(2, i4);
                                executeFast2.step();
                                executeFast2.dispose();
                                if (i4 >= longValue) {
                                    queryFinalized = null;
                                } else {
                                    queryFinalized = ad7Var4.b.queryFinalized("SELECT changes()", new Object[0]);
                                    try {
                                        int intValue4 = queryFinalized.next() ? queryFinalized.intValue(0) + i6 : 0;
                                        queryFinalized.dispose();
                                        i3 = Math.max(0, intValue - intValue4);
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement3 = executeFast2;
                                        z = true;
                                        ad7Var4.n(e, z);
                                        if (sQLitePreparedStatement3 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase2 = ad7Var4.b;
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        sQLiteDatabase2.commitTransaction();
                                        return;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement3 = executeFast2;
                                        if (sQLitePreparedStatement3 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase = ad7Var4.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                SQLitePreparedStatement executeFast4 = ad7Var4.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                                executeFast4.requery();
                                executeFast4.bindLong(1, j3);
                                executeFast4.bindInteger(2, i4);
                                executeFast4.step();
                                executeFast4.dispose();
                                SQLitePreparedStatement executeFast5 = ad7Var4.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND date <= ?");
                                executeFast5.requery();
                                executeFast5.bindLong(1, j3);
                                executeFast5.bindInteger(2, i5);
                                executeFast5.step();
                                executeFast5.dispose();
                            } catch (Exception e12) {
                                e = e12;
                                sQLitePreparedStatement3 = executeFast2;
                                z = true;
                                sQLiteCursor = null;
                                ad7Var4.n(e, z);
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = ad7Var4.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLitePreparedStatement3 = executeFast2;
                                sQLiteCursor = null;
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = ad7Var4.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast2 = ad7Var4.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ? WHERE did = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i3);
                        executeFast2.bindInteger(2, i4);
                        executeFast2.bindLong(3, j3);
                        executeFast2.step();
                        executeFast2.dispose();
                        ad7Var4.b.commitTransaction();
                        if (ad7Var4.r0(14, j3)) {
                            ad7Var4.d2(j3, i, i4);
                        }
                        if (i2 == 0 || i3 != 0 || ad7Var4.r0(13, j3)) {
                            sQLitePreparedStatement4 = null;
                        } else {
                            LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                            longSparseIntArray.put(j3, i3);
                            sQLitePreparedStatement4 = null;
                            try {
                                ad7Var4.T1(longSparseIntArray, null, true);
                            } catch (Exception e13) {
                                e = e13;
                                executeFast2 = sQLitePreparedStatement4;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement3 = executeFast2;
                                z = true;
                                ad7Var4.n(e, z);
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = ad7Var4.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th15) {
                                th = th15;
                                SQLitePreparedStatement sQLitePreparedStatement52 = sQLitePreparedStatement4;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement3 = sQLitePreparedStatement52;
                                if (sQLitePreparedStatement3 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = ad7Var4.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Long.valueOf(j3));
                        ad7Var4.i2(arrayList3);
                        if (queryFinalized != null) {
                            queryFinalized.dispose();
                        }
                        sQLiteDatabase2 = ad7Var4.b;
                        if (sQLiteDatabase2 == null) {
                            return;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        sQLitePreparedStatement3 = null;
                        sQLiteCursor = queryFinalized2;
                    } catch (Throwable th16) {
                        th = th16;
                        sQLitePreparedStatement3 = null;
                        sQLiteCursor = queryFinalized2;
                    }
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor = null;
                    sQLitePreparedStatement3 = null;
                } catch (Throwable th17) {
                    th = th17;
                    sQLiteCursor = null;
                    sQLitePreparedStatement3 = null;
                }
                sQLiteDatabase2.commitTransaction();
                return;
        }
    }

    public /* synthetic */ ac7(ad7 ad7Var, long j, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = i4;
    }
}
