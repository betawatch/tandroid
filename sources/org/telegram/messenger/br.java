package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ br(yr yrVar, int i7, int i10, int i11, int i12, long j3) {
        this.a = 0;
        this.b = yrVar;
        this.d = i7;
        this.e = i10;
        this.f = i11;
        this.h = i12;
        this.c = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0222  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        int intValue;
        long longValue;
        int i7;
        int i10;
        int i11;
        int max;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        int intValue2;
        switch (this.a) {
            case 0:
                yr yrVar = this.b;
                int i12 = this.d;
                int i13 = this.e;
                int i14 = this.f;
                int i15 = this.h;
                long j3 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement4 = null;
                try {
                    try {
                        int max2 = Math.max(i12, i13) + i14;
                        SparseArray sparseArray = new SparseArray();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i15));
                        sparseArray.put(max2, arrayList);
                        g0.h3(new lr(yrVar, j3, arrayList, 5));
                        SQLitePreparedStatement executeFast2 = yrVar.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                        for (int i16 = 0; i16 < sparseArray.size(); i16++) {
                            try {
                                int keyAt = sparseArray.keyAt(i16);
                                ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                    executeFast2.requery();
                                    executeFast2.bindInteger(1, ((Integer) arrayList2.get(i17)).intValue());
                                    executeFast2.bindLong(2, j3);
                                    executeFast2.bindInteger(3, keyAt);
                                    executeFast2.bindInteger(4, 1);
                                    executeFast2.step();
                                }
                            } catch (Exception e10) {
                                e = e10;
                                sQLitePreparedStatement4 = executeFast2;
                                yrVar.o(e, true);
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement4 = executeFast2;
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                throw th;
                            }
                        }
                        executeFast2.dispose();
                        SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid = " + i15 + " AND uid = " + j3).stepThis().dispose();
                        yrVar.getMessagesController().n0(max2, j3, sparseArray);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 1:
                yr yrVar2 = this.b;
                long j10 = this.c;
                int i18 = this.d;
                int i19 = this.e;
                int i20 = this.f;
                int i21 = this.h;
                SQLitePreparedStatement sQLitePreparedStatement5 = null;
                try {
                    try {
                        executeFast = yrVar2.b.executeFast("REPLACE INTO widget_heights VALUES(?, ?, ?, ?, ?, ?)");
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    executeFast.bindLong(1, j10);
                    executeFast.bindInteger(2, i18);
                    executeFast.bindInteger(3, i19);
                    executeFast.bindInteger(4, i20);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.bindInteger(6, i21);
                    executeFast.step();
                    executeFast.dispose();
                    SQLiteDatabase sQLiteDatabase4 = yrVar2.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + " AND mid = " + i18 + " AND width NOT IN (SELECT width FROM widget_heights WHERE uid = " + j10 + " AND mid = " + i18 + " ORDER BY date DESC LIMIT 4)").stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    e = e13;
                    sQLitePreparedStatement5 = executeFast;
                    yrVar2.o(e, true);
                    if (sQLitePreparedStatement5 != null) {
                        sQLitePreparedStatement5.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement5 = executeFast;
                    if (sQLitePreparedStatement5 != null) {
                        sQLitePreparedStatement5.dispose();
                    }
                    throw th;
                }
            default:
                yr yrVar3 = this.b;
                long j11 = this.c;
                int i22 = this.d;
                int i23 = this.f;
                int i24 = this.h;
                try {
                    SQLiteCursor queryFinalized = yrVar3.b.queryFinalized("SELECT unread_count, inbox_max, last_mid FROM dialogs WHERE did = " + j11, new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            try {
                                intValue = queryFinalized.intValue(0);
                                int intValue3 = queryFinalized.intValue(1);
                                longValue = queryFinalized.longValue(2);
                                i7 = intValue3;
                                i10 = intValue;
                            } catch (Exception e14) {
                                e = e14;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    yrVar3.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = yrVar3.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    sQLiteDatabase = yrVar3.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = yrVar3.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            intValue = 0;
                            i10 = 0;
                            longValue = 0;
                            i7 = 0;
                        }
                        queryFinalized.dispose();
                        yrVar3.b.beginTransaction();
                        boolean C = m5.C(j11);
                        int i25 = this.e;
                        if (C) {
                            i11 = i10;
                            sQLitePreparedStatement2 = yrVar3.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid >= ? AND read_state IN(0,2) AND out = 0");
                            try {
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindLong(1, j11);
                                sQLitePreparedStatement2.bindInteger(2, i24);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                                if (i24 <= longValue) {
                                    sQLiteCursor3 = null;
                                    max = 0;
                                } else {
                                    SQLiteCursor queryFinalized2 = yrVar3.b.queryFinalized("SELECT changes()", new Object[0]);
                                    try {
                                        if (queryFinalized2.next()) {
                                            try {
                                                intValue2 = queryFinalized2.intValue(0) + i25;
                                            } catch (Exception e15) {
                                                e = e15;
                                                sQLiteCursor = queryFinalized2;
                                                sQLitePreparedStatement = null;
                                                yrVar3.o(e, true);
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase2 = yrVar3.b;
                                                if (sQLiteDatabase2 == null) {
                                                }
                                                sQLiteDatabase2.commitTransaction();
                                                return;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                sQLiteCursor = queryFinalized2;
                                                sQLitePreparedStatement = null;
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase = yrVar3.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            intValue2 = 0;
                                        }
                                        queryFinalized2.dispose();
                                        max = Math.max(0, intValue - intValue2);
                                        sQLiteCursor3 = queryFinalized2;
                                    } catch (Exception e16) {
                                        e = e16;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = queryFinalized2;
                                        yrVar3.o(e, true);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase2 = yrVar3.b;
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        sQLiteDatabase2.commitTransaction();
                                        return;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = queryFinalized2;
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase = yrVar3.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e17) {
                                e = e17;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                yrVar3.o(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = yrVar3.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th10) {
                                th = th10;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = yrVar3.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            try {
                                i24 = Math.max(i7, i22);
                                SQLitePreparedStatement executeFast3 = yrVar3.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
                                try {
                                    executeFast3.requery();
                                    executeFast3.bindLong(1, j11);
                                    executeFast3.bindInteger(2, i24);
                                    executeFast3.step();
                                    executeFast3.dispose();
                                    i11 = i10;
                                    if (i24 >= longValue) {
                                        sQLiteCursor2 = null;
                                        max = 0;
                                    } else {
                                        SQLiteCursor queryFinalized3 = yrVar3.b.queryFinalized("SELECT changes()", new Object[0]);
                                        try {
                                            int intValue4 = queryFinalized3.next() ? i25 + queryFinalized3.intValue(0) : 0;
                                            queryFinalized3.dispose();
                                            max = Math.max(0, intValue - intValue4);
                                            sQLiteCursor2 = queryFinalized3;
                                        } catch (Exception e18) {
                                            e = e18;
                                            sQLitePreparedStatement = executeFast3;
                                            sQLiteCursor = queryFinalized3;
                                            yrVar3.o(e, true);
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase2 = yrVar3.b;
                                            if (sQLiteDatabase2 == null) {
                                            }
                                            sQLiteDatabase2.commitTransaction();
                                            return;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            sQLitePreparedStatement = executeFast3;
                                            sQLiteCursor = queryFinalized3;
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase = yrVar3.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    try {
                                        SQLitePreparedStatement executeFast4 = yrVar3.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                                        executeFast4.requery();
                                        executeFast4.bindLong(1, j11);
                                        executeFast4.bindInteger(2, i24);
                                        executeFast4.step();
                                        executeFast4.dispose();
                                        executeFast3 = yrVar3.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND date <= ?");
                                        executeFast3.requery();
                                        executeFast3.bindLong(1, j11);
                                        executeFast3.bindInteger(2, i23);
                                        executeFast3.step();
                                        executeFast3.dispose();
                                        sQLiteCursor3 = sQLiteCursor2;
                                    } catch (Exception e19) {
                                        e = e19;
                                        sQLitePreparedStatement = executeFast3;
                                        sQLiteCursor = sQLiteCursor2;
                                        yrVar3.o(e, true);
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        sQLiteDatabase2 = yrVar3.b;
                                        if (sQLiteDatabase2 == null) {
                                            return;
                                        }
                                        sQLiteDatabase2.commitTransaction();
                                        return;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        sQLitePreparedStatement = executeFast3;
                                        sQLiteCursor = sQLiteCursor2;
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase = yrVar3.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e20) {
                                    e = e20;
                                    sQLitePreparedStatement = executeFast3;
                                    sQLiteCursor = null;
                                } catch (Throwable th13) {
                                    th = th13;
                                    sQLitePreparedStatement = executeFast3;
                                    sQLiteCursor = null;
                                }
                            } catch (Exception e21) {
                                e = e21;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                yrVar3.o(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = yrVar3.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = yrVar3.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        try {
                            sQLitePreparedStatement2 = yrVar3.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ? WHERE did = ?");
                        } catch (Exception e22) {
                            e = e22;
                            sQLitePreparedStatement3 = null;
                        } catch (Throwable th15) {
                            th = th15;
                            sQLitePreparedStatement3 = null;
                        }
                        try {
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, max);
                            sQLitePreparedStatement2.bindInteger(2, i24);
                            sQLitePreparedStatement2.bindLong(3, j11);
                            sQLitePreparedStatement2.step();
                            sQLitePreparedStatement2.dispose();
                            yrVar3.b.commitTransaction();
                            if (yrVar3.u0(14, j11)) {
                                try {
                                    yrVar3.g2(j11, i7, i24);
                                } catch (Exception e23) {
                                    e = e23;
                                    sQLiteCursor = sQLiteCursor3;
                                    sQLitePreparedStatement = null;
                                    yrVar3.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = yrVar3.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th16) {
                                    th = th16;
                                    sQLiteCursor = sQLiteCursor3;
                                    sQLitePreparedStatement = null;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase = yrVar3.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (i11 == 0 || max != 0 || yrVar3.u0(13, j11)) {
                                sQLitePreparedStatement3 = null;
                            } else {
                                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                                longSparseIntArray.put(j11, max);
                                sQLitePreparedStatement3 = null;
                                try {
                                    yrVar3.W1(longSparseIntArray, null, true);
                                } catch (Exception e24) {
                                    e = e24;
                                    SQLiteCursor sQLiteCursor4 = sQLiteCursor3;
                                    sQLitePreparedStatement = sQLitePreparedStatement3;
                                    sQLiteCursor = sQLiteCursor4;
                                    yrVar3.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = yrVar3.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th17) {
                                    th = th17;
                                    SQLiteCursor sQLiteCursor5 = sQLiteCursor3;
                                    sQLitePreparedStatement = sQLitePreparedStatement3;
                                    sQLiteCursor = sQLiteCursor5;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase = yrVar3.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(Long.valueOf(j11));
                            yrVar3.l2(arrayList3);
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                            }
                            sQLiteDatabase2 = yrVar3.b;
                            if (sQLiteDatabase2 == null) {
                                return;
                            }
                        } catch (Exception e25) {
                            e = e25;
                            sQLiteCursor = sQLiteCursor3;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            yrVar3.o(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            sQLiteDatabase2 = yrVar3.b;
                            if (sQLiteDatabase2 == null) {
                            }
                            sQLiteDatabase2.commitTransaction();
                            return;
                        } catch (Throwable th18) {
                            th = th18;
                            sQLiteCursor = sQLiteCursor3;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            sQLiteDatabase = yrVar3.b;
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e26) {
                        e = e26;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th19) {
                        th = th19;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = queryFinalized;
                    }
                } catch (Exception e27) {
                    e = e27;
                    sQLiteCursor = null;
                    sQLitePreparedStatement = null;
                } catch (Throwable th20) {
                    th = th20;
                    sQLiteCursor = null;
                    sQLitePreparedStatement = null;
                }
                sQLiteDatabase2.commitTransaction();
                return;
        }
    }

    public /* synthetic */ br(yr yrVar, long j3, int i7, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.b = yrVar;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }
}
