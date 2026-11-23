package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class uq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uq(c1 c1Var, long j3, List list, boolean z10, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j3;
        this.f = list;
        this.d = z10;
        this.e = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor queryFinalized;
        int i7;
        SQLitePreparedStatement executeFast;
        switch (this.a) {
            case 0:
                ur urVar = (ur) this.b;
                String str = (String) this.f;
                int i10 = this.e;
                String str2 = "SELECT ";
                boolean z10 = this.d;
                long j3 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    if (z10) {
                        try {
                            SQLiteDatabase sQLiteDatabase = urVar.b;
                            StringBuilder sb2 = new StringBuilder();
                            Locale locale = Locale.US;
                            sb2.append("SELECT " + str + " FROM dialogs WHERE did = ");
                            sb2.append(j3);
                            queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                            try {
                                r9 = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0)) : 0;
                                queryFinalized.dispose();
                            } catch (SQLiteException e10) {
                                e = e10;
                                e.printStackTrace();
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                if (queryFinalized == null) {
                                    queryFinalized.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            queryFinalized = null;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = 0;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    i7 = r9 + i10;
                    SQLiteDatabase sQLiteDatabase2 = urVar.getMessagesStorage().b;
                    Locale locale2 = Locale.US;
                    executeFast = sQLiteDatabase2.executeFast("UPDATE dialogs SET " + str + " = ? WHERE did = ?");
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = str2;
                }
                try {
                    executeFast.bindInteger(1, i7);
                    executeFast.bindLong(2, j3);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (SQLiteException e12) {
                    e = e12;
                    queryFinalized = null;
                    sQLitePreparedStatement = executeFast;
                    e.printStackTrace();
                    if (sQLitePreparedStatement != null) {
                    }
                    if (queryFinalized == null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = 0;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != 0) {
                    }
                    throw th;
                }
            case 1:
                ((ur) this.b).D1(this.c, (List) this.f, this.d, true, this.e);
                return;
            default:
                f00 f00Var = (f00) this.b;
                ArrayList arrayList = (ArrayList) this.f;
                boolean z11 = s2.a;
                long j10 = this.c;
                if (z11) {
                    i5.c.t(arrayList == null ? 0 : arrayList.size(), a8.p0.t(j10, "loaded from cache ", " topics_count="));
                }
                f00Var.c.put(j10, 0);
                f00Var.u(j10, arrayList, null, this.d, this.e, -1);
                f00Var.y(j10, true);
                return;
        }
    }

    public /* synthetic */ uq(ur urVar, boolean z10, String str, long j3, int i7, String str2) {
        this.a = 0;
        this.b = urVar;
        this.d = z10;
        this.f = str;
        this.c = j3;
        this.e = i7;
    }
}
