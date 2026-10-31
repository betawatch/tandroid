package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dr(f1 f1Var, long j10, List list, boolean z10, int i10, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = j10;
        this.f = list;
        this.d = z10;
        this.e = i10;
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
        int i10;
        SQLitePreparedStatement executeFast;
        switch (this.a) {
            case 0:
                hs hsVar = (hs) this.b;
                String str = (String) this.f;
                int i11 = this.e;
                String str2 = "SELECT ";
                boolean z10 = this.d;
                long j10 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    if (z10) {
                        try {
                            SQLiteDatabase sQLiteDatabase = hsVar.b;
                            StringBuilder sb2 = new StringBuilder();
                            Locale locale = Locale.US;
                            sb2.append("SELECT " + str + " FROM dialogs WHERE did = ");
                            sb2.append(j10);
                            queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                            try {
                                r9 = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0)) : 0;
                                queryFinalized.dispose();
                            } catch (SQLiteException e) {
                                e = e;
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
                        } catch (SQLiteException e7) {
                            e = e7;
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
                    i10 = r9 + i11;
                    SQLiteDatabase sQLiteDatabase2 = hsVar.getMessagesStorage().b;
                    Locale locale2 = Locale.US;
                    executeFast = sQLiteDatabase2.executeFast("UPDATE dialogs SET " + str + " = ? WHERE did = ?");
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = str2;
                }
                try {
                    executeFast.bindInteger(1, i10);
                    executeFast.bindLong(2, j10);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (SQLiteException e10) {
                    e = e10;
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
                ((hs) this.b).D1(this.c, (List) this.f, this.d, true, this.e);
                return;
            default:
                x00 x00Var = (x00) this.b;
                ArrayList arrayList = (ArrayList) this.f;
                boolean z11 = v2.a;
                long j11 = this.c;
                if (z11) {
                    i0.a.p(arrayList == null ? 0 : arrayList.size(), a1.g.s(j11, "loaded from cache ", " topics_count="));
                }
                x00Var.c.put(j11, 0);
                x00Var.u(j11, arrayList, null, this.d, this.e, -1);
                x00Var.y(j11, true);
                return;
        }
    }

    public /* synthetic */ dr(hs hsVar, boolean z10, String str, long j10, int i10, String str2) {
        this.a = 0;
        this.b = hsVar;
        this.d = z10;
        this.f = str;
        this.c = j10;
        this.e = i10;
    }
}
