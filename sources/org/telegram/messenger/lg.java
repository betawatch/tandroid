package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ lg(c1 c1Var, long j3, long j10, int i7, int i10, int i11) {
        this.a = i11;
        this.b = c1Var;
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
        long j10;
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                si siVar = (si) this.b;
                int i14 = this.f;
                long j11 = this.c;
                long j12 = this.d;
                int i15 = this.e;
                if (j11 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j12 + " AND topic_id = " + j11 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
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
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j12 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
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
                if (i7 == -1 && m5.C(j12)) {
                    SQLiteDatabase sQLiteDatabase3 = siVar.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j12 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i7 = queryFinalized2.intValue(0);
                    }
                    queryFinalized2.dispose();
                    if (i7 != -1) {
                        i12 = i7;
                        i11 = i15;
                        j10 = j11;
                        siVar.H1(j12, j10, i11, i12);
                        j3 = j12;
                    } else {
                        j3 = j12;
                        j10 = j11;
                        i11 = i15;
                        i12 = i7;
                    }
                    i7 = i12;
                } else {
                    j3 = j12;
                    j10 = j11;
                    i11 = i15;
                }
                g0.h3(new li(siVar, j3, true, i7, i11, i10, j10, i14));
                break;
            case 1:
                si siVar2 = (si) this.b;
                long j13 = this.d;
                int i16 = this.e;
                int i17 = this.f;
                long j14 = this.c;
                try {
                    SQLitePreparedStatement executeFast = j14 != 0 ? siVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : siVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j13);
                    if (j14 != 0) {
                        executeFast.bindLong(2, j14);
                        i13 = 3;
                    } else {
                        i13 = 2;
                    }
                    executeFast.bindInteger(i13, i16);
                    executeFast.bindInteger(i13 + 1, i17);
                    executeFast.bindInteger(i13 + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                ((vr) this.b).e2(-this.c, this.d, this.e, this.f);
                break;
        }
    }
}
