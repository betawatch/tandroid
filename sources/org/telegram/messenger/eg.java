package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ eg(c1 c1Var, long j10, long j11, int i3, int i10, int i11) {
        this.a = i11;
        this.b = c1Var;
        this.c = j10;
        this.d = j11;
        this.e = i3;
        this.f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        int i3;
        int i10;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                li liVar = (li) this.b;
                int i14 = this.f;
                long j12 = this.c;
                long j13 = this.d;
                int i15 = this.e;
                if (j12 != 0) {
                    try {
                        SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j13 + " AND topic_id = " + j12 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } else {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = liVar.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j13 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                }
                if (queryFinalized.next()) {
                    i3 = queryFinalized.intValue(0);
                    i10 = queryFinalized.intValue(1);
                } else {
                    i3 = -1;
                    i10 = 0;
                }
                queryFinalized.dispose();
                if (i3 == -1 && m5.C(j13)) {
                    SQLiteDatabase sQLiteDatabase3 = liVar.getMessagesStorage().b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j13 + " AND type = " + i15 + " LIMIT 1", new Object[0]);
                    if (queryFinalized2.next()) {
                        i3 = queryFinalized2.intValue(0);
                    }
                    queryFinalized2.dispose();
                    if (i3 != -1) {
                        i12 = i3;
                        i11 = i15;
                        j11 = j12;
                        liVar.H1(j13, j11, i11, i12);
                        j10 = j13;
                    } else {
                        j10 = j13;
                        j11 = j12;
                        i11 = i15;
                        i12 = i3;
                    }
                    i3 = i12;
                } else {
                    j10 = j13;
                    j11 = j12;
                    i11 = i15;
                }
                g0.h3(new ei(liVar, j10, true, i3, i11, i10, j11, i14));
                break;
            case 1:
                li liVar2 = (li) this.b;
                long j14 = this.d;
                int i16 = this.e;
                int i17 = this.f;
                long j15 = this.c;
                try {
                    SQLitePreparedStatement executeFast = j15 != 0 ? liVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : liVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j14);
                    if (j15 != 0) {
                        executeFast.bindLong(2, j15);
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
                ((qr) this.b).e2(-this.c, this.d, this.e, this.f);
                break;
        }
    }
}
