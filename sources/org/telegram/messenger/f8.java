package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f8 {
    public p5 a;
    public final int b;
    public SQLiteDatabase c;
    public File d;
    public File e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final e8 g = new e8();
    public boolean h;

    public f8(int i7) {
        this.b = i7;
    }

    public final void a() {
        File h = t0.h();
        int i7 = this.b;
        if (i7 != 0) {
            File file = new File(h, jg.g.k(i7, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            g0.E(this.d, file2);
            a8.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, boolean z9) {
        boolean E;
        File h = t0.h();
        int i10 = this.b;
        if (i10 != 0) {
            File file = new File(h, jg.g.k(i10, "account", "/"));
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
            if (exists) {
                int intValue = this.c.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (r2.a) {
                    a8.b("current files db version = " + intValue);
                }
                if (intValue == 0) {
                    throw new Exception("malformed");
                }
                g(intValue);
            } else {
                this.c.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, flags INTEGER, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.c.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
                this.c.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER, message_id INTEGER, message_type INTEGER);").stepThis().dispose();
                this.c.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            }
            if (!z9) {
                a();
            }
            a8.b("files db created from_backup= " + z9);
        } catch (Exception e10) {
            if (i7 < 4) {
                if (!z9) {
                    File h7 = t0.h();
                    if (i10 != 0) {
                        File file2 = new File(h7, jg.g.k(i10, "account", "/"));
                        file2.mkdirs();
                        h7 = file2;
                    }
                    File file3 = new File(h7, "file_to_path_backup.db");
                    if (file3.exists()) {
                        try {
                            E = g0.E(file3, this.d);
                        } catch (IOException e11) {
                            a8.g(e11, true);
                            E = false;
                            if (E) {
                            }
                            this.d.delete();
                            this.e.delete();
                            b(i7 + 1, false);
                            boolean z10 = r2.a;
                            a8.g(e10, true);
                        }
                        if (E) {
                            b(i7 + 1, true);
                            return;
                        }
                    }
                    E = false;
                    if (E) {
                    }
                }
                this.d.delete();
                this.e.delete();
                b(i7 + 1, false);
            }
            boolean z102 = r2.a;
            a8.g(e10, true);
        }
    }

    public final void c() {
        if (this.h) {
            return;
        }
        if (!as.a) {
            int i7 = 0;
            while (!as.a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                i7++;
                if (i7 > 5) {
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
                try {
                    if (this.a == null) {
                        p5 p5Var = new p5("files_database_queue_" + this.b);
                        this.a = p5Var;
                        p5Var.setPriority(10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e8 e(File file, e8 e8Var) {
        int i7;
        int i10;
        SQLiteCursor sQLiteCursor = null;
        if (file == null) {
            return null;
        }
        if (e8Var == null) {
            e8Var = this.g;
        }
        int i11 = 0;
        long j3 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.c;
                StringBuilder sb2 = new StringBuilder("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = '");
                try {
                    sb2.append(file.getPath().replace("'", "").replace("\"", ""));
                    sb2.append("'");
                    sQLiteCursor = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                    if (sQLiteCursor.next()) {
                        j3 = sQLiteCursor.longValue(0);
                        i7 = sQLiteCursor.intValue(1);
                        try {
                            i11 = i7;
                            i10 = sQLiteCursor.intValue(2);
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            i11 = i7;
                            i10 = 0;
                            e8Var.a = j3;
                            e8Var.b = i11;
                            e8Var.c = i10;
                            return e8Var;
                        }
                    } else {
                        i10 = 0;
                    }
                    sQLiteCursor.dispose();
                } catch (Exception e11) {
                    e = e11;
                    i7 = 0;
                    a8.g(e, true);
                    i11 = i7;
                    i10 = 0;
                    e8Var.a = j3;
                    e8Var.b = i11;
                    e8Var.c = i10;
                    return e8Var;
                }
            } catch (Exception e12) {
                e = e12;
            }
            e8Var.a = j3;
            e8Var.b = i11;
            e8Var.c = i10;
            return e8Var;
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(final int i7, final int i10, final long j3, boolean z9) {
        int i11;
        boolean z10;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        String str;
        final long currentTimeMillis = System.currentTimeMillis();
        String str2 = j3 + "_" + i7 + "_" + i10;
        ConcurrentHashMap concurrentHashMap = this.f;
        String str3 = (String) concurrentHashMap.get(str2);
        String str4 = null;
        if (str3 == "~null~") {
            boolean z11 = r2.a;
            a8.b("get file path cached null id=" + j3 + " dc=" + i7 + " type=" + i10 + " path=null in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return null;
        }
        if (str3 != null) {
            boolean z12 = r2.a;
            a8.b("get file path cached id=" + j3 + " dc=" + i7 + " type=" + i10 + " path=" + str3 + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return str3;
        }
        if (this.a != null) {
            i11 = 0;
            if (Thread.currentThread() == this.a) {
                z10 = false;
                if (!z10) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final String[] strArr = new String[1];
                    h(new Runnable() { // from class: org.telegram.messenger.b8
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
                        
                            if (r10 == null) goto L20;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            long j10 = j3;
                            int i12 = i7;
                            int i13 = i10;
                            String[] strArr2 = strArr;
                            long j11 = currentTimeMillis;
                            f8 f8Var = f8.this;
                            f8Var.c();
                            SQLiteDatabase sQLiteDatabase = f8Var.c;
                            if (sQLiteDatabase != null) {
                                SQLiteCursor sQLiteCursor3 = null;
                                try {
                                    sQLiteCursor3 = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j10 + " AND dc_id = " + i12 + " AND type = " + i13, new Object[0]);
                                    if (sQLiteCursor3.next()) {
                                        strArr2[0] = sQLiteCursor3.stringValue(0);
                                        boolean z13 = r2.a;
                                        a8.b("get file path id=" + j10 + " dc=" + i12 + " type=" + i13 + " path=" + strArr2[0] + " in " + (System.currentTimeMillis() - j11) + "ms");
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        a8.g(th2, true);
                                    } catch (Throwable th3) {
                                        if (sQLiteCursor3 != null) {
                                            sQLiteCursor3.dispose();
                                        }
                                        throw th3;
                                    }
                                }
                                sQLiteCursor3.dispose();
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await();
                    } catch (Exception unused) {
                    }
                    String str5 = strArr[i11];
                    if (str5 != null) {
                        concurrentHashMap.put(str2, str5);
                    } else {
                        concurrentHashMap.put(str2, "~null~");
                    }
                    return strArr[i11];
                }
                SQLiteDatabase sQLiteDatabase = this.c;
                try {
                    if (sQLiteDatabase == null) {
                        return null;
                    }
                    try {
                        int i12 = i11;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j3 + " AND dc_id = " + i7 + " AND type = " + i10, new Object[i12]);
                        try {
                            if (sQLiteCursor2.next()) {
                                str = sQLiteCursor2.stringValue(i12);
                                try {
                                    boolean z13 = r2.a;
                                    a8.b("get file path id=" + j3 + " dc=" + i7 + " type=" + i10 + " path=" + str + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    str4 = str;
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    a8.g(e, true);
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
                        } catch (SQLiteException e11) {
                            e = e11;
                            str = null;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        sQLiteCursor2 = null;
                        str = null;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = 0;
                        if (sQLiteCursor != 0) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                    if (str == null) {
                        concurrentHashMap.put(str2, str);
                    } else {
                        concurrentHashMap.put(str2, "~null~");
                    }
                    return str;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = this;
                }
            }
        } else {
            i11 = 0;
        }
        z10 = z9;
        if (!z10) {
        }
    }

    public final void g(int i7) {
        if (i7 == 1) {
            jg.g.z(this.c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            jg.g.z(this.c, "PRAGMA user_version = 2");
            i7 = 2;
        }
        if (i7 == 2) {
            jg.g.z(this.c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            jg.g.z(this.c, "PRAGMA user_version = 3");
            i7 = 3;
        }
        if (i7 == 3) {
            jg.g.z(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            jg.g.z(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            jg.g.z(this.c, "PRAGMA user_version = 4");
            i7 = 4;
        }
        if (i7 == 4 || i7 == 5 || i7 == 6) {
            try {
                this.c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
            jg.g.z(this.c, "PRAGMA user_version = 7");
        }
    }

    public final void h(Runnable runnable) {
        d();
        this.a.c(runnable);
    }
}
