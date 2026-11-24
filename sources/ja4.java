// default package

import j$.util.concurrent.ConcurrentHashMap;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja4 implements Runnable {
    public final /* synthetic */ la4 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ja4(la4 la4Var, long j, int i, int i2, String str, int i3) {
        this.a = la4Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        boolean z = this.f;
        la4 la4Var = this.a;
        ConcurrentHashMap concurrentHashMap = la4Var.f;
        boolean z2 = w01.a;
        StringBuilder sb = new StringBuilder("put file path id=");
        long j = this.b;
        sb.append(j);
        sb.append(" dc=");
        int i = this.c;
        sb.append(i);
        sb.append(" type=");
        byte b = this.d;
        sb.append((int) b);
        sb.append(" path=");
        String str = this.e;
        sb.append(str);
        fa4.b(sb.toString());
        la4Var.c();
        SQLiteDatabase sQLiteDatabase = la4Var.c;
        if (sQLiteDatabase == null) {
            return;
        }
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        sQLitePreparedStatement3 = null;
        sQLitePreparedStatement3 = null;
        try {
            if (str != null) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("DELETE FROM paths WHERE path = ?");
                try {
                    executeFast.bindString(1, str);
                    executeFast.step();
                    sQLitePreparedStatement4 = la4Var.c.executeFast("REPLACE INTO paths VALUES(?, ?, ?, ?, ?)");
                    sQLitePreparedStatement4.requery();
                    sQLitePreparedStatement4.bindLong(1, j);
                    sQLitePreparedStatement4.bindInteger(2, i);
                    sQLitePreparedStatement4.bindInteger(3, b);
                    sQLitePreparedStatement4.bindString(4, str);
                    sQLitePreparedStatement4.bindInteger(5, z ? 1 : 0);
                    sQLitePreparedStatement4.step();
                    sQLitePreparedStatement4.dispose();
                    concurrentHashMap.put(j + "_" + i + "_" + ((int) b), str);
                    sQLitePreparedStatement2 = sQLitePreparedStatement4;
                    sQLitePreparedStatement3 = executeFast;
                } catch (SQLiteException e) {
                    e = e;
                    sQLitePreparedStatement = sQLitePreparedStatement4;
                    sQLitePreparedStatement3 = executeFast;
                    try {
                        fa4.g(e, true);
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = sQLitePreparedStatement4;
                    sQLitePreparedStatement3 = executeFast;
                    if (sQLitePreparedStatement3 != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
            } else {
                sQLiteDatabase.executeFast("DELETE FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + ((int) b)).stepThis().dispose();
                concurrentHashMap.put(j + "_" + i + "_" + ((int) b), "~null~");
                sQLitePreparedStatement2 = null;
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
            if (sQLitePreparedStatement2 != null) {
                sQLitePreparedStatement2.dispose();
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatement3;
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = sQLitePreparedStatement3;
        }
    }
}
