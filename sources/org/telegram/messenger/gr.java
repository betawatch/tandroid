package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ gr(hs hsVar, int i10, int i11, int i12, int i13, long j10) {
        this.a = 0;
        this.b = hsVar;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
        this.c = j10;
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
        int i10;
        int i11;
        int i12;
        int max;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        int intValue2;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                int i13 = this.d;
                int i14 = this.e;
                int i15 = this.f;
                int i16 = this.h;
                long j10 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement4 = null;
                try {
                    try {
                        int max2 = Math.max(i13, i14) + i15;
                        SparseArray sparseArray = new SparseArray();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i16));
                        sparseArray.put(max2, arrayList);
                        i0.g3(new tr(hsVar, j10, arrayList, 5));
                        SQLitePreparedStatement executeFast2 = hsVar.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                            try {
                                int keyAt = sparseArray.keyAt(i17);
                                ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                    executeFast2.requery();
                                    executeFast2.bindInteger(1, ((Integer) arrayList2.get(i18)).intValue());
                                    executeFast2.bindLong(2, j10);
                                    executeFast2.bindInteger(3, keyAt);
                                    executeFast2.bindInteger(4, 1);
                                    executeFast2.step();
                                }
                            } catch (Exception e) {
                                e = e;
                                sQLitePreparedStatement4 = executeFast2;
                                hsVar.o(e, true);
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
                        SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid = " + i16 + " AND uid = " + j10).stepThis().dispose();
                        hsVar.getMessagesController().n0(max2, j10, sparseArray);
                        return;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 1:
                hs hsVar2 = this.b;
                long j11 = this.c;
                int i19 = this.d;
                int i20 = this.e;
                int i21 = this.f;
                int i22 = this.h;
                SQLitePreparedStatement sQLitePreparedStatement5 = null;
                try {
                    try {
                        executeFast = hsVar2.b.executeFast("REPLACE INTO widget_heights VALUES(?, ?, ?, ?, ?, ?)");
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, i19);
                    executeFast.bindInteger(3, i20);
                    executeFast.bindInteger(4, i21);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.bindInteger(6, i22);
                    executeFast.step();
                    executeFast.dispose();
                    SQLiteDatabase sQLiteDatabase4 = hsVar2.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase4.executeFast("DELETE FROM widget_heights WHERE uid = " + j11 + " AND mid = " + i19 + " AND width NOT IN (SELECT width FROM widget_heights WHERE uid = " + j11 + " AND mid = " + i19 + " ORDER BY date DESC LIMIT 4)").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    e = e11;
                    sQLitePreparedStatement5 = executeFast;
                    hsVar2.o(e, true);
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
                hs hsVar3 = this.b;
                long j12 = this.c;
                int i23 = this.d;
                int i24 = this.f;
                int i25 = this.h;
                try {
                    SQLiteCursor queryFinalized = hsVar3.b.queryFinalized("SELECT unread_count, inbox_max, last_mid FROM dialogs WHERE did = " + j12, new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            try {
                                intValue = queryFinalized.intValue(0);
                                int intValue3 = queryFinalized.intValue(1);
                                longValue = queryFinalized.longValue(2);
                                i10 = intValue3;
                                i11 = intValue;
                            } catch (Exception e12) {
                                e = e12;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    hsVar3.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = hsVar3.b;
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
                                    sQLiteDatabase = hsVar3.b;
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
                                sQLiteDatabase = hsVar3.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            intValue = 0;
                            i11 = 0;
                            longValue = 0;
                            i10 = 0;
                        }
                        queryFinalized.dispose();
                        hsVar3.b.beginTransaction();
                        boolean C = o5.C(j12);
                        int i26 = this.e;
                        if (C) {
                            i12 = i11;
                            sQLitePreparedStatement2 = hsVar3.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid >= ? AND read_state IN(0,2) AND out = 0");
                            try {
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindLong(1, j12);
                                sQLitePreparedStatement2.bindInteger(2, i25);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                                if (i25 <= longValue) {
                                    sQLiteCursor3 = null;
                                    max = 0;
                                } else {
                                    SQLiteCursor queryFinalized2 = hsVar3.b.queryFinalized("SELECT changes()", new Object[0]);
                                    try {
                                        if (queryFinalized2.next()) {
                                            try {
                                                intValue2 = queryFinalized2.intValue(0) + i26;
                                            } catch (Exception e13) {
                                                e = e13;
                                                sQLiteCursor = queryFinalized2;
                                                sQLitePreparedStatement = null;
                                                hsVar3.o(e, true);
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase2 = hsVar3.b;
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
                                                sQLiteDatabase = hsVar3.b;
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
                                    } catch (Exception e14) {
                                        e = e14;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = queryFinalized2;
                                        hsVar3.o(e, true);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase2 = hsVar3.b;
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
                                        sQLiteDatabase = hsVar3.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e15) {
                                e = e15;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = sQLitePreparedStatement2;
                                hsVar3.o(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = hsVar3.b;
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
                                sQLiteDatabase = hsVar3.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            try {
                                i25 = Math.max(i10, i23);
                                SQLitePreparedStatement executeFast3 = hsVar3.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
                                try {
                                    executeFast3.requery();
                                    executeFast3.bindLong(1, j12);
                                    executeFast3.bindInteger(2, i25);
                                    executeFast3.step();
                                    executeFast3.dispose();
                                    i12 = i11;
                                    if (i25 >= longValue) {
                                        sQLiteCursor2 = null;
                                        max = 0;
                                    } else {
                                        SQLiteCursor queryFinalized3 = hsVar3.b.queryFinalized("SELECT changes()", new Object[0]);
                                        try {
                                            int intValue4 = queryFinalized3.next() ? i26 + queryFinalized3.intValue(0) : 0;
                                            queryFinalized3.dispose();
                                            max = Math.max(0, intValue - intValue4);
                                            sQLiteCursor2 = queryFinalized3;
                                        } catch (Exception e16) {
                                            e = e16;
                                            sQLitePreparedStatement = executeFast3;
                                            sQLiteCursor = queryFinalized3;
                                            hsVar3.o(e, true);
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase2 = hsVar3.b;
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
                                            sQLiteDatabase = hsVar3.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    try {
                                        SQLitePreparedStatement executeFast4 = hsVar3.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                                        executeFast4.requery();
                                        executeFast4.bindLong(1, j12);
                                        executeFast4.bindInteger(2, i25);
                                        executeFast4.step();
                                        executeFast4.dispose();
                                        executeFast3 = hsVar3.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND date <= ?");
                                        executeFast3.requery();
                                        executeFast3.bindLong(1, j12);
                                        executeFast3.bindInteger(2, i24);
                                        executeFast3.step();
                                        executeFast3.dispose();
                                        sQLiteCursor3 = sQLiteCursor2;
                                    } catch (Exception e17) {
                                        e = e17;
                                        sQLitePreparedStatement = executeFast3;
                                        sQLiteCursor = sQLiteCursor2;
                                        hsVar3.o(e, true);
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        sQLiteDatabase2 = hsVar3.b;
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
                                        sQLiteDatabase = hsVar3.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    sQLitePreparedStatement = executeFast3;
                                    sQLiteCursor = null;
                                } catch (Throwable th13) {
                                    th = th13;
                                    sQLitePreparedStatement = executeFast3;
                                    sQLiteCursor = null;
                                }
                            } catch (Exception e19) {
                                e = e19;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                hsVar3.o(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = hsVar3.b;
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
                                sQLiteDatabase = hsVar3.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        try {
                            sQLitePreparedStatement2 = hsVar3.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ? WHERE did = ?");
                        } catch (Exception e20) {
                            e = e20;
                            sQLitePreparedStatement3 = null;
                        } catch (Throwable th15) {
                            th = th15;
                            sQLitePreparedStatement3 = null;
                        }
                        try {
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, max);
                            sQLitePreparedStatement2.bindInteger(2, i25);
                            sQLitePreparedStatement2.bindLong(3, j12);
                            sQLitePreparedStatement2.step();
                            sQLitePreparedStatement2.dispose();
                            hsVar3.b.commitTransaction();
                            if (hsVar3.u0(14, j12)) {
                                try {
                                    hsVar3.g2(j12, i10, i25);
                                } catch (Exception e21) {
                                    e = e21;
                                    sQLiteCursor = sQLiteCursor3;
                                    sQLitePreparedStatement = null;
                                    hsVar3.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = hsVar3.b;
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
                                    sQLiteDatabase = hsVar3.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (i12 == 0 || max != 0 || hsVar3.u0(13, j12)) {
                                sQLitePreparedStatement3 = null;
                            } else {
                                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                                longSparseIntArray.put(j12, max);
                                sQLitePreparedStatement3 = null;
                                try {
                                    hsVar3.W1(longSparseIntArray, null, true);
                                } catch (Exception e22) {
                                    e = e22;
                                    SQLiteCursor sQLiteCursor4 = sQLiteCursor3;
                                    sQLitePreparedStatement = sQLitePreparedStatement3;
                                    sQLiteCursor = sQLiteCursor4;
                                    hsVar3.o(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = hsVar3.b;
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
                                    sQLiteDatabase = hsVar3.b;
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(Long.valueOf(j12));
                            hsVar3.l2(arrayList3);
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                            }
                            sQLiteDatabase2 = hsVar3.b;
                            if (sQLiteDatabase2 == null) {
                                return;
                            }
                        } catch (Exception e23) {
                            e = e23;
                            sQLiteCursor = sQLiteCursor3;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            hsVar3.o(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            sQLiteDatabase2 = hsVar3.b;
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
                            sQLiteDatabase = hsVar3.b;
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e24) {
                        e = e24;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th19) {
                        th = th19;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = queryFinalized;
                    }
                } catch (Exception e25) {
                    e = e25;
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

    public /* synthetic */ gr(hs hsVar, long j10, int i10, int i11, int i12, int i13, int i14) {
        this.a = i14;
        this.b = hsVar;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }
}
