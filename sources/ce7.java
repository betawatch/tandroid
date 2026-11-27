// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ce7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ce7(kf7 kf7Var, ArrayList arrayList, int i) {
        this.a = (byte) 2;
        this.b = kf7Var;
        this.d = arrayList;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v33 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        Exception e;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase3;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r2 = null;
        SQLiteCursor sQLiteCursor = null;
        r2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        sQLitePreparedStatement2 = null;
        int i = 0;
        int i2 = this.c;
        ArrayList arrayList2 = this.d;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                if (i2 == 1) {
                    try {
                        try {
                            kf7Var.b.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
                        } catch (Exception e2) {
                            e = e2;
                            kf7Var.p(e, true);
                            sQLiteDatabase2 = kf7Var.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement2 == null) {
                                sQLitePreparedStatement2.dispose();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = kf7Var.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                }
                kf7Var.b.beginTransaction();
                SQLiteDatabase sQLiteDatabase4 = kf7Var.b;
                SQLitePreparedStatement executeFast = i2 != 0 ? sQLiteDatabase4.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)") : sQLiteDatabase4.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
                try {
                    int size = arrayList2.size();
                    while (i < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i);
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(wallPaper.getObjectSize());
                        wallPaper.serializeToStream(nativeByteBuffer);
                        if (i2 != 0) {
                            executeFast.bindLong(1, wallPaper.id);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            if (i2 < 0) {
                                executeFast.bindInteger(3, i2);
                            } else {
                                executeFast.bindInteger(3, i2 == 2 ? -1 : i);
                            }
                        } else {
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindLong(2, wallPaper.id);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        i++;
                    }
                    executeFast.dispose();
                    kf7Var.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase5 = kf7Var.b;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    sQLitePreparedStatement2 = executeFast;
                    e = e3;
                    kf7Var.p(e, true);
                    sQLiteDatabase2 = kf7Var.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement2 == null) {
                    }
                } catch (Throwable th3) {
                    sQLitePreparedStatement2 = executeFast;
                    th = th3;
                    sQLiteDatabase = kf7Var.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            case 1:
                try {
                    kf7Var.b.beginTransaction();
                    kf7Var.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i2).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
                    if (arrayList2.isEmpty()) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i2);
                        executeFast2.bindLong(2, -1L);
                        executeFast2.bindInteger(3, 0);
                        executeFast2.step();
                    } else {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            long j = ((jf7) arrayList2.get(i)).a;
                            executeFast2.requery();
                            executeFast2.bindInteger(1, i2);
                            executeFast2.bindLong(2, j);
                            executeFast2.bindInteger(3, i);
                            executeFast2.step();
                            i++;
                        }
                    }
                    executeFast2.dispose();
                    kf7Var.b.commitTransaction();
                    return;
                } catch (Exception e4) {
                    kf7Var.p(e4, true);
                    return;
                }
            default:
                SQLitePreparedStatement sQLitePreparedStatement3 = "SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (";
                try {
                    try {
                        try {
                            arrayList = new ArrayList();
                            sQLiteDatabase3 = kf7Var.b;
                            Locale locale = Locale.US;
                        } catch (Exception e5) {
                            e = e5;
                        }
                        try {
                            SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                            while (queryFinalized.next()) {
                                try {
                                    long longValue = queryFinalized.longValue(0);
                                    if (queryFinalized.intValue(1) == i2 && !wf3.B(longValue) && !wf3.C(longValue)) {
                                        arrayList.add(Long.valueOf(queryFinalized.longValue(0)));
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    sQLiteCursor = queryFinalized;
                                    sQLitePreparedStatement = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor2 = queryFinalized;
                                    sQLitePreparedStatement3 = 0;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement3 != 0) {
                                        sQLitePreparedStatement3.dispose();
                                    }
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                try {
                                    long longValue2 = ((Long) arrayList.get(i3)).longValue();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindInteger(1, 0);
                                    sQLitePreparedStatement.bindLong(2, longValue2);
                                    sQLitePreparedStatement.step();
                                } catch (Exception e7) {
                                    e = e7;
                                    kf7Var.p(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement == null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                }
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        } catch (Exception e8) {
                            e = e8;
                            sQLitePreparedStatement = null;
                            kf7Var.p(e, true);
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement == null) {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLitePreparedStatement3 = 0;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                break;
        }
    }

    public /* synthetic */ ce7(kf7 kf7Var, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = i;
        this.d = arrayList;
    }
}
