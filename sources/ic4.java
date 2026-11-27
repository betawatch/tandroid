// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ic4 {
    public to3 a;
    public final int b;
    public SQLiteDatabase c;
    public File d;
    public File e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final hc4 g = new hc4();
    public boolean h;

    public ic4(int i) {
        this.b = i;
    }

    public final void a() {
        File h = a.h();
        int i = this.b;
        if (i != 0) {
            File file = new File(h, qd4.n(i, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            hl.E(this.d, file2);
            cc4.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z) {
        boolean E;
        File h = a.h();
        int i2 = this.b;
        if (i2 != 0) {
            File file = new File(h, qd4.n(i2, "account", "/"));
            file.mkdirs();
            h = file;
        }
        this.d = new File(h, "file_to_path.db");
        this.e = new File(h, "file_to_path.db-shm");
        boolean exists = this.d.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.d.getPath());
            this.c = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.c.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.c;
            if (exists) {
                int intValue = sQLiteDatabase2.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (f11.a) {
                    cc4.b("current files db version = " + intValue);
                }
                if (intValue == 0) {
                    throw new Exception("malformed");
                }
                g(intValue);
            } else {
                sQLiteDatabase2.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, flags INTEGER, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.c.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
                this.c.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER, message_id INTEGER, message_type INTEGER);").stepThis().dispose();
                this.c.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            }
            if (!z) {
                a();
            }
            cc4.b("files db created from_backup= " + z);
        } catch (Exception e) {
            if (i < 4) {
                if (!z) {
                    File h2 = a.h();
                    if (i2 != 0) {
                        File file2 = new File(h2, qd4.n(i2, "account", "/"));
                        file2.mkdirs();
                        h2 = file2;
                    }
                    File file3 = new File(h2, "file_to_path_backup.db");
                    if (file3.exists()) {
                        try {
                            E = hl.E(file3, this.d);
                        } catch (IOException e2) {
                            cc4.g(e2, true);
                            E = false;
                            if (E) {
                            }
                            this.d.delete();
                            this.e.delete();
                            b(i + 1, false);
                            boolean z2 = f11.a;
                            cc4.g(e, true);
                        }
                        if (E) {
                            b(i + 1, true);
                            return;
                        }
                    }
                    E = false;
                    if (E) {
                    }
                }
                this.d.delete();
                this.e.delete();
                b(i + 1, false);
            }
            boolean z22 = f11.a;
            cc4.g(e, true);
        }
    }

    public final void c() {
        if (this.h) {
            return;
        }
        if (!ok7.a) {
            int i = 0;
            while (!ok7.a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i > 5) {
                    break;
                }
            }
        }
        b(0, false);
        this.h = true;
    }

    public final void d() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    to3 to3Var = new to3("files_database_queue_" + this.b);
                    this.a = to3Var;
                    to3Var.setPriority(10);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hc4 e(File file, hc4 hc4Var) {
        int i;
        int i2;
        SQLiteCursor sQLiteCursor = null;
        if (file == null) {
            return null;
        }
        if (hc4Var == null) {
            hc4Var = this.g;
        }
        int i3 = 0;
        long j = 0;
        try {
            try {
            } finally {
                if (0 != 0) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            sQLiteCursor = this.c.queryFinalized("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = ?", file.getPath().replace("'", "").replace("\"", ""));
            if (sQLiteCursor.next()) {
                j = sQLiteCursor.longValue(0);
                i = sQLiteCursor.intValue(1);
                try {
                    i3 = i;
                    i2 = sQLiteCursor.intValue(2);
                } catch (Exception e2) {
                    e = e2;
                    cc4.g(e, true);
                    i3 = i;
                    i2 = 0;
                    hc4Var.a = j;
                    hc4Var.b = i3;
                    hc4Var.c = i2;
                    return hc4Var;
                }
            } else {
                i2 = 0;
            }
            sQLiteCursor.dispose();
        } catch (Exception e3) {
            e = e3;
            i = 0;
            cc4.g(e, true);
            i3 = i;
            i2 = 0;
            hc4Var.a = j;
            hc4Var.b = i3;
            hc4Var.c = i2;
            return hc4Var;
        }
        hc4Var.a = j;
        hc4Var.b = i3;
        hc4Var.c = i2;
        return hc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(final int i, final int i2, final long j, boolean z) {
        int i3;
        boolean z2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        String str;
        final long currentTimeMillis = System.currentTimeMillis();
        String str2 = j + "_" + i + "_" + i2;
        ConcurrentHashMap concurrentHashMap = this.f;
        String str3 = (String) concurrentHashMap.get(str2);
        String str4 = null;
        if (str3 == "~null~") {
            boolean z3 = f11.a;
            cc4.b("get file path cached null id=" + j + " dc=" + i + " type=" + i2 + " path=null in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return null;
        }
        if (str3 != null) {
            boolean z4 = f11.a;
            cc4.b("get file path cached id=" + j + " dc=" + i + " type=" + i2 + " path=" + str3 + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return str3;
        }
        if (this.a != null) {
            i3 = 0;
            if (Thread.currentThread() == this.a) {
                z2 = false;
                if (!z2) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final String[] strArr = new String[1];
                    h(new Runnable() { // from class: ec4
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j2 = j;
                            int i4 = i;
                            byte b = i2;
                            String[] strArr2 = strArr;
                            long j3 = currentTimeMillis;
                            ic4 ic4Var = ic4.this;
                            ic4Var.c();
                            SQLiteDatabase sQLiteDatabase = ic4Var.c;
                            if (sQLiteDatabase != null) {
                                SQLiteCursor sQLiteCursor3 = null;
                                try {
                                    sQLiteCursor3 = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j2 + " AND dc_id = " + i4 + " AND type = " + ((int) b), new Object[0]);
                                    if (sQLiteCursor3.next()) {
                                        strArr2[0] = sQLiteCursor3.stringValue(0);
                                        boolean z5 = f11.a;
                                        cc4.b("get file path id=" + j2 + " dc=" + i4 + " type=" + ((int) b) + " path=" + strArr2[0] + " in " + (System.currentTimeMillis() - j3) + "ms");
                                    }
                                } catch (Throwable th) {
                                    try {
                                        cc4.g(th, true);
                                    } finally {
                                        if (sQLiteCursor3 != null) {
                                            sQLiteCursor3.dispose();
                                        }
                                    }
                                }
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await();
                    } catch (Exception unused) {
                    }
                    String str5 = strArr[i3];
                    if (str5 != null) {
                        concurrentHashMap.put(str2, str5);
                    } else {
                        concurrentHashMap.put(str2, "~null~");
                    }
                    return strArr[i3];
                }
                SQLiteDatabase sQLiteDatabase = this.c;
                if (sQLiteDatabase == null) {
                    return null;
                }
                try {
                    int i4 = i3;
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + i2, new Object[i4]);
                    try {
                        try {
                            if (sQLiteCursor2.next()) {
                                str = sQLiteCursor2.stringValue(i4);
                                try {
                                    boolean z5 = f11.a;
                                    cc4.b("get file path id=" + j + " dc=" + i + " type=" + i2 + " path=" + str + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    str4 = str;
                                } catch (SQLiteException e) {
                                    e = e;
                                    cc4.g(e, true);
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (str == null) {
                                    }
                                    return str;
                                }
                            }
                            sQLiteCursor2.dispose();
                            str = str4;
                        } catch (SQLiteException e2) {
                            e = e2;
                            str = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = sQLiteCursor2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    sQLiteCursor2 = null;
                    str = null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                if (str == null) {
                    concurrentHashMap.put(str2, str);
                } else {
                    concurrentHashMap.put(str2, "~null~");
                }
                return str;
            }
        } else {
            i3 = 0;
        }
        z2 = z;
        if (!z2) {
        }
    }

    public final void g(int i) {
        if (i == 1) {
            bs2.y(this.c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            bs2.y(this.c, "PRAGMA user_version = 2");
            i = 2;
        }
        if (i == 2) {
            bs2.y(this.c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            bs2.y(this.c, "PRAGMA user_version = 3");
            i = 3;
        }
        if (i == 3) {
            bs2.y(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            bs2.y(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            bs2.y(this.c, "PRAGMA user_version = 4");
            i = 4;
        }
        if (i == 4 || i == 5 || i == 6) {
            try {
                this.c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
            bs2.y(this.c, "PRAGMA user_version = 7");
        }
    }

    public final void h(Runnable runnable) {
        d();
        this.a.c(runnable);
    }
}
