package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k8 {
    public r5 a;
    public final int b;
    public SQLiteDatabase c;
    public File d;
    public File e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final j8 g = new j8();
    public boolean h;

    public k8(int i10) {
        this.b = i10;
    }

    public final void a() {
        File h = w0.h();
        int i10 = this.b;
        if (i10 != 0) {
            File file = new File(h, i0.a.j(i10, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            i0.E(this.d, file2);
            f8.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, boolean z10) {
        boolean E;
        File h = w0.h();
        int i11 = this.b;
        if (i11 != 0) {
            File file = new File(h, i0.a.j(i11, "account", "/"));
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
                if (v2.a) {
                    f8.b("current files db version = " + intValue);
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
            if (!z10) {
                a();
            }
            f8.b("files db created from_backup= " + z10);
        } catch (Exception e) {
            if (i10 < 4) {
                if (!z10) {
                    File h10 = w0.h();
                    if (i11 != 0) {
                        File file2 = new File(h10, i0.a.j(i11, "account", "/"));
                        file2.mkdirs();
                        h10 = file2;
                    }
                    File file3 = new File(h10, "file_to_path_backup.db");
                    if (file3.exists()) {
                        try {
                            E = i0.E(file3, this.d);
                        } catch (IOException e7) {
                            f8.g(e7, true);
                            E = false;
                            if (E) {
                            }
                            this.d.delete();
                            this.e.delete();
                            b(i10 + 1, false);
                            boolean z11 = v2.a;
                            f8.g(e, true);
                        }
                        if (E) {
                            b(i10 + 1, true);
                            return;
                        }
                    }
                    E = false;
                    if (E) {
                    }
                }
                this.d.delete();
                this.e.delete();
                b(i10 + 1, false);
            }
            boolean z112 = v2.a;
            f8.g(e, true);
        }
    }

    public final void c() {
        if (this.h) {
            return;
        }
        if (!js.a) {
            int i10 = 0;
            while (!js.a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i10++;
                if (i10 > 5) {
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
                        r5 r5Var = new r5("files_database_queue_" + this.b);
                        this.a = r5Var;
                        r5Var.setPriority(10);
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
    public final j8 e(File file, j8 j8Var) {
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor = null;
        if (file == null) {
            return null;
        }
        if (j8Var == null) {
            j8Var = this.g;
        }
        int i12 = 0;
        long j10 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.c;
                StringBuilder sb2 = new StringBuilder("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = '");
                try {
                    sb2.append(file.getPath().replace("'", "").replace("\"", ""));
                    sb2.append("'");
                    sQLiteCursor = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                    if (sQLiteCursor.next()) {
                        j10 = sQLiteCursor.longValue(0);
                        i10 = sQLiteCursor.intValue(1);
                        try {
                            i12 = i10;
                            i11 = sQLiteCursor.intValue(2);
                        } catch (Exception e) {
                            e = e;
                            f8.g(e, true);
                            i12 = i10;
                            i11 = 0;
                            j8Var.a = j10;
                            j8Var.b = i12;
                            j8Var.c = i11;
                            return j8Var;
                        }
                    } else {
                        i11 = 0;
                    }
                    sQLiteCursor.dispose();
                } catch (Exception e7) {
                    e = e7;
                    i10 = 0;
                    f8.g(e, true);
                    i12 = i10;
                    i11 = 0;
                    j8Var.a = j10;
                    j8Var.b = i12;
                    j8Var.c = i11;
                    return j8Var;
                }
            } catch (Exception e10) {
                e = e10;
            }
            j8Var.a = j10;
            j8Var.b = i12;
            j8Var.c = i11;
            return j8Var;
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
    public final String f(final int i10, final int i11, final long j10, boolean z10) {
        int i12;
        boolean z11;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        String str;
        final long currentTimeMillis = System.currentTimeMillis();
        String str2 = j10 + "_" + i10 + "_" + i11;
        ConcurrentHashMap concurrentHashMap = this.f;
        String str3 = (String) concurrentHashMap.get(str2);
        String str4 = null;
        if (str3 == "~null~") {
            boolean z12 = v2.a;
            f8.b("get file path cached null id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=null in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return null;
        }
        if (str3 != null) {
            boolean z13 = v2.a;
            f8.b("get file path cached id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=" + str3 + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return str3;
        }
        if (this.a != null) {
            i12 = 0;
            if (Thread.currentThread() == this.a) {
                z11 = false;
                if (!z11) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final String[] strArr = new String[1];
                    h(new Runnable() { // from class: org.telegram.messenger.g8
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
                        
                            if (r10 == null) goto L20;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            long j11 = j10;
                            int i13 = i10;
                            int i14 = i11;
                            String[] strArr2 = strArr;
                            long j12 = currentTimeMillis;
                            k8 k8Var = k8.this;
                            k8Var.c();
                            SQLiteDatabase sQLiteDatabase = k8Var.c;
                            if (sQLiteDatabase != null) {
                                SQLiteCursor sQLiteCursor3 = null;
                                try {
                                    sQLiteCursor3 = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j11 + " AND dc_id = " + i13 + " AND type = " + i14, new Object[0]);
                                    if (sQLiteCursor3.next()) {
                                        strArr2[0] = sQLiteCursor3.stringValue(0);
                                        boolean z14 = v2.a;
                                        f8.b("get file path id=" + j11 + " dc=" + i13 + " type=" + i14 + " path=" + strArr2[0] + " in " + (System.currentTimeMillis() - j12) + "ms");
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        f8.g(th2, true);
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
                    String str5 = strArr[i12];
                    if (str5 != null) {
                        concurrentHashMap.put(str2, str5);
                    } else {
                        concurrentHashMap.put(str2, "~null~");
                    }
                    return strArr[i12];
                }
                SQLiteDatabase sQLiteDatabase = this.c;
                try {
                    if (sQLiteDatabase == null) {
                        return null;
                    }
                    try {
                        int i13 = i12;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j10 + " AND dc_id = " + i10 + " AND type = " + i11, new Object[i13]);
                        try {
                            if (sQLiteCursor2.next()) {
                                str = sQLiteCursor2.stringValue(i13);
                                try {
                                    boolean z14 = v2.a;
                                    f8.b("get file path id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=" + str + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    str4 = str;
                                } catch (SQLiteException e) {
                                    e = e;
                                    f8.g(e, true);
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
                        } catch (SQLiteException e7) {
                            e = e7;
                            str = null;
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
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
            i12 = 0;
        }
        z11 = z10;
        if (!z11) {
        }
    }

    public final void g(int i10) {
        if (i10 == 1) {
            m5.s(this.c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            m5.s(this.c, "PRAGMA user_version = 2");
            i10 = 2;
        }
        if (i10 == 2) {
            m5.s(this.c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            m5.s(this.c, "PRAGMA user_version = 3");
            i10 = 3;
        }
        if (i10 == 3) {
            m5.s(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            m5.s(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            m5.s(this.c, "PRAGMA user_version = 4");
            i10 = 4;
        }
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            try {
                this.c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
            m5.s(this.c, "PRAGMA user_version = 7");
        }
    }

    public final void h(Runnable runnable) {
        d();
        this.a.c(runnable);
    }
}
