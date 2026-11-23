package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ mg(si siVar, long j3, long j10, int i7, int i10, int i11) {
        this.a = i11;
        this.b = siVar;
        this.c = j3;
        this.d = j10;
        this.e = i7;
        this.f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i7;
        int i10;
        long j3;
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                int i14 = this.f;
                long j10 = this.c;
                si siVar = this.b;
                long j11 = this.d;
                int i15 = this.e;
                if (j10 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j11 + " AND topic_id = " + j10 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = siVar.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j11 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                }
                if (queryFinalized.next()) {
                    i7 = queryFinalized.intValue(0);
                    i10 = queryFinalized.intValue(1);
                } else {
                    i7 = -1;
                    i10 = 0;
                }
                queryFinalized.dispose();
                if (i7 == -1 && n5.C(j11)) {
                    SQLiteDatabase sQLiteDatabase3 = siVar.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j11 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i7 = queryFinalized2.intValue(0);
                    }
                    int i16 = i7;
                    queryFinalized2.dispose();
                    if (i16 != -1) {
                        siVar.M1(j11, j10, i15, i16);
                        j3 = j10;
                        i11 = i15;
                    } else {
                        j3 = j10;
                        i11 = i15;
                    }
                    i12 = i16;
                } else {
                    j3 = j10;
                    i11 = i15;
                    i12 = i7;
                }
                g0.g3(new mf(siVar, j11, true, i12, i11, i10, j3, i14));
                break;
            default:
                long j12 = this.d;
                int i17 = this.e;
                int i18 = this.f;
                long j13 = this.c;
                si siVar2 = this.b;
                try {
                    SQLitePreparedStatement executeFast = j13 != 0 ? siVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : siVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    if (j13 != 0) {
                        executeFast.bindLong(2, j13);
                        i13 = 3;
                    } else {
                        i13 = 2;
                    }
                    executeFast.bindInteger(i13, i17);
                    executeFast.bindInteger(i13 + 1, i18);
                    executeFast.bindInteger(i13 + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
        }
    }
}
