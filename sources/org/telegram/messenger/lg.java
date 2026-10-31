package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ lg(f1 f1Var, long j10, long j11, int i10, int i11, int i12) {
        this.a = i12;
        this.b = f1Var;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.b;
                int i15 = this.f;
                long j12 = this.c;
                long j13 = this.d;
                int i16 = this.e;
                if (j12 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j13 + " AND topic_id = " + j12 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e) {
                        e = e;
                        z10 = true;
                        f8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j13 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    } catch (Exception e7) {
                        e = e7;
                        z10 = true;
                        f8.g(e, z10);
                        return;
                    }
                }
                if (queryFinalized.next()) {
                    i10 = queryFinalized.intValue(0);
                    i11 = queryFinalized.intValue(1);
                } else {
                    i10 = -1;
                    i11 = 0;
                }
                queryFinalized.dispose();
                if (i10 == -1 && o5.C(j13)) {
                    SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j13 + " AND type = " + i16 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i10 = queryFinalized2.intValue(0);
                    }
                    queryFinalized2.dispose();
                    if (i10 != -1) {
                        i13 = i10;
                        i12 = i16;
                        j11 = j12;
                        uiVar.H1(j13, j11, i12, i13);
                        j10 = j13;
                    } else {
                        j10 = j13;
                        j11 = j12;
                        i12 = i16;
                        i13 = i10;
                    }
                    i10 = i13;
                } else {
                    j10 = j13;
                    j11 = j12;
                    i12 = i16;
                }
                i0.g3(new mi(uiVar, j10, true, i10, i12, i11, j11, i15));
                break;
            case 1:
                ui uiVar2 = (ui) this.b;
                long j14 = this.d;
                int i17 = this.e;
                int i18 = this.f;
                long j15 = this.c;
                try {
                    SQLitePreparedStatement executeFast = j15 != 0 ? uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j14);
                    if (j15 != 0) {
                        executeFast.bindLong(2, j15);
                        i14 = 3;
                    } else {
                        i14 = 2;
                    }
                    executeFast.bindInteger(i14, i17);
                    executeFast.bindInteger(i14 + 1, i18);
                    executeFast.bindInteger(i14 + 2, 0);
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                ((hs) this.b).e2(-this.c, this.d, this.e, this.f);
                break;
        }
    }
}
