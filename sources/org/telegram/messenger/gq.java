package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ gq(hs hsVar, int i10, long j10, int i11) {
        this.a = i11;
        this.b = hsVar;
        this.c = i10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                long j10 = this.d;
                hs hsVar = this.b;
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i10 + " WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e) {
                    hsVar.o(e, true);
                    return;
                }
            case 1:
                this.b.A0(this.c, this.d);
                return;
            case 2:
                int i11 = this.c;
                long j11 = this.d;
                hs hsVar2 = this.b;
                hsVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar2.b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i11);
                        sQLitePreparedStatement.bindLong(2, j11);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e7) {
                    hsVar2.o(e7, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
                return;
            case 3:
                int i12 = this.c;
                long j12 = this.d;
                hs hsVar3 = this.b;
                hsVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = hsVar3.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i12);
                        sQLitePreparedStatement2.bindLong(2, j12);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e10) {
                        hsVar3.o(e10, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 4:
                int i13 = this.c;
                long j13 = this.d;
                hs hsVar4 = this.b;
                hsVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = hsVar4.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i13 + " AND uid = " + j13).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    hsVar4.o(e11, true);
                    return;
                }
            case 5:
                int i14 = this.c;
                long j14 = this.d;
                hs hsVar5 = this.b;
                hsVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = hsVar5.b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i14);
                    executeFast.bindLong(2, -j14);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e12) {
                    hsVar5.o(e12, true);
                    return;
                }
            case 6:
                hs hsVar6 = this.b;
                int i15 = this.c;
                long j15 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = hsVar6.b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j15 + " AND type = " + i15).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    hsVar6.o(e13, true);
                    return;
                }
            default:
                int i16 = this.c;
                long j16 = this.d;
                hs hsVar7 = this.b;
                hsVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = hsVar7.b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i16);
                        sQLitePreparedStatement3.bindLong(2, j16);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e14) {
                        hsVar7.o(e14, true);
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                    }
                    throw th4;
                }
        }
    }
}
