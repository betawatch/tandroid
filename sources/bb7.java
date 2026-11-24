// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class bb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ bb7(ad7 ad7Var, int i, long j, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = i;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        long j = this.d;
        int i = this.c;
        ad7 ad7Var = this.b;
        try {
            try {
                try {
                    switch (b) {
                        case 0:
                            try {
                                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                                Locale locale = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i + " WHERE did = " + j).stepThis().dispose();
                                return;
                            } catch (SQLiteException e) {
                                ad7Var.n(e, true);
                                return;
                            }
                        case 1:
                            ad7Var.x0(i, j);
                            return;
                        case 2:
                            try {
                                sQLitePreparedStatement = ad7Var.b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                            } catch (Exception e2) {
                                ad7Var.n(e2, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                            }
                            return;
                        case 3:
                            try {
                                sQLitePreparedStatement = ad7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                            } catch (Exception e3) {
                                ad7Var.n(e3, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                            }
                            return;
                        case 4:
                            ad7Var.getClass();
                            try {
                                SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                                Locale locale2 = Locale.US;
                                sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i + " AND uid = " + j).stepThis().dispose();
                                return;
                            } catch (Exception e4) {
                                ad7Var.n(e4, true);
                                return;
                            }
                        case 5:
                            try {
                                SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                                executeFast.bindInteger(1, i);
                                executeFast.bindLong(2, -j);
                                executeFast.step();
                                executeFast.dispose();
                                return;
                            } catch (Exception e5) {
                                ad7Var.n(e5, true);
                                return;
                            }
                        case 6:
                            try {
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j + " AND type = " + i).stepThis().dispose();
                                return;
                            } catch (Exception e6) {
                                ad7Var.n(e6, true);
                                return;
                            }
                        default:
                            try {
                                sQLitePreparedStatement = ad7Var.b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, i);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                            } catch (Exception e7) {
                                ad7Var.n(e7, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                            }
                            return;
                    }
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th3;
        }
    }
}
