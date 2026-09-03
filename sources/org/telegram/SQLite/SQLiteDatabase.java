package org.telegram.SQLite;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class SQLiteDatabase {
    private boolean inTransaction;
    private boolean isOpen = true;
    private final long sqliteHandle;

    public SQLiteDatabase(String str) {
        this.sqliteHandle = opendb(str, ApplicationLoader.getFilesDirFixed().getPath());
    }

    public void beginTransaction() {
        if (this.inTransaction) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new SQLiteException("database already in transaction");
            }
            commitTransaction();
        }
        this.inTransaction = true;
        beginTransaction(this.sqliteHandle);
    }

    public native void beginTransaction(long j10);

    public void checkOpened() {
        if (!this.isOpen) {
            throw new SQLiteException("Database closed");
        }
    }

    public void close() {
        if (this.isOpen) {
            try {
                commitTransaction();
                closedb(this.sqliteHandle);
            } catch (SQLiteException e6) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(e6.getMessage(), e6);
                }
            }
            this.isOpen = false;
        }
    }

    public native void closedb(long j10);

    public void commitTransaction() {
        if (this.inTransaction) {
            this.inTransaction = false;
            commitTransaction(this.sqliteHandle);
        }
    }

    public native void commitTransaction(long j10);

    public SQLitePreparedStatement executeFast(String str) {
        return new SQLitePreparedStatement(this, str);
    }

    public Integer executeInt(String str, Object... objArr) {
        checkOpened();
        SQLiteCursor queryFinalized = queryFinalized(str, objArr);
        try {
            if (queryFinalized.next()) {
                return Integer.valueOf(queryFinalized.intValue(0));
            }
            queryFinalized.dispose();
            return null;
        } finally {
            queryFinalized.dispose();
        }
    }

    public void explainQuery(String str, Object... objArr) {
        checkOpened();
        SQLiteCursor query = new SQLitePreparedStatement(this, yh.k("EXPLAIN QUERY PLAN ", str)).query(objArr);
        while (query.next()) {
            int columnCount = query.getColumnCount();
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < columnCount; i10++) {
                sb.append(query.stringValue(i10));
                sb.append(", ");
            }
            FileLog.d("EXPLAIN QUERY PLAN " + sb.toString());
        }
        query.dispose();
    }

    public void finalize() {
        super.finalize();
        close();
    }

    public long getSQLiteHandle() {
        return this.sqliteHandle;
    }

    public native long opendb(String str, String str2);

    public SQLiteCursor queryFinalized(String str, Object... objArr) {
        checkOpened();
        return new SQLitePreparedStatement(this, str).query(objArr);
    }

    public boolean tableExists(String str) {
        checkOpened();
        return executeInt("SELECT rowid FROM sqlite_master WHERE type='table' AND name=?;", str) != null;
    }
}
