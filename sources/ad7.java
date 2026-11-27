// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ad7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;

    public /* synthetic */ ad7(kf7 kf7Var, int i, int i2, int i3, int i4, long j) {
        this.a = (byte) 1;
        this.b = kf7Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.h = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int intValue;
        int intValue2;
        long longValue;
        int i;
        SQLitePreparedStatement executeFast;
        int max;
        int intValue3;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLitePreparedStatement sQLitePreparedStatement4;
        switch (this.a) {
            case 0:
                kf7 kf7Var = this.b;
                long j = this.h;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                int i5 = this.f;
                try {
                    SQLiteCursor queryFinalized = kf7Var.b.queryFinalized("SELECT unread_count, inbox_max, last_mid FROM dialogs WHERE did = " + j, new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            try {
                                intValue = queryFinalized.intValue(0);
                                intValue2 = queryFinalized.intValue(1);
                                longValue = queryFinalized.longValue(2);
                                i = intValue;
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    kf7Var.p(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = kf7Var.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    sQLiteDatabase = kf7Var.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = kf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            longValue = 0;
                            intValue = 0;
                            intValue2 = 0;
                            i = 0;
                        }
                        queryFinalized.dispose();
                        kf7Var.b.beginTransaction();
                        if (wf3.B(j)) {
                            SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("UPDATE messages_v2" + kf7Var.T + " SET read_state = read_state | 1 WHERE uid = ? AND mid >= ? AND read_state IN(0,2) AND out = 0");
                            try {
                                executeFast2.requery();
                                executeFast2.bindLong(1, j);
                                executeFast2.bindInteger(2, i5);
                                executeFast2.step();
                                executeFast2.dispose();
                                if (i5 <= longValue) {
                                    max = 0;
                                    sQLiteCursor = null;
                                } else {
                                    sQLiteCursor = kf7Var.b.queryFinalized("SELECT changes()", new Object[0]);
                                    try {
                                        if (sQLiteCursor.next()) {
                                            try {
                                                intValue3 = sQLiteCursor.intValue(0) + i3;
                                            } catch (Exception e2) {
                                                e = e2;
                                                sQLitePreparedStatement = null;
                                                kf7Var.p(e, true);
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase2 = kf7Var.b;
                                                if (sQLiteDatabase2 == null) {
                                                }
                                                sQLiteDatabase2.commitTransaction();
                                                return;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                sQLitePreparedStatement = null;
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase = kf7Var.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            intValue3 = 0;
                                        }
                                        sQLiteCursor.dispose();
                                        max = Math.max(0, intValue - intValue3);
                                    } catch (Exception e3) {
                                        e = e3;
                                        sQLitePreparedStatement2 = null;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        kf7Var.p(e, true);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase2 = kf7Var.b;
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        sQLiteDatabase2.commitTransaction();
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLitePreparedStatement2 = null;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase = kf7Var.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                sQLitePreparedStatement = executeFast2;
                                sQLiteCursor = null;
                                kf7Var.p(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = kf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement = executeFast2;
                                sQLiteCursor = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = kf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            try {
                                i5 = Math.max(intValue2, i2);
                                executeFast = kf7Var.b.executeFast("UPDATE messages_v2" + kf7Var.T + " SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
                                try {
                                    executeFast.requery();
                                    executeFast.bindLong(1, j);
                                    executeFast.bindInteger(2, i5);
                                    executeFast.step();
                                    executeFast.dispose();
                                    if (i5 >= longValue) {
                                        max = 0;
                                        sQLiteCursor = null;
                                    } else {
                                        sQLiteCursor = kf7Var.b.queryFinalized("SELECT changes()", new Object[0]);
                                        try {
                                            int intValue4 = sQLiteCursor.next() ? i3 + sQLiteCursor.intValue(0) : 0;
                                            sQLiteCursor.dispose();
                                            max = Math.max(0, intValue - intValue4);
                                        } catch (Exception e5) {
                                            e = e5;
                                            sQLitePreparedStatement = executeFast;
                                            kf7Var.p(e, true);
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase2 = kf7Var.b;
                                            if (sQLiteDatabase2 == null) {
                                            }
                                            sQLiteDatabase2.commitTransaction();
                                            return;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLitePreparedStatement = executeFast;
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase = kf7Var.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    SQLitePreparedStatement executeFast3 = kf7Var.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                                    executeFast3.requery();
                                    executeFast3.bindLong(1, j);
                                    executeFast3.bindInteger(2, i5);
                                    executeFast3.step();
                                    executeFast3.dispose();
                                    SQLitePreparedStatement executeFast4 = kf7Var.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND date <= ?");
                                    executeFast4.requery();
                                    executeFast4.bindLong(1, j);
                                    executeFast4.bindInteger(2, i4);
                                    executeFast4.step();
                                    executeFast4.dispose();
                                } catch (Exception e6) {
                                    e = e6;
                                    sQLitePreparedStatement = executeFast;
                                    sQLiteCursor = null;
                                    kf7Var.p(e, true);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    sQLiteDatabase2 = kf7Var.b;
                                    if (sQLiteDatabase2 == null) {
                                        return;
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th7) {
                                    th = th7;
                                    sQLitePreparedStatement = executeFast;
                                    sQLiteCursor = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase = kf7Var.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                kf7Var.p(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = kf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = kf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast = kf7Var.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ? WHERE did = ?");
                        executeFast.requery();
                        executeFast.bindInteger(1, max);
                        executeFast.bindInteger(2, i5);
                        executeFast.bindLong(3, j);
                        executeFast.step();
                        executeFast.dispose();
                        kf7Var.b.commitTransaction();
                        if (kf7Var.u0(14, j)) {
                            kf7Var.i2(j, intValue2, i5);
                        }
                        if (i == 0 || max != 0 || kf7Var.u0(13, j)) {
                            sQLitePreparedStatement2 = null;
                        } else {
                            LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                            longSparseIntArray.put(j, max);
                            sQLitePreparedStatement2 = null;
                            try {
                                kf7Var.Y1(longSparseIntArray, null, true);
                            } catch (Exception e8) {
                                e = e8;
                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                kf7Var.p(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = kf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th9) {
                                th = th9;
                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = kf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Long.valueOf(j));
                        kf7Var.n2(arrayList);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        sQLiteDatabase2 = kf7Var.b;
                        if (sQLiteDatabase2 == null) {
                            return;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th10) {
                        th = th10;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor = queryFinalized;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                    sQLitePreparedStatement = null;
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteCursor = null;
                    sQLitePreparedStatement = null;
                }
                sQLiteDatabase2.commitTransaction();
                return;
            case 1:
                kf7 kf7Var2 = this.b;
                int i6 = this.c;
                int i7 = this.d;
                int i8 = this.e;
                int i9 = this.f;
                long j2 = this.h;
                try {
                    int max2 = Math.max(i6, i7) + i8;
                    SparseArray sparseArray = new SparseArray();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(i9));
                    sparseArray.put(max2, arrayList2);
                    hl.c3(new te7(kf7Var2, j2, arrayList2, (byte) 7));
                    sQLitePreparedStatement3 = kf7Var2.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        try {
                            try {
                                int keyAt = sparseArray.keyAt(i10);
                                ArrayList arrayList3 = (ArrayList) sparseArray.get(keyAt);
                                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                    sQLitePreparedStatement3.requery();
                                    sQLitePreparedStatement3.bindInteger(1, ((Integer) arrayList3.get(i11)).intValue());
                                    sQLitePreparedStatement3.bindLong(2, j2);
                                    sQLitePreparedStatement3.bindInteger(3, keyAt);
                                    sQLitePreparedStatement3.bindInteger(4, 1);
                                    sQLitePreparedStatement3.step();
                                }
                            } catch (Exception e11) {
                                e = e11;
                                kf7Var2.p(e, true);
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            if (sQLitePreparedStatement3 != null) {
                                sQLitePreparedStatement3.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLitePreparedStatement3.dispose();
                    SQLiteDatabase sQLiteDatabase3 = kf7Var2.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid = " + i9 + " AND uid = " + j2).stepThis().dispose();
                    kf7Var2.getMessagesController().m0(max2, j2, sparseArray);
                    return;
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement3 = null;
                } catch (Throwable th13) {
                    th = th13;
                    sQLitePreparedStatement3 = null;
                    if (sQLitePreparedStatement3 != null) {
                    }
                    throw th;
                }
            default:
                kf7 kf7Var3 = this.b;
                long j3 = this.h;
                int i12 = this.c;
                int i13 = this.d;
                int i14 = this.e;
                int i15 = this.f;
                try {
                    try {
                        sQLitePreparedStatement4 = kf7Var3.b.executeFast("REPLACE INTO widget_heights VALUES(?, ?, ?, ?, ?, ?)");
                        try {
                            sQLitePreparedStatement4.bindLong(1, j3);
                            sQLitePreparedStatement4.bindInteger(2, i12);
                            sQLitePreparedStatement4.bindInteger(3, i13);
                            sQLitePreparedStatement4.bindInteger(4, i14);
                            sQLitePreparedStatement4.bindLong(5, System.currentTimeMillis());
                            sQLitePreparedStatement4.bindInteger(6, i15);
                            sQLitePreparedStatement4.step();
                            sQLitePreparedStatement4.dispose();
                            SQLiteDatabase sQLiteDatabase4 = kf7Var3.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase4.executeFast("DELETE FROM widget_heights WHERE uid = " + j3 + " AND mid = " + i12 + " AND width NOT IN (SELECT width FROM widget_heights WHERE uid = " + j3 + " AND mid = " + i12 + " ORDER BY date DESC LIMIT 4)").stepThis().dispose();
                        } catch (Exception e13) {
                            e = e13;
                            kf7Var3.p(e, true);
                            if (sQLitePreparedStatement4 != null) {
                                sQLitePreparedStatement4.dispose();
                            }
                            return;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        if (sQLitePreparedStatement4 != null) {
                            sQLitePreparedStatement4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLitePreparedStatement4 = null;
                } catch (Throwable th15) {
                    th = th15;
                    sQLitePreparedStatement4 = null;
                    if (sQLitePreparedStatement4 != null) {
                    }
                    throw th;
                }
                return;
        }
    }

    public /* synthetic */ ad7(kf7 kf7Var, long j, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.h = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }
}
