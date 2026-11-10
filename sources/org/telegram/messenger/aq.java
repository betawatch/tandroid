package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ aq(yr yrVar, int i7, long j3, int i10) {
        this.a = i10;
        this.b = yrVar;
        this.c = i7;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                long j3 = this.d;
                yr yrVar = this.b;
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i7 + " WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (SQLiteException e10) {
                    yrVar.o(e10, true);
                    return;
                }
            case 1:
                this.b.A0(this.c, this.d);
                return;
            case 2:
                int i10 = this.c;
                long j10 = this.d;
                yr yrVar2 = this.b;
                yrVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar2.b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i10);
                        sQLitePreparedStatement.bindLong(2, j10);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    yrVar2.o(e11, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
                return;
            case 3:
                int i11 = this.c;
                long j11 = this.d;
                yr yrVar3 = this.b;
                yrVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = yrVar3.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i11);
                        sQLitePreparedStatement2.bindLong(2, j11);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e12) {
                        yrVar3.o(e12, true);
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
                int i12 = this.c;
                long j12 = this.d;
                yr yrVar4 = this.b;
                yrVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = yrVar4.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i12 + " AND uid = " + j12).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    yrVar4.o(e13, true);
                    return;
                }
            case 5:
                int i13 = this.c;
                long j13 = this.d;
                yr yrVar5 = this.b;
                yrVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = yrVar5.b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i13);
                    executeFast.bindLong(2, -j13);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e14) {
                    yrVar5.o(e14, true);
                    return;
                }
            case 6:
                yr yrVar6 = this.b;
                int i14 = this.c;
                long j14 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = yrVar6.b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j14 + " AND type = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    yrVar6.o(e15, true);
                    return;
                }
            default:
                int i15 = this.c;
                long j15 = this.d;
                yr yrVar7 = this.b;
                yrVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = yrVar7.b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i15);
                        sQLitePreparedStatement3.bindLong(2, j15);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e16) {
                        yrVar7.o(e16, true);
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
